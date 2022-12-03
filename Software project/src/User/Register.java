package User;

public class Register implements UserService{
	
	String userName, password, email;
	
	public Register(String userName, String password, String email){
		this.email = email;
		this.password = password;
		this.userName = userName;		
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
