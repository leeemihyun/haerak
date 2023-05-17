package kr.co.haerak.vo.user;

public class ModifyPassVO {
	private String userId, newPass;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	@Override
	public String toString() {
		return "ModifyPassVO [userId=" + userId + ", newPass=" + newPass + "]";
	}

	public ModifyPassVO(String userId, String newPass) {
		super();
		this.userId = userId;
		this.newPass = newPass;
	}
	
	public ModifyPassVO() {
		// TODO Auto-generated constructor stub
	}
	
}
