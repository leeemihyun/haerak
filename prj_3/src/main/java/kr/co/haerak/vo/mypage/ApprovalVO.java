package kr.co.haerak.vo.mypage;

import java.sql.Date;

public class ApprovalVO {
	private int clubNum;
	private String userId, approvalStatus;
	private Date approvalDate;
	
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
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	@Override
	public String toString() {
		return "ApprovalVO [clubNum=" + clubNum + ", userId=" + userId + ", approvalStatus=" + approvalStatus
				+ ", approvalDate=" + approvalDate + "]";
	}
	
}
