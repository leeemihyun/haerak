package kr.co.haerak.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.haerak.service.admin.AdminLoginService;
import kr.co.haerak.vo.admin.AdminVO;

@Controller
public class AdminLoginController {

	@Autowired(required = false)
	private AdminLoginService als;
	
	@GetMapping("/admin/adminlogin.do")
	public String adminLoginForm() {
		
		return "admin/adminlogin";
	}
	
	@PostMapping("/adminloginProcess.do")
	public String adminLoginProcess(AdminVO aVO, Model model) {
		
		model.addAttribute("adminLog",als.loginCheckService(aVO));
		
		return "forward:admin/dashboard.do";
	}
}
