package flipkart;
import java.util.Scanner;
public class Categories extends Home_Page{
	public static void categories()
	{                                                                     //method starts
		Scanner sc= new Scanner(System.in);
		System.out.println("Categories page will shows");
		System.out.println("search the products");
		System.out.println("furniture,flight,sports,medicines");
		String str=sc.next();
		String furniture="Furniture";
		String flight="Flights";
		String sports="Sports";
	    String medicines="Medicines";
	    switch(str) {                                                 //main switch starts
	    case "furniture":
	    	System.out.println("2022 most wanted collection");
	    	System.out.println("It will diciplay the all type of furniture");
	    	System.out.println("Top Categories");
	    	System.out.println("beds,sofas,officetable,diningsets,beanbags");
	    	String str1=sc.next();
	    	String beds="Beds";
	    	String sofas="Sofas";
	    	String officetables="Office_tables";
	    	String diningsets="Dining_Sets";
	    	String beanbags="Bean_Bags";
	    	switch(str1) {                                              //furniture switch starts
	    	case "beds" :
	    		System.out.println("All type of the bed will deciplay");
	    		System.out.println("Filter the amt");
	    		System.out.println("Enter the amt above 15000");
	    		int amt=sc.nextInt();
	    		int n1=15000;
	    		if(amt>=15000) {
	    			System.out.println("Select below one");
		    		System.out.println("hometown,spacewood");
		    		String brand=sc.next();
		    		String hometown="HomeTown";
		    		String spacewood="Spacewood";
		     switch (brand)
		     {                                                           //beds switch starts
		     case "hometown":
		    	    int price6=18000;
				    System.out.println("Wakefit petra Engineered wood queenbox bed:");
				    System.out.println("the price of hometown:"+price6);
				    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
		     	    int num5=sc.nextInt();
		     	    if(num5==1)
		     	    {
		     	    	System.out.println("yor product will added to carts");
		     	    	System.out.println("If u want to go cart");
		     	    	System.out.println("Enter 1.yes,2.No");
		     	    	int n2=sc.nextInt();
		     	    	if(n2==1)
		     	    	{
		     	    		System.out.println("Product detailes");
		     	    		System.out.println("Wakefit petra Engineered wood queenbox bed:");
		    			    System.out.println("the price of hometown:"+price6);
		    			    System.out.println("Enter the number of items");
		   	     	        int num4=sc.nextInt();
		   	     	        int total_Amount=price6*num4;
		   	     	        System.out.println("The total amount of phone is: "+total_Amount);
		   	    	        Cart.cart();
		     	    	}
		     	    	else
		     	    	{
		     	    		categories();
		     	    	}
		     	    }
		     	   else
			    	{
			    		System.out.println("Search another product");
			    		System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
			    	}		
				    break;
				    
		     case "spacewood" :
		    	    int price3=8490;
		    	    System.out.println("Spacewood maxima Engineered wood queen bed:");
					System.out.println("price of spaceewood"+price3);
				    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
		     	    int num6=sc.nextInt();
		     	    if(num6==1)
		     	    {
		     	    	System.out.println("yor product will added to carts");
		     	    	System.out.println("If u want to go cart");
		     	    	System.out.println("Enter 1.yes,2.No");
		     	    	int n2=sc.nextInt();
		     	    	if(n2==1)
		     	    	{
		     	    		System.out.println("Product detailes");
		     	    		System.out.println("Wakefit petra Engineered wood queenbox bed:");
		    			    System.out.println("the price of hometown:"+price3);
		    			    System.out.println("Enter the number of items");
		   	     	        int num4=sc.nextInt();
		   	     	        int total_Amount=price3*num4;
		   	     	        System.out.println("The total amount of phone is: "+total_Amount);
		   	    	        Cart.cart();
		     	    	}
		     	    	else
		     	    	{
		     	    		categories();
		     	    	}
		     	    }
		     	   else
			    	{
			    		System.out.println("Search another product");
			    		System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
			    	}		
				    break;
					default :
						System.out.println("Enter amt and brand is not avilable at this time");
						System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
		     }                                                                                  //beds switch ends
	    		}
	    		else
	    		{
	    			System.out.println("not found");
	    			categories();
	    		}
	    		break;
	    		case "sofas" :
	    			System.out.println("Show you diffrent types of sofas");
	    			System.out.println("Wakefit Napper Right Aligned Chaise with Ottoman fabric 6 seater sofa");
	    			int price3=35948;
					System.out.println("price of spaceewood :"+price3);
				    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
		     	    int num6=sc.nextInt();
		     	    if(num6==1)
		     	    {
		     	    	System.out.println("yor product will added to carts");
		     	    	System.out.println("If u want to go cart");
		     	    	System.out.println("Enter 1.yes,2.No");
		     	    	int n2=sc.nextInt();
		     	    	if(n2==1)
		     	    	{
		     	    		System.out.println("Product detailes");
		     	    		System.out.println("Wakefit petra Engineered wood queenbox bed:");
		    			    System.out.println("the price of sofas:"+price3);
		    			    System.out.println("Enter the number of items");
		   	     	        int num4=sc.nextInt();
		   	     	        int total_Amount=price3*num4;
		   	     	        System.out.println("The total amount of phone is: "+total_Amount);
		   	    	        Cart.cart();
		     	    	}
		     	    	else
		     	    	{
		     	    		categories();
		     	    	}
		     	    }
		     	   else
			    	{
			    		System.out.println("Search another product");
			    		System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
			    	}		
				    break;
	    		case "officetables" :
	    			System.out.println("shows all type of officetable");
	    			System.out.println("Limraz furniture L 56 Engineered Wood Study Table");
	    			int price=1298;
	    			System.out.println("price of officetable :"+price);
	    		    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
		     	    int num7=sc.nextInt();
		     	    if(num7==1)
		     	    {
		     	    	System.out.println("yor product will added to carts");
		     	    	System.out.println("If u want to go cart");
		     	    	System.out.println("Enter 1.yes,2.No");
		     	    	int n2=sc.nextInt();
		     	    	if(n2==1)
		     	    	{
		     	    		System.out.println("Product detailes");
		     	    		System.out.println("Wakefit petra Engineered wood queenbox bed:");
		    			    System.out.println("the price of sofas:"+price);
		    			    System.out.println("Enter the number of items");
		   	     	        int num4=sc.nextInt();
		   	     	        int total_Amount=price*num4;
		   	     	        System.out.println("The total amount of phone is: "+total_Amount);
		   	    	        Cart.cart();
		     	    	}
		     	    	else
		     	    	{
		     	    		categories();
		     	    	}
		     	    }
		     	   else
			    	{
			    		System.out.println("Search another product");
			    		System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
			    	}		
				    break;
	    		case "diningsets" :
	    			System.out.println("shows all type of dining tables");
	    			System.out.println("Taskwood furniture Solid wood four seater Dining table");
	    			int price1 =15501;
	    			System.out.println("price of dining table is: "+price1);
	    			System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
		     	    int num8=sc.nextInt();
		     	    if(num8==1)
		     	    {
		     	    	System.out.println("yor product will added to carts");
		     	    	System.out.println("If u want to go cart");
		     	    	System.out.println("Enter 1.yes,2.No");
		     	    	int n2=sc.nextInt();
		     	    	if(n2==1)
		     	    	{
		     	    		System.out.println("Product detailes");
		     	    		System.out.println("Wakefit petra Engineered wood queenbox bed:");
		    			    System.out.println("the price of sofas:"+price1);
		    			    System.out.println("Enter the number of items");
		   	     	        int num4=sc.nextInt();
		   	     	        int total_Amount=price1*num4;
		   	     	        System.out.println("The total amount of phone is: "+total_Amount);
		   	    	        Cart.cart();
		     	    	}
		     	    	else
		     	    	{
		     	    		categories();
		     	    	}
		     	    }
		     	   else
			    	{
			    		System.out.println("Search another product");
			    		System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
			    	}		
				    break;
	    		case "beanbags" :
	    			System.out.println("Shows all type of beanbags");
	    			System.out.println("Teardrop Bean Bag with bean filling");
	    			int price2=2000;
	    			System.out.println("price of bean bag is :"+price2);
	    			System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
		     	    int num9=sc.nextInt();
		     	    if(num9==1)
		     	    {
		     	    	System.out.println("yor product will added to carts");
		     	    	System.out.println("If u want to go cart");
		     	    	System.out.println("Enter 1.yes,2.No");
		     	    	int n2=sc.nextInt();
		     	    	if(n2==1)
		     	    	{
		     	    		System.out.println("Product detailes");
		     	    		System.out.println("Wakefit petra Engineered wood queenbox bed:");
		    			    System.out.println("the price of sofas:"+price2);
		    			    System.out.println("Enter the number of items");
		   	     	        int num4=sc.nextInt();
		   	     	        int total_Amount=price2*num4;
		   	     	        System.out.println("The total amount of phone is: "+total_Amount);
		   	    	        Cart.cart();
		     	    	}
		     	    	else
		     	    	{
		     	    		categories();
		     	    	}
		     	    }
		     	   else
			    	{
			    		System.out.println("Search another product");
			    		System.out.println("If you want categories(1),or main_page(2)");
			    		int num11=sc.nextInt();
			    		if(num11==1)
			    		{
			    			categories();	
			    		}
			    		else
			    		{
			    			Flipkart_Main_method.m1();
			    		}
			    	}		
				    break;
				    default :
				    	System.out.println("Not found");
	    	}
	    	break;
	    case "flight" :
	    	String from1="Bengaluru";
	    	String to1="Goa";
	    	System.out.println("Search flights");
	    	System.out.println("Only from Bengaluru to Goa");
	    	System.out.println("From");
	    	String from=sc.next();
	    	System.out.println("To");
	    	String to=sc.next();
	       if(from1.equals(from) && to1.equals(to))
	       {
	    	   System.out.println("Shows the ticket ");
	    	   System.out.println("If u want to book this flight click yes(1),No(2)");
	    	   int yes=sc.nextInt();
	    	   if(yes==1)
	    	   {
	    		   int ticket=3500;
	    		   System.out.println("price of tickets :"+ticket);
	    		   System.out.println("Enter the number of tickets");
	    		   int ticket1=sc.nextInt();
	    		   int total_Ammount=ticket*ticket1;
	    		   System.out.println("you are total amt is :"+total_Ammount+" And the number of seats you are booked :"+ticket1);
	    		   System.out.println("Select the payment method");
	    	 	   System.out.println("paytm,phonepay,googlepay,upi,debitcard");
	    	 	   String payment=sc.next();
	    	 	   int otp=123456;
	    	 	   System.out.println("Enter the OTP: "+otp);
	    	 	   int otp1=sc.nextInt();
	    	 	   if(otp==otp1)
	    	 	   {
	    	 		   System.out.println("You are ticket is confirmed");
	    	 		   System.out.println("===========================================");
	    	 		  System.out.println("If you want categories(1),or main_page(2)");
	    	    		int num11=sc.nextInt();
	    	    		if(num11==1)
	    	    		{
	    	    			categories();	
	    	    		}
	    	    		else
	    	    		{
	    	    			Flipkart_Main_method.m1();
	    	    		}
	    	 	   }
	    	 	   else
	    	 	   {
	    	 		   System.out.println("Entered OTP is not correct");
	    	 		   System.out.println("Payment canceled");
	    	 		   System.out.println("=======================================");
	    	 		  System.out.println("If you want categories(1),or main_page(2)");
	    	    		int num11=sc.nextInt();
	    	    		if(num11==1)
	    	    		{
	    	    			categories();	
	    	    		}
	    	    		else
	    	    		{
	    	    			Flipkart_Main_method.m1();
	    	    		}
	    	 	   }
	    	   }
	       }
	       else
	       {
	    	   System.out.println("Not found");
	    	   System.out.println("Search another product");
	   		System.out.println("If you want categories(1),or main_page(2)");
	   		int num11=sc.nextInt();
	   		if(num11==1)
	   		{
	   			categories();	
	   		}
	   		else
	   		{
	   			Flipkart_Main_method.m1();
	   		}
	       }
	       break;
	    case "sports" :
	    	System.out.println("Pick you are favorite sports");
	    	System.out.println("Cricket Kits");
	    	int price =1149;
	    	System.out.println("Klapp cricket kits");
	    	System.out.println("Price of kit :"+price);
	    	System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
	 	    int num9=sc.nextInt();
	 	    if(num9==1)
	 	    {
	 	    	System.out.println("yor product will added to carts");
	 	    	System.out.println("If u want to go cart");
	 	    	System.out.println("Enter 1.yes,2.No");
	 	    	int n2=sc.nextInt();
	 	    	if(n2==1)
	 	    	{
	 	    		System.out.println("Product detailes");
	 	    		System.out.println("Klapp cricket kits");
				    System.out.println("the price of sofas:"+price);
				    System.out.println("Enter the number of items");
		     	        int num4=sc.nextInt();
		     	        int total_Amount=price*num4;
		     	        System.out.println("The total amount of phone is: "+total_Amount);
		    	        Cart.cart();
	 	    	}
	 	    	else
	 	    	{
	 	    		categories();
	 	    	}
	 	    }
	 	   else
	    	{
	    		System.out.println("Search another product");
	    		System.out.println("If you want categories(1),or main_page(2)");
	    		int num11=sc.nextInt();
	    		if(num11==1)
	    		{
	    			categories();	
	    		}
	    		else
	    		{
	    			Flipkart_Main_method.m1();
	    		}
	    	}		
		    break;
	    case "medicines" :
	    	System.out.println("Shows all type of medicines");
	    	System.out.println("Fever & cold Relife");
	    	System.out.println("Otrivin oxy fast relife ");
	    	int price15=86;
	    	System.out.println("price of medicines: "+price15);
	    	System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
	 	    int num10=sc.nextInt();
	 	    if(num10==1)
	 	    {
	 	    	System.out.println("yor product will added to carts");
	 	    	System.out.println("If u want to go cart");
	 	    	System.out.println("Enter 1.yes,2.No");
	 	    	int n2=sc.nextInt();
	 	    	if(n2==1)
	 	    	{
	 	    		System.out.println("Product detailes");
	 	    		System.out.println("Fever & cold Relife");
				    System.out.println("the price of medicines: "+price15);
				    System.out.println("Enter the number of items");
		     	        int num4=sc.nextInt();
		     	        int total_Amount=price15*num4;
		     	        System.out.println("The total amount of phone is: "+total_Amount);
		    	        Cart.cart();
	 	    	}
	 	    	else
	 	    	{
	 	    		categories();
	 	    	}
	 	    }
	 	   else
	    	{
	    		System.out.println("Search another product");
	    		System.out.println("If you want categories(1),or main_page(2)");
	    		int num11=sc.nextInt();
	    		if(num11==1)
	    		{
	    			categories();	
	    		}
	    		else
	    		{
	    			Flipkart_Main_method.m1();
	    		}
	    	}		
		    break;
	      default :
	    	  System.out.println("Not found");
	    	  System.out.println("If you want categories(1),or main_page(2)");
	  		int num11=sc.nextInt();
	  		if(num11==1)
	  		{
	  			categories();	
	  		}
	  		else
	  		{
	  			Flipkart_Main_method.m1();
	  		}
	    	
	    	}//furniture ends
	    
	    }//Categories main switch
	}//methods ends