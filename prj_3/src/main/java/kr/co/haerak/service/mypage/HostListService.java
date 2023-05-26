package kr.co.haerak.service.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.mypage.MypageDAO;
import kr.co.haerak.domain.mypage.HostListDomain;

@Component
public class HostListService {

	@Autowired(required = false)
	private MypageDAO mDAO;
	
	public List<HostListDomain> hostList(String sessionId){
		
		List<HostListDomain> list = mDAO.selectHostList(sessionId);
		
		return list;
	}
}
