package kr.co.haerak.controller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.haerak.domain.main.ClubSalesDomain;
import kr.co.haerak.service.main.ClubMainService;
import kr.co.haerak.service.main.ClubMoreService;
import kr.co.haerak.service.main.ClubSearchService;
import kr.co.haerak.vo.main.SeeMoreVO;

@Controller
public class MainController {
	
	@Autowired(required = false)
	ClubSearchService css;
	
	@Autowired(required = false)
	ClubMoreService cms;
	
	
	@Autowired(required = false)
	ClubMainService cmas;
	
	

	
	
	@RequestMapping(value="/header.do", method= {RequestMethod.GET,RequestMethod.POST})
	public String header() {
		
		return "main/header";
	}
	
	
	@RequestMapping(value="/footer.do", method= {RequestMethod.GET,RequestMethod.POST})
	public String footer() {
		
		return "main/footer";
	}
	
	
	
	@GetMapping("/login.do")
	public String login() {
		
		return "main/login";
	}
	
	
	
	
	//메인에서 모임 순위
	@RequestMapping(value="/main.do", method= {RequestMethod.GET,RequestMethod.POST})
	//@GetMapping("/main.do")
	public String mainRank(Model model) {
		
		model.addAttribute("selectList", cmas.mainRank(1) );
		model.addAttribute("selectList2", cmas.mainRank(2) );
		model.addAttribute("selectList3", cmas.mainRank(3) );
		
		return "main/main";
	}
	
	
	
	
	//검색
	@GetMapping("/club_search.do")
	public String clubSearchProcess(ClubSalesDomain csDomain, Model model) {
		
		model.addAttribute("clubList", css.clubSearchProcess(csDomain));
		
		return "main/category";
	}
	
	
	
	
	// 모임 더보기
	@GetMapping("/category.do")
	public String categoryMore(SeeMoreVO smVO, Model model ) {
		
		model.addAttribute("categoryList", cms.selectMoreClub(smVO));
		
		return "main/category";
	}
	
	
	
	
	
	
	
	

	
	
 

	
	
}
