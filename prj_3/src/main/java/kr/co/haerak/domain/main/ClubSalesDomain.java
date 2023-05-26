package kr.co.haerak.domain.main;

import java.sql.Date;
import java.util.List;

public class ClubSalesDomain {
	
	private List<UserDomain> userInfo;
	private String club_Img, club_name, area_name  ;
	private int club_Num, price, category_Num, number_People, USER_COUNT;
	private Date club_Date;
	
	
	

	public List<UserDomain> getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(List<UserDomain> userInfo) {
		this.userInfo = userInfo;
	}
	public String getClub_Img() {
		return club_Img;
	}
	public void setClub_Img(String club_Img) {
		this.club_Img = club_Img;
	}
	public String getClub_name() {
		return club_name;
	}
	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public int getUSER_COUNT() {
		return USER_COUNT;
	}
	public void setUSER_COUNT(int uSER_COUNT) {
		USER_COUNT = uSER_COUNT;
	}
	public int getClub_Num() {
		return club_Num;
	}
	public void setClub_Num(int club_Num) {
		this.club_Num = club_Num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCategory_Num() {
		return category_Num;
	}
	public void setCategory_Num(int category_Num) {
		this.category_Num = category_Num;
	}
	public int getNumber_People() {
		return number_People;
	}
	public void setNumber_People(int number_People) {
		this.number_People = number_People;
	}
	public Date getClub_Date() {
		return club_Date;
	}
	public void setClub_Date(Date club_Date) {
		this.club_Date = club_Date;
	}
	@Override
	public String toString() {
		return "ClubSalesDomain [userInfo=" + userInfo + ", club_Img=" + club_Img + ", club_name=" + club_name
				+ ", area_name=" + area_name + ", club_Num=" + club_Num + ", price=" + price + ", category_Num="
				+ category_Num + ", number_People=" + number_People + ", USER_COUNT=" + USER_COUNT + ", club_Date="
				+ club_Date + "]";
	}
	
	


	
	
	
	

	
}