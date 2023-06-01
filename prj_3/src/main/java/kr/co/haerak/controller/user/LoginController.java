package kr.co.haerak.controller.user;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.service.user.LoginService;
import kr.co.haerak.vo.user.LoginVO;
@SessionAttributes("lsDomain")
@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService ls;
	
	@GetMapping("login_form.do")
	public String loginForm() {
		
		return "main/login";
	}//loginForm
	
	@PostMapping("/login_process.do")
	public String loginProcess(Model model, LoginVO lVO) throws NoSuchAlgorithmException {
		// userId, userPassword;
		LoginSessionDomain lsDomain = ls.loginService(lVO);
		if(lsDomain==null) {
			model.addAttribute("flag", false);
			return "main/login";
		}//end if
		model.addAttribute("lsDomain", lsDomain);
		return "forward:main.do";
	}//loginForm
	
	@GetMapping("logout_process.do")
	public String logoutProcess(Model model, SessionStatus ss) {
		
		ss.setComplete();
		
		return "redirect:main.do";
	}//logoutProcess
	
	
}//class
