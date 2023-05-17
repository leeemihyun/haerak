package kr.co.haerak.vo.user;

public class ModifyProfileVO {
	private String nickName, userImg, personalIntro;

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

	@Override
	public String toString() {
		return "ModifyProfileVO [nickName=" + nickName + ", userImg=" + userImg + ", personalIntro=" + personalIntro
				+ "]";
	}
	public ModifyProfileVO() {
		// TODO Auto-generated constructor stub
	}

	public ModifyProfileVO(String nickName, String userImg, String personalIntro) {
		super();
		this.nickName = nickName;
		this.userImg = userImg;
		this.personalIntro = personalIntro;
	}
	
	
}
