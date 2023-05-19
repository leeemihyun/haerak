package kr.co.haerak.vo.main;

public class SeeMoreVO {
	
	public int actiAreaNum, categoryNum;
	
	public SeeMoreVO() {
	}

	public SeeMoreVO(int actiAreaNum, int categoryNum) {
		this.actiAreaNum = actiAreaNum;
		this.categoryNum = categoryNum;
	}

	
	
	@Override
	public String toString() {
		return "SeeMoreVO [actiAreaNum=" + actiAreaNum + ", categoryNum=" + categoryNum + "]";
	}
	
	
	
	

}
