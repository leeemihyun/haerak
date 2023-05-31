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
.intro{position: absolute; top: 240px; left: 350px; font-size: 18px}
.btn1{position: absolute; left: 180px}
.btn2{position: absolute; left: 310px}
.t{position:absolute; top: 50px;}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">
<script type="text/javascript">
$(function(){
	$("#btn1").click(function() {
		$("#frm1").submit();
	});
	
	$("#btn2").click(function() {
		$("#frm2").submit();
	});

	$("#cancel").click(function() {
		$("#frm3").submit();
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
			<div class="profileImg"><img src=${ lsDomain.userImg } onerror="this.onerror=null; this.src='http://localhost/prj3/mypage/images/profile.png'" class="profile_img"></div>
			<div class="nickname">${ lsDomain.nickName }님</div>
			<div class="intro">${ lsDomain.personalIntro }</div>
		</div>
		<div class="content">
		<form action="joinList.do" id="frm1">
			<input type="button" value="확정된 모임" class="btn btn-outline-secondary btn1" id="btn1">
		</form>
		<form action="waitList.do" id="frm2">
			<input type="button" value="수락 대기 모임" class="btn btn-outline-secondary btn2" id="btn2">
		</form>
			<div class="t">
			<table class="table table-hover" style="width: 1000px; text-align: center">
				<thead>
					<tr>
						<th>모임명</th>
						<th>호스트</th>
						<th>모임 날짜</th>
						<th>취 소</th>
					</tr>
				</thead>
				<tbody class="table-group-divider">
				<c:forEach var="list" items="${ list }">
					<tr>
						<td>${ list.clubName }</td>
						<td>${ list.host }</td>
						<td>${ list.clubDate }</td>
						<td><form action="joinList.do" id="frm3">
						<input type="button" value="취소하기" id="cancel" onclick="javascript:location.href='removeWaitList.do?userId=${lsDomain.userId }&clubNum=${list.clubNum }'"></form> </td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			</div>
		</div>
	</div><!-- container -->
	<div class="container5">
   <jsp:include page="/footer.do"/>
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>


