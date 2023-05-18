package kr.co.haerak.vo.user;

public class ModifyProfileVO {
	private String nickName, userImg, personalIntro, user_id;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getPersonalIntro() {
		return personalIntro;
	}

	public void setPersonalIntro(String personalIntro) {
		this.personalIntro = personalIntro;
	}

	public ModifyProfileVO(String nickName, String userImg, String personalIntro, String user_id) {
		super();
		this.nickName = nickName;
		this.userImg = userImg;
		this.personalIntro = personalIntro;
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "ModifyProfileVO [nickName=" + nickName + ", userImg=" + userImg + ", personalIntro=" + personalIntro
				+ ", user_id=" + user_id + "]";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public ModifyProfileVO() {
		// TODO Auto-generated constructor stub
	}

}
