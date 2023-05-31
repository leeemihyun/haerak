<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰더보기</title>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">
<!-- bootstrap 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap  끝 -->
<style type="text/css">
a{text-decoration: none; color: #333;}

#wrap{width: 1900px; min-heigh:100px; margin: 0px auto;  }
#body{width:1900px; min-heigh:100px; position: relative; padding-bottom: 250px; }
.container5{
height: 300px; 
position: relative;
bottom: 0; 
}
.hrstyle1{ width:1200px; position: relative; left: 350px; top: 30px; border-color:#000000; }
.hrstyle2{ width:1200px; position: relative; left: 350px; top: 110px; border-color:#000000; }
#reviewTitle { position: relative; left: 350px; top:40px; width: 500px; }
#reviewTitle2 { position: relative; left: 350px; top:70px; }
#inputReview { position: relative; left: 350px; top:100px; border: 1px solid #333; width: 1200px; height: 300px; }
#review_profile_img{
	width:50px;
	height:50px;
	border-radius:100%;
	background-color:#e0e0e0;
	position: relative;
	top: 0px;
	
}
#review_list_profile_img{
	width:50px;
	height:50px;
	border-radius:100%;
	background-color:#e0e0e0;
	position: relative;
	top: 0px;
}

#host_review_list_profile_img{
	width:50px;
	height:50px;
	border-radius:100%;
	background-color:#e0e0e0;
	position: relative;
	top: 0px;
	left: 10px;
}
#reviewListTable{
	position: relative;
	top: 140px;
	left: 350px;
	
}
td{
width: 1200px;
}

.reviewTd{
height: 270px; 
vertical-align: top;
}

.reviewTdadd{
height: 300px; 
vertical-align: top;
border: 1px solid #333;
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
resize: none; width: 1197px; height: 200px; position: relative; top: 5px; border: 0px; outline: none;
}

#clubReplyArea{
resize: none; width: 1197px; height: 200px; position: relative; top: 5px; border: 0px; outline: none;
}

#reviewListDiv{
width:1197px;
height:270px;
position: relative;

}

#replyinputFrame{
width:1197px;
height:300px;
position: relative;

}

#replyListDiv{
width:1197px;
height:240px;
position: relative;

}

#reviewListComment{
resize: none; outline: none; position: relative; top: 20px; border: 0px; width: 1197px; height: 150px;
}

#replyListComment{
resize: none; outline: none; position: relative; top: 20px; border: 0px; width: 1157px; height: 150px; left: 40px; background-color: #F6F6F6; 
}

.page-link {
color: #F7A144;
background-color: #fff;
border: 1px solid #F7A144; 
}


.page-item.active .page-link {
 z-index: 1;
 color: #555;
 font-weight:bold;
 background-color: #000;
 border-color:  #FF8400;
}



.page-link:focus, .page-link:hover {
  color: #FF8400;
  background-color: #fff; 
  border-color: #FF8400;
}

</style>

<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->

<script type="text/javascript">
$(function() {
	$("#clubReview").val("");
	
	ajaxCall(1);
	
	/* 후기글 */
	$("#reviewInsert").click(function() {
		if(${not empty lsDomain}){
			if($("#clubReview").val().length!=0){
			$("#reviewInserFrm").submit();				
			}else{
				alert("후기글을 작성 후 다시 시도해주세요.");
			}
		}else{
			alert("로그인 후 이용해주세요.");
		}
	});
	
	
});

