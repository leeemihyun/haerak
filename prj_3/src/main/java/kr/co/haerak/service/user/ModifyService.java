package kr.co.haerak.service.user;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.user.UserDAO;
import kr.co.haerak.domain.user.ModifyInfoDomain;
import kr.co.haerak.domain.user.ModifyProfileDomain;
import kr.co.haerak.vo.user.ChkIdPassVO;
import kr.co.haerak.vo.user.ModifyInfoVO;
import kr.co.haerak.vo.user.ModifyProfileVO;
import kr.co.sist.util.cipher.DataDecrypt;
import kr.co.sist.util.cipher.DataEncrypt;

@Component
public class ModifyService {
	
	@Autowired
	private UserDAO uDAO;
	
	public boolean passChkService(ChkIdPassVO cipVO) throws NoSuchAlgorithmException {
		boolean flag = false;
		//암호화된 비번으로 세팅
		cipVO.setUserPassword(DataEncrypt.messageDigest("MD5", cipVO.getUserPassword()));
		
		flag=uDAO.selectChkUserInfo(cipVO);
		
		return flag;// true면 통과 
	}//passChkService
	
	public ModifyProfileDomain setProfileService(String userId) {
		ModifyProfileDomain mpDomain= uDAO.selectProfile(userId);
		
		return mpDomain;
	}//ModifyProfileDomain
	
	public int modifyProfileService(ModifyProfileVO mpVO) {
		int cnt=uDAO.updateProfile(mpVO);
		
		return cnt;
	}//modifyProfileService
	
	public ModifyInfoDomain setInfoService(String userId) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		ModifyInfoDomain mpDomain= uDAO.selectInfo(userId);
		
		//이메일 복호화 하기
		DataDecrypt dd = new DataDecrypt("Tkddydgangnamkong");
		mpDomain.setEmail(dd.decryption(mpDomain.getEmail()));
		
		//이메일 자르기
		String email = mpDomain.getEmail().substring(0, mpDomain.getEmail().indexOf("@"));
		String email2 = mpDomain.getEmail().substring(mpDomain.getEmail().indexOf("@")+1);
		
		//set하기
		mpDomain.setEmail(email);
		mpDomain.setEmail2(email2);
		
		return mpDomain;
	}//ModifyInfoDomain
	
	public int modifyInfoService(ModifyInfoVO mpVO) {
		int cnt=uDAO.updateInfo(mpVO);
		
		return cnt;
	}//modifyInfoService
	
}//class
