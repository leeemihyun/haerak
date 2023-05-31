package kr.co.haerak.dao.admin;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.admin.CategoryCntDomain;
import kr.co.haerak.domain.admin.ClubStatusCntDomain;
import kr.co.haerak.domain.admin.MemberDomain;
import kr.co.haerak.domain.admin.NewAndWithdrawallCntDomain;
import kr.co.haerak.domain.admin.TotalMemberCntDomain;
import kr.co.haerak.domain.admin.TradingStatusDomain;
import kr.co.haerak.vo.admin.TotalMemberCntVO;

@Component
public class DashBoardDAO {

	//오늘 총 방문 수(성공)
	public int totalVisit() throws PersistenceException {
		int totVisit=0;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		totVisit = ss.selectOne("totalVisit");
		
		if(ss !=null) {ss.close();};
		return totVisit;
	}//totalVisit
		
	//총 회원수(성공)
	public int memberCnt()throws PersistenceException {
		int memCnt= 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		memCnt = ss.selectOne("memberCnt");
		
		if(ss != null) {ss.close();};
		
		return memCnt;
	 }

	//신규가입 회원 수(성공)
	public  int newMemberCnt()throws PersistenceException {
		int newMemCnt = 0;
		
		SqlSession ss= MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		newMemCnt = ss.selectOne("newMemberCnt");
		if(ss != null) {ss.close();};
		return newMemCnt;
	}

	//오늘 탈퇴한 회원 수(성공)
	public int withdrawalMembers()throws PersistenceException {
		int wMem = 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		wMem=ss.selectOne("withdrawalMembers");
		
		if(ss != null) {ss.close();}
		
		return wMem;
	}

	//오늘 승인완료 수(성공)
	public  int tradingStatusCnt()throws PersistenceException {
		int tsc = 0;
		
		SqlSession ss= MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		tsc=ss.selectOne("tradingStatusCnt");
		
		if(ss != null) {ss.close();}
		
		return tsc;
	}

	//승인완료 현황 수
	public List<TradingStatusDomain> tradingStatus()throws PersistenceException {
		List<TradingStatusDomain> list = new ArrayList<TradingStatusDomain>();
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList("tradingStatus");
		
		String date="";
		for(int i = 0; i<list.size();i++) {
			date= list.get(i).getTrunc().substring(5,10);
			list.get(i).setTrunc(date);
		}
		
		return list;
	}

	//카테고리별 모임 수(소셜링/클럽/챌린지)(성공)
	public CategoryCntDomain categoryCnt()throws PersistenceException{
		CategoryCntDomain ccd = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ccd=ss.selectOne("categoryCnt");
		
		if(ss != null) {ss.close();}
		
		return ccd;
	}//categoryCnt

	//지역별 모임현황
	public List<ClubStatusCntDomain> regionCnt()throws PersistenceException {

		List<ClubStatusCntDomain> list = new ArrayList<ClubStatusCntDomain>();
		
		SqlSession ss= MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList("regionCnt");
		return list;
	}

	//신규&탈퇴회원(성공)
	public List<NewAndWithdrawallCntDomain> newAndWithdrawallCnt()throws PersistenceException{
		List<NewAndWithdrawallCntDomain> list = new ArrayList<NewAndWithdrawallCntDomain>();
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list=ss.selectList("newAndWithdrawallCnt");
		
		if(ss != null) {ss.close();}
		
		String month="";
		for(int i = 0; i<list.size();i++) {
			month= list.get(i).getMonth().substring(5);
			list.get(i).setMonth(month);
		}
		
		return list;
		
	}

	//월별총회원수(성공)
	public List<TotalMemberCntVO> monthTotalCnt()throws PersistenceException{
		List<TotalMemberCntVO> list = new ArrayList<TotalMemberCntVO>();
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list=ss.selectList("monthTotalCnt");
		
		if(ss !=null) {ss.close();}
		

		return list;
	}
	
	public static void main(String[] args) {
		//System.out.println("탔다");
//		System.out.println(new DashBoardDAO().totalVisit());
//		System.out.println(new DashBoardDAO().memberCnt());
//		System.out.println(new DashBoardDAO().newMemberCnt());
//		System.out.println(new DashBoardDAO().withdrawalMembers());
//		System.out.println(new DashBoardDAO().tradingStatusCnt());
//		System.out.println(new DashBoardDAO().tradingStatus());
//		System.out.println(new DashBoardDAO().categoryCnt());
		System.out.println(new DashBoardDAO().regionCnt());
//		System.out.println(new DashBoardDAO().newAndWithdrawallCnt());
//		System.out.println(new DashBoardDAO().monthTotalCnt());
		
	}//main
	
}//class
