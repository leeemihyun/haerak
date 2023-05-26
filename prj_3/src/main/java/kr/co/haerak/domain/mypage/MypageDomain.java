package kr.co.haerak.domain.mypage;

public class MypageDomain {
	private int clubNum, categoryNum;
	private String clubName, detailTxt, categoryName, clubImg;
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getDetailTxt() {
		return detailTxt;
	}
	public void setDetailTxt(String detailTxt) {
		this.detailTxt = detailTxt;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getClubImg() {
		return clubImg;
	}
	public void setClubImg(String clubImg) {
		this.clubImg = clubImg;
	}
	@Override
	public String toString() {
		return "MypageDomain [clubNum=" + clubNum + ", categoryNum=" + categoryNum + ", clubName=" + clubName
				+ ", detailTxt=" + detailTxt + ", categoryName=" + categoryName + ", clubImg=" + clubImg + "]";
	}
	
}
