package flipkart;
import java.util.Scanner;
public class Login {
		public void login() {
			Scanner sc =new Scanner(System.in);
			System.out.println("welcome to flipkart");
			System.out.println("Enter the one number");
			System.out.println("1.login,2.registration");
			int n1=sc.nextInt();
			if(n1==1)
			{
				System.out.println("enter the user name");
				String un=sc.next();
				System.out.println("enter the password");
				int  pw=sc.nextInt();
				Registration a1=new Registration();
				if((a1.getUser_name()).equals(un) && a1.getPassword()==pw)
				{
					System.out.println("Login sucessful");
					System.out.println("Home page will desiplay");
				}
				else
				{
					System.out.println("invalid password and user name");
					System.out.println("forgot password");
					System.out.println("enter the phno");
					long phno=sc.nextLong();
					if(a1.getPhno()==phno)
					{
						//int otp=Math.random();
						System.out.println("enter the OTP :"+123456);
						int n2=sc.nextInt();
						System.out.println("Enter the new password");
						int pw1=sc.nextInt();
						System.out.println("password is created sucessful");
						System.out.println("flipkart home page will display");
					}
					else
					{
						System.out.println("Enter phno is not regesterd");
						System.out.println("please create account");
						System.out.println("Enter the first name");
						String firstname=sc.next();
						System.out.println("Enter the last name");
						String lastname=sc.next();
						System.out.println("Enter the phno");
						long phno1=sc.nextLong();
						System.out.println("Create a new password");
						char newpw=sc.next().charAt(0);
						System.out.println("Confirm password");
						char conpw=sc.next().charAt(0);
						if(newpw==conpw)
						{
							System.out.println("password is matched");
						}
						System.out.println("flipkart is sucessfully regesterd");
						System.out.println("Home page display");
						}
				}
					}
			else if(n1==2)
			{
				System.out.println("please create account");
				System.out.println("Enter the first name");
				String firstname=sc.next();
				System.out.println("Enter the last name");
				String lastname=sc.next();
				System.out.println("Enter the phno");
				long phno1=sc.nextLong();
				System.out.println("Create a new password");
				char newpw=sc.next().charAt(0);
				System.out.println("Confirm password");
				char conpw=sc.next().charAt(0);
				if(newpw==conpw)
				{
					System.out.println("password is matched");
				}
				System.out.println("flipkart is sucessfully regesterd");
				}
			else
			{
				System.out.println("create or enter the valid credential");
			}
		
			} 
}
