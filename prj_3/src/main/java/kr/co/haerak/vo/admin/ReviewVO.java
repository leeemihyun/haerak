package kr.co.haerak.vo.admin;

import java.util.Date;

/**
 * ÈÄ±â Domain
 * @author user
 */
public class ReviewVO {

	private int review_NUM,club_NUM;
	private String USER_ID,club_review;
	private Date WRITE_DATE;
	
	public ReviewVO() {
		
	}
	
	public ReviewVO(int review_NUM, int club_NUM, String uSER_ID, String club_review, Date wRITE_DATE) {
		this.review_NUM = review_NUM;
		this.club_NUM = club_NUM;
		USER_ID = uSER_ID;
		this.club_review = club_review;
		WRITE_DATE = wRITE_DATE;
	}

	public int getReview_NUM() {
		return review_NUM;
	}
	public void setReview_NUM(int review_NUM) {
		this.review_NUM = review_NUM;
	}
	public int getClub_NUM() {
		return club_NUM;
	}
	public void setClub_NUM(int club_NUM) {
		this.club_NUM = club_NUM;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getClub_review() {
		return club_review;
	}
	public void setClub_review(String club_review) {
		this.club_review = club_review;
	}
	public Date getWRITE_DATE() {
		return WRITE_DATE;
	}
	public void setWRITE_DATE(Date wRITE_DATE) {
		WRITE_DATE = wRITE_DATE;
	}
	@Override
	public String toString() {
		return "ReviewDomain [review_NUM=" + review_NUM + ", club_NUM=" + club_NUM + ", USER_ID=" + USER_ID
				+ ", club_review=" + club_review + ", WRITE_DATE=" + WRITE_DATE + "]";
	}

	

	
	
}//class
