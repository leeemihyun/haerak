package kr.co.haerak.controller.mypage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.haerak.domain.mypage.ApprovalDomain;
import kr.co.haerak.domain.mypage.ClubReviewDomain;
import kr.co.haerak.domain.mypage.HostListDomain;
import kr.co.haerak.domain.mypage.InterestDomain;
import kr.co.haerak.domain.mypage.JoinListDomain;
import kr.co.haerak.domain.mypage.MyProfileDomain;
import kr.co.haerak.domain.mypage.OthersMyPageDomain;
import kr.co.haerak.domain.mypage.ReviewReplyDomain;
import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.service.mypage.ApprovalService;
import kr.co.haerak.service.mypage.HostListService;
import kr.co.haerak.service.mypage.InterestService;
import kr.co.haerak.service.mypage.JoinListService;
import kr.co.haerak.service.mypage.MypageService;
import kr.co.haerak.service.mypage.ReviewService;
import kr.co.haerak.vo.mypage.ApprovalVO;
import kr.co.haerak.vo.mypage.InterestVO;
import kr.co.haerak.vo.mypage.JoinListVO;
import kr.co.haerak.vo.mypage.JoinListVO2;
/**
 * @author user
 *
 */
@SessionAttributes("lsDomain")
@Controller
public class MypageController {
	@Autowired(required = false)
	HostListService hl;

	@Autowired(required = false)
	private ApprovalService as;
	
	@Autowired(required = false)
	private HostListService hls;
	
	@Autowired(required = false)
	private InterestService is;
	
	@Autowired(required = false)
	private ReviewService rs;
	
	@Autowired(required = false)
	private JoinListService js;
	
	@Autowired(required = false)
	private MypageService ms;
	
	
	public boolean loginChk(LoginSessionDomain lsDomain) {
		boolean flag =false;
		if(lsDomain==null) {
			flag=true;//세션이 만료되면 true
		}
		return flag;
	}
	
	@GetMapping("/hostlist.do")
	public String searchHostList(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {//세션이 만료되면 true
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
		
		List<HostListDomain> list = hls.hostList(userId);
		model.addAttribute("list", list);
		
		return "/mypage/host_list";
	}

	@GetMapping("/approval.do")
	public String searchApprovalStatus(int clubNum, Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
		
		List<ApprovalDomain> list=as.approval(clubNum);
		
		model.addAttribute("list",list);
				
		return "/mypage/approval";
	}

	@GetMapping("/interest.do")
	public String searchInterestList(Model model) {
		
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
				
		List<InterestDomain> list=is.interest(userId);
		model.addAttribute("list", list);
				
		return "/mypage/interest";
	}
	
	
	@GetMapping("/heart.do")
	public String removeInterest(InterestVO iVO, HttpServletRequest request, Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
		
		int clubNum=Integer.parseInt(request.getParameter("pNum"));
		
		iVO.setClubNum(clubNum);
		iVO.setUserId(userId);
			
		int cnt=0;
		cnt=is.deleteInterest(iVO);
		model.addAttribute("cnt",cnt);
		
		return "forward:interest.do";
	}
	
	@GetMapping("/joinList.do")
	public String searchJoinList(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
			
		List<JoinListDomain> list=js.joinList(userId);
		model.addAttribute("list",list);
		return "/mypage/join_list";
	}
	
	@GetMapping("/waitList.do")
	public String searchWaitList(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
		
		List<JoinListDomain> list=js.waitList(userId);
		model.addAttribute("list",list);
		return "/mypage/wait_list";
	}
	
	@GetMapping("/removeJoin.do")
	public String removeJoinList(Model model, JoinListVO2 jVO) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
				
		
		int cnt=0;
		cnt=js.deleteJoinList(jVO);
		model.addAttribute("cnt",cnt);
		
		return "forward:joinList.do";
	}

	@GetMapping("/removeWaitList.do")
	public String removeWaitList(Model model, JoinListVO2 jVO) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
		
		
		int cnt=0;
		cnt=js.deleteWaitList(jVO);
		model.addAttribute("cnt",cnt);
		
		return "forward:waitList.do";
	}
	
	@GetMapping("/review.do")
	public String searchReview(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
				
		List<ClubReviewDomain> list=rs.review(userId);
		model.addAttribute("list",list);
				
		return "/mypage/review";
	}
	
	@GetMapping("/reply.do")
	public String searchReviewReply(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		String userId = lsDomain.getUserId();
				
				
		List<ReviewReplyDomain> list=rs.reply(userId);
		model.addAttribute("list",list);
				
		return "/mypage/reply";
	}
	@GetMapping("/approve.do")
	public String approve(Model model, int clubNum, String userId) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		ApprovalVO aVO=new ApprovalVO();
		aVO.setUserId(userId);
		aVO.setClubNum(clubNum);
		
		int cnt=0;
		cnt=as.approve(aVO);
		model.addAttribute("cnt",cnt);
		
		return "forward:hostlist.do";
	}
	
	@GetMapping("/decline.do")
	public String decline(Model model, int clubNum, String userId) {
		LoginSessionDomain lsDomain = (LoginSessionDomain)model.getAttribute("lsDomain");
		if(loginChk(lsDomain) ) {
			return "main/main";
		}//end if
		ApprovalVO aVO=new ApprovalVO();
		aVO.setClubNum(clubNum);
		aVO.setUserId(userId);
		
		int cnt=0;
		cnt=as.decline(aVO);
		model.addAttribute("cnt",cnt);
		
		return "forward:approval.do";
	}
	@ResponseBody
	@GetMapping("/mypageJoin.do")
	public String mypageJoin(Model model,String userId) {
		
		String jsonObj =ms.othersJoinListService(userId);
		
		return jsonObj;
	}
	@ResponseBody
	@GetMapping("/mypageHost.do")
	public String mypageHost(Model model,String userId) {
		
		String jsonObj =ms.othersHostListService(userId);
		
		return jsonObj;
	}
	
	@GetMapping("/othersMypageHost.do")
	public String othersMypageHost(Model model,String userId) {
		
		List<OthersMyPageDomain> list =null;
		MyProfileDomain profile = ms.myProfileService(userId);
		model.addAttribute("userId",userId);
		model.addAttribute("nickName",profile.getNickName());
		model.addAttribute("userImg",profile.getUserImg());
		model.addAttribute("personalIntro",profile.getPersonalIntro());
		model.addAttribute("list",list);
		
		return "mypage/mypage";
	}
	
	
	
	
}//class
