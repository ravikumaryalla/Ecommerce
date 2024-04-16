import java.util.*;
import java.util.Random;
interface Bank1
{
 void tonumber(long num,int a);
 void tobank(long bnum,String ifc,int a);
 
}
interface Bank2
{
void tocredit(long num,String a,int cvv);
}
class Bank
{
 
 static int flag=0;
 static float tamount=100000.00f;
 static private int pin;
 static private String user;
 static private int pass;

 static void setpassword(int pin1)
 {
	pass=pin1;
 }
 static int getpassword()
 {
	return pass;
 }
 
 static int amm=3;

 static void setuser(String user1)
 {
 	user=user1;
 }
 static void setpass(int pin1)
 {
	pin=pin1;
 }
 static String getUser()
 {
	return user;
 }
 static int getpass()
 {
	return pin;
 }
}


class Phonepay extends Bank implements Bank1,Bank2
{
void a1()
{
	System.out.println("Do you want change the Address press 1");
	System.out.println(Account.address);
	System.out.println("Are continue with default Address press  any number");
	if(Home.sc.nextInt()==1)
	{
		System.out.println("Enter the doorno,landmark,mandal,city,pincode");
		Account.address=Home.sc.next();
	}
}

 void payment()
{
	int pin2=getpass();

	System.out.println();
	System.out.println("\t\t\t\t\t\t\t\t\t\t1 payment using number\n"+
			   "\t\t\t\t\t\t\t\t\t\t2 payment using Bank tranfer\n"+
			   "\t\t\t\t\t\t\t\t\t\t3 Back\n");
	int po=Home.sc.nextInt();
	
	
	if(po==1)
        {
			System.out.println("\t\t\t\t\t\t\t\t\t\t Plz select your Bank\n"+
			   "\t\t\t\t\t\t\t\t\t\t     1 for SBI\n"+
			   "\t\t\t\t\t\t\t\t\t\t     2 for Indian Bank\n"+
			   "\t\t\t\t\t\t\t\t\t\t     3 for ICIC Bank");
	int ab=Home.sc.nextInt();
			System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the moblie number");
			System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the pin");
			System.out.println(pin2);
			tonumber(Home.sc.nextLong(),Home.sc.nextInt());
	}
	if(po==2)
	{
			System.out.println("\t\t\t\t\t\t\t\t\t\t Plz select your Bank\n"+
			   "\t\t\t\t\t\t\t\t\t\t     1 for SBI\n"+
			   "\t\t\t\t\t\t\t\t\t\t     2 for Indian Bank\n"+
			   "\t\t\t\t\t\t\t\t\t\t     3 for ICIC Bank");
	int ab=Home.sc.nextInt();
			System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the Bank Account number");
			System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the IFC code");
			System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the pin");
			tobank(Home.sc.nextLong(),Home.sc.next(),Home.sc.nextInt());
	}
	if(po==3)
	{
		Cart c=new Cart();
		c.payment();
	}
}
			
  	  public void tonumber(long num,int a)
  	  {
		int pin2=getpass();int i;
		if(pin2==a)
		{
			free();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[32mDone!!! Payment Successfull\u001B[0m");
		}
		else
		{
   	     		for(i=amm;i>=1;i--)
	     		{
				System.out.println("\u001B[31mWrong Pin plz re-entered Pin\u001B[0m");
				if(Home.sc.nextInt()!=pin2)
				{
				//System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[31m You Entered wrong password ");
				System.out.println("\t\t\t\t\t\t\t\t\t\t plz Entered correct Pin & your attempt are : \u001B[0m"+i);
				}
				else
				{
					free();
				System.out.println("\t\t\t\t\t\t\t\t\t\t**Done!!! Payment Successfull**");
				
				break;
				}
             		}
			System.out.println();
		
		if(i==0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[31mSorry!!! you have reached maximum attempts\u001B[0m");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t\t\tDo you want Reset your pin press 1");
			if(Home.sc.nextInt()==1)
			{
				System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the New pin");
				setpass(Home.sc.nextInt());
				System.out.println("\t\t\t\t\t\t\t\t\t\tNew pin is set press 1 for payment");
				if(Home.sc.nextInt()==1)
				{
					Cart c=new Cart();
					c.payment();
				}
			}
				
		}
  	    }
         }
      //**tonumber is over


 	 public void tobank(long bnum,String ifc,int a)
  	{
		int pin2=getpass();int i;
		if(pin2==a)
		{
			free();
			System.out.println("\u001B[32m\t\t\t\t\t\t\t\t\t\t**Done!!! Payment Successfull**\u001B[0m");
		}
		else
		{
   	     		for(i=amm;i>=1;i--)
	     		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[31mWrong password plz re-entered password");
			if(Home.sc.nextInt()!=pin2)
			{
				//System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[31m You Entered wrong password ");
				System.out.println(" plz Entered correct password & your attempt are : \u001B[0m"+i);
			}
			else
			{
			
			free();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[32m**Done!!! Payment Successfull**\u001B[0m");
			break;
			}
             		}
	
			if(i==0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[31mSorry!!! you have reached maximum attempts\u001B[0m");
			System.out.println("\u001B[32m\t\t\t\t\t\t\t\t\t\tDo you want Reset your pin press 1\u001B[0m");
			if(Home.sc.nextInt()==1)
			{
				System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the New pin");
				setpass(Home.sc.nextInt());
				System.out.println("\t\t\t\t\t\t\t\t\t\tNew pin is set press 1 for payment");
				if(Home.sc.nextInt()==1)
				{
					Cart c=new Cart();
					c.payment();
				}
			}
				
		}
 	 	}
	}
	void free()
	{
			Flipkart.amount=0;
			Realme.aca=0;
			Home.amount=0;
			Account.o=Realme.acc;
			a1();
			Realme.acc=null;
			Realme.acc="0";
       }
	
	 public void tocredit(long num,String a,int cvv)
	 {
     		
		Random r=new Random();
		int z=r.nextInt(8999)+1000;
		System.out.println("Otp is : "+z);
		if(Home.sc.nextInt()==z)
		{
			free();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[32mDone!!! Payment Successfull");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[31myou Enterd wrong OTP");
			System.out.println("\t\t\t\t\t\t\t\t\t\t-----Thank You------\u001B[0m");
		}
	}	
		

}






	












	
		
				
	