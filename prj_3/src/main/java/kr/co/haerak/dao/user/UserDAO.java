package kr.co.haerak.dao.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.domain.user.ModifyInfoDomain;
import kr.co.haerak.domain.user.ModifyProfileDomain;
import kr.co.haerak.vo.user.ChkIdPassVO;
import kr.co.haerak.vo.user.FindIdVO;
import kr.co.haerak.vo.user.FindPassVO;
import kr.co.haerak.vo.user.LoginVO;
import kr.co.haerak.vo.user.ModifyInfoVO;
import kr.co.haerak.vo.user.ModifyPassVO;
import kr.co.haerak.vo.user.ModifyProfileVO;
import kr.co.haerak.vo.user.UserDupVO;
import kr.co.haerak.vo.user.UserVO;

@Component
public class UserDAO {

	public int insertMember(UserVO uVO) {
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		int cnt = ss.insert("kr.co.haerak.user_mapper.insertMember", uVO);
		// 3. transaction완료
		if (cnt == 1) {
			ss.commit();
		}
		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}
		
		return cnt;
	}// insertMember

	public boolean idDup(String userId) {
		boolean dupFlag = true;

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		String result = ss.selectOne("kr.co.haerak.user_mapper.idDup", userId);
		// 3. transaction완료
		if (result != null) {
			dupFlag = false;
		}
		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}

		return dupFlag;// false시 아이디 사용 가능
	}// idDup

	public boolean nickDup(String nickName) {
		boolean dupFlag = true;

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		String result = ss.selectOne("kr.co.haerak.user_mapper.nickDup", nickName);
		// 3. transaction완료
		if (result != null) {//result가 없으면 사용가능
			dupFlag = false;
		}
		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}
		return dupFlag;// false시 아이디 사용 가능
	}// nickDup

	public String userDup(UserDupVO udVO) {
		String userId = "";

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		userId = ss.selectOne("kr.co.haerak.user_mapper.userDup", udVO);
		// 3. transaction완료
		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}

		return userId;
	}// userDup

	public LoginSessionDomain selectLogin(LoginVO lVO) {
		LoginSessionDomain lsDomain = null;

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		lsDomain = ss.selectOne("kr.co.haerak.user_mapper.selectLogin", lVO);
		// 3. transaction완료
		if (lsDomain != null) {// 로그인 최신화
			int cnt = ss.update("loginDateUpdate", lVO.getUserId());
			if (cnt == 1) {
				ss.commit();
			} // end if
		} // end if

		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}
		return lsDomain;
	}// selectLogin

	public String selectFindId(FindIdVO fiVO) {
		String userId = "";

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		userId = ss.selectOne("kr.co.haerak.user_mapper.selectFindId", fiVO);
		// 3. transaction완료

		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}

		return userId;
	}// selectFindId

	public String selectFindPass(FindPassVO fpVO) {

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		String userId = ss.selectOne("kr.co.haerak.user_mapper.selectFindPass", fpVO);
		// 3. transaction완료

		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}

		return userId;// true면 성공 false면 실패
	}// selectFindPass

	/**
	 * 로그인시 delete_date에 값이 있는지 확인
	 * @param 
	 * @return true면 탈퇴한 회원임
	 */
	public boolean selectChkUser(String userId) {
		boolean ckhFlag = false;

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		String user_id = ss.selectOne("kr.co.haerak.user_mapper.selectChkUser", userId);
		// 3. transaction완료
		
		if (user_id != null)//조회결과가 있으면 true
			ckhFlag = true;// 탈퇴일시에 값이 있으면 로그인 금지
		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}

		return ckhFlag;// true면 로그인 금지!
	}// selectChkUserInfo

	/**
	 * 회원정보 수정할때 비밀번호 한번더 입력받고 확인하는 절차
	 * @param cipVO
	 * @return
	 */
	public boolean selectChkUserInfo(ChkIdPassVO cipVO) {
		boolean ckhFlag = false;
		
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		// 2. Handler사용
		String userId = ss.selectOne("kr.co.haerak.user_mapper.selectChkUserInfo", cipVO);
		// 3. transaction완료
		
		if (userId!= null)// 조회된 아이디가 있다면?
			ckhFlag = true;// 
		// 4. 연결끊기
		if (ss != null) {
			ss.close();
		}
		
		return ckhFlag;// true 통과!
	}// selectChkUserInfo
	
	
	public int updatePass(ModifyPassVO mpVO) {
		int cnt=0;
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler사용
		cnt = ss.update("kr.co.haerak.user_mapper.updatePass", mpVO);
		// 3. transaction완료
		if(cnt==1)ss.commit();
		if (ss != null) {
			ss.close();
		}

		return cnt;
	}// updatePass
	
	public ModifyInfoDomain selectInfo(String userId) {
		ModifyInfoDomain miDomain=null;
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		// 2. Handler사용
		miDomain = ss.selectOne("kr.co.haerak.user_mapper.selectInfo", userId);
		// 3. transaction완료
		
		if (ss != null) {
			ss.close();
		}
		
		return miDomain;
	}// ModifyInfoDomain
	
	public int updateInfo(ModifyInfoVO miVO) {
		int cnt=0;
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		// 2. Handler사용
		cnt = ss.update("kr.co.haerak.user_mapper.updateInfo", miVO);
		if(cnt==1)ss.commit();
		// 3. transaction완료
		
		if (ss != null) {
			ss.close();
		}
		
		return cnt;
	}// ModifyInfoDomain
	
	
	public ModifyProfileDomain selectProfile(String userId) {
		ModifyProfileDomain mpDomain=null;
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		// 2. Handler사용
		mpDomain = ss.selectOne("kr.co.haerak.user_mapper.selectProfile", userId);
		// 3. transaction완료
		
		if (ss != null) {
			ss.close();
		}
		
		return mpDomain;
	}// selectProfile
	
	public int updateProfile(ModifyProfileVO mpVO) {
		int cnt=0;
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		// 2. Handler사용
		cnt = ss.update("kr.co.haerak.user_mapper.updateProfile", mpVO);
		// 3. transaction완료
		if(cnt==1)ss.commit();
		if (ss != null) {
			ss.close();
		}
		
		return cnt;
	}// updateProfile
	
	public int deleteUser(String userId) {
		int cnt = 0;
		
		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		// 2. Handler사용
		cnt = ss.insert("kr.co.haerak.user_mapper.deleteUser", userId);
		// 3. transaction완료
		
		if (ss != null) {
			ss.close();
		}
		
		return cnt;
	}//deleteUser
	
