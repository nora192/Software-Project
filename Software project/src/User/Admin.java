package User;

import java.util.*;

public class Admin implements IAdmin{
    public ArrayList<IUser>users = new ArrayList<IUser>();


    public void addUser(IUser obj){
        Register reg = new Register(obj);
        reg.setUsers(users);
        reg.execute();
        /*if(check){
            System.out.println("User Added Successfully");
        }
        else{
            System.out.println("User Not Added, This Mail Belongs To Another Account");
        }*/

    }
    public void printUsers(){
        for(int i=0;i< users.size();i++){
            System.out.println(users.get(i));
        }
    }

}
