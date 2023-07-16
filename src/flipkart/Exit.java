package flipkart;

import java.util.Scanner;

public class Exit extends Home_Page{
	public static void exit()
	{
    System.out.println("=========================================");
	System.out.println("Thank you");
	}
	public static void relogin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("If u want to login ");
		System.out.println("Enter Yes(1) And No(2)");
		int num=sc.nextInt();
		if(num==1)
		{
			Flipkart_Main_method a=new Flipkart_Main_method();
			a.m1();
		}
		else
		{
			System.out.println("====================================");
			System.out.println("Thank you");
		}
	}
}
