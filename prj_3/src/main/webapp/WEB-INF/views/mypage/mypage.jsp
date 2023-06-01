<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    session="true"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
#errOutput{position: relative; width:300px; top:165px; left : 510px; font-weight: bold; font-size: 25px;}
.wrap{width: 1400px;min-heigh:100px;margin: 0px auto;}
.header{height: 200px}
.container{min-heigh:100px; position: relative; padding-bottom: 250px;}
.container5{
height: 300px; 
position: relative;
bottom: 0; 
}
ul li{list-style: none; text-align: center; margin-top: 10px}
a{ text-decoration: none; color: #333; text-align: center}
.right{ position: relative; left:450px; width: 400px; height: 150px; top: 100px;  }
.btns{ position: relative;top:160px ;left:510px; width: 500px; height: 70px;   }
.content{ position: relative;top:300px;left:260px; width: 1000px; height: 300px; }
.profile_img{width:120px; height:120px; border-radius:50%; position: relative; top:20px; left: 20px; float: left}
.nickname{position: relative; top: 40px; left: 100px; }
.intro{position: relative; top: 75px; left: 100px;}
.footer{height: 100px}
.socialring_popular_table{  /*소셜링 4개 테이블*/
position: relative; 
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
position: relative;
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
	
	hostAjax();
	
	$("#hostBtn").click(function() {
		$("#hostBtn").attr('class','btn btn-warning');
		$("#joinBtn").attr('class','btn btn-secondary');
		hostAjax();
	});//click
	
	$("#joinBtn").click(function() {
		$("#joinBtn").attr('class','btn btn-warning');
		$("#hostBtn").attr('class','btn btn-secondary');
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
				$("#errOutput").html("");
				output+="<table class='socialring_popular_table'>";
				if(!jsonObj.resultFlag){
					$("#errOutput").html("에러발생");
				}else{
					if(jsonObj.dataSize==0){$("#errOutput").html("") ;}
					$.each(jsonObj.data, function(idx, ele){
						if(idx%2==0){
							output+="<tr>";
						}
						
						output+="<td class='prdCol1' colspan='3'>";
						output+="<div class='prod_div'>";
						output+="<a href='club_info.do?club_Num="+ele.clubNum+"'>";
						output+="<img class='prod_img' src='"+ele.clubImg+"'/></a></div></td>";
						output+="<td class='prdCol2'><div>";
						output+="<strong>"+ele.clubName+"</strong> <br><br></div> </td>";
						
						if(idx%2==1){
							output+='</tr>';
						}
					})
				}//end else  
				    output+=" </tr></table>" 
				    $("#output").html(output);
			}//success
			
		});//ajax
	});//click
	
});//ready

function hostAjax() {
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
			$("#errOutput").html("");
			output+="<table class='socialring_popular_table'>";
			if(!jsonObj.resultFlag){
				$("#errOutput").html("에러발생");
			}else{
				if(jsonObj.dataSize==0){$("#errOutput").html("주최한 모임이 없습니다!");}
				$.each(jsonObj.data, function(idx, ele){
					if(idx%2==0){
						output+="<tr>";
					}
					
					output+="<td class='prdCol1' colspan='3'>";
					output+="<div class='prod_div'>";
					output+="<a href='club_info.do?club_Num="+ele.clubNum+"'>";
					output+="<img class='prod_img' src='"+ele.clubImg+"'/></a></div></td>";
					output+="<td class='prdCol2'><div>";
					output+="<strong>"+ele.clubName+"</strong> <br><br></div> </td>";
					
					if(idx%2==1){
						output+="</tr>";
					}
				})
			}//end else  
			    output+=" </tr></table>" 
			    $("#output").html(output);
		}//success
		
	});//ajax
}

</script>

</head>
<body>
<div class="wrap">
	<div class="header">
	<jsp:include page="/header.do"/>
	</div><!-- header -->
	<div class="container">
		<div class="right">
			<input type="hidden" id="userId" value="${userId}"/>
			<img src="${userImg}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png'" class="profile_img">
			<div class="nickname" style="font-weight: bold; font-size: 20px;">${nickName}</div>
			<div class="intro" style="font-weight: bold; font-size: 20px;">${personalIntro}</div>
		</div><!-- right  -->
		<hr style="width:1500px; position: relative; left: 0px; top: 130px; border-color:#000000;">
		<div class="btns">
			<button type="button" class="btn btn-secondary" id="hostBtn" style="margin-right: 30px;">주최한 모임</button>
			<button type="button" class="btn btn-secondary" id="joinBtn">참여한 모임</button>
		</div><!-- btns  -->
		<div id="errOutput"></div>
		<div id="output">
		
		</div><!-- output -->
		
		</div><!-- container  -->
	<div class="container5">
   <jsp:include page="/footer.do"/>
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>


