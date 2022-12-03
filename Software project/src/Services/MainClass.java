package Services;

import Payment.*;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("hello world maryam");
		IcreditCard credit = new CreditCard("1","11",1000);
		PayByCard payment = new PayByCard(credit);
		payment.pay(300);
		System.out.println(credit.getAmount());

	}

}
