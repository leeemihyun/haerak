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
	
	
	@GetMapping("passChk.do")
	public String passChkForm() {
	  
	  return "mypage/pass_chk"; 
	  }//passChkForm
	 
	 
	 @PostMapping("passChkProcess.do")
	 public String passChkProcess(Model model ,String userPassword) throws NoSuchAlgorithmException {
	 
	 LoginSessionDomain lsDomain =
	   (LoginSessionDomain)model.getAttribute("lsDomain");
	 ChkIdPassVO cipVO = new ChkIdPassVO(lsDomain.getUserId(), userPassword);
	   
	   boolean flag =ms.passChkService(cipVO);
	   
	   if(!flag) {// ���н� return ""; 
	   
	   }
	   
	   return "mypage/edit_list";//������ 
	   }//passChkProcess
	   
	   
	   @GetMapping("editProfile.do")
	   public String modifyProfileForm(Model model) {
	   LoginSessionDomain lsDomain =
	   (LoginSessionDomain)model.getAttribute("lsDomain");
	   String userId = lsDomain.getUserId();
	   
	   ModifyProfileDomain mpDomain = ms.setProfileService(userId);
	   model.addAttribute("mpDomain", mpDomain);
	   
	   return "forward:profileProcess.do"; 
	   }//modifyProfileForm
	   
	   @PostMapping("profileProcess.do")
	   public String modifyProfileProcess(Model model,
	   HttpServletRequest request) throws IOException {
		   File file = new File("");
	   
	   int maxSize= 1024*1024*10;
	   MultipartRequest mr = new MultipartRequest(request, file.getAbsolutePath(), maxSize, "UTF-8", new DefaultFileRenamePolicy());
	   String nickName=(String)request.getAttribute("nickName");
	   String userImg=(String)request.getAttribute("userImg");
	   String personalIntro=(String)request.getAttribute("personalIntro");
	   LoginSessionDomain lsDomain =(LoginSessionDomain)model.getAttribute("lsDomain");
	   String userId =lsDomain.getUserId();
	   ModifyProfileVO mpVO = new ModifyProfileVO(nickName,userImg, personalIntro, userId);
	   int cnt=ms.modifyProfileService(mpVO);
	   if(cnt==1){//���� 
		   return "mypage/host_list"; 
	   }
	   
	   return "mypage/host_list"; 
	   }//modifyProfileProcess
	   
	   
	   @PostMapping("editPass.do")
	   public String ModifyPassForm() {
	   
	   
	   return "forward:editPassProcess.do"; 
	   }//ModifyPassForm
	   
	   @PostMapping("editPassProcess.do")
	   public String ModifyPassProcess(Model model, String userPassword) throws NoSuchAlgorithmException {
	   
	   LoginSessionDomain lsDomain =(LoginSessionDomain)model.getAttribute("lsDomain");
	   String userId = lsDomain.getUserId();
	   
	   ModifyPassVO mpVO = new ModifyPassVO(userId, userPassword);
	   int cnt =ms.modifyPassService(mpVO);
	   if (cnt==1) {//���� 
		   return "main/logout"; 
		   }//end if
	   
	   return "main/logout";
	   }//ModifyPassForm
	   
	   
	   @GetMapping("editPersonal.do")
	   public String ModifyInfoForm(Model model) throws
	   NoSuchAlgorithmException, UnsupportedEncodingException,
	   GeneralSecurityException {
		   LoginSessionDomain lsDomain =(LoginSessionDomain)model.getAttribute("lsDomain");
		   String userId =lsDomain.getUserId();
		   ModifyInfoDomain mpDomain = ms.setInfoService(userId);
	   model.addAttribute("mpDomain", mpDomain);
	   
	   return "forward:editPersonalProcess.do"; 
	   }//ModifyInfoForm
	   
	   @PostMapping("editPersonalProcess.do")
	   public String ModifyInfoProcess(ModifyInfoVO miVO, Model
	   model) { 
		   LoginSessionDomain lsDomain =(LoginSessionDomain)model.getAttribute("lsDomain");
		   String userId =lsDomain.getUserId();
		   miVO.setUserId(userId);
	   
	   int cnt = ms.modifyInfoService(miVO);
	   
	   if(cnt==1) { 
		   return "mypage/edit_list";//������ 
	   }//end if
	   
	   return "main/logout"; 
	   }//ModifyInfoForm
	   
	   @GetMapping("deleteAccount")
	   public String deleteUserForm() {
	   
	   return "forward:deleteProcess.do"; 
	   }
	   
	   @GetMapping("deleteProcess.do")
	   public String deleteUserProcess(Model model) {
	   LoginSessionDomain lsDomain =(LoginSessionDomain)model.getAttribute("lsDomain");
	   String userId =lsDomain.getUserId();
	   
	   int cnt=ms.deleteUserService(userId);
	   if(cnt==1) { 
		   return "main/logout";//������ 
		   }//end if
	   
	   return "main/logout"; 
	   }
	   
	  
	
}//class
