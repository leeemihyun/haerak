package kr.co.haerak.domain.admin;

import java.util.Date;

/**
 * ÈÄ±â Domain
 * @author user
 */
public class ReviewDomain {

	private int review_num,club_num;
	private String user_id,club_review;
	private Date write_date;
	
	public ReviewDomain() {
		
	}

	public ReviewDomain(int review_num, int club_num, String user_id, String club_review, Date write_date) {
		this.review_num = review_num;
		this.club_num = club_num;
		this.user_id = user_id;
		this.club_review = club_review;
		this.write_date = write_date;
	}

	public int getReview_num() {
		return review_num;
	}

	public void setReview_num(int review_num) {
		this.review_num = review_num;
	}

	public int getClub_num() {
		return club_num;
	}

	public void setClub_num(int club_num) {
		this.club_num = club_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getClub_review() {
		return club_review;
	}

	public void setClub_review(String club_review) {
		this.club_review = club_review;
	}

	public Date getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}

	@Override
	public String toString() {
		return "ReviewDomain [review_num=" + review_num + ", club_num=" + club_num + ", user_id=" + user_id
				+ ", club_review=" + club_review + ", write_date=" + write_date + "]";
	}
	

	

	
	
}//class
