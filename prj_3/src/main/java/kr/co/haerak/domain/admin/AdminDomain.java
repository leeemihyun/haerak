package kr.co.haerak.domain.admin;

/**
 * °ü¸®ÀÚ VO
 * @author user
 */
public class AdminDomain {

	private String Id,password;

	public AdminDomain() {
		
	}
	
	public AdminDomain(String id, String password) {
		Id = id;
		this.password = password;
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
		return "AdminDomain [Id=" + Id + ", password=" + password + "]";
	}

	
	



	
	
}//class
