package kr.co.haerak.dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.admin.MemberDomain;

@Component
public class ManageMemberDAO {

	public List<MemberDomain> memberSetSearch(String userid)throws PersistenceException{
		List<MemberDomain> list=new ArrayList<MemberDomain>();
		
		SqlSession ss= MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList("memberList",userid);
		
		if(ss != null) {ss.close();}//end if
		
		return list;
	}//memberSetSearch
	
	public static void main(String[] args) {
		System.out.println(new ManageMemberDAO().memberSetSearch(""));
	}
	
}//class
