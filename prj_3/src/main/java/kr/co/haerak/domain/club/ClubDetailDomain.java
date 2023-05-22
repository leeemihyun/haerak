package kr.co.haerak.domain.club;

import java.sql.Date;
import java.util.List;

public class ClubDetailDomain {

	private List<String> clubImg;
	private String clubName,clubAddr,detailTxt,userId,nickName,userImg,addr,personalIntro,categoryName,latitude,longitude;
	private int reviewCnt,viewCnt,interCnt,price,clubNum,numberPeople;
	private Date inputDate,clubDate;
	
	public List<String> getClubImg() {
		return clubImg;
	}
	public void setClubImg(List<String> clubImg) {
		this.clubImg = clubImg;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubAddr() {
		return clubAddr;
	}
	public void setClubAddr(String clubAddr) {
		this.clubAddr = clubAddr;
	}
	public String getDetailTxt() {
		return detailTxt;
	}
	public void setDetailTxt(String detailTxt) {
		this.detailTxt = detailTxt;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPersonalIntro() {
		return personalIntro;
	}
	public void setPersonalIntro(String personalIntro) {
		this.personalIntro = personalIntro;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
	public int getReviewCnt() {
		return reviewCnt;
	}
	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public int getInterCnt() {
		return interCnt;
	}
	public void setInterCnt(int interCnt) {
		this.interCnt = interCnt;
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
	public int getNumberPeople() {
		return numberPeople;
	}
	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public Date getClubDate() {
		return clubDate;
	}
	public void setClubDate(Date clubDate) {
		this.clubDate = clubDate;
	}
	
	
	@Override
	public String toString() {
		return "ClubDetailDomain [clubImg=" + clubImg + ", clubName=" + clubName + ", clubAddr=" + clubAddr
				+ ", detailTxt=" + detailTxt + ", userId=" + userId + ", nickName=" + nickName + ", userImg=" + userImg
				+ ", addr=" + addr + ", personalIntro=" + personalIntro + ", categoryName=" + categoryName
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", reviewCnt=" + reviewCnt + ", viewCnt="
				+ viewCnt + ", interCnt=" + interCnt + ", price=" + price + ", clubNum=" + clubNum + ", numberPeople="
				+ numberPeople + ", inputDate=" + inputDate + ", clubDate=" + clubDate + "]";
	}
	
	
	
	
}//ClubDetailDomain
