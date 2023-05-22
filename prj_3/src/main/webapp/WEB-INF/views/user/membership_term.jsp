<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 약관</title>

<style type="text/css">
#container{  height: 900px;position: relative; }
/* container에 position:relative가 설정되었고  container의 자식 div인 
loginBox는 container의 시작점이 loginBox의 시작좌표가된다.
  */

#footer{  height: 300px;}
#joinMembership{width:300px; height: 56px; text-align: center; font-size: 37px; font-weight: bold; 
				position: absolute; left: 800px; top: 9px; border: 2px solid #333; border-radius: 10px;color:#5E5E5E}
#logo{width:202px; height: 54px;position: absolute; left: 128px; top: 13px;}
#checkbox1{position: absolute; left: 700px; top: 130px;}
#checkbox2{position: absolute; left: 700px; top: 200px;}
#checkbox3{position: absolute; left: 700px; top: 450px;}
#checkBtn{position: absolute; left: 1076px; top: 630px; width:130px;height: 50px;
		border: 1px solid #333;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;border-radius: 10px;}
#cancelBtn{position: absolute; left: 940px; top: 630px; width:130px;border-radius: 10px;
		height: 50px;
		border: 1px solid #333;
		cursor: pointer;
		background-color: #fff;
		color:#333;
		font-weight: bold}
#font1{font-size:15px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#font2{font-size:10px;font-family: "맑은고딕"; font-weight:bold; color: #E88935;  }
#font3{font-size:17px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#textarea{width:500px;height: 150px;}

</style>
<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">
<script type="text/javascript">
function setAll() {
	var obj=document.frm;
	if(obj.chkAll.checked){
		obj.chk1.checked=true;
		obj.chk2.checked=true;
	}else{
		obj.chk1.checked=false;
		obj.chk2.checked=false;
	}//end else
}//setAll

function check() {
	var obj=document.frm;
	if(!(obj.chk1.checked)){
		alert("이용약관 동의는 필수사항입니다!")
		obj.chk1.focus();
	}else if(obj.chk1.checked){
		location.href= "user_dup.do";
	}
	
}
</script>
</head>
<body>

<div class="wrap"> 
<div class="header" >
<jsp:include page="/header.do"/>
</div>
<form name="frm">
<div id="container">
	<input type="text" id="joinMembership" value="회원가입" readonly="readonly">
<div id="checkbox1">
	<input type="checkbox" name="chkAll" id= "chkAll"onclick="setAll()">
	<font id="font3">해락 이용약관 및 개인정보 수집 및 이용에 모두 동의합니다.</font>
</div>
<div id="checkbox2">
	<input type="checkbox" name="chk1" >
	<font id="font1">해락 이용약관에 동의합니다.</font>
	<font id="font2">(필수)</font><br>
	<textarea id="textarea" readonly="readonly">
약관1
	</textarea>
</div>
<div id="checkbox3">
	<input type="checkbox" name="chk2" >
	<font id="font1">개인정보 수집 및 이용에 동의합니다.</font><br>
<textarea id="textarea" readonly="readonly" >
약관2
</textarea>
</div>
<div >
	<input type="button" value="다음" id="checkBtn" onclick="check()">
	<a href="void"><input type="button" value="취소" id="cancelBtn" ></a>
</div>
</div>
</form>

<div class="container5">
   <jsp:include page="/footer.do" />
</div><!--container5  -->
</div>
</body>
</html>