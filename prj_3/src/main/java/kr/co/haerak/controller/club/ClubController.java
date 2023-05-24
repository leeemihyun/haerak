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

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.service.club.InsertClubService;
import kr.co.haerak.service.club.ShowClubService;
import kr.co.haerak.vo.club.ClubInsertVO;

/**
 * 민수 페이지 (모임 상세, 등록, 수정, 후기글 페이지)
 * @author user
 */
@Controller
public class ClubController {
	
	@Autowired(required = false)
	private ShowClubService scs;
	
	@Autowired
	private InsertClubService ics;
	
		/**
		 * 모임상세페이지
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/club/club_info.do")
		public String showClubInfoForm(int club_Num,Model model) {
			String userId="";
			userId=(String)model.getAttribute("userId");

			if(userId==null) {
				userId="틀린아이디";
			}
			
			model.addAttribute("clubInfo",scs.showClubService(club_Num));
			model.addAttribute("interFlag",scs.selectInterService(userId, club_Num));
			
			return "club/club_info";
		}//ShowClubInfoForm
	
		

		/**
		 * 하트 클릭 시 관심목록 추가/삭제(ajax)
		 * @param model
		 * @param clubNum
		 */
		@ResponseBody
		@GetMapping("/club/updateInterestList.do")
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
		@GetMapping("/club/approvalrequest.do")
		public String insertapprovalList(Model model,int club_Num) {
			
			String userId="";
			userId=(String)model.getAttribute("userId");

			if(userId==null) {
				userId="틀린아이디";
			}
			
			model.addAttribute("approvalFlag",scs.clubApprovalInsert("abcd4", club_Num));
			model.addAttribute("clubInfo",scs.showClubService(club_Num));
			model.addAttribute("interFlag",scs.selectInterService(userId, club_Num));
			
			return "club/club_info";
		}
		

		/**
		 * 후기 더보기 페이지
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/club/reviewSeeMoreForm.do")
		public String reviewSeeMoreForm(Model model,int clubNum) {
			
			
			return "club/review";
		}//reviewSeeMoreForm	
		
		
		/**
		 *  후기 작성하기(ajax)
		 */
		@GetMapping("/club/reviewInsert.do")
		public void reviewInsert() {
			
		}//reviewInsert	
		
		/**
		 *  답변 작성하기(ajax)
		 */
		@GetMapping("/club/replyInsert.do")
		public void replyInsert() {
			
		}//replyInsert	
		
		
		/**
		 * 모임수정페이지 폼 가기
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/club/clubModifyForm.do")
		public String clubModifyForm(Model model,int clubNum) {
			
			
			return "result";
		}//clubModifyForm
		
		
		
		/**
		 * 모임 수정 페이지에서 작성완료 버튼 누를 시 
		 * @param model
		 * @return
		 */
		@GetMapping("/club/clubModifyProcess.do")
		public String clubModifyProcess(Model model) {
			
			
			return "result";
		}//clubModifyProcess
		
		
		
		/**
		 * 모임 등록하기폼으로 가기 (카테고리 설정 페이지)
		 * @param model
		 * @return
		 */
		@GetMapping("/club/clubRegistrationCategoryForm.do")
		public String clubRegistrationCategoryForm(Model model) {
			
			
			return "club/select_category_page";
		}//clubRegistrationCategoryForm
		
		
		
		/**
		 * 모임등록 폼 페이지
		 * @param model
		 * @return
		 */
		@GetMapping("/club/clubRegistrationForm.do")
		public String clubRegistrationForm(Model model, int categoryNum) {
			
			model.addAttribute("categoryNum",categoryNum);
			model.addAttribute("pageInfo","모임 등록");
			
			return "club/sell_page";
		}//clubRegistrationForm
		
		
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
			
			return "main/main";
		}//clubRegistrationProcess
		
		
		
}//class
