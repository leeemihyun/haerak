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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
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
</div><!-- header-->
   
   
	<div class="container">
	<div class="info">
	<h2>내 계정정보를 수정하거나 삭제할수 있습니다.</h2>
	
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
     
<div class="container5">
	<jsp:include page="/footer.do"/>
</div><!-- footer-->
</div><!-- wrap -->

</body>
</html>


