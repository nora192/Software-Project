package Services;
import Mobile.*;
import Payment.*;
import User.AddUser;
import User.AddWalletFunds;
import User.IUser;
import User.User;
import User.SubscribeService;
import User.UserService;
import User.IAdmin;
import User.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static ArrayList<Services> AllServices = new ArrayList<Services>();

	public static void main(String[] args) {
		Services MobileWeService = new MobileWE();
		Services MobileOrangeService = new MobileOrange();
		Services MobileVodafoneService = new MobileVodafone();
		Services MobileEtisalatService = new MobileEtisalat();
		AllServices.add(MobileWeService);
		AllServices.add(MobileOrangeService);
		AllServices.add(MobileVodafoneService);
		AllServices.add(MobileEtisalatService);

		IAdmin adduser= new AddUser();
		String Email;
		String PassWord;
		String UserName;
		
		System.out.println("Enter \n -1 for Admin Mode \n -2 for User Mode ");


		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{

		}
		if (choice == 2)
		{
			System.out.println("Welcome , Please Sign In to get to the System");
			System.out.println("Enter your Email :");
			Email = sc.next();
			System.out.println("Enter your Password :");
			PassWord = sc.next();
			System.out.println("Enter Your UserName :");
			UserName = sc.next();
			
			IUser user = new User(Email,PassWord,UserName);
			
			((AddUser) adduser).addUser(user);
			
			int num=1;
			
			while (num != 0)
			{
				System.out.println("Welcome to the system! \n 1- Subscribe to Service ");
				num = sc.nextInt();
				if(num == 1)
				{
					UserService ThisUserService =new SubscribeService(user);
					ThisUserService.execute();


		}
//		ArrayList<Services> AllServices=new ArrayList<Services>();
//
//		Services s = new MobileWE("mobile we", 500 );
//		IFormHandler hn= new FormHandler(s);
//		((MobileWE) s).setHandler(hn);
//
//		((MobileWE) s).MyHandler.GetInformation(user1);
//		((MobileWE) s).MyHandler.PrintForm();


////		IcreditCard credit = new CreditCard(user1,"11",1000);
////
////
//		((MobileWE) s).PrintForm();

//		Payment p = new PayByCash("cairo");
//		AllServices.add(s);
//		AllServices.add(s2);

		//System.out.println("hello world maryam");

//		UpdatedPayment payment = new PayByCard(credit);
//		((MobileWE) s).setPayment(payment);
//
//		Discounts_Decorator d  = new overall(s,50);
//		//d= new overall(s2,50);
//		ArrayList<Services> Discounts=new ArrayList<Services>();
//		Discounts.add(s);
//		Discounts.add(s2);
//
//		//((MobileWE) s).pay();
//
//		Discounts_Decorator d2  = new specific(d,50);
//
//		double sum = d2.pay();
//		payment.UpdateAmount(sum);
//
//		System.out.println(credit.getAmount());


	}}}}



