package kr.co.haerak.vo.main;

public class SeeMoreVO {
	
	private int actiAreaNum, categoryNum;
	private String searchText;
	
	public SeeMoreVO() {
	}

	public int getActiAreaNum() {
		return actiAreaNum;
	}

	public void setActiAreaNum(int actiAreaNum) {
		this.actiAreaNum = actiAreaNum;
	}

	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	@Override
	public String toString() {
		return "SeeMoreVO [actiAreaNum=" + actiAreaNum + ", categoryNum=" + categoryNum + ", searchText=" + searchText
				+ "]";
	}

	
	


	
	

}
