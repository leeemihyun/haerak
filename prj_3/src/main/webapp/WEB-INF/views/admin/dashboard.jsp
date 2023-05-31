<%@page import="kr.co.haerak.dao.admin.DashBoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.haerak.vo.admin.TotalMemberCntVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/admin.css">
<style type="text/css">

/* 화면구성  */
#wrap { width: 1200px; height: 1050px; margin: 0px auto;  }
#header { width: 200px; height: 1050px; float: left; background-color: #F7A144   }
#container { width: 988px; height: 1050px;  float: right;   }
#con_header { height: 60px;   }
#con_main {height: 990px;  position: relative;  }

/* 메뉴 */
.col_tit {font-size: 20px; color: #000000; padding-bottom: 10px;}
.menu { }
.menu li {position: relative;}
.menu li a {
    font-size: 16px; text-transform: uppercase;
    color: black;
    font-weight:bold;
    border-bottom: 1px solid #dbdbdb;
    padding: 10px; display: block;
    transition: box-shadow 0.34s ease, background 0.34s ease;
}
.menu li a i {
    position: absolute; right: 10px; top: 15px;
}
.menu li a:hover {
    box-shadow: inset 200px 0 0 0 rgba(255, 102, 51,0.6);
    color: #fff;
    background: #F7A144;
}

/* 거래현황  그래프   */
#chart1{ position: absolute; top:200px; left: 30px; border: 1px solid #333; width: 440px; height: 240px  }


/* 오늘의 수치  */
#day_info { width: 950px; height: 130px;  position: absolute; top: 20px; left: 10px; font-weight: bold;  }
.day_info_set { width: 130px; height: 100px;  float: left; margin-left: 60px; border-radius: 5px;}

/* 가로차트 */
#control { position: relative; top:500px; left:30px; width: 440px; border: 1px solid #333;  }

#temp1 {width: 440px; height: 250px; position: absolute; top: 200px; left: 520px; border: 1px solid #333; }
#temp2 {width: 440px; height: 180px; position: absolute; top: 500px; left: 520px; border: 1px solid #333; }
#temp3 {width: 440px; height: 180px; position: absolute; top: 750px; left: 520px; border: 1px solid #333; }



</style>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<!-- jQeury CDN 시작  -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQeury CDN 끝  -->
	<%
	DashBoardDAO dDAO= new DashBoardDAO();
 	List<TotalMemberCntVO> montotal = dDAO.monthTotalCnt();
	%>
<script type="text/javascript">
(function( $ ) {
    "use strict";
    $(function() {
        function animated_contents() {
            $(".zt-skill-bar > div ").each(function (i) {
                var $this  = $(this),
                    skills = $this.data('width');
 
                $this.css({'width' : skills + '%'});
 
            });
        }
        
        if(jQuery().appear) {
            $('.zt-skill-bar').appear().on('appear', function() {
                animated_contents();
            });
        } else {
            animated_contents();
        }
    });
}(jQuery));

/* 원형차트(해결) */

google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
	
	var socialingCnt=${categoryCnt.socialCnt};
	var clubCnt=${categoryCnt.clubCnt};
	var challengeCnt=${categoryCnt.challengeCnt};
	
  var data = google.visualization.arrayToDataTable([
    ['Task', 'Hours per Day'],
    ['소셜링', socialingCnt],
    ['클럽',clubCnt],
    ['챌린지',challengeCnt]
  ]);
  var options = {
    title: '카테고리 별 모임 수',
    is3D: true,
  };

  var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
  chart.draw(data, options);
}
/*  원형차트(해결) */



</script>
<script type="text/javascript">
/* 신규&탈퇴 현황 */

google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
	var ndcount=0;
  var data = google.visualization.arrayToDataTable([
    ['Month', '신규회원', '탈퇴회원'],
    ['1',${newAndwithdrawallCnt[0].CREATE_DATE},${newAndwithdrawallCnt[0].DELETE_DATE}],
    ['2',${newAndwithdrawallCnt[1].CREATE_DATE},${newAndwithdrawallCnt[1].DELETE_DATE}],
    ['3',${newAndwithdrawallCnt[2].CREATE_DATE},${newAndwithdrawallCnt[2].DELETE_DATE}],
    ['4',${newAndwithdrawallCnt[3].CREATE_DATE},${newAndwithdrawallCnt[3].DELETE_DATE}],
    ['5',${newAndwithdrawallCnt[4].CREATE_DATE},${newAndwithdrawallCnt[4].DELETE_DATE}]
	 
  ]);
  var options = {
    title: '신규&탈퇴 회원',
    curveType: 'function',
    legend: { position: 'bottom' }
  };

  var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

  chart.draw(data, options);
}

