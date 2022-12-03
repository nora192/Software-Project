package Services;
import Discounts.Discounts_Decorator;
import Discounts.overall;
import Mobile.MobileWE;
import Payment.PayByCash;
import Payment.Payment;

import Payment.*;
import User.IUser;
import User.User;
import User.Register;
import User.IAdmin;
import User.Admin;
public class MainClass {

	public static void main(String[] args) {

		Services s = new MobileWE("cairo", 500);
		//Payment p = new PayByCash("cairo");
		

		System.out.println("hello world maryam");
		
		IcreditCard credit = new CreditCard("1","11",1000);
		Payment payment = new PayByCard(credit);
		
		s.setPayment(payment);
		
		Discounts_Decorator d  = new overall(s,0.5);
		d.setPayment(payment);
		double sum = d.pay();
//		payment.updateCredit(sum);
		
		System.out.println(sum);
		System.out.println(credit.getAmount());
		IUser user = new User("kholoud","ll","fgf");
		Admin admin= new Admin();
		admin.addUser(user);
		admin.addUser(user);
		admin.printUsers();
	}

}
