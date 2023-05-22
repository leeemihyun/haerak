package kr.co.haerak.vo.club;

public class ClubSearchVO {
	
	private String user_id;
	private int club_Num;
	
	
	
	public ClubSearchVO() {
	}
	
	
	public ClubSearchVO(String user_id, int club_Num) {
		this.user_id = user_id;
		this.club_Num = club_Num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getClub_Num() {
		return club_Num;
	}
	public void setClub_Num(int club_Num) {
		this.club_Num = club_Num;
	}
	
	
	@Override
	public String toString() {
		return "ClubSearchVO [user_id=" + user_id + ", club_Num=" + club_Num + "]";
	}
	
	
	
}
