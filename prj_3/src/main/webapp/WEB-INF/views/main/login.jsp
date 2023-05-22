<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
    
<!-- 추가 -->
<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
--%>

<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HAERAK</title>

<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/login.css">

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 시작 -->



<script type="text/javascript">
	var flag = '${flag}';
	if(flag!=""){
		alert("아이디나 비밀번호를 다시 확인해주세요");
	}//end if
	

    function chkNull(){
    	if($("#id").val() == ""){
    		alert("아이디를 입력해 주세요");
    		$("#id").focus();
    		return;
    	}//end if
    	if($("#pass").val() == ""){
    		alert("비밀번호를 입력해 주세요");
    		$("#pass").focus();
    		return;
    	}//end if
    	
    	
    	$("#postFrm").submit();
   
}//chkNull

</script>

</head>




<body>
<div class="wrap">

  <div class="header"> 
        <jsp:include page="/header.do"/>
  </div> <!--header-->


<div class="area_login">
     <div class="loginTitle">로그인</div>
</div><!-- area_login -->    
     
     
   
 <div class="login_frm">
 <form id="postFrm"  action="login_process.do" method="post" >
     
     <div class="input_login">
     <input type="text"  id="id" name="userId" class="text_input_login"  placeholder="아이디를 입력해주세요"  autofocus="autofocus"> 
     </div>
     
     <div class="input_password">
    <input type="password"  id="pass" name="userPassword" class="text_input_password" placeholder="비밀번호를 입력해주세요"> 
     </div>
     
     <div class="find_id">
     <a href="http://localhost/prj_2/ldk/id_inquiry.jsp" class="a_find" >아이디찾기</a>
     </div>
     
      <div class="find_password">
      <a href="http://localhost/prj_2/ldk/pass_inquiry.jsp" class="a_find" >비밀번호찾기</a>
     </div>
     
     
     <div class="div_btn_login">
        <input type="button"  value="로그인" class="btn_login"  id="btn" onclick="chkNull()">
     </div>
     
     
      <div class="div_btn_join_member">
        <input type="button"  value="회원가입" class="btn_join_member"  onclick="location.href='join_term.do' ">
     </div>
     
     

</form><!--postFrm  -->    
</div><!--login_frm  -->         


<div class="container5">
    <jsp:include page="/footer.do"/>
</div><!--container5  -->



</div> <!--wrap  -->
</body>
</html>