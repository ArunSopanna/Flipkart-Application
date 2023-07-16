package flipkart;
import java.util.*;
public class Cart extends Home_Page{
	public static void cart()
	{
		Scanner sc=new Scanner(System.in);
 	    System.out.println("enter you are address");
 	    char address1=sc.next().charAt(0);
 	    System.out.println("Select the payment method");
 	    System.out.println("paytm,phonepay,googlepay,upi,debitcard");
 	    String payment=sc.next();
 	    double otp=Math.floor(Math.random()*10000);
 	    System.out.println("You are OTP is: "+otp);
 	    System.out.println("Enter you are OTP");
 	    int otp1=sc.nextInt();
 	   if(otp==otp1) {
 	    System.out.println("You are order sucessful completed");
 	    System.out.println("You are order will delver within 5 days");
 	    System.out.println("thank you for using flipakart");
 	    System.out.println("===========================================");
 	    System.out.println("If you want to go back to home page yes(1)");
 	    int num1=sc.nextInt();
 	    Flipkart_Main_method.m1();
	}
 	   else
 	   {
 		   System.out.println("enter otp incorrect");
 		   System.out.println("Resend The OTP yes(1) and No(2)");
 		  // Scanner sc=new Scanner(System.in);
 		   int n=sc.nextInt();
 		   if(n==1)
 		   {
 		 	    double otp2=Math.floor(Math.random()*10000);
 		 	    System.out.println("You are OTP is: "+otp2);
 		 	    System.out.println("Enter you are OTP");
 		 	    int otp3=sc.nextInt();
 		 	  if(otp2==otp3) {
 		  	    System.out.println("You are order sucessful completed");
 		  	    System.out.println("You are order will delver within 5 days");
 		  	    System.out.println("thank you for using flipakart");
 		  	    System.out.println("===========================================");
 		  	 System.out.println("If you want to go back to home page yes(1)");
		 	    int num1=sc.nextInt();
		 	    Flipkart_Main_method.m1();
 		 	  }
 		  	    else
 		  	    {
 		  	    	System.out.println("Otp is incorrect please try some time");
 		  	    }
 		   }
 		   else
 		   {
 			  System.out.println("If you want to go back to home page yes(1)");
 		 	    int num1=sc.nextInt();
 		 	    Flipkart_Main_method.m1();
 		   }
 	   }
 	   
	}
	public static void cart1()
	{
		System.out.println("please add some product to cart");
	}

}//cart ends
