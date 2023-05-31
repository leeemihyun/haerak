<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.container{min-height: 900px; position: relative;}
ul li{list-style: none; text-align: center; margin-top: 5px}
.left{top: 200px; left:50px; width: 150px; min-height: 300px;position: absolute;}
.right{ position: absolute;left:200px; width: 900px; height: 300px; }
.content{ position: absolute;top:500px;left:350px; width: 1000px; height: 300px; }
.profile_img{width:120px;height:120px;border-radius:50%; position: absolute; top:200px; left: 150px;}
.nickname{position: absolute; top: 220px; left: 350px; font-size: 20px}
.intro{position: absolute; top: 260px; left: 350px; font-size: 18px}
.grid {
    width: 100%;
    display: grid;
    grid-template-columns: 247px 247px 247px 247px;
}

.likedItem{padding:10px;}

.itemBox{position:relative;width:230px;margin-bottom:20px;cursor:pointer;}
.ThumbNail{width:200px;height:200px;border-radius:5px;object-fit:cover;}
.fDnSDy{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between;}
.ThumbNailTitle{margin-top:7px;color:#454c53;font-size:17px;} @media all and (max-width:800px){.title{font-size:14px;margin-top:5px;}}
.price{color:#000;font-size:22px;}
.fPDVWA{width:39px;height:39px;border:1px solid #ebebeb;border-radius:11px;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-align-items:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;margin-top:7px;} @media all and (max-width:800px){.fPDVWA{width:40px;height:40px;}}
.dfwPrT{width:16px;height:16px;}
.heart_on{position:absolute;bottom:40px;right:35px;width:30px;height:30px;}
.fNGdVx{position:absolute;top:0;}

</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">
<script type="text/javascript">

function heartClick(index) {
		var src=$('#'+index).attr('src');
		var elementId = $(this).attr('id');
		var frm="#frm"+index;
		$("#index").val(elementId);
		 
		$('#'+index).fadeOut(250).fadeIn(200);
		if(src=='http://localhost/prj_3/images/heart_on.svg'){
	   $("#pic").val(src);
	   $(frm).submit();
			$('#'+index).attr('src','http://localhost/prj_3/images/heart_off.png');
		}else if(src=='http://localhost/prj_3/images/heart_off.png'){
			$('#'+index).attr('src','http://localhost/prj_3/images/heart_on.svg');
			 $("#pic").val(src);
			 $(frm).submit();
		}//end else
	
}

$(function() {
 	 $(".heart_on").hover(function() {
 			//마우스 포인터가 들어갔음
	 	$(this).css("width","35px");
	 	$(this).css("height","35px");
 	},
 	function() {
	 		//마우스 포인터가 빠져나갔음
	 	$(this).css("width","30px");
	 	$(this).css("height","30px");
 	}); 
	
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
			<ul>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="hostlist.do">주최한 모임</a></li>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="interest.do">관심목록</a></li>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="joinList.do">참여한 모임</a></li>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="review.do">후기</a></li>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="clubRegistrationCategoryForm.do">모임 생성하기</a></li>
				<br/>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="editProfile.do">프로필 수정</a></li>
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="passChk.do">회원정보 수정</a></li>
			</ul>
		</div>
		<div class="right">
			<div class="profileImg"><img src=${ lsDomain.userImg } onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png'" class="profile_img"></div>
			<div class="nickname">${ lsDomain.nickName }님</div>
			<div class="intro">${ lsDomain.personalIntro }</div>
		</div>
		<div class="content">
		<div class="grid">
<c:forEach var="list" items="${ list }" varStatus="status" >
	<div class="likedItem">
		<div class="itemBox">
		<form action="heart.do" id="frm${status.index}">
		<a href="">
		<input type="hidden" value="${list.clubNum}" name="pNum" id="pNum"/>
		<input type="hidden" value="${status.index}" name="index" id="index"/>
	</form>
		<img src="${ list.clubImg }" class="ThumbNail" id="prdImg"></a>
			<div class="ThumbNailType__ItemInfoBox-sc-1invua-7 fDnSDy">
				<div><!-- info -->
					<div class="ThumbNailTitle"> ${ list.clubName }${list.clubNum} ...</div>
						<div class="price">${ list.clubDate }</div>
				</div>
				<input type="hidden">
				<img src="http://localhost/prj_3/images/heart_on.svg" class="heart_on" id="${ status.index }" name="heart" onclick="heartClick('${status.index}')"/>
				<input type="hidden" value="" name="pic" id="pic"/>
					<div class="SellStateImg__Wrapper-sc-15fv3xr-0 fNGdVx"></div>
			</div>
		</div>
	</div><!-- item -->
</c:forEach>
	</div><!-- grid -->
		</div>
	</div><!-- container -->
	<div class="container5">
   <jsp:include page="/footer.do"/>
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>


