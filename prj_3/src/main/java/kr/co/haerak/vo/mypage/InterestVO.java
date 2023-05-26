package kr.co.haerak.vo.mypage;

import java.sql.Date;

public class InterestVO {
	private String userId;
	private int clubNum;
	private Date interestDate;
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
	public Date getInterestDate() {
		return interestDate;
	}
	public void setInterestDate(Date interestDate) {
		this.interestDate = interestDate;
	}
	@Override
	public String toString() {
		return "InterestVO [userId=" + userId + ", clubNum=" + clubNum + ", interestDate=" + interestDate + "]";
	}
	
}
