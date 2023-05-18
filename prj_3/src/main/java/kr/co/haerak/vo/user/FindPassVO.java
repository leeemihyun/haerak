package kr.co.haerak.vo.user;

public class FindPassVO {
	private String userName, userId, email, email2;

	public FindPassVO() {
		// TODO Auto-generated constructor stub
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	@Override
	public String toString() {
		return "FindPassVO [userName=" + userName + ", userId=" + userId + ", email=" + email + ", email2=" + email2
				+ "]";
	}

	public FindPassVO(String userName, String userId, String email, String email2) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.email = email;
		this.email2 = email2;
	}
	
	
}
