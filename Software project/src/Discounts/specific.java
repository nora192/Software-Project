package Discounts;

import Payment.Payment;
import Services.Services;

public class specific implements Discounts_Decorator {
	
	String sName;
	Payment payment;
	double dis = 0;
	Services service;
	
	public specific(String sName ,double dis)
	{
		this.dis = dis;
		this.sName = sName; 
	}
	public void setDisc(double dis){
		this.dis = dis;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}

	public void pay() {
		if(service.getServiceName() == sName){
			this.setDisc(dis);
		}
		else{
			this.setDisc(100.0);
		}
		double price1 = service.getPrice();
		double afterDis = price1 * (dis / 100);
		service.setPrice(afterDis);
		service.pay();
	
	}

	public void setService(Services service) {
		this.service = service;
		// TODO Auto-generated method stub
		
	}

	public void setPayment(Payment p) {
		// TODO Auto-generated method stub
		
	}
	public String getServiceName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
