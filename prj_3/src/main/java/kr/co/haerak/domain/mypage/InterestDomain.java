package kr.co.haerak.domain.mypage;

import java.sql.Date;

public class InterestDomain {
	private String clubImg, clubName;
	private int clubNum;
	private Date clubDate;
	public String getClubImg() {
		return clubImg;
	}
	public void setClubImg(String clubImg) {
		this.clubImg = clubImg;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public Date getClubDate() {
		return clubDate;
	}
	public void setClubDate(Date clubDate) {
		this.clubDate = clubDate;
	}
	@Override
	public String toString() {
		return "InterestDomain [clubImg=" + clubImg + ", clubName=" + clubName + ", clubNum=" + clubNum + ", clubDate="
				+ clubDate + "]";
	}

}
