package kr.co.haerak.vo;

public class ReplyVO {

	private int reviewNum,clubNum;
	private String reviewReply,userId;
	
	
	
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
	public String getReviewReply() {
		return reviewReply;
	}
	public void setReviewReply(String reviewReply) {
		this.reviewReply = reviewReply;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	@Override
	public String toString() {
		return "ReplyVO [reviewNum=" + reviewNum + ", clubNum=" + clubNum + ", reviewReply=" + reviewReply + ", userId="
				+ userId + "]";
	}
	
	
	
}//ReplyVO
