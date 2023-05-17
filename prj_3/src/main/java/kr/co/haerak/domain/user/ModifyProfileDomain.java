package kr.co.haerak.domain.user;

public class ModifyProfileDomain {
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
	public ModifyProfileDomain() {
		// TODO Auto-generated constructor stub
	}

	public ModifyProfileDomain(String nickName, String userImg, String personalIntro) {
		super();
		this.nickName = nickName;
		this.userImg = userImg;
		this.personalIntro = personalIntro;
	}
	
	
}
