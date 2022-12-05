package User;

import java.util.ArrayList;

import static User.RefundHandling.users;

public class Register implements UserService{
	IUser user;
	
	public Register(IUser user){
		this.user = user;

	}
	
	public void execute() {
		IUser obj = new User(user.email,user.password, user.username);
		boolean flag= true;
		
		for(int i=0;i<users.size();i++){
			if(users.get(i).email.equals(obj.email)  ){
				flag = false;
				break;
			}
		}
		
		if(flag == false){
			System.out.println("User Not Added, This Mail Belongs To Another Account");
		}
		
		else{
			users.add(obj);
			System.out.println("User Added Successfully");
		}
	}
}
