package kr.co.haerak.domain.admin;

public class TradingStatusDomain {

	private String trunc;
	private int count;
	
	public TradingStatusDomain() {
	
	}

	public TradingStatusDomain(String trunc, int count) {
		this.trunc = trunc;
		this.count = count;
	}
	
	public String getTrunc() {
		return trunc;
	}
	public void setTrunc(String trunc) {
		this.trunc = trunc;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "TradingStatusDomain [trunc=" + trunc + ", count=" + count + "]";
	}
	
	
}
