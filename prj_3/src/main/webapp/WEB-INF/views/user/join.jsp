<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<style type="text/css">
#wrap {
	width: 1200px;
	height: 1200px;
	margin: 0px auto;
	border: 1px solid #333
}

#header {
	height: 80px;
	position: relative;
	border-bottom: 2px solid #5E5E5E
}

#container {
	height: 1800px;
	position: relative;
}

#footer {
	height: 300px;
}

#logo {
	width: 202px;
	height: 54px;
	position: absolute;
	left: 478px;
	top: 13px;
}

#joinMembership {
	width: 300px;
	height: 56px;
	text-align: center;
	font-size: 37px;
	font-weight: bold;
	position: absolute;
	left: 800px;
	top: 9px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E
}

#div1 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 130px;
}

#div2 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 250px;
}

#div3 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 370px;
}

#div4 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 490px;
}

#div5 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 610px;
}

#div6 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 730px;
}

#div7 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 850px;
}

#div8 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 970px;
}

#div9 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 1090px;
}

#div10 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 1190px;
}

#div11 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 1260px;
}

#div12 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 1360px;
}

#div13 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 1480px;
}

#div14 {
	position: absolute;
	width: 500px;
	height: 100px;
	left: 710px;
	top: 1600px;
}

#font1 {
	font-size: 25px;
	font-family: "고딕";
	font-weight: bold;
	color: #333333;
}

#inputBox, #addr, #detailAddr {
	width: 500px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	font-size: 15px;
	cursor: pointer;
}

#zipcode {
	width: 230px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	font-size: 15px;
	cursor: pointer;
}

#addrBtn {
	width: 230px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	font-size: 15px;
	cursor: pointer;
}

#inputBox_tel1 {
	width: 130px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	font-size: 15px;
	cursor: pointer;
}

#inputBox_tel2 {
	width: 350px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	font-size: 15px;
	cursor: pointer;
}

#inputBox_id {
	width: 375px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

#inputBox_nick {
	width: 375px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

#inputBox_birth {
	width: 150px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

#inputBox_email1 {
	width: 195px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

#inputBox_email2 {
	width: 120px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

.inputBox_email1 {
	width: 150px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

.inputBox_email2 {
	width: 150px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

#inputBox_domain {
	width: 150px;
	height: 50px;
	border: 2px solid #333;
	border-radius: 10px;
	color: #5E5E5E;
	cursor: pointer;
}

.idBtn {
	width: 110px;
	height: 50px;
	border-radius: 10px;
	font-size: 15px;
	border: 1px solid #333;
	cursor: pointer;
	background-color: #F7A144;
	color: #FFF;
	font-weight: bold;;
	cursor: pointer;
}

.nickBtn {
	width: 110px;
	height: 50px;
	border-radius: 10px;
	font-size: 15px;
	border: 1px solid #333;
	cursor: pointer;
	background-color: #F7A144;
	color: #FFF;
	font-weight: bold;;
	cursor: pointer;
}

#nextBtn {
	width: 500px;
	height: 50px;
	border: 2px solid #333;
	font-weight: bold;
	border-radius: 10px;
	color: #F7A144;
	font-size: 20px;
	cursor: pointer;
	background-color: #F7A144;
	color: #FFF
}

#id_result1 {
	font-size: 8px;
	color: green;
}

#id_result2 {
	font-size: 8px;
	color: red;
}

#nick_result1 {
	font-size: 8px;
	color: green;
}

#nick_result2 {
	font-size: 8px;
	color: red;
}

#output1 {
	font-size: 8px;
	color: red;
}

#output2 {
	font-size: 8px;
	color: green;
}

#output3 {
	font-size: 8px;
	color: red;
}

#output4 {
	font-size: 8px;
	color: green;
}

#output5 {
	font-size: 8px;
	color: red;
}

#output6 {
	font-size: 8px;
	color: green;
}

#output7 {
	font-size: 8px;
	color: red;
}

#output8 {
	font-size: 8px;
	color: green;
}

#output9 {
	font-size: 8px;
	color: red;
}

#output10 {
	font-size: 8px;
	color: green;
}
</style>
<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- 다음 주소찾기 api -->
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- JQuery CDN  -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
function findZip() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById("zipcode").value = data.zonecode;
            document.getElementById("addr").value = roadAddr;
            //커서 상세주소입력으로 이동
            document.getElementById("detailAddr").focus();

        }
    }).open();
}



function passValid1(){
	var obj=document.frm;
	var userPassword=obj.userPassword.value;
	if(validatePass(userPassword)){
		document.getElementById("output4").innerHTML=""
		document.getElementById("output3").innerHTML=""
	}else{
		document.getElementById("output3").innerHTML="비밀번호는 영문소문자와 숫자를 이용해 8~16 자리 내로 설정하세요."
		document.getElementById("output4").innerHTML=""
	}//end else
}//passValid1

