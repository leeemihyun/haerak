package kr.co.haerak.domain.admin;

public class NewAndWithdrawallCntDomain {
	private int CREATE_DATE,DELETE_DATE;
	private String month;
	
	public NewAndWithdrawallCntDomain() {
		
	}
	
	public NewAndWithdrawallCntDomain(int cREATE_DATE, int dELETE_DATE, String month) {
		CREATE_DATE = cREATE_DATE;
		DELETE_DATE = dELETE_DATE;
		this.month = month;
	}

	public int getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(int cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public int getDELETE_DATE() {
		return DELETE_DATE;
	}
	public void setDELETE_DATE(int dELETE_DATE) {
		DELETE_DATE = dELETE_DATE;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "NewAndWithdrawallCntDomain [CREATE_DATE=" + CREATE_DATE + ", DELETE_DATE=" + DELETE_DATE + ", month="
				+ month + "]";
	}
	
	
}
