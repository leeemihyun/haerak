package kr.co.haerak.vo.admin;

/**
 * °ü¸®ÀÚ VO
 * @author user
 */
public class AdminVO {

	private String Id,password;

	

	public AdminVO(String id, String password) {
		Id = id;
		this.password = password;
	}

	public AdminVO() {
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminVO [Id=" + Id + ", password=" + password + "]";
	}

	



	
	
}//class
