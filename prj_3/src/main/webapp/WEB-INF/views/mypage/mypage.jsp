<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.wrap{width: 1400px;min-height: 600px;margin: 0px auto;}
.header{height: 200px}
.container{min-height: 900px; position: relative;}
.left{left:50px; width: 150px; min-height: 300px;position: absolute;}
ul li{list-style: none; text-align: center; margin-top: 10px}
a{ text-decoration: none; color: #333; text-align: center}
.right{ position: absolute;left:260px; width: 900px; height: 300px; }
.content{ position: absolute;top:300px;left:260px; width: 1000px; height: 300px; }
.profile_img{width:120px;height:120px;border-radius:50%; position: absolute; top:25px; left: 100px;}
.nickname{position: absolute; top: 45px; left: 300px;}
.intro{position: absolute; top: 65px; left: 300px;}
.footer{height: 100px}

</style>
<title>마이페이지</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<script type="text/javascript">
$(function(){

});//ready
</script>

</head>
<body>
<div class="wrap">
	<div class="header">
	header
	</div><!-- header -->
	<div class="container">
		<div class="profile">
			<div class="profileImg"><img src="images/profile.png" onerror="this.onerror=null; this.src='http://localhost/prj3/mypage/images/profile.png'" class="profile_img"></div>
			<div class="nickname">xxx님</div>
			<div class="intro">안녕하세요.</div>
		</div>
		<div class="content">
		<form action="">
			<input type="button" value="주최한 모임">
			<input type="button" value="참여한 모임">
		</form>
		<div>
			<div></div>
		</div>
		</div>
	</div><!-- container -->
	<div class="footer">
	footer
	</div><!-- footer -->
</div><!-- wrap -->
</body>
</html>


