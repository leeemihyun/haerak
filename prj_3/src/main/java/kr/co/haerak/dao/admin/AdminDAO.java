package kr.co.haerak.dao.admin;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.MyBatisHandler;
import kr.co.haerak.domain.admin.AdminDomain;
import kr.co.haerak.domain.user.LoginSessionDomain;
import kr.co.haerak.vo.admin.AdminVO;
import kr.co.haerak.vo.user.LoginVO;
@Component
public class AdminDAO {

	public AdminDomain loginCheck(AdminVO aVO)throws PersistenceException {
		AdminDomain ad =null;
		
		//SqlSession 
		SqlSession ss= MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ad = ss.selectOne("adminLog",aVO);
		
		if (ss != null) {ss.close();}
		return ad; 
	}//loginCheck

	


	public static void main(String[] args) {
		System.out.println(new AdminDAO().loginCheck(new AdminVO("","")));
	}


}//class
