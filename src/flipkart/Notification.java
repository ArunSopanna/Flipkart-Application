package flipkart;
import java.util.Scanner;
public class Notification extends Home_Page {
	public static void notification()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Notification page will be disiplay");
		System.out.println("Select below one");
		System.out.println("all,offers,remainder");
	  String str3=sc.next();
		String all="All";
		String offers="Offers";
		String remainder="Remainder";
		switch(str3)
		{
		case "all":
			System.out.println("Share your feedback");
			System.out.println("Give the ratings");
			int num2=sc.nextInt();
			if(num2<=3)
			{
			System.out.println("What can we improve in our product selction");
			System.out.println("variety,pricing,delivery time,search,others");
		    String str4=sc.next();
		    String variety="Variety";
		    String pricing="Pricing";
		    String delivery="Deliverytime";
		    String search="Search";
		    String others="Others";
		    switch(str4) {
		    case "varety":
		    case "pricing":
		    case "delivering":
		    case "search":
		    case "others":
		    	System.out.println("Thanks for giving feedback");
		    }
			}
			else
			{
				System.out.println("Thanks for giving feedback");
			}
			break;
		}
			switch(str3) {
		    case "offers" :
		    System.out.println("Handpicked for you");
		    System.out.println("claimed your reward?");
		    
		    break;
			}
			switch(str3)
			{
		case "remainder":
			System.out.println("your application timed out");
			System.out.println("your just one step away to get an axis banck credit card");
		}   
	}//notification switch end
	}