//	public static void main(String[] args) {
////		System.out.println(new UserDAO().idDup("abcd10"));
////		System.out.println(new UserDAO().selectLogin(new LoginVO("abcd2","XZPOtw4r9dqoTsPQzSxzGg==")));
////		System.out.println(new UserDAO().selectFindId(new FindIdVO("일단군","trC2y8L4uUhOIy4Y3KcwEa8tGfrmc3m+aaqks9piX2w=")));
////		System.out.println(new UserDAO().selectChkUserInfo(new ChkIdPassVO("일단군","trC2y8L4uUhOIy4Y3KcwEa8tGfrmc3m+aaqks9piX2w=")));
////		System.out.println(new UserDAO().selectChkUserInfo(new ChkIdPassVO("일단군","trC2y8L4uUhOIy4Y3KcwEa8tGfrmc3m+aaqks9piX2w=")));
////		System.out.println(new UserDAO().updatePass(new ModifyPassVO("abcd2","XZPOtw4r9dqoTsPQzSxzGg==")));
////		System.out.println(new UserDAO().selectInfo("abcd2"));
////		System.out.println(new UserDAO().selectProfile("abcd2"));
////		System.out.println(new UserDAO().updateInfo(new ModifyInfoVO("","","","","","abcd2",5)));
//		
//	}// main
}// class
