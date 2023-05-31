package kr.co.haerak.dao.club;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.club.ClubDetailDomain;
import kr.co.haerak.domain.club.SetReviewDomain;
import kr.co.haerak.vo.club.ClubSearchVO;

/**
 * 모임상세페이지 DAO
 * @author user
 */
@Component
public class ShowClubDAO {

	
	/**
	 * 모임의 정보를 띄우는 service
	 * @param clubNum
	 * @return
	 */
	public ClubDetailDomain showClubService(int clubNum) {
		
		ClubDetailDomain result=null;
		List<String> clubImg=new ArrayList<String>();
		
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 <select id="subquery" resultMap="cdResult">
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		result=ss.selectOne("selectClubInfoDetail",clubNum); //상품목록
		clubImg=ss.selectList("selectClubImg",clubNum); //상품이미지
		result.setClubImg(clubImg);
		ss.update("riviewCntAdd",clubNum);
		ss.commit();
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
		return result;
	}//showClubService
	
	/**
	 * 모임 상세페이지에서 댓글 4개 가져오기
	 * @param clubNum
	 * @return
	 */
	public List<SetReviewDomain> inforeviewListSelect(int clubNum) {
		List<SetReviewDomain> result=null;
		
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 <select id="subquery" resultMap="cdResult">
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		result=ss.selectList("InforeviewListSelect",clubNum); //상품목록
		System.out.println(result);
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
		return result;
	}//inforeviewListSelect
	
	/**
	 *  모임더보기 페이지에서 리뷰를 가져오는 service
	 * @param clubNum
	 * @return
	 */
	public List<SetReviewDomain> showReviewService(int clubNum) {
		
		List<SetReviewDomain> result=new ArrayList<SetReviewDomain>();
		
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 
		result=ss.selectList("clubInfoSelectReview",clubNum);
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
		
		return result;
	}//showReviewService
	
	/**
	 * 관심상태인지 확인하는 service
	 * @param userId
	 * @param clubNum
	 * @return
	 */
	public String selectInterService(ClubSearchVO csVO) {
		String result="";
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		result=(String)ss.selectOne("interCheck",csVO); //관심체크
		System.out.println(result);
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		return result;
	}//selectInterService
	
	
	/**
	 * 하트 클릭 시 관심목록 추가/삭제
	 * @param userId
	 * @param clubNum
	 */
	public boolean updateInterList(ClubSearchVO csVO,int flag) { //flag   1: 추가 2: 삭제
		
		boolean result=false;
		int sqlcheck=0;
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		if(flag==1) {
			sqlcheck=ss.insert("interAdd",csVO); //추가
			
		}else if(flag==2) {
			sqlcheck=ss.delete("interDelete",csVO); //삭제
		}
		
		if(sqlcheck==1) {
			ss.commit();
			result=true;
		}//end if
		
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
		System.out.println(sqlcheck);
		return result;
		
	}//updateInterList
	
	
	/**
	 * 모임신청하기
	 */
	public boolean clubApprovalInsert(ClubSearchVO csVO) {
		int cnt=0;
		boolean approvalFlag=false;
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		
		if(approvalCheck(csVO)) {
		cnt=ss.insert("clubApprovalInsert",csVO); //전에 했었는지
		if(cnt==1) {
			ss.commit();
			approvalFlag=true; //성공
		}else {
			ss.rollback();
		}//end else
		}
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if

		return approvalFlag;
	}//clubapprovalInsert
	
	public boolean approvalCheck(ClubSearchVO csVO) {
		
		boolean approvalFlag=false;
		//1. Mybatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. handler 사용 
		//parameterType이 없으므로 매개변수 하나인 method를 사용한다.
		String joinCheck=ss.selectOne("joinListCheck",csVO);
		String approvalCheck=ss.selectOne("approvallistCheck",csVO);
		if(joinCheck==null) {
			if(approvalCheck==null) {
				approvalFlag=true;
			}//end if
		}//end if
		
		
		//3. MyBatis Handler 닫기
		if(ss !=null) {ss.close();} //end if
		
		
		return approvalFlag;
	}
	
	public static void main(String[] args) {
		//System.out.println(new ShowClubDAO().showClubService(1));
		//ClubSearchVO sVO=new ClubSearchVO();
		//sVO.setClub_Num(1);
		//sVO.setUser_id("abcd12");
		//System.out.println(sVO.getUser_id());
		//System.out.println(new ShowClubDAO().updateInterList(sVO,2));
		//new ShowClubDAO().clubApprovalInsert(sVO);
		//new ShowClubDAO().showReviewService(1);
		new ShowClubDAO().inforeviewListSelect(1);
	}//main
	
	
}//ShowClubDAO
