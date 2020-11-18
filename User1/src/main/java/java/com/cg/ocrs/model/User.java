package java.com.cg.ocrs.model;

public class User {
	private String Username;
	private String Password;
	private int Rolecode;
	public User(){
		
	}
	public User(String username, String password, int rolecode) {
		super();
		Username = username;
		Password = password;
		Rolecode = rolecode;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getRolecode() {
		return Rolecode;
	}
	public void setRolecode(int rolecode) {
		Rolecode = rolecode;
	}
	@Override
	public String toString() {
		return "user [Username=" + Username + ", Password=" + Password + ", Rolecode=" + Rolecode + "]";
	}
	
	
	
	
	

}
