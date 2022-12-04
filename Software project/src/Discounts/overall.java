package Discounts;

import Payment.Payment;
import Services.Services;

public class overall implements Discounts_Decorator {
	
	Services s;
	Payment p;
	double dis = 0;
	
	public overall(double dis)
	{
		this.dis = dis;
		//this.DiscountAmount = DiscountAmount;
	}
	public void setService(Services s)
	{
		this.s = s;
		//this.DiscountAmount = DiscountAmount;
	}
	/*public double pay() {
		// TODO Auto-generated method stub
		return 0;
	}*/

	public void pay() {
		double price1 = s.getPrice();
		double afterDis = price1 * (dis / 100);
		s.setPrice(afterDis);
		s.pay();
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}
	public void setPayment(Payment p) {
		// TODO Auto-generated method stub
		
	}
	public String getServiceName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*public Services obj = null;
	public double DiscountAmount = 0;
	Payment p = null;

	public overall(Services c, double DiscountAmount)
	{
		this.obj = c;
		this.DiscountAmount = DiscountAmount;
	}
	
	public double pay() {
		return obj.pay() * DiscountAmount;
	}

	public void setPayment(Payment p) {
		this.p = p;	
	}
	*/


}
