package kr.co.haerak.vo.user;

public class ModifyInfoVO {
	private String eMail, addr, detailAddr, tel, zipcode, userId;
	private int actAreaNum;
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
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

	
	@Override
	public String toString() {
		return "ModifyInfoVO [eMail=" + eMail + ", addr=" + addr + ", detailAddr=" + detailAddr + ", tel=" + tel
				+ ", zipcode=" + zipcode + ", userId=" + userId + ", actAreaNum=" + actAreaNum + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ModifyInfoVO(String eMail, String addr, String detailAddr, String tel, String zipcode, String userId,
			int actAreaNum) {
		super();
		this.eMail = eMail;
		this.addr = addr;
		this.detailAddr = detailAddr;
		this.tel = tel;
		this.zipcode = zipcode;
		this.userId = userId;
		this.actAreaNum = actAreaNum;
	}
	public ModifyInfoVO() {
		// TODO Auto-generated constructor stub
	}
	

}
