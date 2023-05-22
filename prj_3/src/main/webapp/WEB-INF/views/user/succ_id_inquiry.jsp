<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기 성공</title>

<style type="text/css">
#wrap{ width: 1200px; height: 1200px;margin: 0px auto; border:1px solid #333}
#header{  height: 80px; position: relative; border-bottom: 2px solid #5E5E5E}
#container{  height: 700px;position: relative; }
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
#colorBtn{position: absolute; left: 770px; top: 15px; width:180px;height: 50px;font-size:20px;
		border: 1px solid #333;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;border-radius: 10px;}
#whiteBtn{position: absolute; left: 950px; top: 15px; width:180px;border-radius: 10px;font-size:20px;
		height: 50px;border: 1px solid #333;cursor: pointer;background-color: #fff;color:#333;font-weight: bold}
#colorBtn2{position: absolute; left: 950px; top: 365px; width:180px;height: 50px;font-size:20px;
		border: 1px solid #333;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;border-radius: 10px;}
#whiteBtn2{position: absolute; left: 770px; top: 365px; width:180px;border-radius: 10px;font-size:20px;
		height: 50px;border: 1px solid #333;cursor: pointer;background-color: #fff;color:#333;font-weight: bold}
#div1{position: absolute;width:500px;height:30px;left:710px;top: 115px;border-bottom: 3px solid #5E5E5E}
#div2{position: absolute;width:500px;height:30px;left:710px;top: 200px; text-align: center;}
#div3{position: absolute;width:500px;height:30px;left:710px;top: 280px;}
#font1{font-size:20px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#font2{font-size:10px;font-family: "맑은고딕"; font-weight:bold; color: #E88935;  }
#font3{font-size:22px;font-family: "맑은고딕"; font-weight:bold; color: #333333;  }
#textarea{width:500px;height: 150px;}
#inputBox1{width:500px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;text-align: center;}
#inputBox2{width:200px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
#inputBox3{width:185px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
#nextBtn{width:500px;height: 50px;background-color: #333333; color: #FFF;font-size: 18px;font-weight:bold;
		border-radius: 10px;position: absolute; left:710px; top:370px;cursor: pointer;}
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

<form name="frm">
<div id="container">
	<a href="#void">
	<input type="button" id="colorBtn" value="아이디찾기" >
	</a>
	<a href="#void">
	<input type="button" id="whiteBtn" value="비밀번호찾기" >
	</a>
	<div id="div1">
		<font id="font3">아이디 찾기 성공!</font>
	</div>
	<div id="div2" >
		회원님의 아이디는<br><br>
		<input type="text" id="inputBox1" value="${userId }" readonly="readonly"><br><br>
		입니다.
	</div>
	<div id="div3">
	
	</div>
	<a href="http://localhost/prj_2/lmh/main_login.jsp">
	<input type="button" id="whiteBtn2" value="홈으로">
	</a>
	<a href="http://localhost/prj_2/ldk/pass_inquiry.do?userId=${userId }">
	<input type="button" id="colorBtn2" value="비밀번호 찾기">
	</a>
</div><!-- container -->
</form>

<div class="container5">
   <jsp:include page="/footer.do" />
</div><!--container5  -->
</div><!-- wrap -->
</body>
</html>