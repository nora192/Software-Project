package Services;
import Discounts.Discounts_Decorator;
import Discounts.overall;
import Mobile.MobileWE;
import Payment.PayByCash;
import Payment.Payment;

import Payment.*;


public class MainClass {

	public static void main(String[] args) {

		Services s = new MobileWE("cairo", 500);
		//Payment p = new PayByCash("cairo");


		System.out.println("hello world maryam");

		IcreditCard credit = new CreditCard("1","11",1000);
		PayByCard payment = new PayByCard(credit);

		s.setPayment(payment);

		Discounts_Decorator d  = new overall(s,0.5);
		double sum = d.pay();

		System.out.println(sum);
		System.out.println(credit.getAmount());


	}

}