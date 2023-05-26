<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.container{position: relative; width: 1200px; height: 500px;}
#div{position: absolute; top: 50px; left: 400px; border-bottom: 1px solid #333; width: 400px}
#msg{position: absolute; top: 200px; left: 450px; width: 400px; height: 300px;}
#btn{position: absolute; top: 300px; left: 500px; width:150px; height: 40px;
	border-radius: 10px;font-size: 15px; border: 1px solid #F7A144;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;cursor: pointer;}
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
</div><!-- header -->
<div id="container">

<form action="" id="frm" method="post">
<div id="div"><h2>회원정보 삭제</h2></div>
<div id="msg">회원님의 정보를 삭제하시겠습니까?</div>
<input type="button" value="확인" id="btn">
</form>
</div><!-- container -->
<div class="footer">
</div><!-- footer -->
</div><!-- wrap -->
</body>
</html>


