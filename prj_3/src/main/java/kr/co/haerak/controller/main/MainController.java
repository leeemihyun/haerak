package kr.co.haerak.controller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.haerak.domain.main.ClubSalesDomain;
import kr.co.haerak.service.main.ClubMainService;
import kr.co.haerak.service.main.ClubMoreService;
import kr.co.haerak.vo.main.SeeMoreVO;

@SessionAttributes("lsDomain")
@Controller
public class MainController {
	
	
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
	
	
	
	
	//메인 카테고리별 인기모임
	@RequestMapping(value="/main.do", method= {RequestMethod.GET,RequestMethod.POST})
	public String mainRank(Model model) {
		
		model.addAttribute("socialring", cmas.mainRank(1) );
		model.addAttribute("club", cmas.mainRank(2) );
		model.addAttribute("challenge", cmas.mainRank(3) );
		
		return "main/main";
	}
	
	

	
	// 모임 더보기 ajax 요청 url
	@ResponseBody
	@RequestMapping(value="/categoryAjax.do", method= {RequestMethod.GET})
	public String categoryMoreAjax(Model model, SeeMoreVO smVO,int currentPage1) {
		String jsonObj =cms.selectMoreClub(smVO,currentPage1);
		
		return jsonObj;
	}

	
	
	
	
	
	// 모임 더보기, 검색
	@RequestMapping(value="/category.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String categoryMore(SeeMoreVO smVO ,Model model  ) {
		
		
		model.addAttribute("category_Num", smVO.getCategoryNum());
		model.addAttribute("actiArea_Num", smVO.getActiAreaNum());
		model.addAttribute("searchText", smVO.getSearchText());

		return "main/category";
	}
	
	

	

	
	
 

	
	
}
