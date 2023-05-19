package kr.co.haerak.domain.main;

import java.sql.Date;
import java.util.List;

public class ClubSalesDomain {
	
	private List<String> userImg,userTotal;
	private String clubImg, clubName, areaName ;
	private int clubNum, price, categoryNum, numberPeople;
	private Date clubDate;
	
	
	public ClubSalesDomain() {
	}


	public List<String> getUserImg() {
		return userImg;
	}


	public void setUserImg(List<String> userImg) {
		this.userImg = userImg;
	}


	public List<String> getUserTotal() {
		return userTotal;
	}


	public void setUserTotal(List<String> userTotal) {
		this.userTotal = userTotal;
	}


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


	public String getAreaName() {
		return areaName;
	}


	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public int getClubNum() {
		return clubNum;
	}


	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCategoryNum() {
		return categoryNum;
	}


	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
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
		return "ClubSalesDomain [userImg=" + userImg + ", userTotal=" + userTotal + ", clubImg=" + clubImg
				+ ", clubName=" + clubName + ", areaName=" + areaName + ", clubNum=" + clubNum + ", price=" + price
				+ ", categoryNum=" + categoryNum + ", numberPeople=" + numberPeople + ", clubDate=" + clubDate + "]";
	}


	
}