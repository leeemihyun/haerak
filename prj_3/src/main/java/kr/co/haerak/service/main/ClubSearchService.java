package kr.co.haerak.service.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.main.ClubDAO;
import kr.co.haerak.domain.main.ClubSalesDomain;
import kr.co.haerak.vo.main.SeeMoreVO;

@Component
public class ClubSearchService {
	
	@Autowired(required = false)
	private ClubDAO cDAO;
	
	
	
	
	//모임검색
	public List<ClubSalesDomain> clubSearchProcess(ClubSalesDomain csDomain){
		
		List<ClubSalesDomain> list = cDAO.selectSearch(csDomain);
		
		return list;
	}
	

	
	
	
	

	
	
}//ClubSearchService
