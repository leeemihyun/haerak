package kr.co.haerak.vo.mypage;

public class JoinListVO2 {
	private String userId;
	private int clubNum;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	@Override
	public String toString() {
		return "JoinListVO2 [userId=" + userId + ", clubNum=" + clubNum + "]";
	}
	
}
