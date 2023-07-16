package flipkart;
import java.util.Scanner;
public class Flipkart_Main_method {
	public static void main(String[] args) {
		Login b1=new Login();
		b1.login();
		m1();
		
	}
		
		public static void m1()
		{
	    Scanner sc=new Scanner(System.in);
		Home_Page b2=new Home_Page();
		b2.home_Page();
		char ch=sc.next().charAt(0);
		if(ch=='a')
		{
		Home b3=new Home();
		b3.home();
		}
		else if(ch=='b')
		{
		Categories b4=new Categories();
        b4.categories();
		}
		else if(ch=='c')
		{
			Notification b5=new Notification();
			b5.notification();
		}
		else if(ch=='d')
		{
			Account b6=new Account();
			b6.account();
		}
		else if(ch=='e')
		{
			Cart b7=new Cart();
			b7.cart1();
		}
		else if(ch=='f')
		{
			Exit b8=new Exit();
			b8.exit();
			b8.relogin();
		}
	}
}