function ajaxCall(index) {
	if('${clubNum}'!=""){
		$.ajax({
			url:"reviewReply.do",
			data:"clubNum="+${clubNum}+"&currentPage="+index,
			dataType:"json",
			error: function(xhr){
				alert("문제발생");
				console.log(xhr.status);
			},
			success: function(jsonObj){
				
				$("#paginationUL").children().remove();
				if($("#reviewListTable tr").length>1){
				$("#reviewListTable > tbody").remove();					
				}
				/* alert(jsonObj.pageCnt+"/"+jsonObj.currentPage+"/"+jsonObj.pageGroup+"/"+jsonObj.lastNum+"/"+jsonObj.firstNum); */
				var output="";
				var pageoutput="";
				var datacnt=0;
				var reviewCnt=0;
				var startDateCnt=(6*(jsonObj.currentPage-1));
				var endDateCnt=(6*jsonObj.currentPage)-1;
				/* alert(startDateCnt+"/"+endDateCnt); */
				if(!jsonObj.resultFlag){
				output+="<tr><td>조회된 리뷰가 없습니다.</td><tr>";
				}else{
					
					/* 페이지네이션 영역  */
						if(jsonObj.firstNum>5){						
						pageoutput+="<li class='page-item'>"
	      					+"<a class='page-link' href='#' aria-label='Previous' onclick='pageselect("+(jsonObj.firstNum-1)+")'>"
	        				+"<span aria-hidden='true'>&laquo;</span>"
	      					+"</a>"
	    					+"</li>";
						}//end if
	    					for(var i = jsonObj.firstNum; i <= jsonObj.lastNum; i++){
	    					pageoutput+="<li class='page-item'><a class='page-link' href='#' onclick='pageselect("+i+")'>"+i+"</a></li>";
	    					}//end for
	    				if(jsonObj.lastNum!=jsonObj.pageCnt){
	    					pageoutput+="<li class='page-item'>"
	      					+"<a class='page-link' href='#' aria-label='Next' onclick='pageselect("+(jsonObj.lastNum+1)+")'>"
	        				+"<span aria-hidden='true'>&raquo;</span>"
	     					+"</a>"
	    					+"</li>";    					
	    				}//end if
	    					
	    					$("#paginationUL").append(pageoutput);
					/* 페이지네이션 영역 */
					
					$.each(jsonObj.data, function(idx, ele) {
						if(ele.replyNum==0){
							reviewCnt++;
						if(datacnt>=startDateCnt&&datacnt<=endDateCnt){
						output+="<tr>"
							+"<td class='reviewTd' >"
							+"<div id='reviewListDiv'>"
							+"<img src='"+ele.userImg+"' onerror='this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';' id='review_list_profile_img'/>"
							+"<a href='othersMypageHost.do?userId="+ele.userId+"'><span style='position: relative; top: 0px; left: 10px; font-weight: bold; font-size: 25px;'>"+ele.nickName+"</span></a>"
							+"<span style='position: relative; top: 0px; left: 20px; font-weight: bold; font-size: 15px;'>"+ele.writeDate+"</span>"
							+"<textarea placeholder='리뷰글' readonly='readonly' id='reviewListComment'>"+ele.clubReview+"</textarea>";
							if(ele.replyCheck==0 && '${lsDomain.userId}'=='${selluserId}'){
								output+="<input type='button' value='답변' id='replybtn"+idx+"' style='position: relative; top: 18px; left:1130px;' class='btn btn-warning' onclick='replyframeInput("+idx+", "+ele.reviewNum+")'>"							
							}//end if
							output+="</div>"
							+"</td>"
							+"</tr>"
							+"<tr>"
							+"<td class='replyclick"+idx+"'></td>"
							+"</tr>";
							}//end if
						datacnt++;
						}//end if
						if(ele.replyNum!=0){
						if(datacnt>=startDateCnt&&datacnt<=endDateCnt){	
						output+="<tr>"
							+"<td class='replyTd'>"
							+"<div id='reviewListDiv'>"
							+"<img src='http://localhost/prj_3/images/rightarrow.png' style='position: relative; top: 0px; width: 40px; height: 40px;'/>"
							+"<img src='"+ele.userImg+"' onerror='this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';' id='host_review_list_profile_img'/>"
							+"<a href='othersMypageHost.do?userId="+ele.userId+"'><span style='position: relative; top: 0px; left: 10px; font-weight: bold; font-size: 25px;'>"+ele.nickName+"</span></a>"
							+"<span style='position: relative; top: 0px; left:20px; font-weight: bold; font-size: 15px;'>"+ele.writeDate+"</span>"
							+"<textarea placeholder='답변글' readonly='readonly' id='replyListComment'>"+ele.reviewReply+"</textarea>"							
							+"</div>"
							+"</td>"
							+"</tr>";
							}//end if
						datacnt++;
						}//end if
						if(datacnt>=startDateCnt&&datacnt<=endDateCnt){	
						output+="<tr>"
						+"<td><hr id='reviewhr' /></td>"
						+"</tr>";
						}//end if
					});//end each	

					$("#reviewListTable").append(output);
					$("#dataCntInfoTitle").html("후기 "+reviewCnt+"개");
			
				}//end else
				
			}//success
		});//ajax
		}//end if
}


