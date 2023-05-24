package kr.co.haerak.service.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import kr.co.haerak.dao.main.ClubDAO;
import kr.co.haerak.domain.main.ClubSalesDomain;

@Component
public class ClubMainService {
	
	
	@Autowired(required = false)
	private ClubDAO cDAO;
	
	
	public List<ClubSalesDomain> mainRank(int categoryNum){
		List<ClubSalesDomain> list = null;
		
		list = cDAO.selectRankClub(categoryNum);
		 
		return list;
		
	}
	
	
	
	

}
