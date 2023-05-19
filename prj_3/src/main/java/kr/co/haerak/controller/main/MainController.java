package kr.co.haerak.controller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.haerak.service.main.ClubSearchService;
import kr.co.haerak.vo.main.SeeMoreVO;

@Controller
public class MainController {
	
	@Autowired(required = false)
	ClubSearchService css;
	
	
	
	
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
	
	
	
	
	
	//카테고리별 더보기
	@PostMapping("/category.do")
	public String categoryMore(SeeMoreVO smVO, Model model) {
		
		model.addAttribute("categoryList", css.selectMoreClub(smVO));
		
		return "main/category";
	}
	
	
	
 

	
	
}
