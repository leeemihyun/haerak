package kr.co.haerak.domain.mypage;

public class MyProfileDomain {
	private String nickName, userImg, personalIntro;

	public MyProfileDomain() {
		// TODO Auto-generated constructor stub
	}

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

	public MyProfileDomain(String nickName, String userImg, String personalIntro) {
		super();
		this.nickName = nickName;
		this.userImg = userImg;
		this.personalIntro = personalIntro;
	}

	@Override
	public String toString() {
		return "MyProfileDomain [nickName=" + nickName + ", userImg=" + userImg + ", personalIntro=" + personalIntro
				+ "]";
	}

}
