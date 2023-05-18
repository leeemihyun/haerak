package kr.co.haerak.service.user;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.user.UserDAO;
import kr.co.haerak.vo.user.FindIdVO;
import kr.co.haerak.vo.user.FindPassVO;
import kr.co.sist.util.cipher.DataEncrypt;

@Component
public class InquiryService {
	@Autowired
	private UserDAO uDAO;
	
	
	public String idInquiryService(FindIdVO fiVO) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		String userId="";
		
		//이메일 암호화하여 넣기
		DataEncrypt de = new DataEncrypt("Tkddydgangnamkong");//암호화 키
		
		fiVO.setEmail(fiVO.getEmail()+"@"+fiVO.getEmail2());//이메일 하나로 합치기
		fiVO.setEmail( de.encryption( fiVO.getEmail()) );//이메일 주소 암호화하기
		
		uDAO.selectFindId(fiVO);
		
		return userId;
	}//idInquiryService
	
	public String passInquiryService(FindPassVO fpVO) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		String userId="";
		
		//이메일 암호화하여 넣기
		DataEncrypt de = new DataEncrypt("Tkddydgangnamkong");//암호화 키
		
		fpVO.setEmail(fpVO.getEmail()+"@"+fpVO.getEmail2());//이메일 하나로 합치기
		fpVO.setEmail( de.encryption( fpVO.getEmail()) );//이메일 주소 암호화하기
		
		uDAO.selectFindPass(fpVO);
		
		return userId;
	}//idInquiryService
	
}
