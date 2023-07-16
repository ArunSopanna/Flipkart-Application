package flipkart;
import java.util.*;
public class Account extends Registration {
	public static void account()
	{
		Account a5=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Account settings");
		System.out.println("Hi "+a5.getUser_name());
		System.out.println("flipkart_Plus,edit_Profile,saved_Addresses,language");
		String str5=sc.next();
		String flipkart_Plus="Flipkart_Plus";
		String edit_Profile="Edit_Profile";
		String saved_Addresses="Saved_Addresses";
		String language="Language";
		switch(str5) {
		case "flipkart_Plus" :
			System.out.println("Earn 200 SuperCoins to join plus!");
			break;
		case "edit_Profile" :
			System.out.println("edit your profile");
			System.out.println("You are first name: "+a5.getUser_name());
			System.out.println("You are phno is: "+a5.getPhno());
			System.out.println("If you want to change you are name you can change in below ");
			System.out.println("edit your first name");
			String firstname3=sc.next();
			a5.setFirstname(firstname3);
			System.out.println(firstname3);
			System.out.println("Edit mobile number");
			long phno3=sc.nextLong();
			a5.setPhno(phno3);
			System.out.println(phno3);
			System.out.println("Change password");
			int pw1=sc.nextInt();
			a5.setPassword(pw1);
			System.out.println(pw1);
			break;
		case "saved_Addresses":
			System.out.println("Yor addresses will show ");
			break;
		case "language":
		{
			System.out.println("choose the launguage");
			System.out.println("kannda,telugu,english,hindi,tamil");
			String str7=sc.next();
			String kannada="KANNADA";
			String hindi="HINDI";
			String english="ENGLISH";
			String telugu="TELUGU";
			String tamil="TAMIL";
			switch(str7)
			{
			case "kannada" :
				System.out.println("your language is :" +kannada);
				break;
			case "telugu" :
				System.out.println("your language is :" +telugu);
				break;
			case "english" :
				System.out.println("your language is :" +english);
				break;
			case "hindi" :
				System.out.println("your language is :" +hindi);
				break;
			case "tamil" :
				System.out.println("your language is :" +tamil);
				break;
			}
		}
		}
	}//Account ends
}
