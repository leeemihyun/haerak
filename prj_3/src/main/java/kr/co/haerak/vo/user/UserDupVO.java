package kr.co.haerak.vo.user;

public class UserDupVO {
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
	
	public UserDupVO() {
		// TODO Auto-generated constructor stub
	}

	public UserDupVO(String userName, String eMail) {
		super();
		this.userName = userName;
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "UserDupVO [userName=" + userName + ", eMail=" + eMail + "]";
	}
	
	
}
