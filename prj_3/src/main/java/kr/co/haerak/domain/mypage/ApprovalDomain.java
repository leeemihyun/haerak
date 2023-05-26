package kr.co.haerak.domain.mypage;


public class ApprovalDomain {
	private int clubNum;
	private String clubName, approvalStatus, userId;
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ApprovalDomain [clubNum=" + clubNum + ", clubName=" + clubName + ", approvalStatus=" + approvalStatus
				+ ", userId=" + userId + "]";
	}
	
}
