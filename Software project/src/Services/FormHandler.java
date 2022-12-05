package Services;

import User.IUser;

import java.util.ArrayList;
import java.util.Scanner;

public class FormHandler implements IFormHandler {
    Services obj;
    String[] Titles = {"First name", "Last Name", " Mobile Number" , "Address"};

    public FormHandler(Services obj)
    {this.obj = obj; }

    public void FormUser(ArrayList<String> Form, IUser user)
    {
        obj.UsersList.add(user);
        obj.FormList.add(Form);
    }



    public void GetInformation(IUser user)
    {
        System.out.println(obj.description());
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> form= new ArrayList<String>();
        
        for(int i=0;i<4;i++) {
            String data;
            System.out.println("Enter your " + Titles[i] + " :");
            data = sc.nextLine();
            form.add(data);
        }
         FormUser(form , user);
        System.out.println("You subscribed in this Service!");
    }

}
