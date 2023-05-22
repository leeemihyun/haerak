<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모임 작성 페이지</title>


<style>
#wrap{
width: 1900px; 
height : auto; 
margin: 0px auto;
position: relative;
}

.hrsty1{
border-color:#000000;
width:1200px;
position:absolute;
top:140px;
left:350px;
}

.hrsty2{
border-color:#000000;
width:1200px;
position:absolute;
top:230px;
left:350px;
}

.hrsty3{
border-color:#000000;
width:1200px;
position:absolute;
top:560px;
left:350px;
}

.hrsty4{
border-color:#000000;
width:1200px;
position:absolute;
top:1000px;
left:350px;
}

.hrsty5{
border-color:#000000;
width:1200px;
position:absolute;
top:1100px;
left:350px;
}

.hrsty6{
border-color:#000000;
width:1200px;
position:absolute;
top:1210px;
left:350px;
}

.hrsty7{
border-color:#000000;
width:1200px;
position:absolute;
top:1370px;
left:350px;
}

.hrsty8{
border-color:#000000;
width:1200px;
position:absolute;
top:1580px;
left:350px;
}

.hrsty9{
border-color:#000000;
width:1200px;
position:absolute;
top:2100px;
left:350px;
}

.body{
width: 1900px;
height:2500px;
position:relative;

}

.info_title{
position:absolute;
top:50px;
left:400px;
}


/* 제목 */
.title_area{
position:absolute;
left:400px;
top:180px;
}

#input_title{
width:500px;
height:30px;
border-radius: 5px;
left:50px;
padding:0px;
}



 
/* 상품 이미지 */
.img_area{
position:absolute;
height:290px;
left:400px;
top:270px;
}

.input_img{
border: 1px solid #333;
width:250px;
height:250px;
margin-left:60px;
margin-top:0px;
text-align:center;
float:left;
}

#caution{
float:left;
font-size:1.5pt;
color:#0055FF;
line-height:15pt;
margin-left:30px;
margin-top:60px
}

/* 자세한 설명(summernote) */
.explain_area{
position:absolute;
left:400px;
top:600px;
}

/* 참가인원수 설정 */
.member_count_area{
position:absolute;
left:400px;
top:1050px;
}

#input_member{
width:100px;
height:35px;
border-radius: 5px;
text-align:center;
padding:2px;
}
/* 참가비 */
.price_area{
position:absolute;
left:400px;
top:1140px;
}

#input_price{
width:170px;
height:30px;
border-radius: 5px;
padding:2px;
}

.hr_footer{
border: 1px solid #000;
}


.price_none_button{
width:70px;
height:35px;
border: none;
border-radius: 5px;
background-color: #E0E0E0;
font-size: 10pt;
font-weight: bold;
}

.price_button{
width: 70px;
height : 35px;
border: none;
border-radius: 5px;
background-color: #E0E0E0;
font-size: 10pt;
font-weight: bold;
}


/* 날짜&시간 */
.date_area{
position:absolute;
left:400px;
top:1260px;
}

.date{
position:absolute;
}

.time{
position:absolute;
left:300px;
}

/* 진행장소 */
.place_area1{
position:absolute;
left:400px;
top:1420px;
}

#zipcodeSearch{
position: absolute;
width:500px;
height:100px;
}
#zipcode{width:340px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
#addrBtn{width:110px;height: 50px;border-radius: 10px;font-size: 15px;
		border: none;cursor: pointer;background-color: #F7A144;color:#FFF;font-weight: bold;;cursor: pointer;}
#addrSearch{position: absolute;width:500px;height:100px;top:100px;}
#detailAddrInput{position: absolute;width:500px;height:100px;top:100px; left: 470px;}
#addr{width:450px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}
#detailAddr{width:450px;height: 50px;border: 2px solid #333; border-radius: 10px;color:#5E5E5E;font-size: 15px;cursor: pointer;}

.place_area2{
position:absolute;
left:400px;
top:1600px;
}
#mapPointLog{
width:350px;
height:25px;
border:0.5px solid #5E5E5E;
border-radius:5px;
}
/* 확인&취소 버튼 */
.button_area{
position:absolute;
left:760px;
top:2200px;
}

