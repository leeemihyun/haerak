package kr.co.haerak.service.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.mypage.MypageDAO;
import kr.co.haerak.domain.mypage.JoinListDomain;
import kr.co.haerak.vo.mypage.JoinListVO;
import kr.co.haerak.vo.mypage.JoinListVO2;

@Component
public class JoinListService {
	@Autowired(required = false)
	private MypageDAO mDAO;
	
	public List<JoinListDomain> joinList(String sessionId){
		
		List<JoinListDomain> list = mDAO.joinList(sessionId);
		
		return list;
	}
	
	public List<JoinListDomain> waitList(String sessionId){
		List<JoinListDomain> list = mDAO.waitList(sessionId);
		
		return list;
	}
	
	public int deleteJoinList(JoinListVO2 jVO) {
		int cnt=0;
		
		cnt=mDAO.deleteJoinList(jVO);
		
		return cnt;
	}
	
	public int deleteWaitList(JoinListVO2 jVO) {
		int cnt=0;
		
		cnt=mDAO.deleteWaitList(jVO);
		
		return cnt;
	}
	
	
}