/* 선 그래프  temp2 */
</script>
<script type="text/javascript">
/* 월별 총회원 수   */

google.charts.load('current', {packages: ['corechart', 'line']});
google.charts.setOnLoadCallback(drawBasic);

function drawBasic() {

      var data = new google.visualization.DataTable();
      data.addColumn('number', 'X');
      data.addColumn('number', '총회원수');

      data.addRows([
      	<%for( TotalMemberCntVO tVO : montotal) {%>
        [<%=tVO.getMonth()%>,<%=tVO.getUserCount()%>],
        <%}%>
      ]);

      var options = {
        hAxis: {
          title: 'month'
        },
        vAxis: {
          title: '총회원수'
        }
      };

      var chart = new google.visualization.LineChart(document.getElementById('chart_div'));

      chart.draw(data, options);
}

/* 총회원 수   */
</script>

<script type="text/javascript">
/* 거래현황  */
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawBasic);

function drawBasic() {
	
	
	
       var data = google.visualization.arrayToDataTable([
         ['6일전', '모임현황', { role: 'style' }],
         ['6일전',${tradingStatus[0].count}, '#F7A144 '],            // RGB value
         ['5일전',${tradingStatus[1].count}, '#F7A144 '],            // English color name
         ['4일전',${tradingStatus[2].count}, '#F7A144 '],
         ['3일전',${tradingStatus[3].count}, '#F7A144 '],
         ['2일전',${tradingStatus[4].count}, '#F7A144 '],
         ['1일전',${tradingStatus[5].count}, '#F7A144 ']

      ]);

      var options = {
        title: '모임 현황',
        hAxis: {
          title: 'Day',
          viewWindow: {
            min: [7, 30, 0],
            max: [17, 30, 0]
          }
        },
        vAxis: {
          title: 'count'
        }
      };

      var chart = new google.visualization.ColumnChart(
        document.getElementById('chart_div1'));

      chart.draw(data, options);
    }
    
/* 상품거래현황  */   
</script>
<script type="text/javascript">
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawBasic);

function drawBasic() {

      var data = google.visualization.arrayToDataTable([
        ['location', '지역별 모임수',{ role: 'style' }],
        ['대전',	${ regionCnt[0].count } , '#F7A144'],
        ['세종', ${ regionCnt[1].count }, '#F7A144 '],
        ['강원',	${ regionCnt[2].count }, '#F7A144 '],
        ['서울', ${ regionCnt[3].count }, '#F7A144 '],
        ['경기', ${ regionCnt[4].count }, '#F7A144 '],
        ['대구', ${ regionCnt[5].count }, '#F7A144 '],
        ['경남', ${ regionCnt[6].count }, '#F7A144 '],
        ['제주', ${ regionCnt[7].count }, '#F7A144 '],
        ['경북', ${ regionCnt[8].count }, '#F7A144 '],
        ['광주', ${ regionCnt[9].count }, '#F7A144 '],
        ['전북', ${ regionCnt[10].count }, '#F7A144 '],
        ['인천', ${ regionCnt[11].count }, '#F7A144 '],
        ['울산', ${ regionCnt[12].count }, '#F7A144 '],
        ['전남', ${ regionCnt[13].count }, '#F7A144 '],
        ['충북', ${ regionCnt[14].count }, '#F7A144 '],
        ['부산', ${ regionCnt[15].count }, '#F7A144 '],
        ['충남', ${ regionCnt[16].count }, '#F7A144 ']
      ]);

      var options = {
        title: '각 지역별 모임현황',
        chartArea: {width: '50%'},
        height:'430',
        hAxis: {
          title: 'Total Population',
          minValue: 0
        },
        vAxis: {
          title: '지역'
        }
      };

      var chart = new google.visualization.BarChart(document.getElementById('chart_div3'));

      chart.draw(data, options);
    }
