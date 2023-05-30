<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.container{min-height: 900px; position: relative;}
ul li{list-style: none; text-align: center; margin-top: 5px}
.left{top: 200px; left:50px; width: 150px; min-height: 300px;position: absolute;}
.right{ position: absolute;left:200px; width: 900px; height: 300px; }
.content{ position: absolute;top:500px;left:350px; width: 1000px; height: 300px; }
.profile_img{width:120px;height:120px;border-radius:50%; position: absolute; top:200px; left: 150px;}
.nickname{position: absolute; top: 220px; left: 350px; font-size: 20px}
.intro{position: absolute; top: 260px; left: 350px; font-size: 18px}
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
				<li><a class="link-body-emphasis link-offset-2 link-underline-opacity-0 link-underline-opacity-75-hover" href="club/clubRegistrationCategoryForm.do">모임 생성하기</a></li>
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
			<table class="table table-hover" style="width: 600px; text-align: center">
				<thead>
					<tr>
						<th>모임번호</th>
						<th>모임명</th>
						<th>아이디</th>
						<th>승인</th>
						<th>거절</th>
						<th>현재 상태</th>
					</tr>
				</thead>
				<tbody class="table-group-divider">
				<c:forEach var="list" items="${ list }">
					<tr>
						<td>${ list.clubNum }</td>
						<td>${ list.clubName }</td>
						<td><a href="">${list.userId }</a></td>
						<td><a href="approve.do?clubNum=${list.clubNum }&userId=${list.userId}">승인</a></td>
						<td><a href="decline.do?clubNum=${list.clubNum }&userId=${list.userId}">거절</a></td>
						<td>${ list.approvalStatus }</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div><!-- container -->
	<div class="container5">
   <jsp:include page="/footer.do"/>
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>


