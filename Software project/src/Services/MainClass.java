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

public class MainClass {

	public static void main(String[] args) {

		ArrayList<Services> AllServices=new ArrayList<Services>();
		Services s = new MobileWE("mobile we", 500);
		Services s2 = new InternetEtisalat("Intrenet Etisalat" , 200);

		Payment p = new PayByCash("cairo");
		AllServices.add(s);
		AllServices.add(s2);

		//System.out.println("hello world maryam");
		IUser user1 = new User("nada","l","gf");
		IcreditCard credit = new CreditCard(user1,"11",1000);
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



		//Discounts_Decorator d2  = new specific(d,50);

		//d.setPayment(payment);

		//double sum = ((MobileWE) s).pay();
		//payment.UpdateAmount(sum);

		//System.out.println(sum);
		//System.out.println(credit.getAmount());
		
		//at first admin should apply discount either overall(applied to all services)
		//or specific(applied to a specific services)
		//if specific;
	//	Discounts_Decorator d = new specific("MobileWE", 50);
	//	IUser user1 = new User("nada","l","gf");
	//	Services ssr = new MobileWE("mobile we ", 350);
		//set service to a discount
		//d.setService(ssr);/*
		//IcreditCard c = new CreditCard(user1,"000",1000);
		//credit card amount before paying
		//System.out.println(c.getAmount());
		//now user user1 credit card has 1000
//		Payment p = new PayByCard(c);
		//set payment method to service(pay by card)
		//ssr.setPayment(p);
		//apply discount 
		//d.pay();
		//after discount.
		//System.out.println(c.getAmount());
		
		//Payment p = new PayByCash("cairo");
		

		/*System.out.println("hello world maryam");
		
		//IcreditCard c = new CreditCard("1","11",1000);
		//Payment p = new PayByCard(c);
		
		ssr.setPayment(p);
		
		Discounts_Decorator dd  = new overall(s,0.5);
		dd.setPayment(p);
		double su = dd.pay();
//		payment.updateCredit(sum);
		
		System.out.println(su);
		System.out.println(credit.getAmount());
		IUser user = new User("kholoud","ll","fgf");
		Admin admin= new Admin();
		admin.addUser(user);
		admin.addUser(user);
		admin.printUsers();
		
		IUser A = new User("aa@gmail", "0000", "aaa");
		//create a wallet for user A with amount 1000
		IWallet wallet = new Wallet(A,1000);
		A.setWallet(wallet);
		//increment wallet amount of user A by 50
		AddWalletFunds addfund = new AddWalletFunds(50,A);
		addfund.execute();
		
		System.out.println(A.getWallet().getAmount());*/

	}

}
