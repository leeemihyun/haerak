<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰더보기</title>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<style type="text/css">

#wrap{width: 1900px; height:2400px; margin: 0px auto;  }
#body{width:1900px; height: 2100px; position: relative; }
.hrstyle1{ width:1200px; position: absolute; left: 350px; top: 80px; border-color:#000000; }
.hrstyle2{ width:1200px; position: absolute; left: 350px; top: 550px; border-color:#000000; }
#reviewTitle { position: absolute; left: 350px; top:30px; }
#reviewTitle2 { position: absolute; left: 350px; top:150px; }
#inputReview { position: absolute; left: 350px; top:220px; border: 1px solid #333; width: 1200px; height: 300px; }
#review_profile_img{
	width:50px;
	height:50px;
	border-radius:100%;
	background-color:#e0e0e0;
	position: absolute;
	top: 0px;
	
}
#review_list_profile_img{
	width:50px;
	height:50px;
	border-radius:100%;
	background-color:#e0e0e0;
	position: absolute;
	top: 5px;
}

#host_review_list_profile_img{
	width:50px;
	height:50px;
	border-radius:100%;
	background-color:#e0e0e0;
	position: absolute;
	top: 5px;
	left: 40px;
}
#reviewListTable{
	position: absolute;
	top: 600px;
	left: 350px;
	
}
td{
width: 1200px;
}

.reviewTd{
height: 270px; 
vertical-align: top;
}

.replyTd{
height: 240px; 
vertical-align: top;
background-color: #F6F6F6;
}

#reviewhr{
    background:black;
    height:2px;
    border:0;
}

#clubReview{
resize: none; width: 1197px; height: 200px; position: absolute; top: 50px; border: 0px; outline: none;
}

#reviewListDiv{
width:1197px;
height:270px;
position: relative;

}

#replyListDiv{
width:1197px;
height:240px;
position: relative;

}

#reviewListComment{
resize: none; outline: none; position: absolute; top: 60px; border: 0px; width: 1197px; height: 150px;
}

#replyListComment{
resize: none; outline: none; position: absolute; top: 60px; border: 0px; width: 1157px; height: 150px; left: 40px; background-color: #F6F6F6;
}

</style>
<!-- bootstrap 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap  끝 -->
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
$(function() {
	
});
</script>
</head>
<body>
<div id="wrap">
	<div class="header">
	<jsp:include page="/header.do" />
	</div><!-- header -->
	<div id="body">
	<div id="reviewTitle">
	<span style="font-weight: bold; font-size: 40px;">후기 167개</span>
	</div><!-- reviewTitle  -->
	<hr class="hrstyle1">
	<div id="reviewTitle2">
	<span style="font-weight: bold; font-size: 30px;">후기를 작성해주세요.!</span>
	</div><!-- reviewTitle  -->
	<div id="inputReview" >
	<img src="" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="review_profile_img"/>
	<span style="position: absolute; top: 5px; left: 60px; font-weight: bold; font-size: 25px;">구매자 명</span>
	<textarea id="clubReview" placeholder="값을 입력해주세요" ></textarea>
	<input type="button" value="작성완료" style="position: absolute; top: 253px; left:1100px;" class="btn btn-warning">
	</div>
	<hr class="hrstyle2">
	<table id="reviewListTable">
	<tr>
	<td class="reviewTd" >
	<div id="reviewListDiv">
	<img src="" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="review_list_profile_img"/>
	<span style="position: absolute; top: 5px; left: 60px; font-weight: bold; font-size: 25px;">구매자 명</span>
	<span style="position: absolute; top: 35px; left:60px; font-weight: bold; font-size: 15px;">2023년 04월 22일 오전 10시 40분</span>
	<textarea placeholder="리뷰글" readonly="readonly" id="reviewListComment"></textarea>
	<input type="button" value="답변" style="position: absolute; top: 220px; left:1130px;" class="btn btn-warning">
	</div>
	</td>
	</tr>
	<tr>
	<td class="replyTd">
	<div id="reviewListDiv">
	<img src="http://localhost/prj_3/images/rightarrow.png" style="position: absolute; top: 0px; width: 40px; height: 40px;"/>
	<img src="" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="host_review_list_profile_img"/>
	<span style="position: absolute; top: 5px; left: 100px; font-weight: bold; font-size: 25px;">판매자 명</span>
	<span style="position: absolute; top: 35px; left:100px; font-weight: bold; font-size: 15px;">2023년 04월 22일 오전 10시 40분</span>
	<textarea placeholder="답변글" readonly="readonly" id="replyListComment"></textarea>
	</div>
	</td>
	</tr>
	<tr >
	<td><hr id="reviewhr" /></td>
	</tr>
	<tr>
	<td class="reviewTd">
	<div id="reviewListDiv">
	<img src="" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="review_list_profile_img"/>
	<span style="position: absolute; top: 5px; left: 60px; font-weight: bold; font-size: 25px;">구매자 명</span>
	<span style="position: absolute; top: 35px; left:60px; font-weight: bold; font-size: 15px;">2023년 04월 22일 오전 10시 40분</span>
	<textarea placeholder="리뷰글" readonly="readonly" id="reviewListComment"></textarea>
	<input type="button" value="답변" style="position: absolute; top: 220px; left:1130px;" class="btn btn-warning">
	</div>
	</td>
	</tr>
	<tr >
	<td></td>
	</tr>
	<tr>
	<td><hr id="reviewhr" /></td>
	</tr>
	<tr>
	<td class="reviewTd">
	<div id="replyListDiv">
	<img src="" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="review_list_profile_img"/>
	<span style="position: absolute; top: 5px; left: 60px; font-weight: bold; font-size: 25px;">구매자 명</span>
	<span style="position: absolute; top: 35px; left:60px; font-weight: bold; font-size: 15px;">2023년 04월 22일 오전 10시 40분</span>
	<textarea placeholder="리뷰글" readonly="readonly" id="reviewListComment"></textarea>
	<input type="button" value="답변" style="position: absolute; top: 220px; left:1130px;" class="btn btn-warning">
	</div>
	</td>
	</tr>
	<tr>
	<td></td>
	</tr>
	<tr>
	<td><hr id="reviewhr" /></td>
	</tr>
	</table>
	
	<div id="pageProcess" style="position: absolute; top: 2050px; left: 750px;">
	<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">4</a></li>
    <li class="page-item"><a class="page-link" href="#">5</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
	</div>
	
	</div><!--  body -->
	<div class="container5">
	<jsp:include page="/footer.do" />
	</div><!-- footer -->
</div>
</body>
</html>