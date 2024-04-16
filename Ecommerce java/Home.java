import java.util.*;
class Home
{

static Scanner sc=new Scanner(System.in);
static int amount=0;

static LinkedHashMap lm=new LinkedHashMap();
/*void Continue(String s)
{
	if(s.equalsIgnoreCase("Yes"))
	{
	System.out.println("choose a option\n"+
			   " 1 for Home\n"+
			   " 2 for All Categories\n"+
			   " 3 for Notifications\n"+
			   " 4 for Account\n"+
			   " 5 for Cart\n");
			   " 6 for Back\n");
		Flipkart.display();
	}
}*/

 void offers()
 {

	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t Hot Sale");
	System.out.println();
	System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t 1 iphone 15 at 49,999/- Only \n"+
			   "\t\t\t\t\t\t\t\t\t 2 One plus 11R at 38,999/- Only \n"+
			   "\t\t\t\t\t\t\t\t\t 3 250 Liters Fridge at 23,333/-\n"+
			   "\t\t\t\t\t\t\t\t\t 4 Lenovo Yoga at 43,999/-\n"+
		           "\t\t\t\t\t\t\t\t\t 5 Back\u001B[0m");
	int [] offers={49999,38999,23333,43999};
	//System.out.println(offers[1]);
	int a=sc.nextInt();
	if(a==1)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();	
	amount=amount+offers[0]*q;
	lm.put("iphone15","49999");
	Realme.total("iphone",49999,q);
	}
		
			offers();	
		
	}
	if(a==2)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("one plus 11R","38999");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+offers[1]*q;
	Realme.total("one plus 11R",38999,q);
	}
			offers();	
		
	}
	if(a==3)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("Fridge","23333");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+offers[2]*q;
	Realme.total("Fridge",23333,q);
	}
		
			offers();	
		
	}
	if(a==4)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("lenovo yoga","43999");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+offers[3]*q;
	Realme.total("lenovo yoga",43999,q);
	}
		
			offers();	
		
	}
	if(a==5)
	{
		Flipkart.home();
	}
	/*System.out.println("Do you want to continue Shopping : press Yes");
	if((sc.next()).equalsIgnoreCase("Yes"))
	{
		Continue("Yes");
	}*/

 }
 void saleonmobile()
 {
	System.out.println("\u001B[36m\t\t\t\t\t\t\t\t\t\t 10%off on Mobiles");
	System.out.println();
	System.out.println("\u001B[5m\t\t\t\t\t\t\t\t\t1 iphone 13 at 39,999/- Only \n"+
			   "\t\t\t\t\t\t\t\t\t2  One plus 10R at 28,999/- Only \n"+
			   "\t\t\t\t\t\t\t\t\t3  Nothing 1 at 23,333/-only \n"+
			   "\t\t\t\t\t\t\t\t\t4  Nothing 2 at 33,333/-only \n"+
		           "\t\t\t\t\t\t\t\t\t5  iQoo z7  at 23,333/-only \n"+ 
			   "\t\t\t\t\t\t\t\t\t6  Vivo T2 pro at 22,222/-\n"+
			   "\t\t\t\t\t\t\t\t\t7  iphone 12 at 30,000/-\n"+
			   "\t\t\t\t\t\t\t\t\t8  Red mi 11 pro at 23,333/-\n"+
			   "\t\t\t\t\t\t\t\t\t9  poco f3 pro at 23,333/-\n"+
			   "\t\t\t\t\t\t\t\t\t10 Real me 11 pro+ at 33,999/-only \n"+
			   "\t\t\t\t\t\t\t\t\t11 Back\u001B[0m");
	int [] saleon={39999,28999,23333,33999,23333,22222,30000,23333,23333,33999};
	//System.out.println(offers[1]);
	int a=sc.nextInt();
	if(a==1)
	{
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			lm.put("iphone 13","39999");
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();
			amount=amount+saleon[0]*q;
			Realme.total("iphone 13",39999,q);
		}
		
			saleonmobile();	
		
	}
	
	if(a==2)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("one plus 10R","28999");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+saleon[1]*q;
	Realme.total("one plus 10R",28999,q);
	}
	
		saleonmobile();	
		
	}
	
	if(a==3)
	{
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			lm.put("Nothing 1","23333");
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();
			amount=amount+saleon[2]*q;
			Realme.total("Nothing ",23333,q);
		}
		
			saleonmobile();	
		
	
	}
	if(a==4)
	{
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			lm.put("Nothing 2","33333");
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();
			amount=amount+saleon[3]*q;
			Realme.total("Nothing 2",33333,q);
		}
		
			saleonmobile();	
		
	
	}
	if(a==5)
	{
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			lm.put("iQoo z7","23333");
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();
			amount=amount+saleon[4]*q;
			Realme.total("iQoo Z7",23333,q);
		}
		
			saleonmobile();	
		
	
	}
	if(a==6)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("Vivo T2 pro","22222");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+saleon[5]*q;
	Realme.total("Vivo T2 pro",22222,q);
	}
	
		saleonmobile();	
		
	}
	
	if(a==7)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("iphone 12","30,000");
	//lm.put("Nothing 1","23333");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+saleon[6]*q;
	Realme.total("iphone 12",30000,q);
}
	
		saleonmobile();	
		
	
	}
	if(a==8)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("Red mi 11 pro","23333");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+saleon[7]*q;
	Realme.total("Red mi 11 pro",23333,q);
	}
	
		saleonmobile();	
		
	}
	
	if(a==9)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("poco f3 pro ","23333");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+saleon[8]*q;
	Realme.total("poco f3 pro",23333,q);
	}
	
		saleonmobile();	
		
	}
	
	if(a==10)
	{
	System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
	lm.put("Real me 11 pro+","33999");
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	amount=amount+saleon[9]*q;
	Realme.total("Real me 11 pro+",33999,q);
	}
	
		saleonmobile();	
		
	}
	
	if(a==11)
	{
		Flipkart.home();
	}


	}
 void onedeal()
 {
	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t One MIn Deal\u001B[0m");
	System.out.println();
	System.out.println("\u001B[5m\t\t\t\t\t\t\t\t\t1 Sony Dj head set at 19,999/- Only \n"+
			   "\t\t\t\t\t\t\t\t\t2 Gitara  at 8,999/- Only \n"+
			   "\t\t\t\t\t\t\t\t\t3 Mixer 750W at 3,333/-\n"+
			   "\t\t\t\t\t\t\t\t\t4 Gym kit at 9,999/-only\n"+
			   "\t\t\t\t\t\t\t\t\t5 Back \u001B[0m");
	int [] onedeal ={19999,8999,3333,9999};
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Sony Dj head set","19999");
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();
		amount=amount+onedeal[0]*q;
		Realme.total("sony dj headset",19999,q);
		break;
		}
		
			onedeal();
		
		case 2:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Gitara","8999");
		System.out.println("plz Enter the how many quantity you want : ");
		 int q=sc.nextInt();
		amount=amount+onedeal[1]*q;
		Realme.total("Gitara",8999,q);
		}
		
			onedeal();
		
		break;
		case 3:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Mixer","3333");
		System.out.println("plz Enter the how many quantity you want : ");
		 int q=sc.nextInt();
		amount=amount+onedeal[2]*q;
		Realme.total("Mixer",3333,q);
		}
		
			onedeal();
		
		break;
		case 4:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Gym kit","9999");
		System.out.println("plz Enter the how many quantity you want : ");
		int  q=sc.nextInt();
		amount=amount+onedeal[3]*q;
		Realme.total("Gym kit",9999,q);
		}
		
			onedeal();
		
		break;	
		case 5:
		Flipkart.home();
	}
		

  }
 void discount()
 {	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\tFlat 30% discount on these Item");
	System.out.println();
	System.out.println("\u001B[0m\u001B[5m\t\t\t\t\t\t\t\t\t1 Sony Dj head set at 19,999/- 30% off 13999 Only \n"+
			   "\t\t\t\t\t\t\t\t\t2  Gitara  at 8,999/- 30% off  8999/-Only \n"+
			   "\t\t\t\t\t\t\t\t\t3  Mixer 750W at 3,333/-\n"+
			   "\t\t\t\t\t\t\t\t\t4  Gym kit at 9,999/-only\n"+
			   "\t\t\t\t\t\t\t\t\t5 Back \u001B[0m");
	int [] onedeal ={13999,8999,3333,9999};
	System.out.println("plz select the option");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Sony Dj head set","13999");
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();
		amount=amount+onedeal[0]*q;
		Realme.total("sony dj headset",13999,q);
		}
		
			discount();
		
		break;
		case 2:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Gitara","6299");
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();
		amount=amount+onedeal[1]*q;
		Realme.total("Gitara",6299,q);
		}
		
			discount();
		
		break;
		case 3:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Mixer","2333");
		System.out.println("plz Enter the how many quantity you want : ");
		 int q=sc.nextInt();
		amount=amount+onedeal[2]*q;
		Realme.total("Mixer",3333,q);
		}
		
			discount();
		
		break;
		case 4:
		System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
		lm.put("Gym kit","6999");
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();
		amount=amount+onedeal[3]*q;
		Realme.total("Gym kit",6999,q);
		}
		discount();	
		
		break;
		case 5:
		Flipkart.home();
	}
	
	}
 static float Amount()
 {
	return amount;
}
}