function pageselect(selectPage) {
	ajaxCall(selectPage);
}

function replyframeInput(idx,reviewNum){

		tbody="<form action='replyInsert.do' method='post' id='replyInsertFrm' name='replyInsertFrm'>"
		+"<input type='hidden' name='reviewNum' value='"+reviewNum+"'>"
		+"<input type='hidden' name='clubNum' value='${clubNum}'>"
		+"<input type='hidden' name='userId' value='${selluserId}'>"
		+"<div id='replyinputFrame'>"
		+"<img src='${lsDomain.userImg}' onerror='this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';' id='review_list_profile_img'/>"
		+"<span style='position: relative; top: 5px; left: 10px; font-weight: bold; font-size: 25px;'>${lsDomain.nickName}</span>"
		+"<textarea id='clubReplyArea' placeholder='값을 입력해주세요' name='reviewReply' ></textarea>"
		+"<input type='button' value='작성완료' style='position: relative; top: 0px; left:1100px;' class='btn btn-warning' id='replyInsertbtn' onclick='replybtn()' >"
		+"</div>"
		+"</form>";
		
	$('.replyclick'+idx).append(tbody);
	$('.replyclick'+idx).attr('class','reviewTdadd');
}

function replybtn(){
	/* 답변 */

		if(${not empty lsDomain}){
			if($("#clubReplyArea").val().length!=0){
					$("#replyInsertFrm").submit();
			}else{
				alert("답변글을 작성 후 다시 시도해주세요.");
			}
		}else{
			alert("로그인 후 이용해주세요.");
		}//end else

}//replybtn


</script>
</head>
<body style="overflow-x:hidden; overflow-y:auto;">
<div id="wrap">
	<div class="header" style="text-decoration: none;">
	<jsp:include page="/header.do"/>
	</div><!-- header -->
	<div id="body">
	<div id="reviewTitle">
	<span style="font-weight: bold; font-size: 40px;" id="dataCntInfoTitle"></span>
	</div><!-- reviewTitle  -->
	<hr class="hrstyle1">
	<div id="reviewTitle2">
	<span style="font-weight: bold; font-size: 30px;">후기를 작성해주세요.!</span>
	</div><!-- reviewTitle  -->
	<div id="inputReview" >
	<form action="reviewInsert.do" method="post" id="reviewInserFrm" name="reviewInserFrm">
	<input type="hidden" name="clubNum" value="${clubNum}">
	<input type="hidden" name="userId" value="${lsDomain.userId}">
	<img src="${lsDomain.userImg}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="review_profile_img"/>
	<span style="position: relative; top: 5px; left: 10px; font-weight: bold; font-size: 25px;">${empty lsDomain.nickName ? 'Guest':lsDomain.nickName}</span>
	<textarea id="clubReview" placeholder="후기글을 입력해주세요" name="clubReview" ></textarea>
	<input type="button" value="작성완료" style="position: relative; top: 2px; left:1100px;" class="btn btn-warning" id="reviewInsert">
	</form>
	</div>
	<hr class="hrstyle2">
	<table id="reviewListTable">	
	</table>
	
	<div id="pageProcess" style="position: relative; top:180px; left: 780px;">
	<nav aria-label="Page navigation example">
  <ul class="pagination" id="paginationUL">

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