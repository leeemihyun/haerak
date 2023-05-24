package kr.co.haerak.dao.club;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.club.ClubInsertDomain;
import kr.co.haerak.vo.club.ClubInsertVO;

/**
 * 모임관련 DAO
 * @author user
 */
@Component
public class InsertClubDAO {

	
	/**
	 * 모임 등록 method
	 * @param cVO
	 */
	public void insertClubInfo(ClubInsertVO cVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ss.insert("insertClubInfo",cVO);
		List<String> list = cVO.getClubImg();
		
		for(String clubImg : list) { 
			ss.insert("insertClubImg","http://localhost/prj_3/club_images/"+clubImg);   
		}//end for
		
		ss.commit();
		
		if(ss!=null)ss.close();
		
	}//insertClubInfo
	
	
	/**
	 * 모임 수정 method
	 * @param cVO
	 */
	public void updateClubInfo(ClubInsertVO cVO) {
		
	}//updateClubInfo
	
	
	/**
	 * 수정할 정보를 수정할 페이지에 세팅
	 * @param clubNum
	 * @return
	 */
	public ClubInsertDomain setSelectClub(int clubNum) {
		
		ClubInsertDomain result=new ClubInsertDomain();
		
		return result;
	}//setSelectClub
	
}//InsertClubDAO
