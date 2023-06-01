package kr.co.haerak.controller.user;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.domain.user.ModifyInfoDomain;
import kr.co.haerak.domain.user.ModifyProfileDomain;
import kr.co.haerak.service.user.ModifyService;
import kr.co.haerak.vo.user.ChkIdPassVO;
import kr.co.haerak.vo.user.ModifyInfoVO;
import kr.co.haerak.vo.user.ModifyPassVO;
import kr.co.haerak.vo.user.ModifyProfileVO;

@SessionAttributes("lsDomain")
@Controller
public class ModifyController {
	@Autowired(required = false)
	private ModifyService ms;
	
	
	@GetMapping("passChk.do")
	public String passChkForm() {

		return "mypage/pass_chk";
	}// passChkForm
	
	
	/**
	 * ÆÐ½º¿öµå È®ÀÎ
	 */
	@PostMapping("/passChkProcess.do")
	public String passChkProcess(Model model, String userPassword) throws NoSuchAlgorithmException {

		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		ChkIdPassVO cipVO = new ChkIdPassVO(lsDomain.getUserId(), userPassword);
		boolean flag = ms.passChkService(cipVO);
		if (!flag) {
			return "forward:passChk.do";
		}
		return "mypage/edit_list";// 
	}// passChkProcess
	
	/**
	 * ÇÁ·ÎÇÊ ¼öÁ¤ Æû
	 */
	@GetMapping("editProfile.do")
	public String modifyProfileForm(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		String userId = lsDomain.getUserId();

		ModifyProfileDomain mpDomain = ms.setProfileService(userId);
		model.addAttribute("mpDomain", mpDomain);

		return "mypage/edit_profile";
	}// modifyProfileForm

	/**
	 * ÇÁ·ÎÇÊ ¼öÁ¤
	 */
	@PostMapping("profileProcess.do")
	public String modifyProfileProcess(Model model, HttpServletRequest request) throws IOException {
		File file = new File("C:/Users/user/git/prj_3/prj_3/src/main/webapp/images");
		int maxSize = 1024 * 1024 * 5;
		MultipartRequest mr = new MultipartRequest(request, file.getAbsolutePath(), maxSize, "UTF-8",
				new DefaultFileRenamePolicy());
		String nickName = (String) mr.getParameter("nickName");
		String userImg = mr.getOriginalFileName("userImgFile");
		if(userImg==null)userImg="profile.png";
		userImg = "http://localhost/prj_3/images/"+userImg;
		String personalIntro = (String) mr.getParameter("personalIntro");
		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		String userId = lsDomain.getUserId();
		ModifyProfileVO mpVO = new ModifyProfileVO(nickName, userImg, personalIntro, userId);
		int cnt = ms.modifyProfileService(mpVO);
		
		return "mypage/host_list";
	}// modifyProfileProcess

	/**
	 * ºñ¹ø ¼öÁ¤ Æû
	 */
	@GetMapping("editPass.do")
	public String ModifyPassForm(Model model) {
		
	
		
		
		return "mypage/edit_pass";
	}// ModifyPassForm

	/**
	 * ºñ¹ø ¼öÁ¤
	 */
	@PostMapping("editPassProcess.do")
	public String ModifyPassProcess(Model model, String pass1, String userId) throws NoSuchAlgorithmException {
		
		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		if(lsDomain!=null) {
			userId = lsDomain.getUserId();
		}
		
		ModifyPassVO mpVO = new ModifyPassVO(userId, pass1);
		
		
		int cnt = ms.modifyPassService(mpVO);

		return "main/logout";
	}// ModifyPassForm

	/**
	 * °³ÀÎÁ¤º¸ ¼öÁ¤ Æû
	 */
	@GetMapping("editPersonal.do")
	public String ModifyInfoForm(Model model)
			throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		String userId = lsDomain.getUserId();
		ModifyInfoDomain mpDomain = ms.setInfoService(userId);
		model.addAttribute("mpDomain", mpDomain);
		
		return "mypage/edit_personal_info";
	}// ModifyInfoForm

	/**
	 * °³ÀÎÁ¤º¸ ¼öÁ¤
	 */
	@PostMapping("editPersonalProcess.do")
	public String ModifyInfoProcess(ModifyInfoVO miVO, Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		String userId = lsDomain.getUserId();
		miVO.setUserId(userId);

		int cnt = ms.modifyInfoService(miVO);

		if (cnt == 1) {
			return "mypage/edit_list";// ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
		} // end if

		return "main/logout";
	}// ModifyInfoForm
	
	/**
	 * È¸¿øÁ¤º¸ »èÁ¦ Æû
	 */
	@GetMapping("deleteAccount.do")
	public String deleteUserForm() {

		return "mypage/delete_account";
	}

	/**
	 * È¸¿øÁ¤º¸ »èÁ¦
	 */
	@GetMapping("deleteProcess.do")
	public String deleteUserProcess(Model model) {
		LoginSessionDomain lsDomain = (LoginSessionDomain) model.getAttribute("lsDomain");
		String userId = lsDomain.getUserId();

		int cnt = ms.deleteUserService(userId);

		return "main/logout";
	}

}// class
