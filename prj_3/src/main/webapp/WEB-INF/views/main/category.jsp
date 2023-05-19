<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
    
<!-- 추가 -->
<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
--%>

<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HAERAK</title>

<link rel="stylesheet" type="text/css" href="http://localhost/prj_test/lmh/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_test/lmh/category.css">

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 시작 -->

</head>




<body>
<div class="wrap">

  <div class="header"> 
        <%@ include file="header.jsp" %>
  </div> 

   
   
    <div class="category_container1">
    
    <div class="category_socialring_text">
         <font color="#F43630" size="5px"><strong>◆소셜링</strong></font><br><br>
         <font size="6px"><strong>똑같은 일상을 다채롭게 <br> 만들어 줄 원데이 취향 모임</strong></font><br><br>
         <font size="5px">누구나 열고 참여할 수 있는 원데이 모임,<br></font>
         <font size="5px">소셜링으로 가볍고 즐겁게 만나보세요!</font>
    </div><!--category_socialring_text-->
    
    </div><!--category_container1  -->
   
   
   
  
 <div class="category_container2">
    <select class="form-select" aria-label="Default select example">
       <option selected>지역을 선택해 주세요</option>
       <option value=1>서울</option>
       <option value=2>경기</option>
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
       <option value=13>제주</option>
       <option value=13>대구</option>
       <option value=13>경북</option>
   </select> 
        
 </div><!--category_container2  -->
 
 
<div class="category_container3">


</div><!--category_container3 모임들  -->
        


        
<form action="clubmore.do" method="get">

<div class="category_container4">

<nav aria-label="Page navigation example" class="category_container4_nav">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>

</div><!--category_container4-->

</form>






 <div class="category_footer">
    <%@ include file="footer.jsp" %>
</div><!--category_footer--> 



</div> <!--wrap  -->
</body>
</html>