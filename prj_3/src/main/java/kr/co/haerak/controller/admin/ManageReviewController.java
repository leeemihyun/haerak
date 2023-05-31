package kr.co.haerak.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.haerak.service.admin.ManageReviewService;

@Controller
public class ManageReviewController {

	@Autowired(required = false)
	private ManageReviewService mrs;
	
	@RequestMapping(value="/admin/reviewlist.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String reviewSetSearchProcess() {
	
		return "admin/review_manage";
	}//reviewSetSearchProcess
	
	@ResponseBody
	@RequestMapping(value="/admin/reviewlistajax.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String reviewSearchAjaxProcess(@RequestParam(defaultValue="na") String userid) {
		String jsonObj=mrs.reviewSetSearchService(userid);
		System.out.println(userid);
		return jsonObj;
	}//reviewSetSearchProcess

	@PostMapping("/admin/reviewDelete.do")
	public String reviewDeleteProcess(
			@RequestParam(defaultValue = "1",required = false)int review_num,Model model){
		model.addAttribute("removeFlag",mrs.deleteReviewService(review_num));	
				
		return "admin/club_manage";
		
	}//clubDeleteProcess
	
}//class
