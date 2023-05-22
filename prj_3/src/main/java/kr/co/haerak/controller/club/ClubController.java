package kr.co.haerak.controller.club;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.haerak.service.club.ShowClubService;

/**
 * 민수 페이지 (모임 상세, 등록, 수정, 후기글 페이지)
 * @author user
 */
@Controller
public class ClubController {
	
	@Autowired(required = false)
	private ShowClubService scs;
	
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
		 */
		@GetMapping("/club/clubRegistrationProcess.do")
		public String clubRegistrationProcess(Model model, HttpServletRequest request) {
			
			
			
			return "result";
		}//clubRegistrationProcess
		
		
		
}//class
