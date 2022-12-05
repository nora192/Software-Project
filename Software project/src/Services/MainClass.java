package Services;
import Discounts.Discounts_Decorator;
import Discounts.overall;
import Discounts.specific;
import Internet.InternetEtisalat;
import Mobile.MobileWE;
import Payment.*;
import User.AddWalletFunds;
import User.IUser;
import User.User;
import User.IUser;
import User.User;
import User.Register;
import User.IAdmin;
import User.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		IAdmin Admin1= new Admin();
		String data;
		int dataInt;
		System.out.println("Enter \n  -1 for Admin Mode \n -2 for User Mode ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{

		}
		if (choice == 2)
		{
		System.out.println("Welcome , Please Sign In to get to the System \n Enter Your Email : ");
		data = sc.nextLine();
		System.out.println("Enter your Password :");

//		Admin1.addUser();
		}
		ArrayList<Services> AllServices=new ArrayList<Services>();

		Services s = new MobileWE("mobile we", 500 );
		IFormHandler hn= new FormHandler(s);
		((MobileWE) s).setHandler(hn);

		Services s2 = new InternetEtisalat("Intrenet Etisalat" , 200);
		IUser user1 = new User("nada@gmail","l","gf");
		IcreditCard credit = new CreditCard(user1,"11",1000);
		IUser A = new User("nada", "l", "gf");
		IAdmin Admin = new Admin();
		Admin.addUser(user1);
		Admin.addUser(A);
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String mail = sc.nextLine();
		String pass = sc.nextLine();
		User user = new User(mail,pass,name);
		Admin.addUser(user);
		Admin.printUsers();

		((MobileWE) s).MyHandler.GetInformation(user1);
		((MobileWE) s).MyHandler.PrintForm();


//
//		((MobileWE) s).PrintForm();

		Payment p = new PayByCash("cairo");
		AllServices.add(s);
		AllServices.add(s2);

		//System.out.println("hello world maryam");

		UpdatedPayment payment = new PayByCard(credit);
		((MobileWE) s).setPayment(payment);

		Discounts_Decorator d  = new overall(s,50);
		//d= new overall(s2,50);
		ArrayList<Services> Discounts=new ArrayList<Services>();
		Discounts.add(s);
		Discounts.add(s2);

		//((MobileWE) s).pay();

		Discounts_Decorator d2  = new specific(d,50);

		double sum = d2.pay();
		payment.UpdateAmount(sum);
		System.out.println(credit.getAmount());


	}

}

