<%@page import="kr.co.haerak.domain.user.LoginSessionDomain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="header import"
    session="true"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 시작 -->


<script type="text/javascript">
$(function() {
	$("#searchBtn").click(function() {
		var searchText = $("#searchFrm input[name='searchText']").val(); //searchFrm에 input에 이름이 searchText 인거
		if(searchText === ""){        //#searchBtn 이 눌러졌을 때 검색어가 없으면 alert 띄우기
			alert("검색어를 입력해 주세요");
		}else{
			$("#searchFrm").submit();  // 검색어가 있으면 폼을 제출함
		}
		
	});
});
</script>






<c:choose>
	<c:when test="${ empty lsDomain }">
	
<a href="main.do">
<img class="logo" src="http://localhost/prj_3/images/logo.png"></a>

   
   
<div class="navi_socialring">
   <a href="category.do?categoryNum=1" style="color: inherit;" ><font size="4px"><strong>소셜링</strong></font></a><br><br>
</div><!-- navi_socialring -->



<div class="navi_club">
   <a href="category.do?categoryNum=2" style="color: inherit;"><font size="4px"><strong>클럽</strong></font></a><br><br>
</div><!-- navi_club -->


<div class="navi_challenge">
   <a href="category.do?categoryNum=3" style="color: inherit;"><font size="4px"><strong>챌린지</strong></font></a><br><br>
</div><!-- navi_challenge -->


<div class="navi_login">
  <a href="login.do" style="color: inherit;"><font size="4px"><strong>로그인</strong></font></a><br><br>
</div><!-- navi_login  -->



<!-- 검색창  -->
<form class="d-flex" role="search" action="category.do?categoryNum=0&actiAreaNum=0" method="get" name="frmheader" id="searchFrm" >
    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="searchText" >
    <button class="btn btn-outline-warning" type="button" name="searchInput1" id="searchBtn" >Search</button>
</form><!-- 검색창 -->





</c:when>

<c:otherwise>

  
<a href="main.do">
<img class="logo" src="http://localhost/prj_3/images/logo.png"></a>

  
<div class="navi_socialring">
   <a href="category.do?categoryNum=1" style="color: inherit;"><font size="4px"><strong>소셜링</strong></font></a><br><br>
</div><!-- navi_socialring -->



<div class="navi_club">
   <a href="category.do?categoryNum=2" style="color: inherit;"><font size="4px"><strong>클럽</strong></font></a><br><br>
</div><!-- navi_club -->


<div class="navi_challenge">
   <a href="category.do?categoryNum=3" style="color: inherit;"><font size="4px"><strong>챌린지</strong></font></a><br><br>
</div><!-- navi_challenge -->


<div class="navi_mypage">
   <a href="hostlist.do" style="color: inherit;"><font size="4px"><strong>마이페이지</strong></font></a><br><br>
</div><!-- navi_mypage  --> 


<div class="navi_logout">
    <a href="logout_process.do" style="color: inherit;"><font size="4px"><strong>로그아웃</strong></font></a><br><br>
</div><!-- navi_logout  --> 



<!-- 검색창  -->
<form class="d-flex" role="search" action="category.do?categoryNum=0&actiAreaNum=0" method="get" name="frmheader" id="searchFrm">
    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="searchText">
    <button class="btn btn-outline-warning" type="button" name="searchInput1" id="searchBtn" >Search</button>
</form><!-- 검색창 -->

       
</c:otherwise>
</c:choose>
 