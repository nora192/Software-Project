package Services;

import Payment.Payment;
import User.IUser;

import java.util.ArrayList;

public interface Services {

//	public String name ="        ";
	public double price = 0;
	public Payment payment = null;
	public double pay();
	ArrayList<IUser> UsersList = new ArrayList< IUser>();
	ArrayList<ArrayList<String>> FormList = new ArrayList <ArrayList<String>>();
	FormHandler MyHandler = null;


}