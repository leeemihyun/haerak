package kr.co.haerak.service.club;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.club.ShowClubDAO;
import kr.co.haerak.domain.club.ClubDetailDomain;
import kr.co.haerak.domain.club.SetReviewDomain;
import kr.co.haerak.vo.club.ClubSearchVO;

/**
 * 모임 상세페이지 service
 * @author user
 */
@Component
public class ShowClubService {

	@Autowired(required = false)
	private ShowClubDAO scDAO;
	
	
	/**
	 * 모임의 정보를 띄우는 service
	 * @param clubNum
	 * @return
	 */
	public ClubDetailDomain showClubService(int clubNum) {
		
		ClubDetailDomain result=scDAO.showClubService(clubNum);
		
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
		boolean interFlag=false;
		ClubSearchVO csVO=new ClubSearchVO(userId, clubNum);
		String diff="";
		diff=scDAO.selectInterService(csVO);
		
		if(userId.equals(diff)) {
			interFlag=true; //일치하면 true
		}//end if
		
		
		return interFlag;
	}//selectInterService
	
	
	/**
	 * 하트 클릭 시 관심목록 추가/삭제
	 * @param userId
	 * @param clubNum
	 */
	public void updateInterList(String userId,int clubNum,int flag) {
		ClubSearchVO csVO=new ClubSearchVO(userId, clubNum);
		scDAO.updateInterList(csVO, flag);
	}//updateInterList
	
	
	/**
	 * 모임신청하기
	 * @param userId
	 * @param clubNum
	 */
	public boolean clubApprovalInsert(String userId,int clubNum) {
		ClubSearchVO csVO=new ClubSearchVO(userId, clubNum);
		boolean approvalFlag=scDAO.clubApprovalInsert(csVO);
		
		return approvalFlag;
	}//clubapprovalInsert
	
	
	
}//ShowClubService
