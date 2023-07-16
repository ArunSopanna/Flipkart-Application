package flipkart;
import java.util.Scanner;
public class Home_Page extends Login {
	public static void home_Page()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Click below one");
		System.out.println("a.home,b.categories,c.notification,d.account,e.cart,f.exit");
		//char ch=sc.next().charAt(0);
		String a="home";
		String b="categories";
		String c="Notification";
		String d="Account";
		String e="cart";
		String f="Exit";
	}
}
