<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모임상세페이지</title>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 시작 -->
<!-- bootstrap 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap  끝 -->
<style type="text/css">
#wrap{ width: 1900px; height: 1200px; margin: 0px auto;   }
#container { height:2700px;  position: relative;  }
#club_info_div{ width: 1200px; height: 500px; top: 80px; left: 350px; position: absolute; padding: 10px; }
#club_Carousel{ width: 550px; height: 480px;  float: left }
#club_detail{ width: 600px; height: 480px;  float: right; position: relative; }
#hr1{ width:1200px; height:30px; top: 600px; left: 350px; position: absolute;}
#hr2{ width:1200px; height:30px; top: 1060px; left: 350px; position: absolute;}
#hr3{ width:1200px; height:30px; top: 1680px; left: 350px; position: absolute;}
#hr4{ width:1200px; height:30px; top: 1800px; left: 350px; position: absolute;}
#hr5{ width:1200px; height:30px; top: 2000px; left: 350px; position: absolute;}
#hr6{ width:1200px; height:30px; top: 2600px; left: 350px; position: absolute;}
#club_review_info{ width: 1200px; height: 400px;  top: 650px; left: 350px; position: absolute;}
#club_review_info_text{ background-color: #F3F3F3; height: 250px; width: 1200px;}
#club_introduce{ width: 1200px; height: 500px;  top: 1120px; left: 350px; position: absolute;  }
#club_introduce_textArea_more_button_div{ width: 1200px; height: 40px;  top: 1630px; left: 350px; position: absolute;  }
#club_member_info{ width: 1200px; height: 100px;  top: 1700px; left: 350px; position: absolute;}
#club_date_info{ width: 1200px; height: 150px;  top: 1850px; left: 350px; position: absolute;}
#club_place{ width: 1200px; height: 500px;  top: 2050px; left: 350px; position: absolute;}
hr{border: 1px solid #333;}
#seller_profile_img{
	position:absolute;
	top:10px;
	left:10px;
	width:100px;
	height:100px;
	border-radius:100%;
	background-color:#e0e0e0;
}
/* 북마크 & 쉐어버튼 */
.bookmark {
	position:absolute;
	top:20px;
	left:500px;
	width:70px;
	height:70px;
	border:none;
	background-color:white;
}
.club_seller_info1{
	position:absolute;
	top:10px;
	left:130px;
}
.club_seller_info_addr{
	position:absolute;
	top:40px;
	left:130px;
}
.club_seller_info_aboutMe{
	position:absolute;
	top:70px;
	left:130px;
}
.club_seller_info2{
	position:absolute;
	top:170px;
	left:0px;
}
a{text-decoration: none; color: #333;}
#review_profile_img{
	width:30px;
	height:30px;
	border-radius:100%;
	background-color:#e0e0e0;
}
#club_review_info_title{ position:absolute; top: 2px;}
#club_review_info_text{ position:absolute; top: 50px; }
#club_review_info_more{ position:absolute; top: 350px; left:500PX;}
#club_member_info_text{ position:absolute; top: 35px; left:0PX;}
#club_date_info_text1{ position:absolute; top: 0px; left:0PX;}
#club_date_info_text2{ position:absolute; top: 60px; left:0PX;}
#club_date_info_text3{ position:absolute; top: 100px; left:0PX;}
#club_detail_text1{	position:absolute; top:0px; left:0px;}
#club_detail_text2{	position:absolute; top:30px; left:0px; width: 480px;}
#club_detail_text3{	position:absolute; top:130px; left:0px;}
#apply_button{	position:absolute; top:250px; left:40px; width: 500px; height: 90px; }
#club_sellerInformation{position:relative; top:380px; left:5px; width:590px; height:120px; }
#club_introduce_title{ position:absolute; top: 0px; left:0PX;}
#club_introduce_textArea{ position:absolute; top: 50px; left:0PX; width: 1200px; height: 400px; overflow: hidden;}
#club_introduce_textArea_more{ position:absolute; top: 0px; left:480PX; width: 200px; height: 40px; }
</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
$(function() {
	

	
	
	if('${clubInfo.categoryName}'!=''){
		if('${clubInfo.categoryName}'=='소셜링'){
			$("#changeLabelColor").css("color","red");
		}else if('${clubInfo.categoryName}'=='클럽'){
			$("#changeLabelColor").css("color","green");			
		}else if('${clubInfo.categoryName}'=='챌린지'){			
			$("#changeLabelColor").css("color","blue");			
		}
	}
	
	
	
	/* 모임판매자 경우 바꾸기  */
	if(${clubInfo.userId eq lsDomain.userId }){
		$("#apply_button").val('수정하기');
		$("#apply_button").removeAttr("onclick");
		$("#apply_button").attr("onclick","clubChangeInfo()");
		
	}//end if
	
	
	/*관심목록 추가기능  */
	$("#heart").click(function() {	
		if( ${not empty lsDomain.userId} ) {
		$("#heart").fadeOut(250).fadeIn(200);
		var src=$(this).attr('src');
		
		if(src=='http://localhost/prj_3/images/heart_on.svg'){
		$(this).attr('src','http://localhost/prj_3/images/heart_off.png');
			interCallAjax(2);
		}//end if
		
		if(src=='http://localhost/prj_3/images/heart_off.png'){
		 $(this).attr('src','http://localhost/prj_3/images/heart_on.svg'); 
		 	interCallAjax(1);
			
		}//end if

		}else{
			alert("로그인 후 이용해주세요");
		}//end else
		
	});//click
	
	
});

