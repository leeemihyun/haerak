package kr.co.haerak.vo.admin;

/**
 * °¡ÀÔÅ»ÅðÄ«¿îÆ® VO
 * @author user
 */
public class MemberCntVO {

	private int newMember,wthdrMember;
	private String month;
	
	public int getNewMember() {
		return newMember;
	}
	public void setNewMember(int newMember) {
		this.newMember = newMember;
	}
	public int getWthdrMember() {
		return wthdrMember;
	}
	public void setWthdrMember(int wthdrMember) {
		this.wthdrMember = wthdrMember;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	@Override
	public String toString() {
		return "MemberCntVO [newMember=" + newMember + ", wthdrMember=" + wthdrMember + ", month=" + month + "]";
	}
	
}
