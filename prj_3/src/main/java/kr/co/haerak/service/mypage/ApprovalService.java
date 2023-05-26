package kr.co.haerak.service.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.mypage.MypageDAO;
import kr.co.haerak.domain.mypage.ApprovalDomain;
import kr.co.haerak.vo.mypage.ApprovalVO;

@Component
public class ApprovalService {
	@Autowired(required = false)
	private MypageDAO mDAO;
	
	public List<ApprovalDomain> approval(int clubNum){
		
		List<ApprovalDomain> list = mDAO.approvalList(clubNum);
		return list;
	}
	
	public int approve(ApprovalVO aVO) {
		int cnt=0;
		
		cnt=mDAO.approve(aVO);
		
		return cnt;
	}

	public int decline(ApprovalVO aVO) {
		int cnt=0;
		
		cnt=mDAO.decline(aVO);
		
		return cnt;
	}
}
