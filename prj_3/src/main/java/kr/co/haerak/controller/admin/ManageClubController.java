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

import kr.co.haerak.service.admin.ManageClubService;

@Controller
public class ManageClubController {
	
	@Autowired(required = false)
	private ManageClubService mcs;
	
	
	
	@RequestMapping(value="/admin/clublist.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String clubSetProcess() {
		
		return "admin/club_manage";
	}
	
	@ResponseBody
	@RequestMapping(value="/admin/clublistajax.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String clubSearchAjaxProcess(@RequestParam(defaultValue = "na") String clubname) {
		String jsonObj= mcs.clubSetSearchService(clubname);
		System.out.println(clubname);
		return jsonObj;
	}
	
	
	
	@PostMapping("/admin/clubDelete.do")
	public String clubDeleteProcess(
			@RequestParam(defaultValue = "1",required = false)int club_num,Model model){
		model.addAttribute("removeFlag",mcs.clubDeleteService(club_num));	
				
		return "admin/club_manage";
		
	}//clubDeleteProcess
}
