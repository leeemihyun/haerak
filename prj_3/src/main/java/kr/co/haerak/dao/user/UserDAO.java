package kr.co.haerak.dao.user;

import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.vo.user.ChkIdPassVO;
import kr.co.haerak.vo.user.FindIdVO;
import kr.co.haerak.vo.user.FindPassVO;
import kr.co.haerak.vo.user.LoginVO;
import kr.co.haerak.vo.user.UserDupVO;

public class UserDAO {

	public void insertMember(kr.co.haerak.vo.user.UserVO uVO) {
		
	}//insertMember
	
	public boolean idDup(String userId) {
		boolean dupFlag = false;
		
		return dupFlag;
	}//idDup
	
	public boolean nickDup(String nickName) {
		boolean dupFlag = false;
		
		return dupFlag;
	}//nickDup
	
	public String userDup(UserDupVO udVO) {
		String userId = "";
		
		return userId;
	}//userDup
	
	public LoginSessionDomain selectLogin(LoginVO lVO) {
		LoginSessionDomain lsDomain=null;
		
		
		return lsDomain;
	}//selectLogin
	
	public void loginDateUpdate(String userId) {
		
	}//selectLogin
	
	public String selectFindId(FindIdVO fiVO) {
		String userId = "";
		
		return userId;
	}//selectFindId
	
	public String selectFindPass(FindPassVO fpVO) {
		String userPassword = "";
		
		return userPassword;
	}//selectFindPass
	
	public boolean selectChkUserInfo(ChkIdPassVO cipVO) {
		boolean userFlag = false;
		
		return userFlag;
	}//selectChkUserInfo
	
	
	
}
