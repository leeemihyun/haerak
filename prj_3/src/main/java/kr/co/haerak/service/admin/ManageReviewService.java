package kr.co.haerak.service.admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.JobName;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.haerak.dao.admin.ManageReviewDAO;
import kr.co.haerak.domain.admin.ReviewDomain;
@Controller
public class ManageReviewService {

	//후기 목록 페이지
	@Autowired(required = false)
	private ManageReviewDAO mrDAO;
	
	public String reviewSetSearchService(String userid){
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("resultFlag", false);
		
		List<ReviewDomain> list = mrDAO.reviewSetSearch(userid);
		jsonObj.put("resultFlag",true);
		jsonObj.put("dataSize", list.size());
		
		/*private int review_num,club_num;
		private String user_id,club_review;
		private Date write_date;*/
		
		
		JSONArray jsonArr=new JSONArray();
		JSONObject jsonTemp=null;
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		for(ReviewDomain rd:list) {
			jsonTemp=new JSONObject();
			jsonTemp.put("review_num",rd.getReview_num());
			jsonTemp.put("club_num",rd.getClub_num());
			jsonTemp.put("user_id",rd.getUser_id());
			jsonTemp.put("club_review",rd.getClub_review());
			jsonTemp.put("write_date",sdf.format( rd.getWrite_date()));
			
			jsonArr.add(jsonTemp);
		}
		jsonObj.put("data", jsonArr);
		
		return jsonObj.toJSONString();
	}//reviewSetSearchService
	
	
	//후기 삭제 서비스
	public boolean deleteReviewService(int review_num) {
		int drs=mrDAO.deleteReview(review_num);
		return drs ==1;
	}
}//class
