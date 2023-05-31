package kr.co.haerak.service.admin;

import java.text.SimpleDateFormat;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.haerak.dao.admin.ManageMemberDAO;
import kr.co.haerak.domain.admin.MemberDomain;

@Controller
public class ManageMemberService {

	//회원 목록 페이지
	@Autowired(required = false)
	private ManageMemberDAO mmDAO;
	
	public String memberSearchService(String userid){
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("resultFlag", false);
		
		List<MemberDomain> list = mmDAO.memberSetSearch(userid); 
		jsonObj.put("resultFlag", true);
		jsonObj.put("dataSize", list.size());
	
		JSONArray jsonArr=new JSONArray();
		JSONObject jsonTemp=null;
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		for(MemberDomain md:list) {
			jsonTemp=new JSONObject();
			jsonTemp.put("user_id", md.getUser_id());
			jsonTemp.put("nickname", md.getNickname());
			jsonTemp.put("addr", md.getAddr());
			jsonTemp.put("create_date",sdf.format( md.getCreate_date()));
			
			jsonArr.add(jsonTemp);
		}
		
		jsonObj.put("data",jsonArr);
		
		return jsonObj.toJSONString();
	}//memberSetSearch
}//class
