package kr.co.haerak.domain.club;

import java.sql.Date;

public class SetReviewDomain {
	private String userId,clubReview,reviewReply,userImg,nickName;
	private int reviewNum,clubNum,replyNum,replyCheck;
	private Date writeDate;
	
	
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
	public String getReviewReply() {
		return reviewReply;
	}
	public void setReviewReply(String reviewReply) {
		this.reviewReply = reviewReply;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
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
	public int getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}
	public int getReplyCheck() {
		return replyCheck;
	}
	public void setReplyCheck(int replyCheck) {
		this.replyCheck = replyCheck;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	@Override
	public String toString() {
		return "SetReviewDomain [userId=" + userId + ", clubReview=" + clubReview + ", reviewReply=" + reviewReply
				+ ", userImg=" + userImg + ", nickName=" + nickName + ", reviewNum=" + reviewNum + ", clubNum="
				+ clubNum + ", replyNum=" + replyNum + ", replyCheck=" + replyCheck + ", writeDate=" + writeDate + "]";
	}
	
	
	
	
	
}//SetReviewDomain
