package kr.co.haerak.service.club;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
	public String showReviewService(int clubNum,int currentPage1) {
		double limitdata=6.0; //한화면에 보여줄 최대 데이터 개수 
		int currentPage=currentPage1; //현재 페이지
		double pageCount=5; //최대 페이지 개수
		double pageGroup=Math.ceil(currentPage / pageCount); //페이지 그룹
		double lastNum=pageGroup*pageCount;
		double firstNum=lastNum-(pageCount - 1);

		
		List<SetReviewDomain> result=new ArrayList<SetReviewDomain>();
		
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("resultFlag", false);
		result=scDAO.showReviewService(clubNum);
		
		
		jsonObj.put("resultFlag", true);
		jsonObj.put("totaldata", result.size()); //총 데이터 개수
		jsonObj.put("pageCnt", Math.ceil(result.size()/limitdata)); //페이지개수
		jsonObj.put("currentPage",currentPage ); //현재페이지
		jsonObj.put("pageGroup", pageGroup); //페이지그룹
		jsonObj.put("lastNum", lastNum); //페이지개수
		jsonObj.put("firstNum",firstNum ); //페이지개수
		JSONArray jsonArr=new JSONArray();
		JSONObject jsonTemp=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년-mm월-dd일 a hh시mm분");
		for(SetReviewDomain srd : result) {
			jsonTemp=new JSONObject();
			jsonTemp.put("userId", srd.getUserId());
			jsonTemp.put("clubNum", srd.getClubNum());
			jsonTemp.put("clubReview", srd.getClubReview());
			jsonTemp.put("nickName", srd.getNickName());
			jsonTemp.put("replyNum", srd.getReplyNum());
			jsonTemp.put("reviewNum", srd.getReviewNum());
			jsonTemp.put("reviewReply", srd.getReviewReply());
			jsonTemp.put("userImg", srd.getUserImg());
			jsonTemp.put("writeDate", sdf.format(srd.getWriteDate()));
			jsonTemp.put("replyCheck",srd.getReplyCheck());
			jsonArr.add(jsonTemp);
		}
		
		jsonObj.put("data", jsonArr);
		
		return jsonObj.toJSONString();
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
	
	public boolean approvalCheck(String userId,int clubNum) {
		ClubSearchVO csVO=new ClubSearchVO(userId, clubNum);
		boolean approvalFlag=scDAO.approvalCheck(csVO);
		
		return approvalFlag;
	}
	
	
}//ShowClubService
