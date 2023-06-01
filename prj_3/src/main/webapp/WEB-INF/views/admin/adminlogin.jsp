<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>


<style type="text/css">

.area_login{
height: 670px; 
width: 1200px;
position: relative; 
}

.loginTitle{
position: absolute;
top : 115px;
left: 900px;
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
left: 805px;
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
left: 805px;
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
left:805px;
}

.btn_login{
width: 355px;
height : 65px;
position: absolute;
top : 360px;
left: 805px;

border: none;
border-radius: 5px;
background-color: #F7A144;
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

.div_notice{
position: absolute;
top : 440px;
left: 880px;
width: 260px;
height : 160px;
background-color: #FCE487;
font-weight: bold;
font-size: 15px;
box-shadow: 5px 5px 5px 5px gray
}


</style>
<!-- jQeury CDN 시작  -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQeury CDN 끝  -->
<script type="text/javascript">

$(function() {
	
	$("#btn").click(function() {
		if($("#id").val()==""){
			alert("아이디는 필수 입력!!!");
			$("#id").focus();
			return;
		}//end if

		if($("#pass").val()==""){
			alert("비밀번호는 필수 입력!!!");
			$("#pass").focus();
			return;
		}//end if
			
		if($("#id").val().length>19){
			alert("아이디는 20자 까지만 입력가능");
			$("#id").focus();
			return
		}
		$("#frm").submit();	
	});
	
});

</script>
</head>
<body>

<div class="wrap">

	<div class="header">
		 <a href="http://localhost/prj_3/main.do"><img src="http://localhost/prj_3/images/logo.png" width="150"></a>
	</div><!-- header  -->
	
  <form action="../adminloginProcess.do" method="post"  id="frm" name="frm" >
  <div class="area_login">
     <div class="loginTitle">관리자 로그인</div>
     
     <div class="input_login">
     <input type="text" class="text_input_login"  placeholder="아이디를 입력해주세요" id="id" name="Id"> 
     </div>
     <div class="input_password">
     <input type="password"  class="text_input_password" placeholder="비밀번호를 입력해주세요" id="pass" name="password" > 
     </div>
         
      <div class="div_btn_login">
        <input type="button"  value="로그인" class="btn_login"  id="btn">
     </div>
     <div class="div_notice">
        Note: This is the <br><br>
		Administrator Sign-In Page.<br><br>
		If you don't want to sign in as an<br>
		Administrator, return to the <br>
		<a href="../main.do">standard Sign-in Page.</a>
     </div>
          
  </div><!-- 로그인 -->
 </form>   

	<div class="footer" >
		<c:import url="../main/footer.jsp" />
	</div><!-- footer  -->
   
  </div><!--wrap  -->

</body>
</html>