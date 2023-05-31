package kr.co.haerak.dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.admin.ClubDomain;
import kr.co.haerak.vo.admin.AdminVO;
@Component
public class ManageClubDAO {

	//모임 목록 테이블 세팅&검색
	public List<ClubDomain> clubSetSearch(String clubname)throws PersistenceException{
		List<ClubDomain> list= null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list=ss.selectList("clubList",clubname);
		if(ss != null) {ss.close();}//end if
		return list;
		
	}//clubSetSearch
	
	//모임 삭제
	public int clubDelete(int club_num) {
		int cnt=0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		cnt=ss.update("kr.co.haerak.admin_Mapper.clubDelete",club_num);
		
		if( cnt==1) {ss.commit();}
		
		if(ss != null) {ss.close();}
		
		return cnt;
	}//clubDelete

	public static void main(String[] args) {
		System.out.println(new ManageClubDAO().clubSetSearch(""));
		//System.out.println(new ManageClubDAO().clubDelete(29));
	}
	
	
}//class
