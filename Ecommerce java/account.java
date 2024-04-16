import java.util.*;
class Account
{
 static String o="";
        String name;
	String email="xxx@gmail.com";
	String number;
	static String address;
 static LinkedHashMap alhm=new LinkedHashMap();
 int ac=1;
 void displaya()
 {
System.out.println();
if(ac==1)
{
System.out.print("\t\t\t\t\t\t\t\t\t\t\u001B[1m"+"Opening Account\n"+"please wait");
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
	System.out.println("\u001B[32m"+"Welcome To Account"+"\u001B[0m");
	ac++;
 }
 else
	{
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t\t\t\tWelcome To Account"+"\u001B[0m");
	//System.out.println("\u001B[32m"+"Welcome To Account"+"\u001B[0m");
	}	
   System.out.print("\u001B[5m\u001B[33m\t1 Account details"+
                      "\t\t\t2  Orders"+
                      "\t\t\t3  HelpCentre & order Related Issues"+
		      "\t\t\t4  Back\n\u001B[0m");
   System.out.println();
   System.out.println("plz select the option"); 
   int a=Home.sc.nextInt();
   if(a==1)
   accountdetails();
   else if(a==2)
   orders();
   else if(a==3)	
   helpcentre();
   else if(a==4)
   Flipkart.display();
 }

 void accountdetails()
 {
	
	
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t\t\tAccount Holder Name: "+name+"\n"+
			   "\t\t\t\t\t\t\t\t\tE-mail Id: "+email+"\n"+
			   "\t\t\t\t\t\t\t\t\tMobile Number: "+number+"\n"+
			   "\t\t\t\t\t\t\t\t\tAddress: "+address);
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t\t\t\t1 change your Name\n"+
			   "\t\t\t\t\t\t\t\t\t\t2 change your E-mail Id\n"+	
			   "\t\t\t\t\t\t\t\t\t\t3 change Numbers\n"+
			   "\t\t\t\t\t\t\t\t\t\t4 change Address\n"+
			   "\t\t\t\t\t\t\t\t\t\t5 All\n"+
			   "\t\t\t\t\t\t\t\t\t\t6 Back\n"+
			   "\t\t\t\t\t\t\t\t\t\t7 for Home");
	
	int a=Home.sc.nextInt();
	if(a==1)
	name=Home.sc.next();
	else if(a==2)
	number=Home.sc.next();
	else if(a==3)
	email=Home.sc.next();
	else if(a==4)
	address=Home.sc.next();
	else if(a==5)
	{
	name=Home.sc.next();
	number=Home.sc.next();
	email=Home.sc.next();
	address=Home.sc.next();
	}
	else if(a==6)
	{
		displaya();
	}
	else if(a==7)
	{
		Flipkart.display();
	}
	
	
  }
 
  void orders()
  {
	
  	Flipkart f=new Flipkart();
	//f.bill();
	/*alhm.putAll(Home.lm);
	alhm.putAll(Realme.acm);
	System.out.println(alhm);*/
	if(o.length()>0)
	{
		int i=0;
		System.out.println("\t\t\t\t\t\t\t\t\t--------------\u001B[5m Your Orders\u001B[0m-------------------");
		System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\tS.No       Item                Amount  \u001B[0m"); 
		System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------------");
		String notificationArray[] = o.split("\n");
        	for (String notification : notificationArray)
		 {
        		    System.out.println("\t\t\t\t\t\t\t\t\t"+ (++i)+"          "+notification);
		 }
		System.out.println("\t\t\t\t\t\t\t\t\t--------------\u001B[31m Total Items "+ (i--) +"\u001B[0m --------------");
		//System.out.println("\u001B[5m\t\t\t\t\t\t\t\t\t\t*******Including All Taxes*******\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t\t No Items Found in Order\u001B[0m");
		displaya();
	}
        










  }
  void 	wishlist()
  {


  }
  void helpcentre()
  {
	System.out.println("\u001B[32m\u001B[5m\t\t\t\t\t\t\t\t\t\tPress 1 customercare number\n"+
			   "\t\t\t\t\t\t\t\t\t\tpress 2 E-mail Id \n"+
			   "\t\t\t\t\t\t\t\t\t\tpress 3 Back  \u001B[0m");
	int a=Home.sc.nextInt();
	if(a==1)
	System.out.println("\u001B[5m\u001B[31m\t\t\t\t\t\t\t\t\t\t1800-1234-4321\u001B[0m");
	if(a==2)
	System.out.println("\u001B[5m\u001B[31m\t\t\t\t\t\t\t\t\t\tFlipkartcustomercare@gmail.com\u001B[0m");
	if(a==3)
	displaya();
   }


}	
	 			   
   
	