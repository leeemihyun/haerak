<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.container{  height: 1100px;position: relative; }
.footer{  height: 300px;}
#logo{width:202px; height: 54px;position: absolute; left: 128px; top: 13px;}
#div0{position: absolute;width:500px;height:100px;left:360px;top: 60px;}
#divName{position: absolute;width:500px;height:100px;left:360px;top: 130px;}
#divEmail{position: absolute;width:500px;height:100px;left:360px;top: 150px;}
#divLoc2{position: absolute;width:500px;height:100px;left:360px;top: 270px;}
#divTel{position: absolute;width:500px;height:100px;left:360px;top: 500px;}
#divLoc{position: absolute;width:500px;height:100px;left:360px;top: 610px;}
#divBtn{position: absolute;width:500px;height:100px;left:360px;top: 750px;}
#font1{font-size:20px;font-family: "고딕"; font-weight:bold; color: #333333; }
#inputBox, #addr, #addr2{width:500px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
#zipcode{width:230px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
.inputBox{width:500px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
.inputBox_id{ background-color: #ccc; width:500px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;cursor: default;}
.inputBox_tel1{width:130px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
.inputBox_tel2{width:350px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
.inputBox_email1{width:150px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;cursor: pointer;}
.inputBox_email2{width:150px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;cursor: pointer;}
#nextBtn{width:500px;height: 50px;border: 2px solid #F7A144;font-weight:bold;
			 border-radius: 10px;font-size: 20px;cursor: pointer;background-color: #F7A144;color:#FFF}
.idBtn{width:110px;height: 50px;border-radius: 10px;font-size: 15px;
		border: 1px solid #F7A144;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;;cursor: pointer;}			 
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
<div class="container">
<div id="div0"><h2>개인정보 수정</h2></div>
<form name="frm" id="frm" action="edit_personal_only_process.jsp" method="post">

<div id="divEmail"> 
	<font id="font1">이메일</font><br>
	<input type="text" class="inputBox_email1" value="<%-- <%= email1 %> --%>" name="email" id="email"><strong>@</strong>
	<input type="text" id="last_email" size="10" class="inputBox_email2" name="email2" id="email2" value="<%-- <%= email2 %> --%>">
	<select class="inputBox_email2" id="email_select" name="email_select">
		<option value="" selected>선택없음</option>
		<option value="gmail.com">gmail.com</option>
		<option value="naver.com">naver.com</option>
		<option value="nate.com">nate.com</option>
		<option value="daum.net">daum.net</option>
		<option value="hotmail.com">hotmail.com</option>
		<option value="1">직접 입력</option>
	</select>
	
</div>

<div id="divLoc2"> 
	<font id="font1">주소</font><br>
	<input type="text" id="zipcode" name="zipcode" id="zipcode" value="<%-- <%= zipcode %> --%>" readonly="readonly"/>
	<input type="button" class="idBtn" name="addrBtn" value="주소찾기"  onclick="findZip()"/>
	<div>
	<input type="text" id="addr" name="addr" readonly="readonly" id="addr" value="<%-- <%= addr %> --%>"/>
	</div>
	<input type="text" id="addr2" name="addr2" id="addr2" value="<%-- <%= detailAddr %> --%>">
</div>

<div id="divLoc"> 
	<font id="font1">활동 지역</font><br>
	<select class="inputBox" name="actLocalNum" id="location">
		<option value="동선택">동선택</option>
		<option value="1">압구정동</option>
		<option value="2">신사동</option>
		<option value="3">청담동</option>
		<option value="4">논현동</option>
		<option value="5">삼성동</option>
		<option value="6">역삼동</option>
		<option value="7">대치동</option>
		<option value="8">도곡동</option>
		<option value="9">개포동</option>
		<option value="10">일원동</option>
		<option value="11">수서동</option>
		<option value="12">자곡동</option>
		<option value="13">율현동</option>
		<option value="14">세곡동</option>
	</select>
</div>

<div id="divTel"> 
	<font id="font1">전화번호</font><br>
	<select class="inputBox_tel1" id="tel">
		<option>010</option>
		<option>011</option>
		<option>017</option>
	</select>
	<input type="text" class="inputBox_tel2" value="<%-- <%= tel %> --%>" maxlength="8" name="tel2" id="tel2">
</div>
<div id="divBtn"> 
	<input type="button" id="nextBtn" value="개인정보 수정">
</div>
</form>
</div>
<!-- container -->
<div class="footer">
</div><!-- footer-->
</div><!-- wrap -->
</body>
</html>


