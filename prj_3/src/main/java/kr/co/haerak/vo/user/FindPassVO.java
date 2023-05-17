package kr.co.haerak.vo.user;

public class FindPassVO {
	private String userName, userId, eMail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "FindPassVO [userName=" + userName + ", userId=" + userId + ", eMail=" + eMail + "]";
	}

	public FindPassVO(String userName, String userId, String eMail) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.eMail = eMail;
	}

	public FindPassVO() {
		// TODO Auto-generated constructor stub
	}

}
