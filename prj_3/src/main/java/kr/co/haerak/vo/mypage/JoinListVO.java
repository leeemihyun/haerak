package kr.co.haerak.vo.mypage;

import java.sql.Date;

public class JoinListVO {
	private String userId;
	private int clubNum;
	private Date joinDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "JoinListVO [userId=" + userId + ", clubNum=" + clubNum + ", joinDate=" + joinDate + "]";
	}
	
}
