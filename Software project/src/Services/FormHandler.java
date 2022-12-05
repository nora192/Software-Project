package Services;

import User.IUser;

import java.util.ArrayList;
import java.util.Scanner;

public class FormHandler implements IFormHandler {
    Services obj;
    String[] Titles = {"First name", "Last Name", " Mobile Number" , "Address"};

    FormHandler(Services obj)
    {this.obj = obj; }

    public void FormUser(ArrayList<String> Form, IUser user)
    {
        obj.UsersList.add(user);
        obj.FormList.add(Form);
    }
    public void PrintForm()
    {
        for(int i = 0; i< obj.UsersList.size(); i++)
        { System.out.println(obj.UsersList.get(i).email+" "+obj.UsersList.get(i).creditCard);

            for(int j=0;i<obj.FormList.size();i++)
            {
                for(int k=0;k<4;k++) {
                    System.out.println(obj.FormList.get(i).get(k)+" ");
                }
            }
        }
    }

    public void GetInformation(IUser user)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> form= new ArrayList<String>();
        for(int i=0;i<4;i++) {
            String data;
            System.out.println("Enter your " + Titles[i] + " :");
            data = sc.nextLine();
            form.add(data);
        }
         FormUser(form , user);
    }

}
