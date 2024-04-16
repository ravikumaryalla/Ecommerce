import java.util.Scanner;
class Cart
{
Scanner sc=new Scanner(System.in);
Flipkart f=new Flipkart();
int ca=1;
 void displayca()
 {
	if(ca==1)
	{
	System.out.print("\t\t\t\t\t\t\t\t\t\t\u001B[1m"+"Opening Cart\n"+"please wait");
	try{
	for(int i=0;i<=2;i++)
	{
		Thread.sleep(1000);
		System.out.print(". ");
	}
		System.out.print("\u001B[0m");
		
	  }
	catch(Exception e)
	{
	}
	System.out.println("\u001B[32m"+"Welcome To Cart"+"\u001B[0m");
	ca++;
	}
	else
	{
		System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[32m"+"Welcome To Cart"+"\u001B[0m");
	}
   System.out.println("\t\t\t\t\t\t\t\t\t\t1 for Items\n"+
		      "\t\t\t\t\t\t\t\t\t\t2 for Payment\n"+
                      "\t\t\t\t\t\t\t\t\t\t3 for Back\n");
   System.out.println("plz select the option");
   int a=Home.sc.nextInt();
   if(a==1)
   {
   	 //System.out.println(Realme.acm);
	 f.bill();
	System.out.println("press 1 for Payment");
	System.out.println("press any number for back");
	if(Home.sc.nextInt()==1)
	{
		payment(); 
	}
	
	displayca();

   }
   if(a==2)
   {
	payment();
	
   }
   if(a==3)
	Flipkart.display(); 
   	
 }
 String A;
 String B;
 String C;
 String D;
 void address()
 {
 System.out.println("plz Enter your City Pincode : ");
 A=sc.next();
 System.out.println("plz Enter your Name : ");
 B=sc.next();
 System.out.println("plz Enter your Number : ");
 C=sc.next();
 System.out.println("plz Enter your LandMark : ");
 D=sc.next();
 Bank.setuser(B);
 }

void Paytime(String s)
{
	try
	{
		System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t ****Just Hold Some Time****");
		System.out.print("\u001B[31m\t\t\t\t\t\t\t\t\t\t  Redirecting");
		for(int i=1;i<=2;i++)
		{
			Thread.sleep(1000);
			System.out.print(". \u001B[0m");
		}	
		System.out.print("\u001B[32m"+s+"\u001B[0m");
	}
	catch(Exception e)
	{
	}
}
 void payment()
 {


	//amount=Home.Amount()+Realme.aca;
	//Flipkart f=new Flipkart();
	Phonepay pp=new Phonepay();
	Flipkart.amount=Home.amount+Realme.aca;
	System.out.println("Total Amount : \u001B[33m\u001B[5m"+Flipkart.amount+"\u001B[0m");
			if(Flipkart.amount>0)
			{
				System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t10% off on credit or debit card\u001B[0m");
				System.out.println("\t\t\t\t\t\t\t\t\t\tDo you want to pay press 1");
				if(sc.nextInt()==1)
				{
				try
				{	
					System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\tPress 1 for G-pay");
					Thread.sleep(500);
					System.out.println("\t\t\t\t\t\t\t\t\t\tPress 2 for Phonepay");
					Thread.sleep(500);
					System.out.println("\t\t\t\t\t\t\t\t\t\tpress 3 for payTm");
					Thread.sleep(500);
					System.out.println("\t\t\t\t\t\t\t\t\t\tpress 4 for Credit Card");
					Thread.sleep(500);
					System.out.println("\t\t\t\t\t\t\t\t\t\tpress 5 for debit card");
					Thread.sleep(500);
					System.out.println("\t\t\t\t\t\t\t\t\t\tpress 6 for Back\u001B[0m");
					Thread.sleep(500);
					System.out.println("\t\t\t\t\t\t\t\t\t\tplz Select your option");
				}
				catch(Exception e)
				{
				}
				}
				int pay=sc.nextInt();
				if(pay==1)
				{
					Paytime("G-pay");
					pp.payment();
				}
				else if(pay==2)
				{
					Paytime("Phonepay");
					pp.payment();
				}
				else if(pay==3)
				{
					Paytime("Paytm");
					pp.payment();
				}
				else if(pay==4 || pay==5)
				{
					if(pay==4)
						Paytime("Creditcard");
					if(pay==5)
						Paytime("Debitcard");
					float o=(Flipkart.amount/100)*10;
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\t\tpayable amount : "+(Flipkart.amount-o));
					System.out.println("\u001B[32m\t\t\t\t\t\t\t\t\t\t1 continue\u001B[0m"); 
					System.out.println("\u001B[32m\t\t\t\t\t\t\t\t\t\tpress any number Back\u001B[0m");
					if(sc.nextInt()==1)
					{
					System.out.println("\t\t\t\t\t\t\t\t\t\tplz enter the card number and date and cvv number");
					pp.tocredit(sc.nextLong(),sc.next(),sc.nextInt());
					//tocredit(long num,String a,int cvv)
					}
					else
					{
						payment();
					}	
				}
				else if(pay==6)
				{
					displayca();
				}
			}
		     
		     else
		     {
			 	System.out.println("\u001B[31m\u001B[5m\u001B[1m\t\t\t\t\t\t\t\t\t\t No Items Are Added\u001B[0m");
	             }
 }
 
}
   
   