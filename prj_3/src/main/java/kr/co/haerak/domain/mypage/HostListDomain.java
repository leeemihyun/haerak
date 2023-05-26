package kr.co.haerak.domain.mypage;

import java.sql.Date;

public class HostListDomain {
	private String categoryName, clubStatus, clubName;
	private int clubNum, numberPeople;
	private Date clubDate;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getClubStatus() {
		return clubStatus;
	}
	public void setClubStatus(String clubStatus) {
		this.clubStatus = clubStatus;
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
	public int getNumberPeople() {
		return numberPeople;
	}
	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}
	public Date getClubDate() {
		return clubDate;
	}
	public void setClubDate(Date clubDate) {
		this.clubDate = clubDate;
	}
	@Override
	public String toString() {
		return "HostListDomain [categoryName=" + categoryName + ", clubStatus=" + clubStatus + ", clubName=" + clubName
				+ ", clubNum=" + clubNum + ", numberPeople=" + numberPeople + ", clubDate=" + clubDate + "]";
	}
	
}
