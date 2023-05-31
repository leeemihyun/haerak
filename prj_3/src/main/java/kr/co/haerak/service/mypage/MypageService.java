package kr.co.haerak.service.mypage;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.mypage.MypageDAO;
import kr.co.haerak.domain.main.ClubSalesDomain;
import kr.co.haerak.domain.mypage.MyProfileDomain;
import kr.co.haerak.domain.mypage.OthersMyPageDomain;

@Component
public class MypageService {
	
	@Autowired(required = false)
	private MypageDAO mDAO;
	
	public String othersJoinListService(String userId){
		List<OthersMyPageDomain> list = null;
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("resultFlag", false);
		int i=0;
		try {
        list=mDAO.myPageJoin(userId);
        jsonObj.put("resultFlag", true);
        jsonObj.put("dataSize", list.size());
        JSONArray jsonArr = new JSONArray();
        JSONObject jsonTemp = null;
        for(OthersMyPageDomain omsd : list) {
        	jsonTemp = new JSONObject();
        	jsonTemp.put("clubImg",omsd.getClubImg());
        	jsonTemp.put("clubName",omsd.getClubName());
        	jsonTemp.put("clubNum",omsd.getClubNum());
        	jsonArr.add(jsonTemp);
        	}
        jsonObj.put("data", jsonArr);
        
		}finally {
			
		}
        
		return jsonObj.toJSONString();
	}
		
		
	public String othersHostListService(String userId){
		List<OthersMyPageDomain> list = null;
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("resultFlag", false);
		int i=0;
		try {
        list=mDAO.myPageHost(userId);
        jsonObj.put("resultFlag", true);
        jsonObj.put("dataSize", list.size());
        JSONArray jsonArr = new JSONArray();
        JSONObject jsonTemp = null;
        for(OthersMyPageDomain omsd : list) {
        	jsonTemp = new JSONObject();
        	jsonTemp.put("clubImg",omsd.getClubImg());
        	jsonTemp.put("clubName",omsd.getClubName());
        	jsonTemp.put("clubNum",omsd.getClubNum());
        	jsonArr.add(jsonTemp);
        	}
        jsonObj.put("data", jsonArr);
        
		}finally {
			
		}
        
		return jsonObj.toJSONString();
	}
	public MyProfileDomain myProfileService(String userId){
		
		MyProfileDomain list = mDAO.myProfile(userId);
		
		return list;
	}
	
	
}
