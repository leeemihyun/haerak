package kr.co.haerak.domain.mypage;

import java.sql.Date;

public class ReviewReplyDomain {
	private int clubNum;
	private String reviewReply;
	private Date writeDate;
	
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
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "ReviewReplyDomain [clubNum=" + clubNum + ", reviewReply=" + reviewReply + ", writeDate=" + writeDate
				+ "]";
	}
	
}