function approvalrequest() {
	
	if(${not empty lsDomain.userId}){
		if(${approvalFlag}){
		window.location.href="approvalrequest.do?club_Num=${clubNum}";				
		}else{
			alert("이미 신청한 모임입니다.");
		}
	}else{
		alert("로그인 후 이용해주세요");
	}//end else
}

function clubChangeInfo() {
	location.href="clubModifyForm.do?clubNum=${clubNum}";
}

function interCallAjax(flagcnt) {
	var param={club_Num:${clubNum},userId:'${lsDomain.userId}',flag:flagcnt}	
	$.ajax({
		url:"updateInterestList.do",
		data : param,
		dataType: "text",
		error: function(xhr) {
			alert("문제발생");
			console.log(xhr.status);
		},
		success: function(jsonObj) {
			if(flagcnt==1){
				alert("관심목록에 추가되었습니다.");
			}else{
				alert("관심목록에 삭제되었습니다.");				
			}
		}//success			
	});//ajax	
}//interCallAjax
</script>
<!-- 카카오 지도  -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=e13a6e6c7238e2054c9ce8fa02405bdb"></script>
<script>
$(function() {
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(${clubInfo.longitude},${clubInfo.latitude}), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(${clubInfo.longitude},${clubInfo.latitude}); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
// marker.setMap(null);   
});
</script>
<!-- 카카오 지도  -->
</head>
<body>
<div id="wrap"> <!-- wrap( 1200 x 1200) -->
	<div class="header">
	 <jsp:include page="/header.do" />
	</div><!-- header  -->
	<div id="container">
	
	<div id="club_info_div">
	<div id="club_Carousel">
	
	<div id="carouselExampleIndicators" class="carousel slide">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="4" aria-label="Slide 5"></button>
  </div>
  
  <div class="carousel-inner">
   <c:forEach var="imgs" items="${clubInfo.clubImg}" varStatus="i" begin="0">
     <div class="carousel-item${i.index==0 ?" active":""}">
      <img src="${imgs}" class="d-block w-100" alt="..." height="480px">
    </div>
   </c:forEach> 
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
	
	</div><!-- 캐러셀  -->
	<div id="club_detail">
	<div id="club_detail_text1"><label style="font-weight: bold; font-size: 18px; " id="changeLabelColor" >▶${clubInfo.categoryName}</label></div>
	<div style="font-size: 30px; font-weight: bold;" id="club_detail_text2">${clubInfo.clubName}</div>
	<img src="${interFlag ? 'http://localhost/prj_3/images/heart_on.svg':'http://localhost/prj_3/images/heart_off.png'}" class="bookmark" id="heart">
	<div style="font-size: 30px; font-weight: bold;" id="club_detail_text3"><fmt:formatNumber value="${clubInfo.price}" pattern="#,###" />원</div>
	<span style="font-weight: bold; font-size: 20px;" class="club_seller_info2">후기 ${clubInfo.reviewCnt} | 찜 ${clubInfo.interCnt} | 조회수 ${clubInfo.viewCnt}</span>
	<input type="button" value="신청하기" class="btn btn-outline-dark" id="apply_button" onclick="approvalrequest()" >
	<div id="club_sellerInformation">
	<a href="othersMypageHost.do?userId=${clubInfo.userId}"><img src="${clubInfo.userImg}" onerror="this.onerror=null; this.src='http://localhost/test_mvc/common/images/profile.png';" id="seller_profile_img"/></a>
	<a href="othersMypageHost.do?userId=${clubInfo.userId}"><span style="font-weight: bold; font-size: 20px;" class="club_seller_info1">${clubInfo.nickName} ></span></a>
	<span style="font-weight: bold; font-size: 17px;" class="club_seller_info_addr">${clubInfo.addr} </span>
	<span style="font-weight: bold; font-size: 17px;" class="club_seller_info_aboutMe">${clubInfo.personalIntro}</span>
	</div><!-- club_sellerInformation  -->	
	</div><!--club_detail  -->
	</div><!-- club_info_div  -->
	<div id="hr1"><hr></div>
	<div id="club_review_info">
	<div style="font-weight: bold; font-size: 30px;" id="club_review_info_title"><strong>${clubInfo.reviewCnt}개 후기</strong></div>
	
	<div id="club_review_info_text" >
	
