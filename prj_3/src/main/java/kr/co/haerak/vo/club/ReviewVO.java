package kr.co.haerak.vo.club;

public class ReviewVO {

	private int clubNum;
	private String userId,clubReview;
	
	
	
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getClubReview() {
		return clubReview;
	}
	public void setClubReview(String clubReview) {
		this.clubReview = clubReview;
	}
	
	
	@Override
	public String toString() {
		return "ReviewVO [clubNum=" + clubNum + ", userId=" + userId + ", clubReview=" + clubReview + "]";
	}
	
	
	
}//ReviewVO
