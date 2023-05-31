package kr.co.haerak.domain.admin;

import java.util.Date;

/**
 * À¯Àú Domain
 * @author user
 */
public class MemberDomain {

	private String user_id,nickname,addr;
	private Date create_date;
	
	public MemberDomain() {
		
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "MemberDomain [user_id=" + user_id + ", nickname=" + nickname + ", addr=" + addr + ", create_date="
				+ create_date + "]";
	}

	public MemberDomain(String user_id, String nickname, String addr, Date create_date) {
		this.user_id = user_id;
		this.nickname = nickname;
		this.addr = addr;
		this.create_date = create_date;
	}
	
	
	
	
	
	
}//class
