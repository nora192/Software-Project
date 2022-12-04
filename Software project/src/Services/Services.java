package Services;

import Payment.Payment;

public interface Services {

//	public String name ="        ";
	public double price = 0;
	public Payment payment = null;
	public double DiscountPrice=1.0;

	public void setDiscountPrice(double DiscountPrice);

	public double getDiscountPrice();
//	public void setPayment (Payment p);
//	public double getPrice();
//	public void setPrice(double price);
//	public String getServiceName();



}