package Services;

import Payment.Payment;
import User.IUser;

import java.util.ArrayList;

public interface Services {

	public Payment payment = null;
	public double pay();
	ArrayList<IUser> UsersList = new ArrayList< IUser>();
	ArrayList<ArrayList<String>> FormList = new ArrayList <ArrayList<String>>();
	IFormHandler MyHandler =null;
	public String getName();
	public String description();

	void setHandler(IFormHandler hn);
}