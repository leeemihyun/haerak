<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 


<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HAERAK</title>
<style type="text/css">
#wrap{width: 1900px; height : auto; margin: 0px auto;} 
</style>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/review.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 시작 -->

</head>

<body>
<div id="wrap">

  <div class="header"> 
     <jsp:include page="/header.do" />
  </div> <!--header-->

  
<div class="container_review">
 
    <div class="review_cnt">
       <font size="5px"><strong>후기 167 개</strong></font>
    </div><!--review_cnt-->
   
   
    <div class="review_write">
       <font size="4px"><strong>후기를 작성해 주세요!</strong></font>
    </div><!--review_write-->
 
</div><!--container_review-->  


 <div class="div_hr_container_review2"> 
    <hr class="hr_container_review2">
 </div><!--div_hr_container_review2 -->
 
 

<div class="container_review2">

   <div class="purchaser_name">
     <img class="purchaser_profile" src="${MainProdVO.user_profile}"/> 
     <strong>이용자명</strong>
   </div><!--purchaser_name-->


   <div class="review_form">
     <textarea class="form-control" id="exampleFormControlTextarea1" rows="10" ></textarea>
     <button 
     class="btn btn-outline-warning" type="submit" 
     style="position:absolute; right: 10px; top: 270px;">작성완료</button>
   </div><!--review_form-->

</div><!--container_review2 -->



 <div class="div_hr_container_review2"> 
    <hr class="hr_container_review2">
 </div><!--div_hr_container_review2 -->


<div class="container_review3">
     
   
<table class="purchaser_reivew_name">
<tr>
   <td class="purchaser_Col1" rowspan="2">
     <img class="purchaser_profile2" src="${MainProdVO.user_profile}"/>
   </td>
   
   <td class="purchaser_Col2">
     <strong>이용자명</strong>
   </td>
</tr>

<tr>
   <td class="purchaser_Col2">
    날짜
   </td>
</tr>
</table><!-- purchaser_reivew_name -->

   <div class="purchaser_reivew">
     <input class="form-control" type="text" value="Readonly input here..." aria-label="readonly input example" readonly>
    <button 
     class="btn btn-outline-warning" type="submit" 
     style="position:absolute; right: 10px; top: 50px;">답변</button>
   </div><!--purchaser_reivew-->
 
 <div class="seller_review_arrow">
    <img class="seller_review_arrow_img" src="http://localhost/prj_test/images/rightarrow.png">
 </div><!--seller_review_arrow-->  
 

 <table class="seller_reivew_name">
<tr>
   <td class="seller_Col1" rowspan="2">
     <img class="seller_profile" src="${MainProdVO.user_profile}"/>
   </td>
   
   <td class="seller_Col2">
     <strong>판매자명</strong>
   </td>
</tr>

<tr>
   <td class="seller_Col2">
    날짜
   </td>
</tr>
</table><!-- seller_reivew_name -->  
   

     <div class="seller_reivew">
        <textarea class="form-control" id="exampleFormControlTextarea1" rows="10" ></textarea>
        <button 
            class="btn btn-outline-warning" type="submit" 
            style="position:absolute; right: 10px; top: 270px;">작성완료</button>
     </div><!--seller_reivew--> 
   

</div><!--container_review3--> 


<div class="review_footer">
    <jsp:include page="/footer.do" />
</div><!--review_footer-->

</div><!--wrap  -->
</body>
</html>