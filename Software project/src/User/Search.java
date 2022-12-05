package User;

import java.util.Scanner;

public class Search implements UserService{

    @Override
    public void execute() {
        System.out.println("welcome to the system \n choose the service you want from the list" +
                "1-Mobile service" +
                "2-Internet service" +
                "3-Donations serivce" +
                "4-Landline service"
                );
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("choose the number of the service you want " +
                    "1-Etisalat" +
                    "2-Orange" +
                    "3-Vodafone" +
                    "4-WE");
        }
        else if(choice == 2){
            System.out.println("choose the number of the service you want " +
                    "1-Etisalat" +
                    "2-Orange" +
                    "3-Vodafone" +
                    "4-WE");

        }
        else if(choice == 3){
            System.out.println("choose the number of the service you want " +
                    "1-Cancer Hospitals" +
                    "2-NGOS" +
                    "3-School");

        }
        else if(choice == 4){
            System.out.println("choose the number of the service you want " +
                    "1-Monthly" +
                    "2-Quarter"
                    );
        }
        else{
            System.out.println("Please enter valid choice");
        }
    }
}
