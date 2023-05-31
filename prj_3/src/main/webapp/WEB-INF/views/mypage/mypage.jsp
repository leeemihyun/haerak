<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    session="true"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.wrap{width: 1400px;min-height: 600px;margin: 0px auto;}
.header{height: 200px}
.container{min-height: 900px; position: relative;}
.left{left:50px; width: 150px; min-height: 300px;position: absolute;}
ul li{list-style: none; text-align: center; margin-top: 10px}
a{ text-decoration: none; color: #333; text-align: center}
.right{ position: absolute;left:260px; width: 900px; height: 300px; }
.btns{ position: absolute;top:200px ;left:300px; width: 900px; height: 300px; }
.content{ position: absolute;top:300px;left:260px; width: 1000px; height: 300px; }
.profile_img{width:120px;height:120px;border-radius:50%; position: absolute; top:25px; left: 100px;}
.nickname{position: absolute; top: 45px; left: 300px;}
.intro{position: absolute; top: 65px; left: 300px;}
.footer{height: 100px}
.socialring_popular_table{  /*소셜링 4개 테이블*/
position: absolute; 
top : 300px; 
left: 270px;
border-collapse: collapse;
border-radius: 50px;
}  
.prod_div{
position: relative;
text-align : center;
display: inline-block;
max-width: 100%;
width: 130px;
height: 130px;
} 



.prod_img{    /*소셜링인기매물사진사이즈  */
position: absolute;
width: 160px;
height: 160px;
object-fit: cover;
left : 0px;
border-radius: 30px;

}

.prdCol1{  /* 테이블에 td    */  
 width: 190px; 
 height: 70px; 
 padding-bottom: 40px;
 padding-right: 20px;
 padding-bottom: 150px;
 }
 
 .prdCol2{  /* 테이블에 td    */  
 
 width: 300px; 
 height: 60px;
 padding-bottom: 10px;
 }
 
 
</style>
<title>마이페이지</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<script type="text/javascript">
$(function(){
	$("#hostBtn").click(function() {
		var output ="";
		var userId = $("#userId").val();
		$.ajax({
			url: "mypageHost.do",
			data : "userId=" + userId,
			dataType : "JSON",
			error : function(xhr) {
				console.log(xhr.status);
			},
			success : function(jsonObj) {
				output+="<table class='socialring_popular_table'>";
				if(!jsonObj.resultFlag){
					output+="<tr><td>문제발생</td></tr>";
				}else{
					if(jsonObj.dataSize==0){output+="<tr><td>문제발생</td></tr>";}
					$.each(jsonObj.data, function(idx, ele){
						output+="<tr><td class='prdCol1' colspan='3'>";
						output+="<div class='prod_div'>";
						output+="<a href='club_info.do?club_Num="+ele.clubNum+"'>";
						output+="<img class='prod_img' src='"+ele.clubImg+"'/></a></div></td>";
						output+="<td class='prdCol2'><div>";
						output+="<strong>"+ele.clubName+"</strong> <br><br></div> </td></tr>";
					})
				}//end else  
				    output+=" </tr></table>" 
				    $("#output").html(output);
			}//success
			
		});//ajax
	});//click
	
	$("#joinBtn").click(function() {
		var output ="";
		var userId = $("#userId").val();
		$.ajax({
			url: "mypageJoin.do",
			data : "userId=" +userId,
			dataType : "JSON",
			error : function(xhr) {
				console.log(xhr.status);
			},
			success : function(jsonObj) {
				output+="<table class='socialring_popular_table'>";
				if(!jsonObj.resultFlag){
					output+="<tr><td>문제발생</td></tr>";
				}else{
					if(jsonObj.dataSize==0){output+="<tr><td>문제발생</td></tr>";}
					$.each(jsonObj.data, function(idx, ele){
						output+="<tr><td class='prdCol1' colspan='3'>";
						output+="<div class='prod_div'>";
						output+="<a href='club_info.do?club_Num="+ele.clubNum+"'>";
						output+="<img class='prod_img' src='"+ele.clubImg+"'/></a></div></td>";
						output+="<td class='prdCol2'><div>";
						output+="<strong>"+ele.clubName+"</strong> <br><br></div> </td></tr>";
					})
				}//end else  
				    output+=" </tr></table>" 
				    $("#output").html(output);
			}//success
			
		});//ajax
	});//click
	
});//ready
</script>

</head>
<body>
<div class="wrap">
	<div class="header">
	<jsp:include page="/header.do"/>
	</div><!-- header -->
	<div class="container">
		<div class="left">
		</div>
		<div class="right">
			<input type="hidden" id="userId" value="${userId}"/>
			<div class="profileImg"><img src="${userImg}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png'" class="profile_img"></div>
			<div class="nickname">${nickName}</div>
			<div class="intro">${personalIntro}</div>
		<div class="btns">
			<button type="button" class="btn btn-warning" id="hostBtn">주최한 모임</button>
			<button type="button" class="btn btn-secondary" id="joinBtn">참여한 모임</button>
		</div>
		</div>
		<div id="output">
		
		</div><!-- output -->
		</div>
	<div class="container5">
   <jsp:include page="/footer.do"/>
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>


