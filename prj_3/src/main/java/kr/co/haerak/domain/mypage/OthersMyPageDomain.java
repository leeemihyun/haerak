package kr.co.haerak.domain.mypage;

public class OthersMyPageDomain {
	
	private String clubName, clubNum, nickName, clubDate, clubImg;

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubNum() {
		return clubNum;
	}

	public void setClubNum(String clubNum) {
		this.clubNum = clubNum;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getClubDate() {
		return clubDate;
	}

	public void setClubDate(String clubDate) {
		this.clubDate = clubDate;
	}

	public String getClubImg() {
		return clubImg;
	}

	public void setClubImg(String clubImg) {
		this.clubImg = clubImg;
	}

	@Override
	public String toString() {
		return "OthersMyPageDomain [clubName=" + clubName + ", clubNum=" + clubNum + ", nickName=" + nickName
				+ ", clubDate=" + clubDate + ", clubImg=" + clubImg + "]";
	}

	public OthersMyPageDomain(String clubName, String clubNum, String nickName, String clubDate, String clubImg) {
		this.clubName = clubName;
		this.clubNum = clubNum;
		this.nickName = nickName;
		this.clubDate = clubDate;
		this.clubImg = clubImg;
	}

	public OthersMyPageDomain() {
		// TODO Auto-generated constructor stub
	}
}
