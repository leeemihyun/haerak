package kr.co.haerak.service.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.mypage.MypageDAO;
import kr.co.haerak.domain.mypage.InterestDomain;
import kr.co.haerak.vo.mypage.InterestVO;

@Component
public class InterestService {

	@Autowired(required = false)
	private MypageDAO mDAO;
	
	public List<InterestDomain> interest(String sessionId){
		List<InterestDomain> list = mDAO.interest(sessionId);
		
		return list;
	}
	
	public int insertInterest(InterestVO iVO) {
		int cnt=0;
		
		cnt=mDAO.insertInterest(iVO);
		
		return cnt;
	}

	public int deleteInterest(InterestVO iVO) {
		int cnt=0;
		
		cnt=mDAO.deleteInterest(iVO);
		
		return cnt;
	}
}