<c:forEach var="review" items="${reviewList}" varStatus="i" begin="0">
<div style="width: 250px; height: 250px; float: left; margin-left: 20px; ">
<div style="font-weight: bold; font-size: 15px;"><a href="othersMypageHost.do?userId=${review.userId}"><img src="${review.userImg}" onerror="this.onerror=null; this.src='http://localhost/test_mvc/common/images/profile.png';" id="review_profile_img"/>${review.nickName}</a></div>
<textarea style="width: 250px; resize: none; height: 200px; outline: none; border: 0px solid #333; background-color: #F3F3F3; font-size: 20px;" readonly="readonly">${review.clubReview }</textarea>
</div>
</c:forEach>

</div><!-- club_review_info_text  -->
<div id="club_review_info_more"><a href="reviewSeeMoreForm.do?clubNum=${clubNum}&selluserId=${clubInfo.userId}"><span style="font-weight: bold; font-size: 20px;">${clubInfo.reviewCnt}개 후기 더보기</span></a></div>
	</div><!-- club_review_info  -->
	<div id="hr2"><hr></div>
	<div id="club_introduce">
	<span style="font-weight: bold; font-size: 25px;" id="club_introduce_title">모임소개</span>
	<div id="club_introduce_textArea">
	${clubInfo.detailTxt}
	</div>
	</div><!-- club_introduce -->
<!-- 	<div id="club_introduce_textArea_more_button_div">
	<input type="button" id="club_introduce_textArea_more" class="btn btn-outline-warning" value="모임소개 더보기" />	
	</div>club_introduce_textArea_more_button_div -->
	<div id="hr3"><hr></div>
	<div id="club_member_info">
	<div id="club_member_info_text"><span style="font-weight: bold; font-size: 20px;"> 인원수: ${clubInfo.numberPeople}명 </span></div>
	</div><!-- club_member_info -->
	<div id="hr4"><hr></div>
	<div id="club_date_info">
	<div id="club_date_info_text1" style="font-weight: bold; font-size: 25px; ">만나는 날짜&시간</div>
	<div id="club_date_info_text2" style="font-weight: bold; font-size: 15px; ">언제까지 모일까요? <fmt:formatDate value="${clubInfo.clubDate}" pattern="yyyy년 MM월 dd일"/></div>
	<div id="club_date_info_text3" style="font-weight: bold; font-size: 15px; ">몇시까지 모일까요? <fmt:formatDate value="${clubInfo.clubDate}" pattern="a hh시 mm분"/></div>
	</div><!-- club_date_info -->
	<div id="hr5"><hr></div>
	<div id="club_place">
	<div id="map" style="width:100%;height:350px;"></div>
	<div style="font-weight: bold; font-size: 25px;">장소명</div>
	<div style="font-weight: bold; font-size: 20px;">${clubInfo.clubAddr}</div>
	</div><!-- club_place -->
	<div id="hr6"><hr></div>
	</div><!-- container  -->
	<div class="container5">
		<jsp:include page="/footer.do" />
	</div><!-- footer  -->
</div>
</body>
</html>