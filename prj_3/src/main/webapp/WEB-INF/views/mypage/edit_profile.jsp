<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.h1{margin: 0 auto; margin-top:100px; width:250px;}
.pic{margin: auto; margin-top:50px; width:120px;}
.profile_img{width:120px;height:120px;border-radius:50%;}
.editInfo{margin: 10px auto; width:350px;font-size:20px;font-weight:bold; color: #333333; }
.editBtn{margin: 600px; margin-top: 50px; width:100px;height: 40px;border-radius: 10px;font-size: 15px;
		border: 1px solid #F7A144;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;cursor: pointer;}
#idBtn{width:100px;height: 40px;border-radius: 10px;font-size: 15px;
		border: 1px solid #F7A144;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;cursor: pointer;}
#nickname{width:200px;height:30px;}
#intro{width:300px;height:200px;}
a{color: #000000;}
</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
$(function(){

});//ready
</script>

</head>
<body>
<div class="wrap">
<div class="header">

</div>
<div class="container">
<form name="frm" id="frm" action="edit_profile_process.jsp" method="post" enctype="multipart/form-data">
	<div class="h1"><h1>프로필 수정</h1></div>
	<div class="pic">
		<img src="<%-- <%= img %> --%>" onerror="this.onerror=null; this.src='http://localhost/prj3/mypage/images/profile.png';" id="profileImg" class="profile_img">
		 <input id="profileInput"
             type="file"
             name="userImgFile"
             accept="image/*"
             onchange="changeProfileImage();"/>
	</div>
	
	<div class="editInfo">
	<label>닉네임</label><br>
	<input type="text" id="nickname" name="nickName" value="<%--  <%= nickname %> --%> "/>
	<input type="button" id="idBtn" value="중복확인" onclick="openNickPop()"/><br>
	<br>
	<label>자기소개</label><br>
	<textarea id="intro" name="personalIntro" ><%-- <%= intro %> --%></textarea><br>
	</div>


	<div><input type="button" value="수정" class="editBtn" id="editBtn" onclick="checkNull()" /></div>
</form>
</div><!-- container -->
<div class="footer">

</div><!-- footer -->
</div><!-- wrap  -->
</body>
</html>


