package kr.co.haerak.domain.mypage;

import java.sql.Date;

public class ClubReviewDomain {
	private int reviewNum, clubNum;
	private String clubReview;
	private Date writeDate;
	
	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public String getClubReview() {
		return clubReview;
	}
	public void setClubReview(String clubReview) {
		this.clubReview = clubReview;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "ClubReviewDomain [reviewNum=" + reviewNum + ", clubNum=" + clubNum + ", clubReview=" + clubReview
				+ ", writeDate=" + writeDate + "]";
	}
	
}