function validatePass(pass){
	var regex = /^[a-z0-9]{8,16}$/;
	return regex.test(pass);
}//validatePass

function passValid2(){
	 var obj=document.frm;
	var userPassword=obj.userPassword.value;
	var pass2=obj.pass2.value;
	
	if(userPassword!=pass2){
		document.getElementById("output1").innerHTML="비밀번호가 일치하지 않습니다."
		document.getElementById("output2").innerHTML=""
	}else{
		document.getElementById("output1").innerHTML=""
		document.getElementById("output2").innerHTML="일치합니다!"
	}//end else 
}//passValid2

function nameValid() {
	 var obj=document.frm;
	var name=obj.userName.value;
	if(validateName(name)){
		document.getElementById("output6").innerHTML=""
		document.getElementById("output5").innerHTML=""
	}else{
		document.getElementById("output5").innerHTML="이름 형식이 아닙니다."
		document.getElementById("output6").innerHTML=""
	}//end else
}//nameValid

function validateName(name){
	var regex = /^[가-힣]{2,10}$/;
	return regex.test(name);
}//validatePass

function emailValid() {
	 var obj=document.frm;
	var email=obj.email.value;
	if(validateEMail(email)){
		document.getElementById("output8").innerHTML=""
		document.getElementById("output7").innerHTML=""
	}else{
		document.getElementById("output7").innerHTML="이메일형식이 아닙니다."
		document.getElementById("output8").innerHTML=""
	}//end else
}//passValid

function validateEMail(email){
	var regex = /^[0-9a-zA-Z]{3,20}$/;
	return regex.test(email);
}//validatePass

function telValid() {
	 var obj=document.frm;
	var tel=obj.tel2.value;
	if(validateEMail(tel)){
		document.getElementById("output10").innerHTML=""
		document.getElementById("output9").innerHTML=""
	}else{
		document.getElementById("output9").innerHTML="전화번호형식이 아닙니다."
		document.getElementById("output10").innerHTML=""
	}//end else
}//telValid()

function validateTel(tel2){
	var regex = /^[0-9]{6,8}$/;
	return regex.test(tel2);
}//validatePass