.cancel-button{
width:180px;
height:65px;
border: none;
border-radius: 5px;
background-color: #E0E0E0;
color: #F7A144;
font-size: 22px;
font-weight: bold;
}

.complete_button{
width: 180px;
height : 65px;
border: none;
border-radius: 5px;
background-color: #F7A144;
color: white;
font-size: 22px;
font-weight: bold;
margin-left:20px;
}

.fileInput{
position: absolute;
top: 245px;
left: 325px;
}



</style>
<link rel="stylesheet" type="text/css" href="http://localhost/prj_3/css/headerFooter.css">

<!-- bootstrap 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
<!-- bootstrap 끝 -->

<!-- summernote-lite 시작 -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" 
integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous">
</script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js">
</script>
<!-- summernote-lite 끝 -->

<!-- 달력 Datapicker jQuery -->
<link rel="stylesheet"  href="css/ui-lightness/jquery-ui-1.8.16.custom.css"/>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">

<!-- 달력 Datapicker jQuery 끝 -->

<!-- 시간 timepicker jQuery -->
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.css">
<!-- 시간 timepicker jQuery 끝 -->

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">

function findZip() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById("zipcode").value = data.zonecode;
            document.getElementById("addr").value = roadAddr;
            //커서 상세주소입력으로 이동
            document.getElementById("detailAddr").focus();
/*
            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
            */
        }
    }).open();
}


function changeProfileImage() {
	$("#clubImg").removeAttr("style");
	document.getElementById('imgCnt').innerHTML=0; // 초기세팅 값
    var imgCntElem = document.getElementById('imgCnt');//span 
    const inputElem = document.getElementById('club_img');//file
    const imgElem = document.getElementById('clubImg');//<img>
    const MAX_IMAGES = 5; //올릴 수 있는 이미지 최대 개수
        
    // Check the number of selected files
    if (inputElem.files.length + parseInt(imgCntElem.innerText) > MAX_IMAGES) {
      alert("이미지는 최대 5장까지 업로드 가능합니다.");
      inputElem.value = '';
      return;
    }//end if
    
    // Update the image count
    imgCntElem.innerText = inputElem.files.length + parseInt(imgCntElem.innerText); //이미지 넣은 개수 화면에 알리기
    
    // Read and display each image
    Array.from(inputElem.files).forEach(file => {
      if (!file.type.startsWith('image/')) {
        return;
      }

      const reader = new FileReader();
      reader.onload = function(e) {
        imgElem.src = e.target.result;
      };
      reader.readAsDataURL(file);
    });
 // Read and store each image file
    
}



/* 제목 입력 시 옆에서 문자 카운트  */
function countTextLength() {
  var inputText = document.getElementById("input_title").value; // 입력된 텍스트 값 가져오기
  var textLength = inputText.length; // 텍스트 길이 계산
  var countElement = document.getElementById("text-count"); // 글자 수를 표시할 요소 가져오기
  countElement.innerHTML = textLength + "/20"; // 글자 수 표시
}

$(function() {
	
	/* 달력 */
    $( "#datepicker" ).datepicker();
    dateFormat: "yy:mm:dd"

	/* 시간 */
   $("#timepicker").timepicker();
		
		
	$("#input_price").hide();
	
	$("#price_button").click(function() { //참가비 있음
		$("#input_price").show();
		 $(this).css("background-color", "#F7A144");
		 $(this).css("color", "white");
		 $("#price_none_button").css("background-color", "#E0E0E0");
		 $("#price_none_button").css("color", "black");
	});
	
	$("#price_none_button").click(function() { //참가비 없음
		$("#input_price").hide();
		 $(this).css("background-color", "#F7A144");
		 $(this).css("color", "white");
		 $("#price_button").css("background-color", "#E0E0E0");
		 $("#price_button").css("color", "black");
	});
	
	$("#complete_button").click(function(){
		/* 상품 이미지 */
 		if($("#input_img").val()==""){
			alert("이미지를 넣어주세요."); 
			$("#input_img").focus();
			return;	
		}//end if 
		 
		/* 상품 제목 */
		if($("#input_title").val()==""){
			alert("제목을 입력해주세요"); 
			$("#input_title").focus();
			return;
		}//end if
				
		/* 가격 */
		if($("#price").val()==""){
			alert("가격을 설정해주세요(나눔하기 체크 시 0원으로 입력됩니다!)");
			$("#price").focus();
			return;
		}//end if
		
		/* 자세한 설명 */
	/* 	if($("#input_explain").val()==""){
			alert("상품에 대한 설명을 적어주세요.");
			$("#input_explain").focus();
			return;
		}//end if  */
		
		/* 거래희망장소 */
	/* 	if($("#input_location").val()==""){
			alert("거래장소를 설정해주세요.");
			$("#input_location").focus();
			return;
		}//end if */

		alert("성공적으로 등록되었습니다!");
	});//click
	
	
	
});



