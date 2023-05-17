package kr.co.haerak.vo.user;

public class FindIdVO {
	private String userName, eMail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "FindIdVO [userName=" + userName + ", eMail=" + eMail + "]";
	}
	
	public FindIdVO() {
		// TODO Auto-generated constructor stub
	}

	public FindIdVO(String userName, String eMail) {
		super();
		this.userName = userName;
		this.eMail = eMail;
	}
}
