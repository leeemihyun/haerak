package kr.co.haerak.controller.user;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.haerak.service.user.JoinService;
import kr.co.haerak.vo.user.UserDupVO;
import kr.co.haerak.vo.user.UserVO;
import kr.co.sist.util.cipher.DataDecrypt;

@Controller
public class JoinController {
	
	@Autowired
	private JoinService js;
	
	@GetMapping("/join_term.do")
	public String joinTermForm() {
		
		return "user/membership_term";
	}//joinTermForm
	
	@GetMapping("/user_dup.do")
	public String userDupForm() {
		
		
		return "user/user_dup";
	}//joinTermForm
	
	@GetMapping("/test_show_user_dup.do")
	public String showUserDupForm() {
		
		
		return "user/show_joined_id";
	}//joinTermForm
	@GetMapping("/test_join.do")
	public String joinForm() {
		
		
		return "user/join";
	}//joinTermForm
	@GetMapping("/test_succ_join.do")
	public String succJoinForm() {
		
		
		return "user/succ_join";
	}//joinTermForm
	
	@PostMapping("/user_dup_process.do")
	public String userDupProcess(UserDupVO udVO, Model model) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		String uri="user/join";
		if(js.userDupService(udVO)!=null) {//값이 있다면?
			model.addAttribute("userId",js.userDupService(udVO));
			uri= "user/show_joined_id";
			return uri;
		}else {
			DataDecrypt dd = new DataDecrypt("Tkddydgangnamkong");
			String email = dd.decryption( udVO.getEmail() );
			email= email.substring(0,email.indexOf("@") );
			model.addAttribute("userName",udVO.getUserName());
			model.addAttribute("email", email);
			model.addAttribute("email2",udVO.getEmail2());
		}//end else
		
		
		return uri;
	}//joinTermForm
	
	@PostMapping("/join_process.do")
	public String joinProcess(UserVO uVO, HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		String uri="user/succ_join";
		uVO.setIp(request.getRemoteAddr());
		
		int cnt=js.joinService(uVO);
		
		if(cnt!=1) uri="redirect:main/main.jsp";
		
		return uri;
	}//joinTermForm
	
	@ResponseBody
	@GetMapping("/id_dup.do")
	public String idDupProcess(String userId) {
		String result="0";
		int cnt=js.idDupService(userId);
		if(cnt==1)result="1";
		return result;
	}
	
	@ResponseBody
	@GetMapping("/nick_dup.do")
	public String nickDupProcess(String nickName) {
		String result="0";
		int cnt=js.nickDupService(nickName);
		if(cnt==1)result="1";
		return result;
	}
	
	
}//class
