package kr.co.haerak.controller.club;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.javassist.Loader.Simple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.service.club.InsertClubService;
import kr.co.haerak.service.club.RegReviewService;
import kr.co.haerak.service.club.ShowClubService;
import kr.co.haerak.vo.club.ClubInsertVO;
import kr.co.haerak.vo.club.ReviewVO;

/**
 * 민수 페이지 (모임 상세, 등록, 수정, 후기글 페이지)
 * @author user
 */
@SessionAttributes("lsDomain")
@Controller
public class ClubController {
	
	@Autowired(required = false)
	private ShowClubService scs;
	
	@Autowired(required = false)
	private InsertClubService ics;
	
	@Autowired(required = false)
	private RegReviewService rrs;
	
		/**
		 * 모임상세페이지
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/club_info.do")
		public String showClubInfoForm(int club_Num,Model model) {
			String userId="";
			userId=(String)model.getAttribute("userId");
			if(userId==null) {
				userId="틀린아이디";
			}
			//LoginSessionDomain lsDomain = new LoginSessionDomain("박존", "안녕하세요", "../images/a.png", "abcd1", "", 1);
			
			//LoginSessionDomain lsDomain=(LoginSessionDomain)model.getAttribute("lsDomain");
			
			//model.addAttribute("lsDomain", lsDomain);
			
			
			model.addAttribute("clubNum",club_Num);
			model.addAttribute("clubInfo",scs.showClubService(club_Num));
			model.addAttribute("interFlag",scs.selectInterService(userId, club_Num));
			model.addAttribute("approvalFlag",scs.approvalCheck("abcd12", club_Num)); //이미 신청한 모임인지 확인
			
			return "club/club_info";
		}//ShowClubInfoForm
	
		

		/**
		 * 하트 클릭 시 관심목록 추가/삭제(ajax)
		 * @param model
		 * @param clubNum
		 */
		@ResponseBody
		@GetMapping("updateInterestList.do")
		public String updateInterestList(int club_Num,String userId,int flag) {
			//System.out.println("웹 파라메터로 넘어온 이름 : "+);
			//Service 생성
			
			scs.updateInterList(userId, club_Num, flag);
			String result="true";
			return result;
		}//updateInterestList
		
		
		/**
		 * 모임신청하기 클릭 
		 * @param model
		 * @param club_Num
		 * @return
		 */
		@GetMapping("/approvalrequest.do")
		public String insertapprovalList(Model model,int club_Num) {
			
			String userId="";
			LoginSessionDomain ls=(LoginSessionDomain)model.getAttribute("lsDomain");
			System.out.println(ls);
			if(userId==null) {
				userId="틀린아이디";
			}
			model.addAttribute("approvalFlag",scs.clubApprovalInsert("abcd12", club_Num));
				
			return "forward:club_info.do";
		}
		

		/**
		 * 후기 더보기 페이지
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/reviewSeeMoreForm.do")
		public String reviewSeeMoreForm(Model model,int clubNum) {
			LoginSessionDomain lsDomain = new LoginSessionDomain("일단", "안녕하세요", "../images/a.png", "abcd2", "", 1);
			model.addAttribute("lsDomain", lsDomain);
			
			
			model.addAttribute("clubNum",clubNum);
			
			return "club/review";
		}//reviewSeeMoreForm	
		
		@ResponseBody
		@GetMapping("/reviewReply.do")
		public String reviewReplyAjax(int clubNum,int currentPage) {
			String jsonObj=scs.showReviewService(clubNum,currentPage);
			
			return jsonObj;
		}
		
		
		/**
		 *  후기 작성하기(do_chain으로 리뷰더보기페이지가기)
		 */
		@GetMapping("/reviewInsert.do")
		public String reviewInsert(Model model,ReviewVO rVO) {
			System.out.println(rVO);
			
			rrs.insertReviewService(rVO);
			model.addAttribute("clubNum",rVO.getClubNum());
			
			return "forward:reviewSeeMoreForm.do";
		}//reviewInsert	
		
		/**
		 *  답변 작성하기(do_chain으로 리뷰더보기페이지가기)
		 */
		@GetMapping("/replyInsert.do")
		public void replyInsert() {
			
		}//replyInsert	
		
		
		/**
		 * 모임수정페이지 폼 가기
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/clubModifyForm.do")
		public String clubModifyForm(Model model,int clubNum) {
			
			model.addAttribute("pageInfo","모임정보 수정");
			model.addAttribute("setClubInfo",ics.setSelectClub(clubNum));
			
			return "club/sell_page";
		}//clubModifyForm
		
		
		

		
		
		
		/**
		 * 모임 등록하기폼으로 가기 (카테고리 설정 페이지)
		 * @param model
		 * @return
		 */
		@GetMapping("/clubRegistrationCategoryForm.do")
		public String clubRegistrationCategoryForm(Model model) {
			
			
			return "club/select_category_page";
		}//clubRegistrationCategoryForm
		
		
		
