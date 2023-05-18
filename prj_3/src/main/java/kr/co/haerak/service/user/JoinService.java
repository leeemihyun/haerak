package kr.co.haerak.service.user;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.user.UserDAO;
import kr.co.haerak.vo.user.UserDupVO;
import kr.co.haerak.vo.user.UserVO;
import kr.co.sist.util.cipher.DataEncrypt;

@Component
public class JoinService {

	@Autowired
	private UserDAO uDAO;
	
	public int joinService(UserVO uVO) throws UnsupportedEncodingException, GeneralSecurityException {
		uVO.setUserPassword(DataEncrypt.messageDigest("MD5", uVO.getUserPassword()));//암호화 한 패스워드를 다시 셋팅하기

		DataEncrypt de = new DataEncrypt("Tkddydgangnamkong");//암호화 키
		
		uVO.setEmail(uVO.getEmail()+"@"+uVO.getEmail2());//이메일 하나로 합치기
		
		uVO.setEmail( de.encryption( uVO.getEmail()) );//이메일 주소 암호화하기
		
		int cnt = uDAO.insertMember(uVO);
		return cnt;
	}//joinService
	
	public int idDupService(String userId) {
		boolean flag=uDAO.idDup(userId);//false시 아이디 사용 가능
		int cnt = 0;
		if(!flag)cnt=1;
		
		
		return cnt;
	}//idDupService
	
	public int nickDupService(String nickname) {
		boolean flag=uDAO.nickDup(nickname);//false시 닉네임 사용 가능
		int cnt = 0;
		if(!flag)cnt=1;
		
		
		return cnt;
	}//nickDupService
	
	public String userDupService(UserDupVO udVO) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		DataEncrypt de = new DataEncrypt("Tkddydgangnamkong");//암호화 키
		
		udVO.setEmail(udVO.getEmail()+"@"+udVO.getEmail2());//이메일 하나로 합치기
		
		udVO.setEmail( de.encryption( udVO.getEmail()) );//이메일 주소 암호화하기
		
		String userId = uDAO.userDup(udVO);
		
		return userId;
	}//userDupService
	
}//class