</script>
<script src="js/jquery-ui-1.8.16.custom.min.js"></script>
</head>
<body>
<div id="wrap">
  
  <div class="header">
      <jsp:include page="/header.do" /> 
  </div>

  
<div class="body">

<label class="info_title" style="font-size:30pt; margin-top:30px;"><strong>${pageInfo}</strong></label>

<!-- <form id="form" name="form" action="" method="post" enctype="multipart/form-data"> -->

<!-- 제목영역 -->
  <hr class="hrsty1"/>
  <div class="title_area">
  <label for="input_title" style="font-size:15pt"><strong>*모임명</strong></label>
  	<input type="text"  id="input_title" oninput="countTextLength()" maxlength="19"  name="clubName"  value="" >
 
  <span id="text-count">0/20</span>
  </div>
<hr class="hrsty2" />

<!-- 사진영역 -->
<div class="img_area">
  <label style="font-size:15pt"><strong>*이미지를 넣어주세요</strong>(<span id="imgCnt">0</span>/6)</label><br/>
  	<div class="input_img">
  	<img src="" id="clubImg" name="clubImg" class="profile_img" width="100%" height="100%" style="display: none;">
	</div>
	<div id="caution">
	* 상품 이미지는 600x600에 최적화 되어 있습니다.<br/>
	- 상품 이미지는 PC에서는 1:1, 모바일에서는 1:1.23 비율로 보여집니다.<br/>
	- 이미지는 상품 등록 시 정사각형으로 잘려서 등록됩니다.<br/>
	- 이미지를 클릭할 경우 원본 이미지를 확인할 수 있습니다.<br/>
	- 이미지를 클릭 후 이동하여 등록순서를 변경할 수 있습니다.<br/>
	- 큰 이미지일 경우 이미지가 깨지는 경우가 발생할 수 있습니다.<br/>
	최대 지원 사이즈인 640 X 640으로 리사이즈 해서 올려주세요.(개당 이미지 최대 10M)
	</div>
	  	<div class="fileInput">
    	<img src="" id="clubImg" name="clubImg" class="profile_img">
    	<input type="file" id="club_img" name="club_img" accept="image/*" onchange="changeProfileImage()" multiple>
    	<input type="hidden" id="imgFileCnt" name="imgFileCnt" value=""/>
    	</div>
</div>
  
<!-- 자세한 설명 영역 -->
<hr class="hrsty3" />
<div class="explain_area">
<label style="font-size:15pt"><strong>*자세한 설명</strong></label>

    <div id="summernote"></div>
    <script>
      $('#summernote').summernote({
        placeholder: '모임에 관하여 자유롭게 써보세요!',
        tabsize: 2,
        width:800,
        height: 300,
        minHeight:300,
        maxHeight:300,
        toolbar: [
          ['style', ['style']],
          ['font', ['bold', 'underline', 'clear']],
          ['color', ['color']],
          ['para', ['ul', 'ol', 'paragraph']],
          ['table', ['table']],
          ['insert', ['link', 'picture']],
        ]
      });
    </script>
</div>


<!-- 참가인원수 설정 영역 -->
	<hr class="hrsty4" />
