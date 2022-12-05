package User;

import java.security.Provider.Service;
import java.util.Scanner;

import Donations.CancerHospitals;
import Donations.NGOs;
import Donations.School;
import Landline.Monthly;
import Landline.Quarter;
import Mobile.Mobile;
import static Services.MainClass.AllServices;
import static Services.MainClass.chosenService;

import Mobile.MobileWE;
import Services.FormHandler;
import Services.IFormHandler;
import Mobile.MobileOrange;
import Mobile.MobileVodafone;
import Mobile.MobileEtisalat;
import Internet.InternetEtisalat;
import Internet.InternetWE;
import Internet.InternetOrange;
import Internet.InternetVodafone;
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
                System.out.println("Enter\n ( 0 ) for MobileWe Service \n ( 1 ) for Mobile Orange Service \n ( 2 ) for Mobile Vodafone Service \n ( 3 ) for Mobile Etisalat service :");
                num = sc.nextInt();
                IFormHandler hn= new FormHandler(AllServices.get(num));
                AllServices.get(num).setHandler(hn);
                
                if(num==0){
                	((MobileWE) AllServices.get(num)).MyHandler.GetInformation(this.user);
                	chosenService = (MobileWE) AllServices.get(num);
                	((MobileWE) chosenService).description();
                }        

                if(num==1){

                    ((MobileOrange) AllServices.get(num)).MyHandler.GetInformation(this.user); 
                    chosenService = (MobileOrange) AllServices.get(num);
                    ((MobileOrange) chosenService).description();
                }

                if(num==2){

                    ((MobileVodafone) AllServices.get(num)).MyHandler.GetInformation(this.user);  
                    chosenService = (MobileVodafone) AllServices.get(num);
                    ((MobileVodafone) chosenService).description();
                }

                if(num==3){
                    ((MobileEtisalat) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (MobileEtisalat) AllServices.get(num);
                    ((MobileEtisalat) chosenService).description();
                }
            }
            if(num == 2)
            {
                System.out.println("Enter\n ( 4 ) for Internet We Service \n ( 5 ) for Internet Orange Service \n ( 6 ) for Internet Vodafone Service \n ( 7 ) for Internet Etisalat service :");
                num = sc.nextInt();
                
                IFormHandler hn= new FormHandler(AllServices.get(num));
                AllServices.get(num).setHandler(hn);
                
                if(num==4){
                    ((InternetWE) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (InternetWE) AllServices.get(num);
                    ((InternetWE) chosenService).description();
                }
 

                if(num==5){
                    ((InternetOrange) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (InternetOrange) AllServices.get(num);
                    ((InternetOrange) chosenService).description();
                }
                   
                if(num==6){
                    ((InternetVodafone) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (InternetVodafone) AllServices.get(num);
                    ((InternetVodafone) chosenService).description();
                 }
                
                if(num==7){
                    ((InternetEtisalat) AllServices.get(num)).MyHandler.GetInformation(this.user);

                    chosenService = (InternetEtisalat) AllServices.get(num);
                    ((InternetEtisalat) chosenService).description();
                 }
                  
            }
            
            if(num == 3)
            {    
            	System.out.println("Enter\n ( 8 ) for Monthly Service \n ( 9 ) for Quarter Service :");
                num = sc.nextInt();
                
                IFormHandler hn= new FormHandler(AllServices.get(num));
                AllServices.get(num).setHandler(hn);
                
                if(num==8){
                    ((Monthly) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (Monthly) AllServices.get(num);
                    ((Monthly) chosenService).description();
                 }
                
                    
                if(num==9){
                    ((Quarter) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (Quarter) AllServices.get(num);
                    ((Quarter) chosenService).description();
                }
                    

            }
            if(num == 4)
            {
                System.out.println("Enter\n ( 10 ) for School Donations \n ( 11 ) for Cancer Hospitals Donations \n ( 12 ) for NGOs Donations :");
                num = sc.nextInt();
                
                IFormHandler hn= new FormHandler(AllServices.get(num));
                AllServices.get(num).setHandler(hn);
                
                if(num==10){
                    ((School) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (School) AllServices.get(num);
                    ((School) chosenService).description();
                }

                   
                if(num==11){
                    ((CancerHospitals) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (CancerHospitals) AllServices.get(num);
                    ((CancerHospitals) chosenService).description();
                }
                   
                if(num==12)
                {
                    ((NGOs) AllServices.get(num)).MyHandler.GetInformation(this.user);
                    chosenService = (NGOs) AllServices.get(num);
                    ((NGOs) chosenService).description();

                }
              }


              
              
              



    }
    
}
