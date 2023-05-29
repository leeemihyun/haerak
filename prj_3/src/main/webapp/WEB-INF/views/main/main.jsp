<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true"
%>
    
<!-- 추가 -->

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

<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/main.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 시작 -->


<script type="text/javascript">

</script>
</head>




<body>
<div class="wrap">

  <div class="header"> 
        <jsp:include page="/header.do" />
  </div> <!--header-->

   
 <div class="container1">
      <div class="mainImg">
         <img src="http://localhost/prj_3/images/haerak_main.PNG">
      </div><!--mainImg-->
        
 </div><!-- container1 메인사진-->
        
        
  

        
        
<!-----------------------------소셜링---------------------------------------->       
<form method="get">     
        
<div class="container2">
     <div class="socialring_text">
         <font color="#F43630" size="5px"><strong>◆소셜링</strong></font><br><br>
         <font size="6px"><strong>똑같은 일상을 다채롭게 <br> 만들어 줄 원데이 취향 모임</strong></font>
     </div><!--socialring_text-->
 
<table class="socialring_popular_table">
  <tr>
    <c:forEach var="club" items="${socialring}" varStatus="i">
      <c:if test="${i.count <= 4}">
      

        <td class="prdCol1" colspan="3">
        <div class="prod_div">
            <a href="club/club_info.do?club_Num=${club.club_Num}">
            <img class="prod_img" src="${club.club_Img}" /></a>
          </div> 
        </td>
        
        <td class="prdCol2"> 
           <div>
               <strong><c:out value="${club.club_name}" /></strong> <br><br>
               <fmt:formatNumber pattern="#,###,###" value="${club.price}" />원<br>
               <c:out value="${club.area_name}"/>  <fmt:formatDate value="${club.club_Date}" pattern="M.d.(E) a hh시"/> <br>
               
               
               <c:forEach var="user" items="${club.userInfo}">
                  <a href="">
                     <img class="user_profile" src="${user.USER_IMG}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/a.png';"/>
                  </a>
               </c:forEach>
               <c:out value="${club.USER_COUNT}" />명 / <c:out value="${club.number_People}"/>명
           </div>
        </td>

        <c:if test="${i.count % 2 eq 0}">
    </tr>
          
         <tr>
        </c:if>
      </c:if>
    </c:forEach>
  </tr>
</table><!--socialring_popular_table --> 




     
     <div class="socialring_more">
      <a href="http://localhost/prj_3/category.do?categoryNum=1">
      <input type="button" value="더보기 >" class="btnMore"></a>
     </div><!--socialring_more-->
     
</div><!--container2 소셜링-->
</form>



 <!-----------------------------클럽---------------------------------------->     

<div class="container3">
     <div class="club_text">
         <font color="#1C8A6A" size="5px"><strong>◆클럽</strong></font><br><br>
         <font size="6px"><strong>지속형 모임으로 <br> 계속해서 친하게 지내요</strong></font>
     </div><!--club_text-->
     
     
     
<table class="socialring_popular_table">
  <tr>
    <c:forEach var="club" items="${club}" varStatus="i">
      <c:if test="${i.count <= 4}">
      

       <td class="prdCol1" colspan="3">
        <div class="prod_div">
            <a href="club/club_info.do?club_Num=${club.club_Num}">
            <img class="prod_img" src="${club.club_Img}" /></a>
          </div> 
        </td>
        
        <td class="prdCol2"> 
           <div>
               <strong><c:out value="${club.club_name}" /></strong> <br><br>
               <fmt:formatNumber pattern="#,###,###" value="${club.price}" />원<br>
               <c:out value="${club.area_name}"/>  <fmt:formatDate value="${club.club_Date}" pattern="M.d.(E) a hh시"/> <br>
               
               
               <c:forEach var="user" items="${club.userInfo}">
                  <img class="user_profile" src="${user.USER_IMG}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/a.png';"/>
               </c:forEach>
                <c:out value="${club.USER_COUNT}"/>명 /<c:out value="${club.number_People}"/>명
           </div>
        </td>

        <c:if test="${i.count % 2 eq 0}">
    </tr>
          
         <tr>
        </c:if>
      </c:if>
    </c:forEach>
  </tr>
</table><!--socialring_popular_table --> 

     
     
     
     <div class="club_more">
     <a href="http://localhost/prj_3/category.do?categoryNum=2">
        <input type="button" value="더보기 >" class="btnMore">
        </a>
     </div><!--club_more-->
</div><!--containe3 클럽-->






 <!-----------------------------챌린지---------------------------------------->  

<div class="container4">
     <div class="challenge_text">
         <font color="#3498D0" size="5px"><strong>◆챌린지</strong></font><br><br>
         <font size="6px"><strong>같은 목표를 가진 <br> 멤버들과 함께 도전해요</strong></font>
     </div><!--challenge_text-->
     
     
     
<table class="socialring_popular_table">
  <tr>
    <c:forEach var="club" items="${challenge}" varStatus="i">
      <c:if test="${i.count <= 4}">
      

       <td class="prdCol1" colspan="3">
        <div class="prod_div">
            <a href="club/club_info.do?club_Num=${club.club_Num}">
            <img class="prod_img" src="${club.club_Img}" /></a>
          </div> 
        </td>
        
        <td class="prdCol2"> <!-- style="border: 1px solid black;" -->
           <div>
               <strong><c:out value="${club.club_name}" /></strong> <br><br>
               <fmt:formatNumber pattern="#,###,###" value="${club.price}" />원<br>
               <c:out value="${club.area_name}"/>  <fmt:formatDate value="${club.club_Date}" pattern="M.d.(E) a hh시"/> <br>
               
               
               <c:forEach var="user" items="${club.userInfo}">
                  <img class="user_profile" src="${user.USER_IMG}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/a.png';"/>
               </c:forEach>
                <c:out value="${club.USER_COUNT}" />명 / <c:out value="${club.number_People}" />명
           </div>
        </td>

        <c:if test="${i.count % 2 eq 0}">
    </tr>
          
         <tr>
        </c:if>
      </c:if>
    </c:forEach>
  </tr>
</table><!--socialring_popular_table --> 

     
     
     
     
     <div class="challenge_more">
     <a href="http://localhost/prj_3/category.do?categoryNum=3">
        <input type="button" value="더보기 >" class="btnMore">
        </a>
     </div><!--challenge_more-->
</div><!--containe4 챌린지-->
   
   
  
     



<div class="container5">
   <jsp:include page="/footer.do" />
</div><!--container5  -->



</div> <!--wrap  -->
</body>
</html>