</script>

</head>
<body>
<div id="wrap" > <!-- wrap( w: 800 x h:950 ) -->
		<div id="header"><!-- header(w: 200 x h : 1400 ) --> 
		<div>
		<a href="http://localhost/prj_3/admin/dashboard.do"><img src="http://localhost/prj_3/images/logo.png" width="150"></a>
		</div>
		<br>
		 <h4 class="col_tit">Menu</h4>
		       <div class="menu">
               		<ul>
                              <li><a href="http://localhost/prj_3/admin/dashboard.do"><i class="fa fa-th-large" aria-hidden="true" style="position: absolute; left: 1px; top: 10px;" ></i>&ensp;Dashboard <i class="fa fa-angle-double-right" aria-hidden="true"></i></a></li>
                              <li><a href="http://localhost/prj_3/admin/memberlist.do"><i class="fa fa-user" aria-hidden="true" style="position: absolute; left: 1px; top: 10px;" ></i>&ensp;회원관리 <i class="fa fa-angle-double-right" aria-hidden="true"></i></a></li>
                              <li><a href="http://localhost/prj_3/admin/clublist.do"><i class="fa fa-cart-plus" aria-hidden="true" style="position: absolute; left: 1px; top: 10px;" ></i>&ensp;모임관리 <i class="fa fa-angle-double-right" aria-hidden="true"></i></a></li>
                              <li><a href="http://localhost/prj_3/admin/reviewlist.do"><i class="fa fa-commenting-o" aria-hidden="true" style="position: absolute; left: 1px; top: 10px;" ></i>&ensp;후기관리 <i class="fa fa-angle-double-right" aria-hidden="true"></i></a></li>
                              <li><a href="http://localhost/prj_3/admin/adminlogin.do"><i class="fa fa-sign-out" aria-hidden="true" style="position: absolute; left: 1px; top: 10px;" ></i>&ensp;로그아웃 <i class="fa fa-angle-double-right" aria-hidden="true"></i></a></li>
                  	</ul>
                </div>
		</div>
		<div id="container"><!-- container(w: 800 x h : 600 ) -->
			<div id="con_header" >
			<div class="dash">
			<br>
			<h1>Dashboard</h1>
			<hr>
			</div>
			</div>
			<div id="con_main">
			
				<div id="chart1">	
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <div id="chart_div1"></div>
				</div>
		
		<div id="day_info">
			<div class="day_info_set" style="background-color:#2C3E50; color: white;" >오늘 총 로그인 수<br><br><br><span style="font-size: 25px;">&ensp;&ensp;&ensp;${totalVisit}</span></div>
			<div class="day_info_set" style="background-color:#2C3E50; color: white;">총 회원 수<br><br><br><span style="font-size: 25px;">&ensp;&ensp;&ensp;${memberCnt}</span></div>
			<div class="day_info_set" style="background-color:#3498DB; color: white;">신규가입 회원 수<br><br><br><span style="font-size: 25px;">&ensp;&ensp;&ensp;${newMemberCnt}</span></div>
			<div class="day_info_set" style="background-color:#E74C3C; color: white; ">오늘 탈퇴한 회원 수<br><br><br><span style="font-size: 25px;">&ensp;&ensp;&ensp;${withdrawalMembers}</span></div>
			<div class="day_info_set" style="background-color:#E0E0E0; ">오늘 승인완료 수<br><br><br><span style="font-size: 25px;">&ensp;&ensp;&ensp;${tradingStatusCnt}</span></div>
		</div>
		
		<!-- 가로차트  -->
		<div id="control">
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <div id="chart_div3"></div>
		</div>
		<!-- 가로차트  -->
			
		<div id="temp1">
			<div id="piechart_3d" style="width: 440px; height: 250px;"></div>
		</div>
		<div id="temp2">
		<div id="curve_chart" style="width: 440px; height: 180px"></div>
		</div>		
		<div id="temp3">
		<div id="chart_div" style="width: 400px; height: 180px"></div>
		</div>			
			 
			</div>
		</div>
</div>
</body>
</html>