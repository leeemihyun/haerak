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

@Controller
public class ModifyController {
	@Autowired
	private ModifyService ms;
	
	/*
	 * @GetMapping public String passChkForm() {
	 * 
	 * return ""; }//passChkForm
	 * 
	 * 
	 * @PostMapping("") public String passChkProcess(Model model ,String
	 * userPassword) throws NoSuchAlgorithmException {
	 * 
	 * LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); ChkIdPassVO cipVO = new
	 * ChkIdPassVO(lsDomain.getUserId(), userPassword);
	 * 
	 * boolean flag =ms.passChkService(cipVO);
	 * 
	 * if(!flag) {// 실패시 return ""; }
	 * 
	 * return "";//성공시 }//passChkProcess
	 * 
	 * 
	 * @GetMapping("") public String modifyProfileForm(Model model) {
	 * LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); String userId =
	 * lsDomain.getUserId();
	 * 
	 * ModifyProfileDomain mpDomain = ms.setProfileService(userId);
	 * model.addAttribute("mpDomain", mpDomain);
	 * 
	 * return ""; }//modifyProfileForm
	 * 
	 * @PostMapping("") public String modifyProfileProcess(Model model,
	 * HttpServletRequest request) throws IOException { File file = new File("");
	 * int maxSize= 1024*1024*10; MultipartRequest mr = new
	 * MultipartRequest(request, file.getAbsolutePath(), maxSize, "UTF-8", new
	 * DefaultFileRenamePolicy()); String nickName=(String)
	 * request.getAttribute("nickName"); String userImg=(String)
	 * request.getAttribute("userImg"); String personalIntro=(String)
	 * request.getAttribute("personalIntro"); LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); String userId =
	 * lsDomain.getUserId(); ModifyProfileVO mpVO = new ModifyProfileVO(nickName,
	 * userImg, personalIntro, userId); int cnt=ms.modifyProfileService(mpVO);
	 * if(cnt==1){//성공 return ""; } return ""; }//modifyProfileProcess
	 * 
	 * @PostMapping("") public String ModifyPassForm() {
	 * 
	 * 
	 * return ""; }//ModifyPassForm
	 * 
	 * @PostMapping("") public String ModifyPassProcess(Model model, String
	 * userPassword) throws NoSuchAlgorithmException {
	 * 
	 * LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); String userId =
	 * lsDomain.getUserId();
	 * 
	 * ModifyPassVO mpVO = new ModifyPassVO(userId, userPassword); int cnt =
	 * ms.modifyPassService(mpVO); if (cnt==1) {//성공 return ""; }//end if
	 * 
	 * return ""; }//ModifyPassForm
	 * 
	 * 
	 * @GetMapping("") public String ModifyInfoForm(Model model) throws
	 * NoSuchAlgorithmException, UnsupportedEncodingException,
	 * GeneralSecurityException { LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); String userId =
	 * lsDomain.getUserId(); ModifyInfoDomain mpDomain = ms.setInfoService(userId);
	 * model.addAttribute("mpDomain", mpDomain);
	 * 
	 * return ""; }//ModifyInfoForm
	 * 
	 * @PostMapping("") public String ModifyInfoProcess(ModifyInfoVO miVO, Model
	 * model) { LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); String userId =
	 * lsDomain.getUserId(); miVO.setUserId(userId);
	 * 
	 * int cnt = ms.modifyInfoService(miVO);
	 * 
	 * if(cnt==1) { return "";//성공시 }//end if
	 * 
	 * return ""; }//ModifyInfoForm
	 * 
	 * @GetMapping("") public String deleteUserForm() {
	 * 
	 * return ""; }
	 * 
	 * @GetMapping("") public String deleteUserProcess(Model model) {
	 * LoginSessionDomain lsDomain =
	 * (LoginSessionDomain)model.getAttribute("lsDomain"); String userId =
	 * lsDomain.getUserId();
	 * 
	 * int cnt=ms.deleteUserService(userId); if(cnt==1) { return "";//성공시 }//end if
	 * 
	 * return ""; }
	 */
	
}//class
