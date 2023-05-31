package kr.co.haerak.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.haerak.service.admin.ManageMemberService;

@Controller
public class ManageMemberController {

	@Autowired(required = false)
	private ManageMemberService mms;
	
	@RequestMapping(value="/admin/memberlist.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String memberSetSearchProcess() {
		
		return "admin/member_manage";
	}//memberSetSearchProcess
	
	@ResponseBody
	@RequestMapping(value="/admin/memberlistajax.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String memberSearchAjaxProcess(@RequestParam(defaultValue ="na") String userid) {
		String jsonObj= mms.memberSearchService(userid);
		System.out.println(userid);
		return jsonObj;
	}//memberSetSearchProcess

}//class
