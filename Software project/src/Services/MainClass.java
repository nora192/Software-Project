package Services;
import Donations.CancerHospitals;
import Donations.NGOs;
import Donations.School;
import Internet.InternetEtisalat;
import Internet.InternetOrange;
import Internet.InternetVodafone;
import Internet.InternetWE;
import Landline.Monthly;
import Landline.Quarter;
import Mobile.*;
import Payment.*;
import User.AddUser;
import User.AddWalletFunds;
import User.IUser;
import User.User;
import User.SubscribeService;
import User.UserService;
import User.IAdmin;
import User.Admin;
import User.DiscountHandler;


import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static ArrayList<Services> AllServices = new ArrayList<Services>();

	public static void main(String[] args) {

		Services MobileWeService = new MobileWE();
		Services MobileOrangeService = new MobileOrange();
		Services MobileVodafoneService = new MobileVodafone();
		Services MobileEtisalatService = new MobileEtisalat();

		AllServices.add(MobileWeService);
		AllServices.add(MobileOrangeService);
		AllServices.add(MobileVodafoneService);
		AllServices.add(MobileEtisalatService);
		Services InternetWeService = new InternetWE();
		Services InternetOrangeService = new InternetOrange();
		Services InternetVodafoneService = new InternetVodafone();
		Services InternetEtisalatService = new InternetEtisalat();
		AllServices.add(InternetWeService);
		AllServices.add(InternetOrangeService);
		AllServices.add(InternetVodafoneService);
		AllServices.add(InternetEtisalatService);

		Services MonthlyLandLine =  new Monthly();
		Services QuarterLandLine = new Quarter();

		AllServices.add(MonthlyLandLine);
		AllServices.add(QuarterLandLine);

		Services SchoolDonations =  new School();
		Services CancerHospitals = new CancerHospitals();
		Services Ngo = new NGOs();

		AllServices.add(SchoolDonations);
		AllServices.add(CancerHospitals);
		AllServices.add(Ngo);




		IAdmin add= new AddUser();
//		IAdmin Admin1= new Admin();
//		IAdmin Admin1= new Admin();

		String Email;
		String PassWord;
		String UserName;
		System.out.println("Enter \n -1 for Admin Mode \n -2 for User Mode ");


		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("enter what you want to do:");
			System.out.println("1-add discount");
			int adminChoice = sc.nextInt();
			if(adminChoice == 1){
				DiscountHandler dh = new DiscountHandler();
				dh.addDiscount();
			}
		}
		if (choice == 2)
		{
			System.out.println("Welcome , Please Sign In to get to the System");
			System.out.println("Enter your Email :");
			Email = sc.next();
			System.out.println("Enter your Password :");
			PassWord = sc.next();
			System.out.println("Enter Your UserName :");
			UserName = sc.next();

			IUser user1 = new User(Email,PassWord,UserName);
			((AddUser) add).addUser(user1);

			int num=1;

			while (num != 0)
			{
				System.out.println("Welcome to the system! \n 1- Subscribe to Service ");
				num = sc.nextInt();
				if(num == 1)
				{
					UserService ThisUserService =new SubscribeService(user1);
					ThisUserService.execute();
				}



			}
		}
	}
}



