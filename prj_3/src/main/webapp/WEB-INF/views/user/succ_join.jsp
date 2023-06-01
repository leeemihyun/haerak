<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료</title>

<style type="text/css">
/* container에 position:relative가 설정되었고  container의 자식 div인 
loginBox는 container의 시작점이 loginBox의 시작좌표가된다.
  */

#wrap{ width: 1200px; height: 1200px;margin: 0px auto; border:1px solid #333}
#header{  height: 80px; position: relative; border-bottom: 2px solid #5E5E5E}
#container{  height: 700px;position: relative; }
#footer{  height: 300px;}
#joinMembership{width:300px; height: 56px; text-align: center; font-size: 37px; font-weight: bold; 
				position: absolute; left: 800px; top: 9px; border: 2px solid #333; border-radius: 10px;color:#5E5E5E}
#logo{width:202px; height: 54px;position: absolute; left: 128px; top: 13px;}
#checkbox1{position: absolute; left: 700px; top: 130px;}
#checkbox2{position: absolute; left: 700px; top: 200px;}
#checkbox3{position: absolute; left: 700px; top: 450px;}

#font1{font-size:15px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#font2{font-size:10px;font-family: "맑은고딕"; font-weight:bold; color: #E88935;  }
#font3{font-size:17px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#textarea{width:500px;height: 150px;}
#inputBox{width:500px;height: 50px;font-size: 21px; }
#div1{position: absolute;width:500px;height:100px;left:790px;top: 170px;}
#font1{font-size:21px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#checkBtn{position: absolute; left: 820px; top: 380px; width:130px;height: 50px;
		border: 1px solid #333;cursor: pointer;background-color: #9A58B5;color:#FFF;font-weight: bold;border-radius: 10px;}
#cancelBtn{position: absolute; left: 960px; top: 380px; width:130px;border-radius: 10px;
		height: 50px;
		border: 1px solid #333;
		cursor: pointer;
		background-color: #fff;
		color:#333;
		font-weight: bold}
#colorBtn2{position: absolute; left: 950px; top: 365px; width:180px;height: 50px;font-size:20px;
		border: 1px solid #333;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;border-radius: 10px;}
#whiteBtn2{position: absolute; left: 770px; top: 365px; width:180px;border-radius: 10px;font-size:20px;
		height: 50px;border: 1px solid #333;cursor: pointer;background-color: #fff;color:#333;font-weight: bold}
</style>
<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">

<script type="text/javascript">

</script>
</head>
<body>

<div class="wrap"> <!-- wrap ( w : 900 x h : 1200) -->
<div class="header">
<jsp:include page="/header.do"/>
</div>

<div id="container">
<form name="frm">
	<input type="text" id="joinMembership" value="회원가입" readonly="readonly">
	<div id="div1">
		<font id="font1">환영합니다!<br>설레는 도전, 즐거운 모임! <br>해락입니다.</font>
	</div>
	<a href="main.do">
	<input type="button" id="whiteBtn2" value="메인으로 이동"></a>
	<a href="lofin_form.do">
	<input type="button" id="colorBtn2" value="로그인 하기">
	</a>
</form>
</div>

<div class="container5">
   <jsp:include page="/footer.do"/>
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>