package User;

import java.util.ArrayList;

public interface IAdmin {
	
	public static ArrayList<IUser>users = new ArrayList<IUser>();
	public static ArrayList<RefundsRequests> refundRequests = new ArrayList<RefundsRequests>();
  
    public void printUsers();
}
