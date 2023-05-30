package kr.co.haerak.dao.club;

import java.util.ArrayList;
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
		
		ClubInsertDomain result=null;
		
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 <select id="subquery" resultMap="cdResult">
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		result=ss.selectOne("setSelectClub",clubNum); //상품목록
		//3. MyBatis Handler 닫기
		
		System.out.println(result);
		if(ss !=null) {ss.close();} //end if
		
		
		return result;
	}//setSelectClub
	
	public static void main(String[] args) {
		new InsertClubDAO().setSelectClub(1);
	}//main
	
	
}//InsertClubDAO
