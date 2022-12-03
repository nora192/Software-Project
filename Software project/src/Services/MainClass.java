package Services;

import Discounts.Discounts_Decorator;
import Discounts.overall;
import Mobile.MobileWE;
import Payment.PayByCash;
import Payment.Payment;

public class MainClass {

	public static void main(String[] args) {
		Services s = new MobileWE("cairo", 20.0);
		Payment p = new PayByCash("cairo");
		
		s.setPayment(p);
		
		
		double sum2 = s.pay();
		
		Discounts_Decorator d  = new overall(s,0.5);
		double sum = d.pay();
		
		System.out.println(sum2);
		System.out.println(sum);

	}

}
