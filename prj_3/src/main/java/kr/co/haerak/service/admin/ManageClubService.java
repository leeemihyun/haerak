package kr.co.haerak.service.admin;

import java.text.SimpleDateFormat;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.haerak.dao.admin.ManageClubDAO;
import kr.co.haerak.domain.admin.ClubDomain;
@Controller
public class ManageClubService{

	//모임 목록 페이지
	@Autowired(required = false)
	private ManageClubDAO mcDAO;
	
	public String clubSetSearchService(String clubname) {
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("resultFlag",false);
		
		List<ClubDomain> list = mcDAO.clubSetSearch(clubname);
		jsonObj.put("resultFlag", true);
		jsonObj.put("dataSize",list.size());
		
	
		JSONArray jsonArr=new JSONArray();
		JSONObject jsonTemp=null;
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		for(ClubDomain cd:list) {
			jsonTemp=new JSONObject();
			jsonTemp.put("CLUB_NAME",cd.getCLUB_NAME());
			jsonTemp.put("CATEGORY_NAME",cd.getCATEGORY_NAME());
			jsonTemp.put("USER_ID",cd.getUSER_ID());
			jsonTemp.put("CLUB_NUM",cd.getCLUB_NUM());
			jsonTemp.put("PRICE",cd.getPRICE());
			jsonTemp.put("INPUT_DATE",sdf.format(cd.getINPUT_DATE()));
		
			jsonArr.add(jsonTemp);
		}
		
		jsonObj.put("data", jsonArr);
		
		
	
		return jsonObj.toJSONString();
	}//clubSetService
	

	
	//모임 삭제
	public boolean clubDeleteService(int club_num) {
		int cnt=mcDAO.clubDelete(club_num);
		
		return cnt==1;
	}
}//class
