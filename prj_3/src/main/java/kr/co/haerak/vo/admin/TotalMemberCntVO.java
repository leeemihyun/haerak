package kr.co.haerak.vo.admin;

/**
 * ÃÑ È¸¿ø ¼ö Domain
 * @author user
 */
public class TotalMemberCntVO {

	private String Month;
	private int userCount;
	
	public TotalMemberCntVO() {
		
	}
	
	
	public TotalMemberCntVO(String month, int userCount) {
		Month = month;
		this.userCount = userCount;
	}


	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	@Override
	public String toString() {
		return "TotalMemberCntDomain [Month=" + Month + ", userCount=" + userCount + "]";
	}

	
	
}//class
