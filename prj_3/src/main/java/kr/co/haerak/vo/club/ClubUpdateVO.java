package kr.co.haerak.vo.club;

import java.sql.Date;
import java.util.List;

public class ClubUpdateVO {

	private int price,clubNum,actiAreaNum,numberPeople;
	private String clubName,detailTxt,clubAddr,detailAddr,userId,latitude,longitude,clubTime,zipcode;
	private List<String> clubImg;
	private Date clubDate;

	
	
	
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getClubTime() {
		return clubTime;
	}
	public void setClubTime(String clubTime) {
		this.clubTime = clubTime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public int getActiAreaNum() {
		return actiAreaNum;
	}
	public void setActiAreaNum(int actiAreaNum) {
		this.actiAreaNum = actiAreaNum;
	}
	public int getNumberPeople() {
		return numberPeople;
	}
	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
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
		return "ClubUpdateVO [price=" + price + ", clubNum=" + clubNum + ", actiAreaNum=" + actiAreaNum
				+ ", numberPeople=" + numberPeople + ", clubName=" + clubName + ", detailTxt=" + detailTxt
				+ ", clubAddr=" + clubAddr + ", detailAddr=" + detailAddr + ", userId=" + userId + ", latitude="
				+ latitude + ", longitude=" + longitude + ", clubTime=" + clubTime + ", zipcode=" + zipcode
				+ ", clubImg=" + clubImg + ", clubDate=" + clubDate + "]";
	}
	
	
	
	
	public ClubUpdateVO(int price, int clubNum, int actiAreaNum, int numberPeople, String clubName, String detailTxt,
			String clubAddr, String detailAddr, String userId, String latitude, String longitude, String clubTime,
			String zipcode, List<String> clubImg, Date clubDate) {
		this.price = price;
		this.clubNum = clubNum;
		this.actiAreaNum = actiAreaNum;
		this.numberPeople = numberPeople;
		this.clubName = clubName;
		this.detailTxt = detailTxt;
		this.clubAddr = clubAddr;
		this.detailAddr = detailAddr;
		this.userId = userId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.clubTime = clubTime;
		this.zipcode = zipcode;
		this.clubImg = clubImg;
		this.clubDate = clubDate;
	}
	
	public ClubUpdateVO(int price, int clubNum, int actiAreaNum, int numberPeople, String clubName, String detailTxt,
			String clubAddr, String detailAddr, String userId, String latitude, String longitude, String clubTime,
			String zipcode, List<String> clubImg) {
		this.price = price;
		this.clubNum = clubNum;
		this.actiAreaNum = actiAreaNum;
		this.numberPeople = numberPeople;
		this.clubName = clubName;
		this.detailTxt = detailTxt;
		this.clubAddr = clubAddr;
		this.detailAddr = detailAddr;
		this.userId = userId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.clubTime = clubTime;
		this.zipcode = zipcode;
		this.clubImg = clubImg;
		
	}
	public ClubUpdateVO() {
		// TODO Auto-generated constructor stub
	}
	
	
}//ClubInsertVO
