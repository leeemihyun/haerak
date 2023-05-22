package kr.co.haerak.service.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.haerak.dao.main.ClubDAO;
import kr.co.haerak.domain.main.ClubSalesDomain;
import kr.co.haerak.vo.main.SeeMoreVO;

public class ClubMoreService {
	
	
	@Autowired(required = false)
	private ClubDAO cDAO;
	
	
	
	
	//카테고리별 더보기 클릭했을 때 리스트 조회
	public List<ClubSalesDomain> selectMoreClub(SeeMoreVO smVO){
		
	List<ClubSalesDomain> clubMore = cDAO.selectMoreClub(smVO);
		
	return selectMoreClub(smVO);
	}

}
