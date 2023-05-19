package kr.co.haerak.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/main.do")
	public String main() {
		
		return "main/main";
	}
	
	
	
	@GetMapping("/header.do")
	public String header() {
		
		return "main/header";
	}
	
	
	
	@GetMapping("/footer.do")
	public String footer() {
		
		return "main/footer";
	}
	
	
	
 

	
	
}
