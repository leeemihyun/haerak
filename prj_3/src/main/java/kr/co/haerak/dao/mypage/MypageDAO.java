package kr.co.haerak.dao.mypage;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.mypage.ApprovalDomain;
import kr.co.haerak.domain.mypage.ClubReviewDomain;
import kr.co.haerak.domain.mypage.HostListDomain;
import kr.co.haerak.domain.mypage.InterestDomain;
import kr.co.haerak.domain.mypage.JoinListDomain;
import kr.co.haerak.domain.mypage.MyProfileDomain;
import kr.co.haerak.domain.mypage.OthersMyPageDomain;
import kr.co.haerak.domain.mypage.ReviewReplyDomain;
import kr.co.haerak.vo.mypage.ApprovalVO;
import kr.co.haerak.vo.mypage.InterestVO;
import kr.co.haerak.vo.mypage.JoinListVO2;


@Component
public class MypageDAO {

	//내가 만든 모임
	public List<HostListDomain> selectHostList(String sessionId)throws PersistenceException{
		List<HostListDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
				
		//2. Handler 사용
		list=ss.selectList("hostList",sessionId);
				
		//3. 조회결과 처리
				
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
				
		return list;
	}

	//승인 대기 목록
	public List<ApprovalDomain> approvalList(int clubNum)throws PersistenceException{
		List<ApprovalDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("approvalStatus", clubNum);
		
		//3. 조회결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}

	//승인
	public int approve(ApprovalVO aVO) {
		int cnt1=0;
		int cnt2=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 조작method 호출
		cnt1=ss.insert("kr.co.haerak.mypage_mapper.approve1", aVO);
		cnt2=ss.delete("kr.co.haerak.mypage_mapper.approve2", aVO);

		//3. transaction 처리
		if(cnt1+cnt2==2) { ss.commit(); }//end if //최대 바뀔 수 있는 행 1개
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return cnt1+cnt2;
	}//approve
	
	//거절
	public int decline(ApprovalVO aVO) {
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 조작method 호출
		cnt=ss.insert("kr.co.haerak.mypage_mapper.decline", aVO);
		
		//3. transaction 처리
		if(cnt==1) { ss.commit(); }//end if //최대 바뀔 수 있는 행 1개
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return cnt;
	}//decline
	
	//관심 목록
	public List<InterestDomain> interest(String sessionId)throws PersistenceException{
		List<InterestDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("interest", sessionId);
		
		//3. 조회결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}
	
	//관심목록 추가
	public int insertInterest(InterestVO iVO) {

		// 1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler 사용
		int cnt = ss.insert("kr.co.haerak.mypage_mapper.addInerest", iVO);

		// 3. transaction 완료
		if (cnt == 1) {
			ss.commit();
		}else {
		}

		// 4. 연결 끊기
		if (ss != null) { ss.close(); } // end if

		return cnt;
	}//insertInterest

	//관심목록 삭제
	public int deleteInterest(InterestVO iVO) {
		int cnt=0;
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
			
		//2. 조작method 호출
		cnt=ss.delete("kr.co.haerak.mypage_mapper.deleteInterest", iVO);
			
		//3. transaction 처리
		if(cnt==1) { ss.commit(); }//end if //최대 바뀔 수 있는 행 1개
			
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
			
		return cnt;
	}//deleteInterest
	
	
	//참여한 모임
	public List<JoinListDomain> joinList(String sessionId)throws PersistenceException{
		List<JoinListDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("joinList", sessionId);
		
		//3. 조회결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}
	
	public List<JoinListDomain> waitList(String sessionId)throws PersistenceException{
		List<JoinListDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
				
		//2. Handler 사용
		list=ss.selectList("waitList",sessionId);
				
		//3. 조회결과 처리
				
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
				
		return list;
	}

	//참여목록 삭제
	public int deleteJoinList(JoinListVO2 jlVO) {
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 조작method 호출
		cnt=ss.delete("kr.co.haerak.mypage_mapper.deleteJoinList", jlVO);
		//3. transaction 처리
		if(cnt==1) { ss.commit(); }//end if //최대 바뀔 수 있는 행 1개
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return cnt;
	}//deleteJoinList
	
	public int deleteWaitList(JoinListVO2 jlVO) {
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 조작method 호출
		cnt=ss.delete("kr.co.haerak.mypage_mapper.deleteWaitList", jlVO);
		//3. transaction 처리
		if(cnt==1) { ss.commit(); }//end if //최대 바뀔 수 있는 행 1개
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return cnt;
	}//deleteJoinList

	//후기
	public List<ClubReviewDomain> review(String sessionId)throws PersistenceException{
		List<ClubReviewDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("review", sessionId);
		
		//3. 조회결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}

	//후기의 답글
	public List<ReviewReplyDomain> reply(String sessionId)throws PersistenceException{
		List<ReviewReplyDomain> list=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("reply", sessionId);
		
		//3. 조회결과 처리
		
		//4. MyBatis Handler 닫기
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}
	
	public List<OthersMyPageDomain> myPageJoin(String userId){
		List<OthersMyPageDomain> list = null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("othersJoinList", userId);
		//3. 조회결과 처리
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}
	
	public List<OthersMyPageDomain> myPageHost(String userId){
		List<OthersMyPageDomain> list = null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectList("othersHostList", userId);
		
		//3. 조회결과 처리
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}
	
	public MyProfileDomain myProfile(String userId){
		MyProfileDomain list =null;
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		list=ss.selectOne("myProfile", userId);
		
		//3. 조회결과 처리
		if(ss!=null) { ss.close(); }//end if
		
		return list;
	}
	/*
	 * public static void main(String[] args) { System.out.println(new
	 * MypageDAO().myPageJoin("abcd1")); System.out.println(new
	 * MypageDAO().myPageHost("abcd5")); }
	 */
}