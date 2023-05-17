package kr.co.haerak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 민수 페이지 (모임 상세, 등록, 수정, 후기글 페이지)
 * @author user
 */
@Controller
public class ClubController {
	
		/**
		 * 모임상세페이지
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/club/club_info.do")
		public String showClubInfoForm(Model model) {
			
			
			return "club/club_info";
		}//ShowClubInfoForm
	
		

		/**
		 * 하트 클릭 시 관심목록 추가/삭제(ajax)
		 * @param model
		 * @param clubNum
		 */
		@GetMapping("/club/updateInterestList.do")
		public void updateInterestList(Model model,int clubNum) {
			
		}//updateInterestList
		
		

		/**
		 * 후기 더보기 페이지
		 * @param model
		 * @param clubNum
		 * @return
		 */
		@GetMapping("/club/reviewSeeMoreForm.do")
		public String reviewSeeMoreForm(Model model,int clubNum) {
			
			
			return "reviewMore";
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
			
			
			return "result";
		}//clubRegistrationCategoryForm
		
		
		
		/**
		 * 모임등록 폼 페이지
		 * @param model
		 * @return
		 */
		@GetMapping("/club/clubRegistrationForm.do")
		public String clubRegistrationForm(Model model, int categoryNum) {
			
			
			return "result";
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
