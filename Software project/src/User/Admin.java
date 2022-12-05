package User;

import java.sql.Ref;
import java.util.*;

public class Admin implements IAdmin{
    public static ArrayList<IUser>users = new ArrayList<IUser>();
    public static ArrayList<RefundsRequests>refundRequests = new ArrayList<RefundsRequests>();

    public void addUser(IUser obj){
        Register reg = new Register(obj);
        reg.execute();

    }
    public void checkRefunds(){
        if(!refundRequests.isEmpty()){
            boolean flag;
            int respond;
            System.out.println("Refund Request Info : "+refundRequests.get(0).user.username +" refund amount "+refundRequests.get(0).amount);
            System.out.println("click \n1-Accept \n2-Reject");
            Scanner sc = new Scanner(System.in);
            respond = sc.nextInt();
            flag= respond == 1;
            Refund ref = new Refund(0);
            ref.getRespond(flag);
            ref.execute();
        }
        else{
            System.out.println("All refud requests have been reviewd ");
        }


    }
    public void printUsers(){
        for(int i=0;i< users.size();i++){
            System.out.println(users.get(i));
        }
    }

}
