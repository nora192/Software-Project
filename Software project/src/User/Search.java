package User;

import java.util.Scanner;

public class Search implements UserService{

    
    public void execute() {
        
    	System.out.println("welcome to the system \n choose the service you want from the list\n" +
                "1-Mobile service\n" +
                "2-Internet service\n" +
                "3-Donations serivce\n" +
                "4-Landline service\n"
                );
        
    	Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if(choice == 1){
            System.out.println("choose the number of the service you want\n" +
                    "1-Etisalat\n" +
                    "2-Orange\n" +
                    "3-Vodafone\n" +
                    "4-WE\n");
        }
        
        else if(choice == 2){
            System.out.println("choose the number of the service you want\n" +
                    "1-Etisalat\n" +
                    "2-Orange\n" +
                    "3-Vodafone\n" +
                    "4-WE\n");

        }
        
        else if(choice == 3){
            System.out.println("choose the number of the service you want\n" +
                    "1-Cancer Hospitals\n" +
                    "2-NGOS\n" +
                    "3-School\n");

        }
        
        else if(choice == 4){
            System.out.println("choose the number of the service you want\n" +
                    "1-Monthly\n" +
                    "2-Quarter\n"
                    );
        }
        
        else{
            System.out.println("Please enter valid choice");
        }
    }
}
