package kr.co.haerak.dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.admin.ReviewDomain;

@Component
public class ManageReviewDAO {

	public List<ReviewDomain> reviewSetSearch(String userid){
		List<ReviewDomain> list =new ArrayList<ReviewDomain>();
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list=ss.selectList("reviewList",userid);
		if(ss != null) {ss.close();}//end if
		
		return list;
	}//reviewSetSearch
	
	public int deleteReview(int review_num)throws PersistenceException {
		int cnt=0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		cnt=ss.update("kr.co.haerak.admin_Mapper.reviewDelete",review_num);
		
		if( cnt==1) {ss.commit();}
		
		if(ss != null) {ss.close();}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(new ManageReviewDAO().reviewSetSearch(""));
		System.out.println(new ManageReviewDAO().deleteReview(5));
	}
}//class
