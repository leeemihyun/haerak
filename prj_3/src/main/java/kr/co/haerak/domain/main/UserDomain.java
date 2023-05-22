package kr.co.haerak.domain.main;

public class UserDomain {
	
	private String USER_ID, USER_IMG;

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getUSER_IMG() {
		return USER_IMG;
	}

	public void setUSER_IMG(String uSER_IMG) {
		USER_IMG = uSER_IMG;
	}

	
	
	@Override
	public String toString() {
		return "UserDomain [USER_ID=" + USER_ID + ", USER_IMG=" + USER_IMG + "]";
	}
	
	
	

}
