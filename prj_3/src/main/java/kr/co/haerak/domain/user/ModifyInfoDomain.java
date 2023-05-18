package kr.co.haerak.domain.user;

public class ModifyInfoDomain {
	private String email, email2, addr, detailAddr, tel, zipcode;
	private int actAreaNum;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getActAreaNum() {
		return actAreaNum;
	}
	public void setActAreaNum(int actAreaNum) {
		this.actAreaNum = actAreaNum;
	}
	
	public ModifyInfoDomain() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ModifyInfoDomain [email=" + email + ", email2=" + email2 + ", addr=" + addr + ", detailAddr="
				+ detailAddr + ", tel=" + tel + ", zipcode=" + zipcode + ", actAreaNum=" + actAreaNum + "]";
	}
	public ModifyInfoDomain(String email, String email2, String addr, String detailAddr, String tel, String zipcode,
			int actAreaNum) {
		super();
		this.email = email;
		this.email2 = email2;
		this.addr = addr;
		this.detailAddr = detailAddr;
		this.tel = tel;
		this.zipcode = zipcode;
		this.actAreaNum = actAreaNum;
	}
	
}
