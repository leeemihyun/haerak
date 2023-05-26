package kr.co.haerak.domain.mypage;

import java.sql.Date;

public class JoinListDomain {
	private int clubNum;
	private String clubName, host;
	private Date clubDate;
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
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Date getClubDate() {
		return clubDate;
	}
	public void setClubDate(Date clubDate) {
		this.clubDate = clubDate;
	}
	@Override
	public String toString() {
		return "JoinListDomain [clubNum=" + clubNum + ", clubName=" + clubName + ", host=" + host
				+ ", clubDate=" + clubDate + "]";
	}
	
}
