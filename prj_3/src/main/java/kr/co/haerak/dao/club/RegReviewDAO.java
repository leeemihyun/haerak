package kr.co.haerak.dao.club;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.club.ClubDetailDomain;
import kr.co.haerak.vo.club.ClubSearchVO;
import kr.co.haerak.vo.club.ReplyVO;
import kr.co.haerak.vo.club.ReviewVO;

/**
 * 댓글관련 DAO
 * @author user
 */
@Component
public class RegReviewDAO {

	/**
	 * 후기글 작성 메소드
	 * @param rVO
	 */
	public void insertReviewService(ReviewVO rVO) {
		
		int cnt=0;
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 <select id="subquery" resultMap="cdResult">
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		cnt=ss.insert("insertReview",rVO); //상품목록
		
		if(cnt==1) {
			ss.commit();
			System.out.println("commit");
		}else {
			ss.rollback();
			System.out.println("rollback");
		}//end else
		
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
		
	}//insertReviewService
	
	
	/**
	 * 답변 작성 메소드
	 * @param rpVO
	 */
	public void insertReplyService(ReplyVO rpVO) {
		int cnt=0;
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 <select id="subquery" resultMap="cdResult">
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		cnt=ss.insert("insertReply",rpVO); //상품목록
		
		if(cnt==1) {
			ss.commit();
			ss.update("replyCheckUpdate",rpVO.getReviewNum());
			ss.commit();			
		}else {
			ss.rollback();
		}//end else
		
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
	}//insertReplyService
	
	public static void main(String[] args) {
//		ReplyVO rpVO=new ReplyVO();
//		rpVO.setReviewReply("답변입니다");
//		rpVO.setUserId("abcd1");
//		rpVO.setReviewNum(6);
//		
//		new RegReviewDAO().insertReplyService(rpVO);
		
	}//main
	
	
}//RegReviewDAO
