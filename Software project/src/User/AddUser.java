package User;

import java.util.ArrayList;

public class AddUser implements IAdmin {
	
  
    public void addUser(IUser obj){
        Register reg = new Register(obj);
        reg.execute();

    }
    
   public void printUsers(){
	   for(int i=0;i< users.size();i++){
		   System.out.println(users.get(i));
	   }
   }
}
