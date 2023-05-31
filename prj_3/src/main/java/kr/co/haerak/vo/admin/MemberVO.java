package kr.co.haerak.vo.admin;

import java.util.Date;

/**
 * À¯Àú Domain
 * @author user
 */
public class MemberVO {

	private String user_id,nickname,detailed_addr,addr,AREA_NAME;
	private Date create_date;
	
	public MemberVO() {
		
	}
	
	
	
	public MemberVO(String user_id, String nickname, String detailed_addr, String addr, String aREA_NAME,
			Date create_date) {
		this.user_id = user_id;
		this.nickname = nickname;
		this.detailed_addr = detailed_addr;
		this.addr = addr;
		AREA_NAME = aREA_NAME;
		this.create_date = create_date;
	}



	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDetailed_addr() {
		return detailed_addr;
	}
	public void setDetailed_addr(String detailed_addr) {
		this.detailed_addr = detailed_addr;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAREA_NAME() {
		return AREA_NAME;
	}
	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	@Override
	public String toString() {
		return "MemberDomain [user_id=" + user_id + ", nickname=" + nickname + ", detailed_addr=" + detailed_addr
				+ ", addr=" + addr + ", AREA_NAME=" + AREA_NAME + ", create_date=" + create_date + "]";
	}
	
	
	
	
}//class
