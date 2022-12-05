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
		
		System.out.println("1-overall \n 2-specific");
		int discChoice = sc.nextInt();
		
		if(discChoice == 1){
				discount = new overall(discount, discAmount);
				
			}
			
			else if(discChoice == 2){
				
				for (int i=0; i< AllServices.size(); i++){
					System.out.println(i+" "+ AllServices.get(i).getName());
				}
				int seviceChoice = sc.nextInt();
				
				discount = new specific(AllServices.get(seviceChoice), discAmount);
			}
			else{
				System.out.println("wrong input");
			}
			
			return discount;
    	
    }



}