function checkNull() {
	 var obj=document.frm;
	if(obj.userId.value==""){
		alert("id를 입력하세요.")
		obj.userId.focus();
		return;
	}
	if(obj.userPassword.value==""){
		alert("비밀번호를 입력하세요.")
		obj.userPassword.focus();
		return;
	}
	if(obj.userPassword.value!=obj.pass2.value){
		alert("비밀번호를 확인하세요.")
		obj.pass2.focus();
		return;
	}
	
	if(document.getElementById("output5").innerHTML!=""){//이름 유효성검증 
		alert("이름을 확인하세요")
		obj.name.focus();
		return;
	}
	if(obj.userName.value==""){
		alert("이름을 입력하세요.")
		obj.userName.focus();
		return;
	}
	if(obj.birthDate.value=="2000-01-01"){
		alert("생년월일을 확인하세요.")
		obj.birthDate.focus();
		return;
	}
	if(obj.email.value==""){
		alert("이메일을 입력하세요.")
		obj.email.focus();
		return;
	}
	if(document.getElementById("output7").innerHTML!=""){
		alert("이메일을 확인하세요.")
		obj.email.focus();
		return;
	}
	if(obj.email2.value==""){
		alert("포털사이트를 선택하세요.")
		obj.email2.focus();
		return;
	}
	if(obj.nickName.value==""){
		alert("닉네임 입력하세요.")
		obj.nickName.focus();
		return;
	}
	if(obj.gender.value=="선택없음"){
		alert("성별을 선택하세요.")
		obj.gender.focus();
		return;
	}
	if(obj.zipcode.value==""){
		alert("주소를 입력하세요.")
		obj.addrBtn.focus();
		return;
	}
	if(obj.detailAddr.value==""){
		alert("상세주소를 입력하세요.")
		obj.detailAddr.focus();
		return;
	}
	if(obj.actAreaNum.value=="지역선택"){
		alert("활동지역을 선택하세요.")
		obj.actAreaNum.focus();
		return;
	}
	if(obj.tel2.value==""){
		alert("전화번호를 입력하세요.")
		obj.tel2.focus();
		return;
	}
	if(document.getElementById("output9").innerHTML!=""){//이름 유효성검증 
		alert("전화번호는 숫자만 입력하세요.")
		obj.tel.focus();
		return;
	}
	
	if(document.getElementById("id_result1").innerHTML!="사용가능한 아이디입니다."){//아이디 유효성검증 
		alert("유효하지않은 아이디입니다.")
		obj.userId.focus();
		return;
	}
	
	if(document.getElementById("nick_result1").innerHTML!="사용가능한 닉네임입니다."){//닉네임 유효성검증 
		alert("유효하지않은 닉네임입니다.")
		obj.nickName.focus();
		return;
	}
	
	obj.submit();
	
}//checknull
$(function(){
	  $('#email_select').change(function(){
	   if($('#email_select').val() == "1"){
	    $("#last_email").val(""); //값 초기화
	    $("#last_email").attr("readonly",false);
	   } else if($('#email_select').val() == ""){
	    $("#last_email").val(""); //값 초기화
	    $("#last_email").attr("readonly",true); //textBox 비활성화
	   } else {
	    $("#last_email").val($('#email_select').val()); //선택값 입력
	    $("#last_email").attr("readonly",true); //비활성화
	   }
	  });//change
	  
	 
		 $("#id_dup").click(function() {
			var userId = $("#inputBox_id").val();
			if ( validateId( userId ) ) {//유효성검증이 통과되었을시
				$.ajax({
					url : "id_dup.do",
					data : "userId=" + userId,
					dataType : "text",
					error : function(xhr) {
						console.log(xhr.status)
					},
					success : function(result) {
						if (result == 1) {
							$("#id_result1").html("사용가능한 아이디입니다.");
							$("#id_result2").html("");
						}//end if
						if (result == 0) {
							$("#id_result1").html("");
							$("#id_result2").html("이미 사용중인 아이디입니다!");
						}//end if
					}//success
				});//ajax
			} else {
				alert("아이디는 영어 소문자, 숫자 조합으로 4-15자로 설정해주세요.");
				$("#inputBox_id").focus();
			}//else
		});//click
 		$("#nick_dup").click(function() {
			var nickName = $("#inputBox_nick").val();
			if ( validateNick(nickName) ) {//유효성검증이 통과되었을시
				$.ajax({
					url : "nick_dup.do",
					data : "nickName=" + nickName,
					dataType : "text",
					error : function(xhr) {
						console.log(xhr.status)
					},
					success : function(result) {
						if (result == 1) {
							$("#nick_result1").html("사용가능한 닉네임입니다.");
							$("#nick_result2").html("");
						}//end if
						if (result == 0) {
							$("#nick_result1").html("");
							$("#nick_result2").html("이미 사용중인 닉네임입니다!");
						}//end if
					}//success
				});//ajax
			} else {
				alert("닉네임은 2-8자 한글만 가능합니다.");
				$("#inputBox_nick").focus();
			}//else
		});//click

	});//ready

	function useId() {
		var obj = document.frm;
		var userId = obj.userId.value;
		if (validateId(userId)) {//유효성검증통과
			document.getElementById("id_result1").innerHTML = "";
			document.getElementById("id_result2").innerHTML = "";
			return;
		} else {
			document.getElementById("id_result1").innerHTML = "";
			document.getElementById("id_result2").innerHTML = "영어 소문자, 숫자로 4-15자 내로 사용 가능합니다.";
			return;
		}//end else
	}//useId

	function validateId(id) {
		var regex = /^[a-z0-9]{4,15}$/;
		return regex.test(id);
	}//validateId
	
	function useNick(){
		var obj=document.frm;
		var nickName = obj.nickName.value;

		if(validateNick(nickName)){//유효성검증통과
				document.getElementById("nick_result1").innerHTML = "";
				document.getElementById("nick_result2").innerHTML = "";
				return;
			} else {
				document.getElementById("nick_result1").innerHTML = "";
				document.getElementById("nick_result2").innerHTML = "한글만 2-6자 사용 가능합니다.";
				return;
			}
		
	}//useNick
	
	function validateNick(nickName){
		var regex = /^[가-힣]{2,6}$/;
		return regex.test(nickName);
	} 
</script>
	
