<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리 페이지</title>
<style>
#wrap{
width: 1900px; 
height : auto; 
margin: 0px auto;
position: relative;
}
.body{
width: 1900px;
height:800px;
position:relative;
}

hr{
border-color:#000000;
width:1900px;
position:absolute;
}

/* body */
#question{
font-size:30pt;
position:relative;
top:100px;
left:640px;
}

/* 카테고리 버튼 영역 */
.category_area{
position:relative;
top:170px;
left: 750px;
}

.category_button{
width:400px;
height:70px;
border-radius: 5px;
border:none;
font-size:18pt;
cursor: pointer;
background-color: #E0E0E0;
}


/* 확인&취소 버튼 */
.button_area{
position:absolute;
left:750px;
top:600px;
}


.cancel-button{
width:190px;
height:65px;
border: none;
border-radius: 5px;
background-color: #E0E0E0;
color: #F7A144;
font-size: 22px;
font-weight: bold;
margin-right:10px
}

.complete_button{
width: 190px;
height : 65px;
border: none;
border-radius: 5px;
background-color: #F7A144;
color: white;
font-size: 22px;
font-weight: bold;
margin-left:10px
}

</style>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">

<!-- bootstrap 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
<!-- bootstrap 끝 -->

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript">
/* 카테고리 버튼 선택 시 컬러변환 기능 */
$(function() {
	  $("#red_button").click(function() {
	    $(this).css("background-color", "#f43630");
	    $(this).css("color", "#FFFFFF");
	    $("#green_button, #blue_button").css("background-color", "#E0E0E0");
	    $("#green_button, #blue_button").css("color", "#000000");
	    $("#categoryNum").val(1);
	  });
	  
	  $("#green_button").click(function() {
	    $(this).css("background-color", "#1c8a6a");
	    $(this).css("color", "#FFFFFF");
	    $("#red_button, #blue_button").css("background-color", "#E0E0E0");
	    $("#red_button, #blue_button").css("color", "#000000");
	    $("#categoryNum").val(2);
	  });
	  
	  $("#blue_button").click(function() {
	    $(this).css("background-color", "#3498d0");
	    $(this).css("color", "#FFFFFF");
	    $("#red_button, #green_button").css("background-color", "#E0E0E0");
	    $("#red_button, #green_button").css("color", "#000000");
	    $("#categoryNum").val(3);
	  });
	  
	  $("#selectCategory").click(function() {
		  if($("#categoryNum").val()!=0){
			  $("#categoryFrm").submit();
		  }else{
			  alert("카테고리를 선택해주세요.");
		  }
		});
	  
});
</script>
</head>
<body>
<div id="wrap">
  <div class="header">
  <jsp:include page="/header.do" />      
  </div>

<div class="body" >
<label id="question"><strong>멤버들과 어떤 활동을 하고 싶나요?</strong></label>

<div class="category_area">
<input type="button" class="category_button" id="red_button" value="소셜링"/><br/>
<br/>
<input type="button"class="category_button" id="green_button" value="클 럽"/><br/>
<br/>
<input type="button"class="category_button" id="blue_button" value="챌린지"/><br/>
<br/>


</div>




<!-- 확인&취소 버튼 -->
<div class="button_area">
<!-- <hr style="left:-410px;top:-50px;width:1200px;"/> -->
<input type="button"class="cancel-button"value="취소"onclick="javascript:history.back();">
<input type="button"class="complete_button" value="작성완료" id="selectCategory" >
</div><!-- button_area -->
<form action="clubRegistrationForm.do" id="categoryFrm" name="categoryFrm">
<input type="hidden" value="0" name="categoryNum" id="categoryNum">
</form>
</div><!-- body -->
   <div class="container5">
      <jsp:include page="/footer.do" />
   </div><!-- footer-->

</div><!-- wrap -->
</body>
</html>