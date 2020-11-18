package cg.ocrs.model;

public class user {
private String Username;
private String Password;
private int Roleback;
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
public int getRoleback() {
	return Roleback;
}
public void setRoleback(int roleback) {
	Roleback = roleback;
}
@Override
public String toString() {
	return "user [Username=" + Username + ", Password=" + Password + ", Roleback=" + Roleback + "]";
}

}
