<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#nick_result1 {
	font-size: 8px;
	color: green;
}

#nick_result2 {
	font-size: 8px;
	color: red;
}
.h1{margin: 0 auto; margin-top:100px; width:250px;}
.pic{margin: auto; margin-top:50px; width:120px;}
.profile_img{width:120px;height:120px;border-radius:50%;}
.editInfo{margin: 10px auto; width:350px;font-size:20px;font-weight:bold; color: #333333; }
.editBtn{margin: 600px; margin-top: 50px; width:100px;height: 40px;border-radius: 10px;font-size: 15px;
		border: 1px solid #F7A144;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;cursor: pointer;}
#idBtn{width:100px;height: 40px;border-radius: 10px;font-size: 15px;
		border: 1px solid #F7A144;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;cursor: pointer;}
#nickname{width:200px;height:30px;}
#intro{width:300px;height:200px;}
</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
$(function(){
	$("#nickBtn").click(function() {
		
		var nickName = $("#nickName").val();
		if ( validateNick(nickName) ) {//유효성검증이 통과되었을시
			$.ajax({
				url : "nick_dup.do",
				data : "nickName=" + nickName,
				dataType : "text",
				error : function(xhr) {
					console.log(xhr.status)
				},
				success : function(result) {
					if (result == 1) {
						$("#nick_result1").html("사용가능한 닉네임입니다.");
						$("#nick_result2").html("");
					}//end if
					if (result == 0) {
						$("#nick_result1").html("");
						$("#nick_result2").html("이미 사용중인 닉네임입니다!");
					}//end if
				}//success
			});//ajax
		} else {
			alert("닉네임은 2-8자 한글만 가능합니다.");
			$("#nickName").focus();
		}//else
	});//click
	
	$("#editBtn").click(function() {
		if($("#nick_result2").html()!="" ){
			alert("닉네임 중복확인 버튼을 눌러주세요")
			$("#nickName").focus();
			return;
		}
		if($("#nickName").val()==""){
			alert("닉네임을 입력해주세요.")
			obj.nickname.focus();
			return;
		}
		$("#frm").submit();
		
	});//click
	
});//ready
function validateNick(nickName){
	var regex = /^[가-힣]{2,6}$/;
	return regex.test(nickName);
}
function changeProfileImage() {
	  var obj=document.frm;
 /*  let profileInput = document.getElementById("profileInput"); */

  // let profileInput = $("#profileInput")[0];
  if ( obj.profileInput.files &&  obj.profileInput.files[0]) {
    let reader = new FileReader();
    // onload는 img 데이터를 다 읽은 이후에 발생하는 이벤트
    reader.onload = function(e) {
      document.getElementById('profileImg').src = e.target.result;
    };

    // onload 안에 있는 소스보다 먼저 실행됨. (밑에 있지만)
    reader.readAsDataURL(profileInput.files[0]);
  } else {
    document.getElementById('profileImg').src = "";
  }//end else
}//changProfileImage



</script>

</head>
<body>
<div class="wrap">
<div class="header">

</div>
<div class="container">
<form name="frm" id="frm" action="profileProcess.do" method="post" enctype="multipart/form-data">
	<div class="h1"><h1>프로필 수정</h1></div>
	<div class="pic">
		<img src="${lsDomain.userImg}" onerror="this.onerror=null; this.src='http://localhost/prj_3/images/profile.png';" id="profileImg" class="profile_img">
		 <input id="profileInput"
             type="file"
             name="userImgFile"
             accept="image/*"
             onchange="changeProfileImage();"/>
	</div>
	
	<div class="editInfo">
	<label>닉네임</label><br>
	<input type="text" id="nickName" name="nickName" value="${lsDomain.nickName}"/>
	<input type="button" id="nickBtn" value="중복확인" /><br>
	<div id="nick_result1"></div>
	<div id="nick_result2"></div>
	<br>
	<label>자기소개</label><br>
	<textarea id="intro" name="personalIntro" >${lsDomain.personalIntro}</textarea><br>
	</div>

	<div><input type="button" value="수정" class="editBtn" id="editBtn" /></div>

</form>
</div><!-- container -->
<div class="footer">

</div><!-- footer -->
</div><!-- wrap  -->
</body>
</html>


