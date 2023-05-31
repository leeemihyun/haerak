package kr.co.haerak.service.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import kr.co.haerak.dao.admin.AdminDAO;
import kr.co.haerak.dao.admin.DashBoardDAO;
import kr.co.haerak.dao.admin.ManageClubDAO;
import kr.co.haerak.dao.admin.ManageMemberDAO;
import kr.co.haerak.dao.admin.ManageReviewDAO;
import kr.co.haerak.domain.admin.CategoryCntDomain;
import kr.co.haerak.domain.admin.ClubStatusCntDomain;
import kr.co.haerak.domain.admin.NewAndWithdrawallCntDomain;
import kr.co.haerak.domain.admin.TotalMemberCntDomain;
import kr.co.haerak.domain.admin.TradingStatusDomain;
import kr.co.haerak.vo.admin.MemberCntVO;
import kr.co.haerak.vo.admin.TotalMemberCntVO;

@Component
public class DashBoardService {

	//대쉬보드
	@Autowired(required = false)
	private DashBoardDAO dbDAO;
	
	//오늘 총 방문수
	public int totalVisitService() {
		int tvs=dbDAO.totalVisit();
	
		return tvs;
	}
	

	//총회원수
	public int memberCntService() {
		int mcs = dbDAO.memberCnt();
		
		return mcs;
	}

	//신규가입 회원 수
	public int newMemberCntService() {
		int mncs =  dbDAO.newMemberCnt();
		return mncs;
		
		
	}

	//오늘 탈퇴한 회원 수
	public int withdrawalMembersService() {
		
		int wms= dbDAO.withdrawalMembers();
		return wms;
	}

	//오늘 승인완료 수
	public int tradingStatusCntService() {
		int tscs= dbDAO.tradingStatusCnt();
		
		return tscs;
	}

	//승인완료 현황 수
	public List<TradingStatusDomain> tradingStatusService(){
		List<TradingStatusDomain> tss= dbDAO.tradingStatus();
		
		return tss;
	}
	
	//카테고리별 모임 수(소셜링/클럽/챌린지)
	public CategoryCntDomain categoryCntService(){
		
		CategoryCntDomain ccd = dbDAO.categoryCnt();
		
		return ccd;
	}

	//지역별 모임현황
	public  List<ClubStatusCntDomain> regionCntService() {
		List<ClubStatusCntDomain> dcs = dbDAO.regionCnt();
		
		return dcs;
	}

	//신규&탈퇴회원
	public List<NewAndWithdrawallCntDomain> newAndwithdrawallCntService(){
		List<NewAndWithdrawallCntDomain> nacs = dbDAO.newAndWithdrawallCnt();
		
		return nacs;
	}

	//월별총회원수
	public List<TotalMemberCntVO> monthTotalCntService(){
		List<TotalMemberCntVO> mtcs = dbDAO.monthTotalCnt();
		
		return mtcs;
	}
	
	

}//class