<div class="member_count_area">
<label style="font-size:15pt"><strong>*참가인원 수</strong></label>
<select id="input_member" name="numberPeople">
<c:forEach var="i"  begin="1" end="10">
<option value="${i}">${i}명</option>
</c:forEach>
</select>
</div>

<!-- 참가비 설정영역 -->
<hr class="hrsty5"/>
<div class="price_area">
<label for="input_price" style="font-size:15pt"><strong>*참가비</strong></label><br/>
<input type="button" value="없음" class="price_none_button" id="price_none_button"/>
<input type="button" value="있음" class="price_button" id="price_button"/>
<input type="text" id="input_price" placeholder="가격을 입력해주세요"   name="price" value="">
</div>

<!-- 만나는 날짜&시간 영역 -->
<hr class="hrsty6"/>
<div class="date_area">
<label style="font-size:15pt"><strong>*만나는 날짜&시간</strong></label><br/>

<br/>
<label>날짜</label>
<input type="text" id="datepicker" >
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js">

</script>


<label>시간</label>
<input type="text" id="timepicker">
<script src="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.js">
$('#timepicker').timepicker({
    timeFormat: 'h:mm p',
    interval: 30,
    minTime: '6',
    maxTime: '12:0am',
    defaultTime: '12',
    startTime: '12',
    dynamic: false,
    dropdown: true,
    scrollbar: false
});
</script>

</div><!-- 만나는 날짜&시간 영역 끝 -->

<!-- 진행장소 영역 -->
<hr class="hrsty7"/>
<div class="place_area1"> 
<label style="font-size:15pt"><strong>*진행장소</strong></label><br/>
<div id="zipcodeSearch"> 
	<input type="text" id="zipcode" name="zipcode" placeholder="우편번호" readonly="readonly" value="">
	<input type="button" id="addrBtn" name="addrBtn" value="주소찾기" onclick="findZip()">
</div>
<div id="addrSearch"> 
	<input type="text" id="addr" name="addr" placeholder="주소" readonly="readonly" value="">
</div>
<div id="detailAddrInput">
	<input type="text" id="detailAddr" name="detailAddr" placeholder="상세주소" value="">
</div>
</div><!-- place area -->

<hr class="hrsty8"/>
<div class="place_area2">
<label style="font-size:15pt"><strong>*위도 & 경도</strong></label>
<div style="border:1px solid black; border-radius:5px; margin-top:10px; ">
<div id="map" style="width:1100px;height:350px;top:0px;"></div>
<br/>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=caf0ce563dcee6fc6969e7fd2bc71756&libraries=services"></script>
<p style="color:#0055FF;"><em>지도를 클릭해주세요!</em></p> 
<div id="clickLatlng"></div>
<br/>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 지도를 클릭한 위치에 표출할 마커입니다
var marker = new kakao.maps.Marker({ 
    // 지도 중심좌표에 마커를 생성합니다 
    position: map.getCenter() 
}); 
// 지도에 마커를 표시합니다
marker.setMap(map);

// 지도에 클릭 이벤트를 등록합니다
// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
kakao.maps.event.addListener(map, 'click', function(mouseEvent) {        
    
    // 클릭한 위도, 경도 정보를 가져옵니다 
    var latlng = mouseEvent.latLng; 
    
    // 마커 위치를 클릭한 위치로 옮깁니다
    marker.setPosition(latlng);
    
    var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
    message += '경도는 ' + latlng.getLng() + ' 입니다';
    
    var resultDiv = document.getElementById('clickLatlng'); 
    resultDiv.innerHTML = message;
    
});
</script>
</div>
</div>

<!-- 확인&취소 버튼 -->
<hr class="hrsty9"/>
<div class="button_area">
<input type="button"class="cancel-button"value="취소"onclick="javascript:history.back();">
<input type="button" class="complete_button" id="complete_button" value="작성완료">
</div><!-- button_area -->


</div><!-- body -->
<!-- </form>  -->  
   <div class="container5">
      <jsp:include page="/footer.do" />
   </div><!-- footer-->
</div><!-- wrap -->
   
</body>
</html>