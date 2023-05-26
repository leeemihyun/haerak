<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

#login_id{
cursor: default; background-color: #ccc;
}
.area_login{
height: 670px; 
width: 1200px;
position: relative; 
}

.loginTitle{
position: absolute;
top : 115px;
left: 500px;
font-weight: bold;
font-size: 25px;
}

.input_login{
width: 350px;
height : 60px;
}

.text_input_login{
width: 350px;
height : 60px;
position: absolute;
top : 185px;
left: 415px;
font-size: 16px;
border-radius: 5px;
border-color: #dcdcde;
}

.input_password{
width: 350px;
height : 60px;
}

.text_input_password{
width: 350px;
height : 60px;
position: absolute;
top : 265px;
left: 415px;
font-size: 16px;
border-radius: 5px;
border-color: #dcdcde;
}

.find_id{
position: absolute;
font-size: 16px;
top : 350px;
left: 570px; 
}

.find_password{
position: absolute;
font-size: 16px;
top : 350px;
left: 670px; 
}

.a_find{
text-decoration: underline;
color: #000
}

.div_btn_login{
width: 350px;
height : 60px;
}

.btn_login{
width: 355px;
height : 65px;
position: absolute;
top : 420px;
left: 415px;

border: none;
border-radius: 5px;
background-color: #8B6FBD;
color: white;
font-size: 22px;
font-weight: bold;
}

.div_btn_join_member{
width: 350px;
height : 60px;
}


.btn_join_member{
width: 355px;
height : 65px;
position: absolute;
top : 500px;
left: 415px;

border: none;
border-radius: 5px;
background-color: #E0E0E0;
color: #8B6FBD;
font-size: 22px;
font-weight: bold;
}
a{color: #000000;}


</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<script type="text/javascript">
$(function(){
	$(".btn_login").click(function() {
		$("frm").submit();
	})
});//ready
</script>

</head>
<body>
<div class="wrap">

<div class="header">
	<jsp:include page="/header.do"/>
</div><!-- header-->
<div class="container">  
	<div class="area_login">
	
	<div class="loginTitle">비밀번호 확인</div>
	<form name="frm" action="passChkProcess.do" method="post">
    <div class="input_login">
    <input type="text" class="text_input_login"  value="<%-- <%= sessionId %> --%>" id="login_id" readonly> 
    </div>
     
    <div class="input_password">
    <input type="password"  class="text_input_password" placeholder="비밀번호를 입력해주세요" name="pass" autofocus="autofocus"> 
    </div>
     
    <div class="find_password">
    <a href="http://localhost/prj_2/ldk/pass_inquiry.jsp" class="a_find" >비밀번호찾기</a>
    </div>
     
    <div class="div_btn_login">
	    <input type="button"  value="확인" class="btn_login"  onclick="checkNull()">
    </div>
    </form>
	</div><!-- 회원정보수정 비밀번호 확인 -->
 </div><!-- container --> 
  
<div class="container5">
	<jsp:include page="/footer.do"/>
</div><!-- footer-->
</div><!--wrap  -->

</body>
</html>


