package kr.co.haerak.vo.user;

public class UserDupVO {
	private String userName, email, email2;

	public UserDupVO() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public UserDupVO(String userName, String email, String email2) {
		super();
		this.userName = userName;
		this.email = email;
		this.email2 = email2;
	}

	@Override
	public String toString() {
		return "UserDupVO [userName=" + userName + ", email=" + email + ", email2=" + email2 + "]";
	}

}
