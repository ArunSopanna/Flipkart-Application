package flipkart;
import java.util.Scanner;
public class Home extends Home_Page {
	public static void home()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("home page should display");
	System.out.println("serch for products");
	System.out.println("p.phones,f.bletooth,s.dress,g.grocery");
	char h=sc.next().charAt(0);
	String p="phones";
    String f="boat";
    String s="dresses";
    String g="Grocery";
    switch(h)                                                                                         //switch home start
    {
    case 'p':
    	System.out.println("it shows the all the mobiles");
    	System.out.println("click on one mobile it will show the all similar mobiles");
    	System.out.println("v.redmi,w.realme,x.samsung,y.oopo,z.vivo");
        char s1=sc.next().charAt(0);
    	String v="redmi";
    	String w="realme";
    	String x="Samsung";
    	String y="Oppo";
    	String z="Vivo";
    	switch(s1)                                                                                   
    	{
    	case 'v':
    		System.out.println("Redmi brand will desiplay");
    		System.out.println("if u want  8gb ram and 128gb rom than enter the above 20000 ");
    		int amt2=sc.nextInt();
    		if(amt2>=20000) {
    	    String realme7pro="redmi note 5pro";
    	    int price=20000;
    	    int ram=8;
    	    int rom=128;
    	    System.out.println("redmi note 5pro");
    	    System.out.println("the price is: "+price);
    	    System.out.println("the ram is:"+ram);
    	    System.out.println("rom is: "+rom);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    		String realme7pro1="redmi note 5pro";
    	    		int price1=20000;
    	    	    int ram1=8;
    	    	    int rom1=128;
    	    	    System.out.println("redmi note 5pro");
    	    	    System.out.println("the price is: "+price);
    	    	    System.out.println("the ram is:"+ram);
    	    	    System.out.println("rom is: "+rom);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price1*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro="redmi note5";
	    	    int price=15000;
	    	    int ram=6;
	    	    int rom=128;
	    	    System.out.println("redmi note5");
	    	    System.out.println("the price is: "+price);
	    	    System.out.println("the ram is:"+ram);
	    	    System.out.println("rom is: "+rom);
	    	    System.out.println("If you intresed  this product please add to cart");
	    	    System.out.println("1.yes,2.no");
	    	   int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println("redmi note5");
		    	    System.out.println("the price is: "+price);
		    	    System.out.println("the ram is:"+ram);
		    	    System.out.println("rom is: "+rom);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'w':
    		System.out.println("Realme brand will desiplay");
    		System.out.println("if u want  8gb ram and 128gb rom than enter the above 20000 ");
    		int amt3=sc.nextInt();
    		if(amt3>=20000) {
    	    String realme7pro="realme 7pro";
    	    int price=20000;
    	    int ram=8;
    	    int rom=128;
    	    System.out.println("realme 7pro");
    	    System.out.println("the price is: "+price);
    	    System.out.println("the ram is:"+ram);
    	    System.out.println("rom is: "+rom);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    		String realme7pro1="realme 7pro";
    	    		int price1=20000;
    	    	    int ram1=8;
    	    	    int rom1=128;
    	    	    System.out.println("realme 7pro");
    	    	    System.out.println("the price is: "+price);
    	    	    System.out.println("the ram is:"+ram);
    	    	    System.out.println("rom is: "+rom);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price1*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro="realme 6pro";
	    	    int price2=15000;
	    	    int ram2=6;
	    	    int rom2=128;
	    	    System.out.println("realme 6pro");
	    	    System.out.println("the price is: "+price2);
	    	    System.out.println("the ram is:"+ram2);
	    	    System.out.println("rom is: "+rom2);
	    	    System.out.println("If you intresed  this product please add to cart");
	    	    System.out.println("1.yes,2.no");
	    	   int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println("realme 6pro");
		    	    System.out.println("the price is: "+price2);
		    	    System.out.println("the ram is:"+ram2);
		    	    System.out.println("rom is: "+rom2);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price2*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'x' :
    		System.out.println("Samsung brand will desiplay");
    		System.out.println("if u want  8gb ram and 128gb rom than enter the above 20000 ");
    		int amt4=sc.nextInt();
    		if(amt4>=20000) {
    	    String realme7pro="Samsung_M53";
    	    int price3=27999;
    	    int ram3=8;
    	    int rom3=128;
    	    System.out.println("Samsung_M53");
    	    System.out.println("the price is: "+price3);
    	    System.out.println("the ram is:"+ram3);
    	    System.out.println("rom is: "+rom3);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println("Samsung_M53");
    	    	    System.out.println("the price is: "+price3);
    	    	    System.out.println("the ram is:"+ram3);
    	    	    System.out.println("rom is: "+rom3);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price3*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro="Samsung_Galaxy_F22";
	    	    int price4=15000;
	    	    int ram4=6;
	    	    int rom4=128;
	    	    System.out.println(realme6pro);
	    	    System.out.println("the price is: "+price4);
	    	    System.out.println("the ram is:"+ram4);
	    	    System.out.println("rom is: "+rom4);
	    	    System.out.println("If you intresed  this product please add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro);
		    	    System.out.println("the price is: "+price4);
		    	    System.out.println("the ram is:"+ram4);
		    	    System.out.println("rom is: "+rom4);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price4*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'y' :
    		System.out.println("Oppo brand will desiplay");
    		System.out.println("if u want  8gb ram and 128gb rom than enter the above 20000 ");
    		int amt7=sc.nextInt();
    		if(amt7>=20000) {
    	    String realme7pro="Oppo_reno7";
    	    int price5=25999;
    	    int ram5=8;
    	    int rom5=128;
    	    System.out.println(realme7pro);
    	    System.out.println("the price is: "+price5);
    	    System.out.println("the ram is:"+ram5);
    	    System.out.println("rom is: "+rom5);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro);
    	    	    System.out.println("the price is: "+price5);
    	    	    System.out.println("the ram is:"+ram5);
    	    	    System.out.println("rom is: "+rom5);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price5*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro1="Oppo_K10";
	    	    int price6=15000;
	    	    int ram6=6;
	    	    int rom6=128;
	    	    System.out.println(realme6pro1);
	    	    System.out.println("the price is: "+price6);
	    	    System.out.println("the ram is:"+ram6);
	    	    System.out.println("rom is: "+rom6);
	    	    System.out.println("If you intresed  this product please add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro1);
		    	    System.out.println("the price is: "+price6);
		    	    System.out.println("the ram is:"+ram6);
		    	    System.out.println("rom is: "+rom6);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price6*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'z' :
    		System.out.println("Vivo brand will desiplay");
    		System.out.println("if u want  8gb ram and 128gb rom than enter the above 20000 ");
    		int amt5=sc.nextInt();
    		if(amt5>=20000) {
    	    String realme7pro1="Vivo_V23e";
    	    int price7=25999;
    	    int ram7=8;
    	    int rom7=128;
    	    System.out.println(realme7pro1);
    	    System.out.println("the price is: "+price7);
    	    System.out.println("the ram is:"+ram7);
    	    System.out.println("rom is: "+rom7);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("the ram is:"+ram7);
    	    	    System.out.println("rom is: "+rom7);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price7*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro2="Vivo_T1X";
	    	    int price8=15000;
	    	    int ram8=6;
	    	    int rom8=128;
	    	    System.out.println(realme6pro2);
	    	    System.out.println("the price is: "+price8);
	    	    System.out.println("the ram is:"+ram8);
	    	    System.out.println("rom is: "+rom8);
	    	    System.out.println("If you intresed  this product please add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro2);
		    	    System.out.println("the price is: "+price8);
		    	    System.out.println("the ram is:"+ram8);
		    	    System.out.println("rom is: "+rom8);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price8*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    		default :
    			System.out.println("not found");
    			home();
    		
    	}   //phones switch ends
    	break;
    case 'f' :
    	System.out.println("It will deciplay all the earphones like wireless and wired earphones");
    	System.out.println("click on one earphones it will show the all similar earphones");
    	System.out.println("r.boat,l.skull candy,u.bose,j.apple,n.zabra");
    	System.out.println("Enter the one brand");
    	char s2=sc.next().charAt(0);
    	String r="BOAT";
    	String l="SKULL_CANDY";
    	String u="BOSE";
    	String j="APPLE";
    	String n="jabra";
    	switch(s2)
    	{
    	case 'r':
    		System.out.println("It will shows the all Boat branded earphones");
    		System.out.println("Top rated and popular brands starts from 1500 to 2500 ");
    		int amt5=sc.nextInt();
    		if(amt5>=1500) {
    	    String realme7pro1="Boat_Airpodes_191G";
    	    int price7=1699;
    	    double version=5.20;
    	    int wireless_Range=10;
    	    System.out.println(realme7pro1);
    	    System.out.println("the price is: "+price7);
    	    System.out.println("version is: "+version);
    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("version is: "+version);
    	    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price7*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro2="Boat_Airpodes_131";
	    	    int price8=999;
	    	    double version1=5.60;
	    	    int wireless_Range=8;
	    	    System.out.println(realme6pro2);
	    	    System.out.println("the price is: "+price8);
	    	    System.out.println("version is:"+version1);
	    	    System.out.println("wireless range is: "+wireless_Range+"m");
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro2);
		    	    System.out.println("the price is: "+price8);
		    	    System.out.println("the ram is:"+version1);
		    	    System.out.println("rom is: "+wireless_Range+"m");
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price8*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'l' :
    		System.out.println("It will shows the all Skull_Candy branded earphones");
    		System.out.println("Top rated and popular brands starts from 5000 ");
    		int amt6=sc.nextInt();
    		if(amt6>=5000) {
    	    String realme7pro1="Skull_Candy";
    	    int price7=6699;
    	    double version=5.80;
    	    int wireless_Range=11;
    	    System.out.println(realme7pro1);
    	    System.out.println("the price is: "+price7);
    	    System.out.println("version is: "+version);
    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("version is: "+version);
    	    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price7*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro2="Skull_Cand_Dime";
	    	    int price8=2599;
	    	    double version1=4.0;
	    	    int wireless_Range=8;
	    	    System.out.println(realme6pro2);
	    	    System.out.println("the price is: "+price8);
	    	    System.out.println("version is:"+version1);
	    	    System.out.println("wireless range is: "+wireless_Range+"m");
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro2);
		    	    System.out.println("the price is: "+price8);
		    	    System.out.println("the ram is:"+version1);
		    	    System.out.println("rom is: "+wireless_Range+"m");
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price8*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'u':
    		System.out.println("It will shows the all Bose_Quiet_Comfort branded earphones");
    		System.out.println("Top rated and popular brands starts from 20000 ");
    		int amt7=sc.nextInt();
    		if(amt7>=20000) {
    	    String realme7pro1="Bose_Quiet_Comfort";
    	    int price7=21499;
    	    double version=6.00;
    	    int wireless_Range=15;
    	    System.out.println(realme7pro1);
    	    System.out.println("the price is: "+price7);
    	    System.out.println("version is: "+version);
    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("version is: "+version);
    	    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price7*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro2="Bose_Sports";
	    	    int price8=10000;
	    	    double version1=4.0;
	    	    int wireless_Range=10;
	    	    System.out.println(realme6pro2);
	    	    System.out.println("the price is: "+price8);
	    	    System.out.println("version is:"+version1);
	    	    System.out.println("wireless range is: "+wireless_Range+"m");
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro2);
		    	    System.out.println("the price is: "+price8);
		    	    System.out.println("the ram is:"+version1);
		    	    System.out.println("rom is: "+wireless_Range+"m");
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price8*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'j':
    		System.out.println("It will shows the all Apple branded earphones");
    		System.out.println("Top rated and popular brands starts from 15000 ");
    		int amt8=sc.nextInt();
    		if(amt8>=15000) {
    	    String realme7pro1="Apple_Airpods_Pro";
    	    int price7=19999;
    	    double version=5.00;
    	    int wireless_Range=12;
    	    System.out.println(realme7pro1);
    	    System.out.println("the price is: "+price7);
    	    System.out.println("version is: "+version);
    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("version is: "+version);
    	    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price7*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro2="Apple_Airpods_2nd_Gen";
	    	    int price8=10000;
	    	    double version1=4.0;
	    	    int wireless_Range=10;
	    	    System.out.println(realme6pro2);
	    	    System.out.println("the price is: "+price8);
	    	    System.out.println("version is:"+version1);
	    	    System.out.println("wireless range is: "+wireless_Range+"m");
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro2);
		    	    System.out.println("the price is: "+price8);
		    	    System.out.println("the ram is:"+version1);
		    	    System.out.println("rom is: "+wireless_Range+"m");
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price8*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 'n':
    		System.out.println("It will shows the all jabra branded earphones");
    		System.out.println("Top rated and popular brands starts from 5000 ");
    		int amt9=sc.nextInt();
    		if(amt9>=5000) {
    	    String realme7pro1="jabra_Elite";
    	    int price7=89999;
    	    double version=5.00;
    	    int wireless_Range=10;
    	    System.out.println(realme7pro1);
    	    System.out.println("the price is: "+price7);
    	    System.out.println("version is: "+version);
    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("the price is: "+price7);
    	    	    System.out.println("version is: "+version);
    	    	    System.out.println("Wireless range is:"+wireless_Range+"m");
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price7*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    			String realme6pro2="jabra_Talk";
	    	    int price8=10000;
	    	    double version1=5.0;
	    	    int wireless_Range=10;
	    	    System.out.println(realme6pro2);
	    	    System.out.println("the price is: "+price8);
	    	    System.out.println("version is:"+version1);
	    	    System.out.println("wireless range is: "+wireless_Range+"m");
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println(realme6pro2);
		    	    System.out.println("the price is: "+price8);
		    	    System.out.println("the ram is:"+version1);
		    	    System.out.println("rom is: "+wireless_Range+"m");
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price8*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    		default :
    			System.out.println("Not found");
    			home();
    	}//bluetooth
    	break;
    case 's':
    	System.out.println("It will display all the dress ");
    	System.out.println("click on dress it will dicplay all the similar dress ");
    	System.out.println("1.LEVIS,2.ADIDAS,3.NIKE,4.PUMA");
    	System.out.println("Enter the one brand");
    	int  s3=sc.nextInt();
    	switch(s3)
    	{
    	case 1:
    		System.out.println("It will shows the all 'LEVIS' branded dreses");
    		System.out.println("Top rated and popular brands starts from 2000 ");
    		int amt9=sc.nextInt();
    		if(amt9>=2000) {
    		int price11=2739;
    	    String realme7pro1="Levis";
    	    String faded ="Light_Fade";
    	    String rise="Mid_Rise";
    	    String distressed="Clean_Look";
    	    String colour="Grey";
    	    System.out.println(realme7pro1);
    	    System.out.println("Product detailes");
    	    System.out.println("Men Slim Mid Blue Jeans");
    	    System.out.println("price is :"+price11);
    	    System.out.println("Faded :"+faded);
    	    System.out.println("Rise :"+rise);
    	    System.out.println("distressed :"+distressed);
    	    System.out.println("colour :"+colour);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    		System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price11);
    	    	    System.out.println("faded :"+faded);
    	    	    System.out.println(" Rise is  :"+rise);
    	    	    System.out.println("Distressed is:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price11*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    	    	int price12=1394;
        	    String realme7pro1="Levis";
        	    String faded ="Light_Fade";
        	    String rise="Mid_Rise";
        	    String distressed="Clean_Look";
        	    String colour="Grey";
        	    System.out.println(realme7pro1);
        	    System.out.println("Product detailes");
        	    System.out.println("Men blue jeans");
        	    System.out.println("price is :"+price12);
        	    System.out.println("Faded :"+faded);
        	    System.out.println("Rise :"+rise);
        	    System.out.println("distressed :"+distressed);
        	    System.out.println("colour :"+colour);
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price12);
    	    	    System.out.println("faded :"+faded);
    	    	    System.out.println(" Rise is  :"+rise);
    	    	    System.out.println("Distressed is:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price12*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 2:
    		System.out.println("It will shows the all 'ADIDAS' branded dreses");
    		System.out.println("Top rated and popular brands starts from 2000 ");
    		int amt10=sc.nextInt();
    		if(amt10>=2000) {
    		int price11=2739;
    	    String realme7pro1="ADIDAS";
    	    String faded ="Short_Sleeves";
    	    String rise="Polyester";
    	    String distressed="Round_Neck";
    	    String colour="Grey";
    	    System.out.println(realme7pro1);
    	    System.out.println("Product detailes");
    	    System.out.println("price is :"+price11);
    	    System.out.println("Sleeve :"+faded);
    	    System.out.println("fabrick :"+rise);
    	    System.out.println("Neck Type :"+distressed);
    	    System.out.println("colour :"+colour);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    		System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price11);
    	    	    System.out.println("Sleeve :"+faded);
    	    	    System.out.println(" fabrick  :"+rise);
    	    	    System.out.println("Neck_Type:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price11*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    	    	int price12=1394;
        	    String realme7pro1="Adidas";
        	    String faded ="Half_Sleeve";
        	    String rise="Viscose_Rayon";
        	    String distressed="Polo_Neck";
        	    String colour="Grey";
        	    System.out.println(realme7pro1);
        	    System.out.println("Product detailes");
        	    System.out.println("price is :"+price12);
        	    System.out.println("Sleeve :"+faded);
        	    System.out.println("fabric :"+rise);
        	    System.out.println("Neck_Type :"+distressed);
        	    System.out.println("colour :"+colour);
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price12);
    	    	    System.out.println("Sleeve :"+faded);
    	    	    System.out.println(" fabric :"+rise);
    	    	    System.out.println("Neck_Type :"+distressed);
    	    	    System.out.println("Colour is :"+colour);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price12*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 3:
    		System.out.println("It will shows the all 'Nike' branded dreses");
    		System.out.println("Top rated and popular brands starts from 1000 ");
    		int amt11=sc.nextInt();
    		if(amt11>=1000) {
    		int price11=1396;
    	    String realme7pro1="NIKE";
    	    String faded ="Short_Sleeve";
    	    String rise="Polyester";
    	    String distressed="Round_Neck";
    	    String colour="Red";
    	    System.out.println(realme7pro1);
    	    System.out.println("Product detailes");
    	    System.out.println("Men self design round neck red tshirt");
    	    System.out.println("price is :"+price11);
    	    System.out.println("sleeve :"+faded);
    	    System.out.println("fabric :"+rise);
    	    System.out.println("neck type :"+distressed);
    	    System.out.println("colour :"+colour);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    		System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price11);
    	    	    System.out.println("faded :"+faded);
    	    	    System.out.println(" Rise is  :"+rise);
    	    	    System.out.println("Distressed is:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price11*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    	    	int price12=647;
        	    String realme7pro1="Nike";
        	    String faded ="Short_Sleeve";
        	    String rise="polyester";
        	    String distressed="Round_Neck";
        	    String colour="Grey";
        	    System.out.println(realme7pro1);
        	    System.out.println("Product detailes");
        	    System.out.println("blue T_Shirt");
        	    System.out.println("price is :"+price12);
        	    System.out.println("Sleeve :"+faded);
        	    System.out.println("Fabric :"+rise);
        	    System.out.println("Neck_Type :"+distressed);
        	    System.out.println("colour :"+colour);
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price12);
    	    	    System.out.println("faded :"+faded);
    	    	    System.out.println(" Rise is  :"+rise);
    	    	    System.out.println("Distressed is:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price12*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    	case 4:
    		System.out.println("It will shows the all 'PUMA' branded dreses");
    		System.out.println("Top rated and popular brands starts from 1000 ");
    		int amt12=sc.nextInt();
    		if(amt12>=1000) {
    		int price11=1696;
    	    String realme7pro1="PUMA";
    	    String faded ="Short_Sleeve";
    	    String rise="Polyester";
    	    String distressed="Crew_Neck";
    	    String colour="Red";
    	    System.out.println(realme7pro1);
    	    System.out.println("Product detailes");
    	    System.out.println("Men self design crew neck red tshirt");
    	    System.out.println("price is :"+price11);
    	    System.out.println("sleeve :"+faded);
    	    System.out.println("fabric :"+rise);
    	    System.out.println("neck type :"+distressed);
    	    System.out.println("colour :"+colour);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
    	    int num1=sc.nextInt();
    	    if(num1==1)
    	    {
    	    	System.out.println("yor product will added to carts");
    	    	//Cart.cart();
    	    	System.out.println("If u want to go cart");
    	    	System.out.println("Enter 1.yes,2.No");
    	    	int n2=sc.nextInt();
    	    	if(n2==1)
    	    	{
    	    		System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price11);
    	    	    System.out.println("faded :"+faded);
    	    	    System.out.println(" Rise is  :"+rise);
    	    	    System.out.println("Distressed is:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
    	    	    System.out.println("Enter the number of items");
    	     	    int num2=sc.nextInt();
    	     	    int total_Amount=price11*num2;
    	     	    System.out.println("The total amount of phone is: "+total_Amount);
    	    	    Cart.cart();
    	    	}
    	    }
    	    	else
    	    	{
    	    		System.out.println("Search another product");
    	    		System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
    	    	}
    		}
    	    else
    		{
    	    	int price12=674;
        	    String realme7pro1="PUMA";
        	    String faded ="Short_Sleeve";
        	    String rise="polyester";
        	    String distressed="Polo_Neck";
        	    String colour="Grey";
        	    System.out.println(realme7pro1);
        	    System.out.println("Product detailes");
        	    System.out.println("blue T_Shirt");
        	    System.out.println("price is :"+price12);
        	    System.out.println("Sleeve :"+faded);
        	    System.out.println("Fabric :"+rise);
        	    System.out.println("Neck_Type :"+distressed);
        	    System.out.println("colour :"+colour);
	    	    System.out.println("If you intrested  this product add to cart");
	    	    System.out.println("1.yes,2.no");
	    	    int intrest3=sc.nextInt();
	    	    if(intrest3==1)
	    	    {
	    	    	System.out.println("the product added to cart");
	    	    	System.out.println("If u want to go cart");
	    	    	System.out.println("Enter 1.yes,2.No");
	    	    	int n2=sc.nextInt();
	    	    	if(n2==1)
	    	    	{
	    	    	System.out.println("My cart");
	    	    	System.out.println("Product detailes");
    	    	    System.out.println(realme7pro1);
    	    	    System.out.println("the price is : "+price12);
    	    	    System.out.println("faded :"+faded);
    	    	    System.out.println(" Rise is  :"+rise);
    	    	    System.out.println("Distressed is:"+distressed);
    	    	    System.out.println("Colour is :"+colour);
		    	    System.out.println("Enter the number of items");
		    	    int num1=sc.nextInt();
		    	    int total_Amount=price12*num1;
		    	    System.out.println("The total amount of phone is: "+total_Amount);
		    	    Cart.cart();
		    	    }
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Search another product");
	    	    	System.out.println("If you want home page(1),or main_page(2)");
    	    		int num4=sc.nextInt();
    	    		if(num4==1)
    	    		{
    	    		home();	
    	    		}
    	    		else
    	    		{
    	    			Flipkart_Main_method.m1();
    	    		}
	    	    }
    		}
    		break;
    		default :
    			System.out.println("Not found");
    			home();
    	}//dress switch
    	break;
    case 'g' :
    	System.out.println("search grocery products ");
    	System.out.println("k.Rice,q.masalas,t.oil&Ghee,i.Dry fruits");
    	System.out.println("Enter the one product");
    	char s4=sc.next().charAt(0);
    	String k="Atta_Rice";
    	String q="Masalas";
    	String t="Oil&Ghee";
    	String i="Fruits";
    	switch(s4)
    	{
    	case 'k':
    		System.out.println("it will desiplay the all the related products");
    		int price=389;
    		System.out.println("pillsbury Chakki Fresh Atta");
            System.out.println(" Atta price for 10 kg is:"+price);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
     	    int num1=sc.nextInt();
     	    if(num1==1)
     	    {
     	    	System.out.println("yor product will added to carts");
     	    	System.out.println("If u want to go cart");
     	    	System.out.println("Enter 1.yes,2.No");
     	    	int n2=sc.nextInt();
     	    	if(n2==1)
     	    	{
     	    		System.out.println("Product detailes");
     	    		System.out.println("pillsbury Chakki Fresh Atta_Rice");
     	            System.out.println(" Atta price is:"+price);
     	            System.out.println("Enter the number of items");
   	     	        int num2=sc.nextInt();
   	     	        int total_Amount=price*num2;
   	     	        System.out.println("The total amount of phone is: "+total_Amount);
   	    	        Cart.cart();
   	    	}
   	    }
     	 	else
	    	{
	    		System.out.println("Search another product");
	    		System.out.println("If you want home page(1),or main_page(2)");
	    		int num4=sc.nextInt();
	    		if(num4==1)
	    		{
	    		home();	
	    		}
	    		else
	    		{
	    			Flipkart_Main_method.m1();
	    		}
	    	}		
    		break;
    	case 'q':
    		System.out.println("it will desiplay the all the related products");
    		int price1=58;
    		System.out.println("Maggi Masalas Magic All in One Masalas");
            System.out.println("price is: "+price1);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
     	    int num2=sc.nextInt();
     	    if(num2==1)
     	    {
     	    	System.out.println("yor product will added to carts");
     	    	System.out.println("If u want to go cart");
     	    	System.out.println("Enter 1.yes,2.No");
     	    	int n2=sc.nextInt();
     	    	if(n2==1)
     	    	{
     	    		System.out.println("Product detailes");
     	    		System.out.println("Maggi Masalas Magic All in One Masalas");
     	            System.out.println("price is: "+price1);
     	            System.out.println("Enter the number of items");
   	     	        int num3=sc.nextInt();
   	     	        int total_Amount=price1*num2;
   	     	        System.out.println("The total amount of phone is: "+total_Amount);
   	    	        Cart.cart();
   	    	}
   	    }
     	 	else
	    	{
	    		System.out.println("Search another product");
	    		System.out.println("If you want home page(1),or main_page(2)");
	    		int num4=sc.nextInt();
	    		if(num4==1)
	    		{
	    		home();	
	    		}
	    		else
	    		{
	    			Flipkart_Main_method.m1();
	    		}
	    	}		
    		break;
    	case 't':
    		System.out.println("it will desiplay the all the related products");
    		int price2=567;
    		System.out.println("Aashirvaad Svasti Pure Cow Ghee 1L Tetrapack");
            System.out.println("price is: "+price2);
    	    System.out.println("If you intrested  this product please add to cart Yes(1),No(2)");
     	    int num3=sc.nextInt();
     	    if(num3==1)
     	    {
     	    	System.out.println("yor product will added to carts");
     	    	System.out.println("If u want to go cart");
     	    	System.out.println("Enter 1.yes,2.No");
     	    	int n2=sc.nextInt();
     	    	if(n2==1)
     	    	{
     	    		System.out.println("Product detailes");
     	    		System.out.println("Aashirvaad Svasti Pure Cow Ghee 1L Tetrapack");
     	            System.out.println("price is: "+price2);
     	            System.out.println("Enter the number of items");
   	     	        int num4=sc.nextInt();
   	     	        int total_Amount=price2*num4;
   	     	        System.out.println("The total amount of phone is: "+total_Amount);
   	    	        Cart.cart();
   	    	}
   	    }
     	 	else
	    	{
	    		System.out.println("Search another product");
	    		System.out.println("If you want home page(1),or main_page(2)");
	    		int num11=sc.nextInt();
	    		if(num11==1)
	    		{
	    		home();	
	    		}
	    		else
	    		{
	    			Flipkart_Main_method.m1();
	    		}
	    	}		
    		break;
    	case 'i':
    		System.out.println("it will desiplay the all the related products");
    		int price3=180;
    		System.out.println("Happilo Premium Natural Whole W320 Cashews");
            System.out.println("price is: "+price3);
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
     	    		System.out.println("Happilo Premium Natural Whole W320 Cashews");
     	            System.out.println("price is: "+price3);
     	            System.out.println("Enter the number of items");
   	     	        int num4=sc.nextInt();
   	     	        int total_Amount=price3*num4;
   	     	        System.out.println("The total amount of phone is: "+total_Amount);
   	    	        Cart.cart();
   	    	}
   	    }
     	 	else
	    	{
	    		System.out.println("Search another product");
	    		System.out.println("If you want home page(1),or main_page(2)");
	    		int num11=sc.nextInt();
	    		if(num11==1)
	    		{
	    		home();	
	    		}
	    		else
	    		{
	    			Flipkart_Main_method.m1();
	    		}
	    	}		
    		break;
    		default :
    			System.out.println("Not found");
    			home();
    		
    	}//grocerry ends
    	
    }// main switch ends
	}//user method ends
}//class ends

