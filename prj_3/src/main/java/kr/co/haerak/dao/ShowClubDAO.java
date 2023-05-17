package kr.co.haerak.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.haerak.domain.ClubDetailDomain;
import kr.co.haerak.domain.SetReviewDomain;

/**
 * 모임상세페이지 DAO
 * @author user
 */
public class ShowClubDAO {

	
	/**
	 * 모임의 정보를 띄우는 service
	 * @param clubNum
	 * @return
	 */
	public ClubDetailDomain showClubService(int clubNum) {
		
		ClubDetailDomain result=new ClubDetailDomain();
		
		return result;
	}//showClubService
	
	
	/**
	 *  모임상세 페이지에서 리뷰를 가져오는 service
	 * @param clubNum
	 * @return
	 */
	public List<SetReviewDomain> showReviewService(int clubNum) {
		
		List<SetReviewDomain> result=new ArrayList<SetReviewDomain>();
		
		
		return result;
	}//showReviewService
	
	/**
	 * 관심상태인지 확인하는 service
	 * @param userId
	 * @param clubNum
	 * @return
	 */
	public boolean selectInterService(String userId,int clubNum) {
		
		return true;
	}//selectInterService
	
	
	/**
	 * 하트 클릭 시 관심목록 추가/삭제
	 * @param userId
	 * @param clubNum
	 */
	public void updateInterList(String userId,int clubNum) {
		
	}//updateInterList
	
	
	/**
	 * 모임신청하기
	 * @param userId
	 * @param clubNum
	 */
	public void clubApprovalInsert(String userId,int clubNum) {
		
	}//clubapprovalInsert
	
	
}//ShowClubDAO
