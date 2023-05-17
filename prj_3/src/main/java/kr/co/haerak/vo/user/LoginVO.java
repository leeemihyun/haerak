package kr.co.haerak.vo.user;

public class LoginVO {
	private String userId, userPassword;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "LoginVO [userId=" + userId + ", userPassword=" + userPassword + "]";
	}

	public LoginVO(String userId, String userPassword) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public LoginVO() {
		// TODO Auto-generated constructor stub
	}
}
