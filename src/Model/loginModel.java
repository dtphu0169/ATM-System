package Model;

public class loginModel {
	private String user;
	private String pw;
	public loginModel(String user, String pw) {
		this.user = user;
		this.pw = pw;
	}
	public String getUser() {
		return user;
	}
	public String getPw() {
		return pw;
	}
	
}
