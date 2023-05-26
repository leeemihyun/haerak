<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
<style type="text/css">
.container{height: 600px; margin-top: 100px; position: relative;}
.info{text-align: center}
.div{margin-left: 450px; margin-top: 50px}
a { text-decoration: none; color: #333;}
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

</div><!-- header-->
   
   
	<div class="container">
	<div class="info">
	<h2>내 계정</h2>
	
	</div>
	<div class="div">
	<a href="editPass.do">
	<h3>비밀번호 수정</h3>
	<div>계정의 비밀번호를 수정할 수 있습니다.</div>
	</a>
	</div>
	<div class="div">
	<a href="editPersonal.do">
	<h3>개인정보 수정</h3>
	<div>계정의 개인정보(생년월일, 이메일, 성별, 지역, 전화번호)를 수정할 수 있습니다.</div>
	</a>
	</div>
	<div class="div">
	<a href="deleteAccount.do">
	<h3>회원정보 삭제</h3>
	<div>계정을 삭제할 수 있습니다.</div>
	</a>
	</div>
	

	</div><!-- container -->
     
<div class="footer">

</div><!-- footer-->
</div><!-- wrap -->

</body>
</html>


