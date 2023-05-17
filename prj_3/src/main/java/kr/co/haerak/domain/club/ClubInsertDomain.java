package kr.co.haerak.domain.club;

import java.sql.Date;
import java.util.List;

public class ClubInsertDomain {

	private int price,categoryNum,ActiAreaNum,numberPeople,clubNum;
	private String clubName,detailTxt,clubAddr,userId,latitude,longitude;
	private List<String> clubImg;
	private Date clubDate;
	
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
	public int getActiAreaNum() {
		return ActiAreaNum;
	}
	public void setActiAreaNum(int actiAreaNum) {
		ActiAreaNum = actiAreaNum;
	}
	public int getNumberPeople() {
		return numberPeople;
	}
	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}
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
	public String getDetailTxt() {
		return detailTxt;
	}
	public void setDetailTxt(String detailTxt) {
		this.detailTxt = detailTxt;
	}
	public String getClubAddr() {
		return clubAddr;
	}
	public void setClubAddr(String clubAddr) {
		this.clubAddr = clubAddr;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public List<String> getClubImg() {
		return clubImg;
	}
	public void setClubImg(List<String> clubImg) {
		this.clubImg = clubImg;
	}
	public Date getClubDate() {
		return clubDate;
	}
	public void setClubDate(Date clubDate) {
		this.clubDate = clubDate;
	}
	
	
	@Override
	public String toString() {
		return "ClubInsertDomain [price=" + price + ", categoryNum=" + categoryNum + ", ActiAreaNum=" + ActiAreaNum
				+ ", numberPeople=" + numberPeople + ", clubNum=" + clubNum + ", clubName=" + clubName + ", detailTxt="
				+ detailTxt + ", clubAddr=" + clubAddr + ", userId=" + userId + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", clubImg=" + clubImg + ", clubDate=" + clubDate + "]";
	}
	
	
	
	
}//ClubInsertDomain
