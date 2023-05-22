package kr.co.haerak.controller.user;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.haerak.service.user.InquiryService;
import kr.co.haerak.vo.user.FindIdVO;
import kr.co.haerak.vo.user.FindPassVO;

@Controller
public class InquiryController {
	
	@Autowired
	private InquiryService is;
	
	@GetMapping("/test_find_id.do")
	public String findIdForm() {
		
		return "user/id_inquiry";
	}//findIdForm
	
	@GetMapping("/test_find_pass.do")
	public String findPassForm() {
		
		return "user/pass_inquiry";
	}//findPassForm
	
	@PostMapping("id_inquiry_process.do")
	public String findIdProcess(FindIdVO fiVO, Model model) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		String uri="user/succ_id_inquiry";
		
		String userId=is.idInquiryService(fiVO);
		if(!"".equals(userId)){// 결과가 있을시
			model.addAttribute("userId", userId);
		}else {
			model.addAttribute("flag", 1);
			uri="user/id_inquiry";
		}//end else
		
		
		return uri;
	}//findIdProcess

	@PostMapping("pass_inquiry_process.do")
	public String findpassProcess(FindPassVO fpVO, Model model) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		String uri="mypage/pass";
		
		String userId=is.passInquiryService(fpVO);
		System.out.println(userId);
		if(userId!=null){// 결과가 있을시
			model.addAttribute("userId", userId);
		}else {
			model.addAttribute("flag", 1);
			uri="user/pass_inquiry";
		}//end else
		
		
		return uri;
	}//findIdProcess
	
}//class
