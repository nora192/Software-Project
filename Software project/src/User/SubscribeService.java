package User;

import java.util.Scanner;

import static Services.MainClass.AllServices;

import Services.FormHandler;
import Services.IFormHandler;
import User.IUser;

public class SubscribeService implements UserService{
    IUser user;
    public SubscribeService(IUser user)
    {
        this.user= user;
    }


    public void execute() {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter\n ( 1 ) for Mobile Services \n ( 2 ) for Internet Services \n ( 3 ) for LandLine Services \n ( 4 ) for Donations :");
            num=sc.nextInt();
            if(num == 1)
            {
                System.out.println("Enter\n ( 0 ) for Mobile We Service \n ( 1 ) for Mobile Orange Service \n ( 2 ) for Mobile Vodafone Service \n ( 3 ) for Mobile Etisalat service :");
                num = sc.nextInt();
                    IFormHandler hn= new FormHandler(AllServices.get(num));
                    AllServices.get(num).setHandler(hn);
                    AllServices.get(num).MyHandler.GetInformation(this.user);
                    AllServices.get(num).MyHandler.PrintForm();

            }
            if(num == 2)
            {
                System.out.println("Enter\n ( 4 ) for Internet We Service \n ( 5 ) for Internet Orange Service \n ( 6 ) for Internet Vodafone Service \n ( 7 ) for Internet Etisalat service :");
                num = sc.nextInt();
                AllServices.get(num).MyHandler.GetInformation(this.user);
                AllServices.get(num).MyHandler.PrintForm();

            }
            if(num == 3)
            {     System.out.println("Enter\n ( 8 ) for Monthly Service \n ( 9 ) for Quarter Service :");
                num = sc.nextInt();
                AllServices.get(num).MyHandler.GetInformation(this.user);
                AllServices.get(num).MyHandler.PrintForm();

            }
            if(num == 4)
            {
                System.out.println("Enter\n ( 10 ) for School Donations \n ( 11 ) for Cancer Hospitals Donations \n ( 12 ) for NGOs Donations :");
                num = sc.nextInt();
                AllServices.get(num).MyHandler.GetInformation(this.user);
                AllServices.get(num).MyHandler.PrintForm();

            }




    }
}
