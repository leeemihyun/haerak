package kr.co.haerak.domain.admin;

public class ClubStatusCntDomain {

	private String AREA_NAME;
	private int count;
	
	public ClubStatusCntDomain() {
		
	}
	
	public ClubStatusCntDomain(String aREA_NAME, int count) {
		AREA_NAME = aREA_NAME;
		this.count = count;
	}

	public String getAREA_NAME() {
		return AREA_NAME;
	}
	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ClubStatusCntDomain [AREA_NAME=" + AREA_NAME + ", count=" + count + "]";
	}
	

	
}
