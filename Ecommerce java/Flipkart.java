import java.util.*;
class Flipkart extends Bank
{
 static Scanner sc=new Scanner(System.in);
 static Home h=new Home();
 static Allcategories all=new Allcategories();
 static Account acc=new Account();
 static Cart ca=new Cart();
 static Phonepay pp=new Phonepay();
 static LinkedHashMap lf=new LinkedHashMap();
 static float amount;static int g=1;static int m=1;
 static int alll=1;
	void bill()
{
	int i=0;
	if(Realme.acc.length()>1)
	{
	
	System.out.println("\t\t\t\t\t\t\t\t\t--------------\u001B[5m Your Bill\u001B[0m-------------------");
	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\tS.No       Item                Amount  \u001B[0m"); 
	System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------------");
	String notificationArray[] = Realme.acc.split("\n");
        for (String notification : notificationArray)
	 {
            System.out.println("\t\t\t\t\t\t\t\t\t"+ (++i)+"          "+notification);
	 }
	System.out.println("\t\t\t\t\t\t\t\t\t--------------\u001B[31m Total Items "+ (i--) +"\u001B[0m --------------");
	System.out.println("\u001B[5m\t\t\t\t\t\t\t\t\t\t*******Including All Taxes*******\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t\t No Items Found in Order\u001B[0m");
	}
}




static void home()
{

		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\t\t \u001B[1m"+"Opening Home\n"+"please wait");
	try{
	for(int i=0;i<=2;i++)
	{
		Thread.sleep(1000);
		System.out.print(". ");
	}
		System.out.print("\u001B[0m");
		System.out.print("\u001B[1m"+"\u001B[32m"+"Welcome To Home"+"\u001B[0m");
		System.out.println();
	  }
	catch(Exception e)
	{
	}	if(m==1)
		{
		Logo l=new Logo();
		l.homelogo();
		m++;
		}
		System.out.println();
		System.out.println("\t  1 for Offers"+
			  	   "\t\t  2 for Sale on moblies"+
			 	   "\t\t\t  3 for Every one Min deal"+
				   "\t\t  4 for 30-50% discount"+
				   "\t\t\t  5 for Back\n");

		
	
		int b=sc.nextInt();
		if(1==b)
		h.offers();
		if(2==b)
		h.saleonmobile();
		if(3==b)
		h.onedeal();
		if(4==b)
		{
		//System.out.println("hik");
		h.discount();
		}
		if(5==b)
		Flipkart.display();
	
	

}
static void allca()
{
	if(alll==1)
	{
	
		System.out.print("\t\t\t\t\t\t\t\t\t\t \u001B[1m"+"Opening All Categories\n"+"please wait");
	try{
	for(int i=0;i<=2;i++)
	{
		Thread.sleep(1000);
		System.out.print(". ");
	}
		System.out.print("\u001B[0m");
		System.out.println("\u001B[1m"+"\u001B[32m"+"Welcome To All Categories"+"\u001B[0m");
	  }
	catch(Exception e)
	{
	}
	alll++;
	}
	else
	{
		System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[1m"+"\u001B[32m"+"Welcome To All Categories"+"\u001B[0m");
	}
//************************* All Categories****************************
	System.out.println();
	System.out.println("\u001B[31m\t  1   Mobiles"+
			   "\t\t  2   T.v"+
			   "\t\t\t  3   Grocery"+
			   "\t\t  4   Fashion"+
			   "\t\t  5   Laptop"+
		           "\t\t\t  6 	Back\u001B[0m");
	int b=sc.nextInt();
	if(b==1)
	all.mobile();
	else if(b==2)
	all.tv();
	else if(b==3)
	all.Grocery();
	else if(b==4)
	all.fashion();
	else if(b==5)
	all.laptop();
	
	else if(b==6)
	display();
	



}
static void notification()
 {

		//*************************  Notification ****************************
		Notification.displayNO();
	
}
static void account()
{
	
	/*System.out.println("\t\t\t1 for Account details\n"+
			   "\t\t\t2 for Orders\n"+
			   "\t\t\t3 for Wishlist\n"+
			   "\t\t\t4 for HelpCentre\n");*/
	acc.displaya();
	
}
static void CArt()
{
	
		
		ca.displayca();
	
}
 static void display()					//******************************head section*******************
 {
	if(g==1)
	{
	Logo l=new Logo();
	l.fkdisplay();
	g++;
	}
	
	System.out.print("\u001B[1m\u001B[33m\t\t\t\t\t\t\t\t\t\tchoose a option\n"+"\n"+"\n"+
			   "\t    1  Home"+
			   "\t\t\t  2 All Categories"+
			   "\t\t\t  3 Notifications"+
			   "\t\t\t  4 Account"+
			   "\t\t\t  5 Cart\n\u001B[0m");
	int a=sc.nextInt();
	if(a==1)
	home();
	if(a==2)
	allca();
	if(a==3)
	notification();
	if(a==4)
	account();
	if(a==5)
	CArt();
	
	
	
	
	
	System.out.println("Do you want to move main menu just press 1");
	System.out.println("Do you want exit from filpkat just press 2");
	int m=sc.nextInt();
	if(m==2)
	System.exit(0);
	if(m==1)
	display();

 }
int login(String a,int b)
{
	
	if(a.equals(Bank.getUser()))
	{
		//System.out.println(Bank.getpassword());
		if(b==Bank.getpassword())
		{
			System.out.print("\t\t\t\t\t\t\t\t\u001B[1m"+"Opening \n"+"please wait");
					try{
					for(int p=0;p<=2;p++)
					{
						Thread.sleep(1000);
						System.out.print(". ");
					}
						System.out.print("\u001B[0m");
						//System.out.println();
	  				}
					catch(Exception e)
					{
					}	
			System.out.println("\u001B[32m"+"Signing successful");
			System.out.print("\u001B[0m");
			display();
			return 0;
		}
		else
		{
			return -1;
		}
	}
	else
	{
		return 1;
	}
}
public static void main(String [] args)
 {
	//display();
	System.out.println("\u001B[1m\t\t\t\t\t\t\t\t1. P.G waala");
	System.out.println("\u001B[1m\t\t\t\t\t\t\t\t2. Flipkart");
	int num=sc.nextInt();
	if(num==1)
	{


	}
	if(num==2)
	{
	int temp=0;String s;int s1;
	Flipkart f=new Flipkart();
	Bank.setuser(sc.next());
	Bank.setpassword(sc.nextInt());
	System.out.println("plz set your upi pin");
	Bank.setpass(sc.nextInt());
	System.out.println("1 for SignUP");
	System.out.println("2 for SignIN");
	System.out.println("plz select the option");
	int a=sc.nextInt();int r=0;
	if(a==1)
	{
		System.out.println("\u001B[1m\t\t\t\t\t\t\t\t*** Creating Flipkart Account ***\u001B[0m");
		System.out.println("\t\t\t\t\t\t\t\tplz enter the username and password");
		Bank.setuser(sc.next());
		Bank.setpassword(sc.nextInt());
		System.out.println("\t\t\t\t\t\t\t\t Enter The Username and Password");
		r=f.login(sc.next(),sc.nextInt());
		
	}	
	if(a==2)
	{
		System.out.println("\t\t\t\t\t\t\t\t** Welcome to Logging Page **");
		System.out.println("\t\t\t\t\t\t\t\t plz enter the username and password");
		s=sc.next();
		s1=sc.nextInt();
		r=f.login(s,s1);
	}
		if(r==1)			//******* user name checking************
		{
			int flaguser=0;
			System.out.println("plz Re-enter the username");
			for(int i=3;i>0;i--)
			{
					
			System.out.println("Wrong username plz Re-enter correct Username &&  your Remaining attempts are : "+i);
				if(sc.next().equals(Bank.getUser()))
				{
				   System.out.println("plz enter the password");
		  		   if(sc.nextInt()==Bank.getpassword())
		   		   {		
					System.out.print("\t\t\t\t\t\t\t\t\u001B[1m"+"Opening \n"+"please wait");
					try{
					for(int p=0;p<=2;p++)
					{
						Thread.sleep(1000);
						System.out.print(". ");
					}
						System.out.print("\u001B[0m");
						System.out.println();
	  				}
					catch(Exception e)
					{
					}	

					display();
					flaguser=1;
					break;
				   }
				   else
				   {
					r=-1;
					flaguser=1;
					break;
				   }
				}
			}
			if(flaguser==0)
			{
				System.out.println("Do you want to Reset you user name press 1");
				if(sc.nextInt()==1)
				{
					System.out.println("plz enter the new User name");
					Bank.setuser(sc.next());
					System.out.println("plz enter the username and password");
					r=f.login(sc.next(),sc.nextInt());
				}
				else
				{
					System.out.println("\t\t\t***Thank You***");
				}
			}
					
		}
		if(r==-1)
		{
				int flagpass=0;
				System.out.println("plz Re-enter the Password");
				for(int i=3;i>0;i--)
					{
						System.out.println("plz Re-enter password && your Remaining attempts are : "+i);
						if(sc.nextInt()==Bank.getpassword())
						{
							display();
							flagpass=1;
							break;
						}
					}
					if(flagpass==0)
					{
						System.out.println("Do you want to Reset you password press 1");
						if(sc.nextInt()==1)
						{
							System.out.println("plz enter the new Password");
							Bank.setpass(sc.nextInt());
							System.out.println("plz enter the username and password");
							f.login(sc.next(),sc.nextInt());
						}
						else
						{
							System.out.println("\t\t\t***Thank You***");
						}
					}
		}
       }
		
					
	}		
	
    }