</head>
<body>
	<div class="wrap">
		<!-- wrap ( w : 900 x h : 1200) -->
		<div class="header">
			<jsp:include page="/header.do"/>
		</div>
		<form name="frm" action="join_process.do" method="post">
			<div id="container">
				<br> <input type="text" id="joinMembership" value="회원가입"
					readonly="readonly">
				<div id="div1">
					<font id="font1">아이디</font><br> <input type="text"
						id="inputBox_id" name="userId" onkeyup="useId()" placeholder="아이디"
						value=""> <input type="button" id="id_dup" class="idBtn"
						value="중복확인">
					<div id="id_result1"></div>
					<div id="id_result2"></div>
				</div>
				<div id="div2">
					<font id="font1">비밀번호</font><br> <input type="password"
						id="inputBox" name="userPassword" placeholder="비밀번호 입력"
						onkeyup="passValid1()" value="">
					<div id="output3"></div>
					<div id="output4"></div>
				</div>
				<div id="div3">
					<font id="font1">비밀번호 재확인</font><br> <input type="password"
						id="inputBox" name="pass2" placeholder="비밀번호 재입력"
						onkeyup="passValid2()" value=""><br>
					<div id="output1" name="output1"></div>
					<div id="output2"></div>
				</div>
				<div id="div4">
					<font id="font1">이름</font><br> <input type="text"
						id="inputBox" placeholder="이름" name="userName"
						onkeyup="nameValid()" value="${ userName != null? userName : '' }" readonly="readonly">
					<div id="output5"></div>
					<div id="output6"></div>
				</div>

				<div id="div5">
					<font id="font1">생년월일</font><br> <input type="date"
						id="inputBox" name="birthDate" max="2023-12-31" min="1900-01-01"
						value="">

				</div>
				<div id="div6">
					<font id="font1">이메일</font><br> <input type="text"
						class="inputBox_email1" placeholder="이메일" name="email" id="email" value="${ email != null? email : '' }"
						onkeyup="emailValid()" readonly="readonly"><strong>@</strong> <input
						type="text" id="last_email" size="10" class="inputBox_email2" value="${ email2 != null? email2 : '' }"
						name="email2" readonly="readonly"> <select class="inputBox_email2"
						id="email_select" name="email_select">
						<option value="" selected>선택없음</option>
						<option value="gmail.com">gmail.com</option>
						<option value="naver.com">naver.com</option>
						<option value="nate.com">nate.com</option>
						<option value="daum.net">daum.net</option>
						<option value="hotmail.com">hotmail.com</option>
						<option value="1">직접 입력</option>
					</select>
					<div id="output7"></div>
					<div id="output8"></div>

				</div>
				<div id="div7">
					<font id="font1">닉네임</font><br> <input type="text"
						id="inputBox_nick" name="nickName" onkeyup="useNick()"
						placeholder="닉네임" value=""> <input type="button"
						id="nick_dup" class="nickBtn" value="중복확인">
					<div id="nick_result1"></div>
					<div id="nick_result2"></div>
				</div>
				<div id="div8">
					<font id="font1">성별</font><br> <select id="inputBox"
						name="gender">
						<option value="none">선택없음</option>
						<option value="남자" selected="selected">남자</option>
						<option value="여자">여자</option>
					</select>
				</div>
				<div id="div9">
					<font id="font1">주소</font><br> <input type="text" id="zipcode"
						name="zipcode" placeholder="우편번호" readonly="readonly" value="">
					<input type="button" class="idBtn" name="addrBtn" value="주소찾기"
						onclick="findZip()">
				</div>
				<div id="div10">
					<input type="text" id="addr" name="addr" placeholder="주소"
						readonly="readonly" value="">
				</div>
				<div id="div11">
					<input type="text" id="detailAddr" name="detailAddr"
						placeholder="상세주소" value="">
				</div>
				<div id="div12">
					<font id="font1">활동지역</font><br> <select id="inputBox"
						name="actAreaNum">
						<option value="지역선택" selected="selected">지역선택</option>
						<option value=1>서울</option>
						<option value=2>강원</option>
						<option value=3>대전</option>
						<option value=4>충남</option>
						<option value=5>충북</option>
						<option value=6>인천</option>
						<option value=7>경기</option>
						<option value=8>광주</option>
						<option value=9>전남</option>
						<option value=10>전북</option>
						<option value=11>부산</option>
						<option value=12>경남</option>
						<option value=13>울산</option>
						<option value=14>제주</option>
						<option value=15>대구</option>
						<option value=16>경북</option>
					</select>
				</div>
				<div id="div13">
					<font id="font1">전화번호</font><br> <select id="inputBox_tel1"
						name="tel1">
						<option value="010" selected="selected">010</option>
						<option value="011">011</option>
						<option value="017">017</option>
					</select> <input type="text" id="inputBox_tel2" name="tel2"
						placeholder="-없이 입력" maxlength="8" value="" onkeyup="telValid()">
					<div id="output9"></div>
					<div id="output10"></div>
				</div>
				<div id="div14">
					<input type="button" id="nextBtn" value="가입하기"
						onclick="checkNull()">
				</div>
			</div>
		</form>

		<div class="container5">
			<jsp:include page="/footer.do" />
		</div>
		<!--container5  -->
	</div><!-- wrap -->
</body>
</html>