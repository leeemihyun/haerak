package kr.co.haerak.service.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.club.RegReviewDAO;
import kr.co.haerak.vo.club.ReplyVO;
import kr.co.haerak.vo.club.ReviewVO;

/**
 * 댓글 관련 service
 * @author user
 */
@Component
public class RegReviewService {
	
	@Autowired(required = false)
	private RegReviewDAO rrDAO;
	
	/**
	 * 후기글 작성 메소드
	 * @param rVO
	 */
	public void insertReviewService(ReviewVO rVO) {
		
		rrDAO.insertReviewService(rVO);
		
	}//insertReviewService
	
	
	/**
	 * 답변 작성 메소드
	 * @param rpVO
	 */
	public void insertReplyService(ReplyVO rpVO) {
		
		rrDAO.insertReplyService(rpVO);
		
	}//insertReplyService
	
	
	
}//RegReviewService
