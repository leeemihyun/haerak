<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료</title>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_2/ldk/main.css">

<style type="text/css">
#wrap{ width: 1200px; height: 1200px;margin: 0px auto; border:1px solid #333}
#header{  height: 80px; position: relative; border-bottom: 2px solid #5E5E5E}
#container{  height: 600px;position: relative; }
/* container에 position:relative가 설정되었고  container의 자식 div인 
loginBox는 container의 시작점이 loginBox의 시작좌표가된다.
  */

#footer{  height: 300px;}

#joinMembership{width:300px; height: 56px; text-align: center; font-size: 37px; font-weight: bold; 
				position: absolute; left: 450px; top: 9px; border: 2px solid #333; border-radius: 10px;color:#5E5E5E}
#logo{width:202px; height: 54px;position: absolute; left: 128px; top: 13px;}
#checkbox1{position: absolute; left: 350px; top: 130px;}
#checkbox2{position: absolute; left: 350px; top: 200px;}
#checkbox3{position: absolute; left: 350px; top: 450px;}

#font1{font-size:15px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#font2{font-size:10px;font-family: "맑은고딕"; font-weight:bold; color: #E88935;  }
#font3{font-size:17px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#textarea{width:500px;height: 150px;}
#inputBox{width:500px;height: 50px;font-size: 21px; }
#div1{position: absolute;width:500px;height:100px;left:440px;top: 170px;}
#font1{font-size:21px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#checkBtn{position: absolute; left: 470px; top: 380px; width:130px;height: 50px;
		border: 1px solid #333;cursor: pointer;background-color: #9A58B5;color:#FFF;font-weight: bold;border-radius: 10px;}
#cancelBtn{position: absolute; left: 610px; top: 380px; width:130px;border-radius: 10px;
		height: 50px;
		border: 1px solid #333;
		cursor: pointer;
		background-color: #fff;
		color:#333;
		font-weight: bold}
#colorBtn2{position: absolute; left: 600px; top: 365px; width:180px;height: 50px;font-size:20px;
		border: 1px solid #333;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;border-radius: 10px;}
#whiteBtn2{position: absolute; left: 420px; top: 365px; width:180px;border-radius: 10px;font-size:20px;
		height: 50px;border: 1px solid #333;cursor: pointer;background-color: #fff;color:#333;font-weight: bold}
</style>
<script type="text/javascript">

</script>
</head>
<body>

<div class="wrap"> <!-- wrap ( w : 900 x h : 1200) -->
<div id="header">
	<a href="#void"><img id="logo" alt="logo"  src="http://localhost/spring_mvc/images/haerak.png"></a>
</div>

<form name="frm">
<div id="container">
	<input type="text" id="joinMembership" value="회원가입" readonly="readonly">
	<div id="div1">
		<font id="font1">환영합니다!<br>설레는 도전, 즐거운 모임! 해락입니다.</font>
	</div>
	<a href="#void">
	<input type="button" id="whiteBtn2" value="메인으로 이동"></a>
	<a href="#void">
	<input type="button" id="colorBtn2" value="로그인 하기">
	</a>
</div>
</form>

<div class="footer">

   </div><!-- footer-->
</div><!-- wrap -->
</body>
</html>