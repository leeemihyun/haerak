package kr.co.haerak.service.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.mypage.MypageDAO;
import kr.co.haerak.domain.mypage.ClubReviewDomain;
import kr.co.haerak.domain.mypage.ReviewReplyDomain;

@Component
public class ReviewService {

	@Autowired(required = false)
	private MypageDAO mDAO;
	
	public List<ClubReviewDomain> review(String sessionId){
		
		List<ClubReviewDomain> list = mDAO.review(sessionId);
		
		return list;
	}
	
	public List<ReviewReplyDomain> reply(String sessionId){
		
		List<ReviewReplyDomain> list = mDAO.reply(sessionId);
		
		return list;
	}
	
}
