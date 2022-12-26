package Services;
import Donations.CancerHospitals;
import Donations.NGOs;
import Donations.School;
import Internet.InternetEtisalat;
import Internet.InternetOrange;
import Internet.InternetVodafone;
import Internet.InternetWE;
import Landline.Monthly;
import Landline.Quarter;
import Mobile.*;
import Payment.*;
import User.AddUser;
import User.AddWalletFunds;
import User.IUser;
import User.RefundHandling;
import User.RefundInvoker;
import User.Search;
import User.User;
import User.SubscribeService;
import User.UserService;
import User.IAdmin;
import User.IRefundInvoker;
import User.IRefundsRequests;
import User.DiscountHandler;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Scanner;

import Discounts.Discounts_Decorator;
import Discounts.overall;

public class MainClass {
	
		public static ArrayList<Services> AllServices = new ArrayList<Services>();
	
		public static Object chosenService = null;
		
		public static void main(String[] args) {
		

		Services MobileWeService = new MobileWE();
		Services MobileOrangeService = new MobileOrange();
		Services MobileVodafoneService = new MobileVodafone();
		Services MobileEtisalatService = new MobileEtisalat();
		
		AllServices.add(MobileWeService);
		AllServices.add(MobileOrangeService);
		AllServices.add(MobileVodafoneService);
		AllServices.add(MobileEtisalatService);
		
		Services InternetWeService = new InternetWE();
		Services InternetOrangeService = new InternetOrange();
		Services InternetVodafoneService = new InternetVodafone();
		Services InternetEtisalatService = new InternetEtisalat();
		
		AllServices.add(InternetWeService);
		AllServices.add(InternetOrangeService);
		AllServices.add(InternetVodafoneService);
		AllServices.add(InternetEtisalatService);
		
		Services MonthlyLandLine =  new Monthly();
		Services QuarterLandLine = new Quarter();
		
		AllServices.add(MonthlyLandLine);
		AllServices.add(QuarterLandLine);
		
		Services SchoolDonations =  new School();
		Services CancerHospitals = new CancerHospitals();
		Services Ngo = new NGOs();
		
		AllServices.add(SchoolDonations);
		AllServices.add(CancerHospitals);
		AllServices.add(Ngo);


		IAdmin add = new AddUser();
		IAdmin handleRefunds = new RefundHandling();
		IAdmin handleDiscounts = new DiscountHandler();
		
		
		String Email;
		String PassWord;
		String UserName;


		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("0- Exit system \n 1- Admin Mode \n 2- for User Mode \n");
			
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Enter what you want to do: ");
				System.out.println("1-add discount");
				System.out.println("2-Check refunds");
				
				int adminChoice = sc.nextInt();
				
				if(adminChoice == 1){
					DiscountHandler dh = new DiscountHandler();
					dh.addDiscount();
				}
				
				else if (adminChoice == 2) {
					((RefundHandling) handleRefunds).checkRefunds();
				}
				
			}
			
			else if (choice == 2)
			{
				System.out.println("Welcome , Please Sign in to the System\n");
				
				System.out.println("Enter your Email :");
				Email = sc.next();
				
				System.out.println("Enter your Password :");
				PassWord = sc.next();
				
				System.out.println("Enter Your UserName :");
				UserName = sc.next();
				
				IUser user1 = new User(Email,PassWord,UserName);
				((AddUser) add).addUser(user1);
				
				int num = 1;
				
				while (num != 0)
				{
					System.out.println("1- Subscribe to Service \n 2- Pay \n 3- Request a refund \n 4- Register to the system as a new user \n 5- Search for the available Services \n");
					num = sc.nextInt();
					
					if(num == 1)
					{
						UserService ThisUserService =new SubscribeService(user1);
						ThisUserService.execute();
					}
					
					else if (num == 2) {
						
						
						System.out.println("1.Credit Card \n 2.Wallet \n 3.Cash \n");
						int n = 1;
						n = sc.nextInt();
						
						if (n == 1) {
							
							IcreditCard card = new CreditCard(user1, "123", 1000);
							user1.creditCard = card;
							Payment payment = new PayByCard(card);
							
							((Services) chosenService).setPayment(payment);
							
							Discounts_Decorator discount = new overall((Services)(chosenService), 50);
							
							discount.pay();
							
							((PayByCard) payment).UpdateAmount(((Services) chosenService).price);
							
						}
						
						else if (n == 2) {
							
							IWallet wallet = new Wallet(user1, 1000);
							Payment payment = new PayByWallet(wallet);
							
							user1.wallet = wallet;
							
							((Services) chosenService).setPayment(payment);
							((Services) chosenService).pay();
							
							((PayByWallet) payment).UpdateAmount(((Services) chosenService).price);
							
						}
						
						else if (n == 3) {
							
							Payment payment = new PayByCash("cash");
							
							((Services) chosenService).setPayment(payment);
							((Services) chosenService).pay();
							
						}
						
					}
					else if (num == 3) {
						
						if (chosenService == null) {
							System.out.println("Please subscribe to a service first and make a purchase \n");
							System.out.println("Please subscribe to a service first and make a purchase \n");
							continue;
						}
						
						double amnt;
						
						System.out.println("\n please enter the amount to be refunded \n");
						amnt = sc.nextDouble();
						
						IRefundInvoker invoker = new RefundInvoker();
						invoker.addRequestToList(user1, (Services) chosenService, amnt);
						
						System.out.println("\n ---- Background admin mode ----  \n");
						
						processingRequest(handleRefunds);
						
						user1.checkRefund();
						
					}
					else if (num == 4) {
						System.out.println("Enter your Email :");
						Email = sc.next();
						
						System.out.println("Enter your Password :");
						PassWord = sc.next();
						
						System.out.println("Enter Your UserName :");
						UserName = sc.next();
						
						user1 = new User(Email,PassWord,UserName);
						((AddUser) add).addUser(user1);
						
					}
					else if (num == 5) {
						UserService search = new Search();
						search.execute();
					}

				}
			}
			
			else if (choice == 0) {
				System.out.println("GoodBye! \n");
				break;
			}
		}
	}
		
		
	public static void processingRequest(IAdmin handleRefunds) {
		 ((RefundHandling) handleRefunds).checkRefunds();
	}
}



