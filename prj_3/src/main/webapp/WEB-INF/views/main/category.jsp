<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
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

<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/category.css">

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->




<script type="text/javascript">


var actiArea=null;
var searchInput=null;


$(function(){

	
	$("#area").change(function(){		
		actiArea=$("#area option").index($("#area option:selected"));
		callClubList(actiArea);
	});
		
	
	callClubList(0);
	
}); 












	function callClubList(actiArea){
		var jsonParam={"searchText": "${searchText}", "categoryNum" : ${category_Num}, "actiAreaNum" : actiArea};
		$.ajax({
			url : "categoryAjax.do",
			data : jsonParam,
			dataType : "JSON",
			error : function( xhr ){
				alert( "서버에서 문제가 발생하였습니다" ); //사용자에게 보여줌
				console.log( "에러코드 : " +xhr.status); //개발자가봄
			},
			success : function(jsonObj){
				var tbody="";
				let cnt=0;
				
				if($("#socialring_popular_table tr").length > 0){
					$("#socialring_popular_table > tbody").empty();
				}
								
				
				$.each(jsonObj.data, function(idx, ele){
					if(cnt%2==0){
						tbody+="</tr><tr>";
					}
					cnt ++;
					tbody+="<td class='prdCol1' colspan='3'><div class='prod_div'><a href='club/club_info.do?club_Num="+ele.club_Num+"'>"+
					"<img class='prod_img' src='"+ele.club_Img+"' /></a></div> </td><td class='prdCol2'><div><strong>"+
					ele.club_name+"</strong><br><br>"+
					ele.price.toLocaleString()+"원<br>"+
					ele.area_name+" "+ele.club_Date+ "<br>";
					
					
				    $.each(ele.userInfo, function(i, ele1){
				   
				        tbody+="<img class='user_profile' src='"+ele1.USER_IMG+"' onerror='this.onerror=null; this.src='http://localhost/prj_3/images/a.png';'/> ";
				    });
					
				    
				    	tbody+=" "+ele.USER_COUNT+"명 / "+ele.number_People+"명";
				    
				    
				    
				    
				    tbody+="</div></td>";
				});
				

				if('${searchText}'==''){
					
				$("#socialring_popular_table").append(tbody);
				}else{
				$("#search_table").append(tbody);
				$("#area").hide();
				$("#search_result_text").html("${searchText} 검색결과 입니다 ");
				}

			}
		});
	}


</script>

</head>




<body>
<div class="wrap">

  <div class="header"> 
        <%@ include file="header.jsp" %>
  </div> 

   
   
<div class="category_container1">
<span id="search_result_text"  ></span>
<table id="search_table">

</table>

 <c:choose>
    <c:when test="${category_Num == 1}">
    
    <div class="category_socialring_text">
         <font color="#F43630" size="5px"><strong>◆소셜링</strong></font><br><br>
         <font size="6px"><strong>똑같은 일상을 다채롭게 <br> 만들어 줄 원데이 취향 모임</strong></font><br><br>
         <font size="5px">누구나 열고 참여할 수 있는 원데이 모임,<br></font>
         <font size="5px">소셜링으로 가볍고 즐겁게 만나보세요!</font>
    </div><!--category_socialring_text-->
   </c:when>
</c:choose> 
 
 
  <c:choose>
    <c:when test="${category_Num == 2}">  
  
    <div class="category_socialring_text">
         <font color="#1C8A6A" size="5px"><strong>◆클럽</strong></font><br><br>
         <font size="6px"><strong>지속형 모임으로 <br> 계속해서 친하게 지내요</strong></font><br><br>
         <font size="5px">나와 같은 관심사를 가진 친구들과<br></font>
         <font size="5px">매일 함께하고 싶다면 클럽에서 만나요!</font>
    </div>
    
     </c:when>
</c:choose> 
    
 
 
 <c:choose>
   <c:when test="${category_Num ==3}">      
    <div class="category_socialring_text">
         <font color="#3498D0" size="5px"><strong>◆챌린지</strong></font><br><br>
         <font size="6px"><strong>같은 목표를 가진 <br> 멤버들과 함께 도전해요</strong></font><br><br>
         <font size="5px">혼자 하기 어려운 큰 목표부터 작은 목표까지<br></font>
         <font size="5px">멤버들과 함께 즐기면서 쉽게 달성해요!</font>
    </div>

    
   </c:when>
</c:choose>
    


</div><!--category_container1-->  
   
  


<form action="clubmore.do" method="get">   
  
 <div class="category_container2">
    <select class="form-select" aria-label="Default select example" name="area" id="area">
       
       <option value="0" selected>지역을 선택해 주세요</option>
       
            <option value="1" ${actiArea_Num eq '1'?"selected='selected'":""}>서울</option>

		    <option value="2" ${actiArea_Num eq '2'?"selected='selected'":""}>강원</option>

				<option value="3" ${actiArea_Num eq '3'?"selected='selected'":""}>대전</option>

				<option value="4" ${actiArea_Num eq '4'?"selected='selected'":""}>충남</option>

				<option value="5" ${actiArea_Num eq '5'?"selected='selected'":""}>충북</option>

				<option value="6" ${actiArea_Num eq '6'?"selected='selected'":""}>인천</option>

				<option value="7" ${actiArea_Num eq '7'?"selected='selected'":""}>경기</option>

				<option value="8" ${actiArea_Num eq '8'?"selected='selected'":""}>광주</option>

				<option value="9" ${actiArea_Num eq '9'?"selected='selected'":""}>전남</option>

				<option value="10" ${actiArea_Num eq '10'?"selected='selected'":""}>전북</option>

				<option value="11" ${actiArea_Num eq '11'?"selected='selected'":""}>부산</option>

				<option value="12" ${actiArea_Num eq '12'?"selected='selected'":""}>경남</option>

				<option value="13" ${actiArea_Num eq '13'?"selected='selected'":""}>울산</option>

				<option value="14" ${actiArea_Num eq '14'?"selected='selected'":""}>제주</option>

				<option value="15" ${actiArea_Num eq '15'?"selected='selected'":""}>대구</option>

				<option value="16" ${actiArea_Num eq '16'?"selected='selected'":""}>경북</option>
			</select> 
        
 </div><!--category_container2  -->
 
 
 
 
<div class="category_container3">

 <table class="socialring_popular_table" id="socialring_popular_table">
  
 </table> <!--popular_sale_table  --> 

</div><!--category_container3 모임들  -->
        

       


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

<!-- </form> -->






 <div class="category_footer">
    <%@ include file="footer.jsp" %>
</div><!--category_footer--> 



</div> <!--wrap  -->
</body>
</html>