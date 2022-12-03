package User;

import java.util.ArrayList;

public class Register implements UserService{
	IUser user;
	ArrayList<IUser>users = new ArrayList<>();
	public Register(IUser user){
		this.user = user;

	}
	void setUsers(ArrayList<IUser>users){
		this.users = users;
	}
	public boolean execute() {
		IUser obj = new User(user.email,user.password, user.username);
		boolean flag= true;
		for(int i=0;i<users.size();i++){
			if(users.get(i).username == obj.username){
				flag = false;
			}
		}
		if(flag == false){
			return false;
		}
		else{
			users.add(obj);
			return true;
		}
	}
}
