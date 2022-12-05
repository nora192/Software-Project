package User;
import static Services.MainClass.AllServices;

import java.util.Scanner;

import Discounts.Discounts_Decorator;
import Discounts.overall;
import Discounts.specific;

public class DiscountHandler implements IAdmin{

	
	public Discounts_Decorator addDiscount(){
    	
		Scanner sc = new Scanner(System.in);
    	
    	Discounts_Decorator discount = null;
    	
    	System.out.print("enter discount percentage: ");
		
    	int discAmount = sc.nextInt();
		
		System.out.println("1-overall \n2-specific");
		int discChoice = sc.nextInt();
		
		if(discChoice == 1){
				discount = new overall(discount, discAmount);
				System.out.println("A discount of " + discAmount + " % is applied on all services \n");
			}
			
		else if(discChoice == 2){
				System.out.println("Please choose a service to apply the discount upon '\n");
				
				for (int i=0; i< AllServices.size(); i++){
					
					System.out.println(i +" "+ AllServices.get(i).getName());
				}
				
				int seviceChoice = sc.nextInt();
				
				discount = new specific(AllServices.get(seviceChoice), discAmount);
				
				System.out.println("A discount of " + discAmount + " is applied on " + AllServices.get(seviceChoice).getName() + "\n" );
			}
			else{
				System.out.println("wrong input");
			}
			
			return discount;
    	
    }




}