		/**
		 * 모임등록 폼 페이지
		 * @param model
		 * @return
		 */
		@GetMapping("/clubRegistrationForm.do")
		public String clubRegistrationForm(Model model, int categoryNum) {
			
			model.addAttribute("categoryNum",categoryNum);
			model.addAttribute("pageInfo","모임 등록");
			
			return "club/sell_page";
		}//clubRegistrationForm
		
		
		/**
		 * 모임 수정 페이지에서 작성완료 버튼 누를 시 
		 * @param model
		 * @return
		 */
		@GetMapping("/clubModifyProcess.do")
		public String clubModifyProcess(Model model, HttpServletRequest request) throws IOException {
			System.out.println("컨트롤러");
			File file=new File("C:/Users/user/git/prj_3/prj_3/src/main/webapp/club_images");
			int max=1024*1024*5;
			MultipartRequest mr = new MultipartRequest(request, file.getAbsolutePath(), max, "UTF-8", new DefaultFileRenamePolicy());
			
			LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
			String userId = lsDomain.getUserId();
			int price= Integer.parseInt(mr.getParameter("price"));
			int categoryNum= Integer.parseInt(mr.getParameter("categoryNum"));
			int actiAreaNum= 1;
			int numberPeople= Integer.parseInt(mr.getParameter("numberPeople"));
			int clubNum=Integer.parseInt(mr.getParameter("clubNum"));
			String clubName = mr.getParameter("clubName");
			String detailTxt = mr.getParameter("detailTxt");
			String clubAddr = mr.getParameter("clubAddr");
			String detailAddr = mr.getParameter("detailAddr");
			String latitude = mr.getParameter("latitude");
			String longitude = mr.getParameter("longitude");
			String clubTime = mr.getParameter("clubTime");
			String zipcode = mr.getParameter("zipcode");
			SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
			List<String> clubImg =new ArrayList<String>();
			//String[] clubImgs = mr.getParameterValues("clubImg");
			//System.out.println(clubImgs.toString());
			String imageNames = mr.getParameter("imageNames");
			System.out.println("컨트롤러 이미지명 파라미터 찍어보기 : "+imageNames);
			String[] clubImgs= imageNames.split(",");
			
			for(int i=0; i<clubImgs.length;i++ ) {
				clubImg.add(clubImgs[i]);
			}
			
			java.util.Date date=null;
			try {
				date = sdf.parse(mr.getParameter("clubDate"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date clubDate = new java.sql.Date(date.getTime());
			ClubInsertVO ciVO = new ClubInsertVO(price, categoryNum, actiAreaNum, numberPeople, clubName, detailTxt, clubAddr, detailAddr, userId, latitude, longitude, clubTime, zipcode, clubImg, clubDate);
			
			
			return "result";
		}//clubModifyProcess
		
		/**
		 * 모임 등록페이지에서 작성완료 버튼 클릭
		 * @param model
		 * @param categoryNum
		 * @return
		 * @throws IOException 
		 */
		@PostMapping("/clubRegistrationProcess.do")
		public String clubRegistrationProcess(Model model, HttpServletRequest request) throws IOException {
			System.out.println("컨트롤러");
			File file=new File("C:/Users/user/git/prj_3/prj_3/src/main/webapp/club_images");
			int max=1024*1024*5;
			MultipartRequest mr = new MultipartRequest(request, file.getAbsolutePath(), max, "UTF-8", new DefaultFileRenamePolicy());
			
			LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
			//String userId = lsDomain.getUserId();
			String userId = "abcd1";
			int price= Integer.parseInt(mr.getParameter("price"));
			int categoryNum= Integer.parseInt(mr.getParameter("categoryNum"));
			int actiAreaNum= 1;
			int numberPeople= Integer.parseInt(mr.getParameter("numberPeople"));
			String clubName = mr.getParameter("clubName");
			String detailTxt = mr.getParameter("detailTxt");
			String clubAddr = mr.getParameter("clubAddr");
			String detailAddr = mr.getParameter("detailAddr");
			String latitude = mr.getParameter("latitude");
			String longitude = mr.getParameter("longitude");
			String clubTime = mr.getParameter("clubTime");
			String zipcode = mr.getParameter("zipcode");
			SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
			List<String> clubImg =new ArrayList<String>();
			//String[] clubImgs = mr.getParameterValues("clubImg");
			//System.out.println(clubImgs.toString());
			String imageNames = mr.getParameter("imageNames");
			System.out.println("컨트롤러 이미지명 파라미터 찍어보기 : "+imageNames);
			String[] clubImgs= imageNames.split(",");
			
			for(int i=0; i<clubImgs.length;i++ ) {
				clubImg.add(clubImgs[i]);
			}
			
			java.util.Date date=null;
			try {
				date = sdf.parse(mr.getParameter("clubDate"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date clubDate = new java.sql.Date(date.getTime());;
			ClubInsertVO ciVO = new ClubInsertVO(price, categoryNum, actiAreaNum, numberPeople, clubName, detailTxt, clubAddr, detailAddr, userId, latitude, longitude, clubTime, zipcode, clubImg, clubDate);
			ics.insertClubInfo(ciVO);
			
			return "forward:main.do";
		}//clubRegistrationProcess
		
		
		
}//class
