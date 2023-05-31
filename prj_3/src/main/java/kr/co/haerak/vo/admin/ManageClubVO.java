package kr.co.haerak.vo.admin;

import java.util.Date;

/**
 * 클럽 도메인
 * @author user
 */
public class ManageClubVO {

	private String CLUB_NAME,CATEGORY_NAME,USER_ID;
	private int CLUB_NUM,PRICE;
	private Date INPUT_DATE;
	
	public ManageClubVO() {
		
	}
	
	public ManageClubVO(String cLUB_NAME, String cATEGORY_NAME, String uSER_ID, int cLUB_NUM, int pRICE,
			Date iNPUT_DATE) {
		CLUB_NAME = cLUB_NAME;
		CATEGORY_NAME = cATEGORY_NAME;
		USER_ID = uSER_ID;
		CLUB_NUM = cLUB_NUM;
		PRICE = pRICE;
		INPUT_DATE = iNPUT_DATE;
	}

	public String getCLUB_NAME() {
		return CLUB_NAME;
	}
	public void setCLUB_NAME(String cLUB_NAME) {
		CLUB_NAME = cLUB_NAME;
	}
	public String getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}
	public void setCATEGORY_NAME(String cATEGORY_NAME) {
		CATEGORY_NAME = cATEGORY_NAME;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public int getCLUB_NUM() {
		return CLUB_NUM;
	}
	public void setCLUB_NUM(int cLUB_NUM) {
		CLUB_NUM = cLUB_NUM;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public Date getINPUT_DATE() {
		return INPUT_DATE;
	}
	public void setINPUT_DATE(Date iNPUT_DATE) {
		INPUT_DATE = iNPUT_DATE;
	}
	@Override
	public String toString() {
		return "ClubDomain [CLUB_NAME=" + CLUB_NAME + ", CATEGORY_NAME=" + CATEGORY_NAME + ", USER_ID=" + USER_ID
				+ ", CLUB_NUM=" + CLUB_NUM + ", PRICE=" + PRICE + ", INPUT_DATE=" + INPUT_DATE + "]";
	}
	
	
	
	
	
}//class
