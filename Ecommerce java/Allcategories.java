
 	
 

import java.util.*;
class Realme 
{
static String acc="";
static float aca=0;
static String allc="";
static Allcategories ac=new Allcategories();
static LinkedHashMap acm=new LinkedHashMap();
static Scanner sc = new Scanner(System.in);
static void total(String name ,int amount,int q)
 {
	acm.put(name,amount);
	String v=name+"X"+q+"---------->"+(amount*q)+"\n";
	acc=acc+v;
	//aca=aca+amount;
	System.out.println("\u001B[31mpress 1  Cart\u001B[0m");
	if(sc.nextInt()==1)
	Flipkart.CArt();
  }
 void rating()
 {
	Random r=new Random();
	int num1=r.nextInt(1000)+350;
	int num2=r.nextInt(800)+350;
	int num3=r.nextInt(500)+350;
	int num4=r.nextInt(300)+150;
	int num5=r.nextInt(50)+50;
	System.out.println("* * * * *  -"+num1);
	System.out.println("* * * *    -"+num2);
	System.out.println("* * *      -"+num3);
	System.out.println("* *        -"+num4);
	System.out.println("*          -"+num5);
 }
 static int rate=0;
  void displayrm() 
  {
	System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t  1 Real me 11Pro\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2 Real me 10\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3 Real me 9\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4 Real me 12pro\u001B[0m\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5 Back" );
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		realme11pro();
		break;
		case 2:
		realme10();
		break;
		case 3:
		realme9();
		break;
		case 4:
		realme12pro();
		case 5:
		Flipkart.all.mobile();
        }
   }	
	 
  void realme11pro()
  {
	System.out.println("Processor   : Snapdragon 870");
	System.out.println("clock Speed : 2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 32 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger     : 80W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 23,333/- only\u001B[0m");
	rating();
	System.out.println("press 1   Buy");System.out.println( "press any number   Back");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();
	aca=aca+(q*23333);
	total("realme11pro",23333,q);
	}
	
		displayrm(); 	

	
  }
  void realme10()
  {
	System.out.println("Processor   : Snapdragon 775");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 44W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 20,000/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*20000;
	total("realme10",20000,q);
	}

		
		displayrm(); 	
	
  }
  void realme9()
  {
	System.out.println("Processor : Snapdragon 675");
	System.out.println("clock Speed :2.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 50 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 18,000/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	
	int q=sc.nextInt();aca=aca+q*18000;
	total("realme9",18000,q);
	}

		
		displayrm(); 	
	
	
  }
  void realme12pro()
  {
	System.out.println("Processor : Snapdragon 888");
	System.out.println("clock Speed :3.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 108 Mp+48 Mp+2 Mp");
	System.out.println("Font Camera : 50 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 25,555/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");

	
	int q=sc.nextInt();aca=aca+q*25555;
	total("realme12pro",25555,q);
	}

		
		displayrm(); 	
	
	
  }
}

class Redmi extends Realme                      
{

  void displayei() 
  {
	System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t  1 Redmi 12Pro\n"+
			   "\u001B[33m\t\t\t\t\t\t\t\t\t\t  2 Redmi 9\n"+
			   "\u001B[33m\t\t\t\t\t\t\t\t\t\t  3 Redmi 8pro\n"+
			   "\u001B[33m\t\t\t\t\t\t\t\t\t\t  4 Redmi 10pro\n"+
			   "\u001B[33m\t\t\t\t\t\t\t\t\t\t  5 Back\n\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		redmi12pro();
		break;
		case 2:
		redmi9();
		break;
		case 3:
		redmi8pro();
		break;
		case 4:
		redmi10pro();
		break;
		case 5:
		Flipkart.all.mobile();
        }
   }	
	 
  void redmi12pro()
  {
	System.out.println("Processor : Snapdragon 870");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 32 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 80W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 25,555/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	
	int q=sc.nextInt();aca=aca+q*25555;
	total("redmi12pro",25555,q);
	}
	
		displayei();
	
	
  }
  void redmi9()
  {
	System.out.println("Processor : Snapdragon 675");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.0 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 44W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 15,555/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	
	int q=sc.nextInt();aca=aca+q*15555;
	total("redmi9",15555,q);
	}
	
		displayei();
	
	
  }
  void redmi8pro()
  {
	System.out.println("Processor : Snapdragon 775");
	System.out.println("clock Speed :2.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 48 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 17,555/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*17555;
	total("redmi8pro",17555,q);
	}
	
		displayei();
	
  }
  void redmi10pro()
  {
	System.out.println("Processor : Snapdragon 888");
	System.out.println("clock Speed :3.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 108 Mp+48 Mp+2 Mp");
	System.out.println("Font Camera : 50 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 19,555/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*19555;
	total("redmi10pro",19555,q);
	}
	
		displayei();
	
  }
}
class Asusrog extends Redmi				//*****Ausurog class******//
{

  void displayas() 
  {
	System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t  1   AsusRog Neo\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   AsusRog Gaming\n"+								 	   "\t\t\t\t\t\t\t\t\t\t  3   AsusRog Maxfire\n"+	
			   "\t\t\t\t\t\t\t\t\t\t  4   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		asusRogNeo();
		break;
		case 2:
		asusRogGaming();
		break;
		case 3:
		asusRogMaxfire();
		break;
		case 4:
		Flipkart.all.mobile();
		
        }
   }	
	 
  void asusRogNeo()
  {
	System.out.println("Processor   : Snapdragon 865");
	System.out.println("clock Speed : 2.7Gh");
	System.out.println("Screen Size : 6.5 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 32 Mp");
	System.out.println("Game Boot   : 3.0v");
	System.out.println("Hype cooling: 2.v");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 80W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 45,555/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*45555;
	total("asusRogNeo",45555,q);
	}
	
		displayas();
	
  }
  void asusRogGaming()
  {
	System.out.println("Processor : Snapdragon 775");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.7 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Game Boot   : 1.0v");
	System.out.println("Hype cooling: 1.v");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 44W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 49,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*49999;
	total("asusRogGaming",49999,q);
	}
	
		displayas();
	
  }
  void asusRogMaxfire()
  {
	System.out.println("Processor : Snapdragon 888+");
	System.out.println("clock Speed :2.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 48 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Game Boot   : 4.0v");
	System.out.println("Hype cooling: 3.v");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 69,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*69999;
	total("asusRogMaxfire",69999,q);
	}
	
		displayas();
	
  }
}
class Googlepix extends Asusrog 
{
//Static Scanner sc=new Scanner(System.in);
  void displaygo() 
  {
	System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t  1   Googlepixal 8\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Googlepixal 8Pro\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		googlepixal8();
		break;
		case 2:
		googlepixal8pro();
		break;
		case 3:
		Flipkart.all.mobile();

        }
   }	
	 
  void googlepixal8()
  {
	System.out.println("Processor : Snapdragon 870");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 32 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 80W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 39,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*39999;
	total("googlepixal8",39999,q);
	}
	
		displaygo();
	
  }
  void googlepixal8pro()
  {
	System.out.println("Processor : Snapdragon 775");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger  : 44W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 59,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*59999;
	total("googlepixal8pro",59999,q);
	}
	
		displaygo();
	
		
  }
}
class Vivo extends  Googlepix
{
//Static Scanner sc=new Scanner(System.in);
  void displayvi() 
  {
	System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t  1   Vivo T2Pro\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Vivo x44 \n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Vivo p20\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   vivo x50\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		vivoT2pro();
		break;
		case 2:
		vivox44();
		break;
		case 3:
		vivop20();
		break;
		case 4:
		vivox50();
		break;
		case 5:
		Flipkart.all.mobile();	
        }
   }	
	 
  void vivoT2pro()
  {
	System.out.println("Processor   : Snapdragon 870");
	System.out.println("clock Speed : 2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 32 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger     : 80W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 22,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*22999;
	total("vivoT2pro",22999,q);
	}
	
		displayvi();
	 
  }
  void vivox44()
  {
	System.out.println("Processor : Snapdragon 775");
	System.out.println("clock Speed :2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger     : 44W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 39,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*39999;
	total("vivox44",39999,q);
	}
	
		displayvi();
	 
  }
  void vivop20()
  {
	System.out.println("Processor   : Snapdragon 675");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 50 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger     : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 19,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*19999;
	total("vivop20",19999,q);
	}
	
		displayvi();
	 
  }
  void vivox50()
  {
	System.out.println("Processor   : Snapdragon 888");
	System.out.println("clock Speed : 3.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 108 Mp+48 Mp+2 Mp");
	System.out.println("Font Camera : 50 Mp");
	System.out.println("Battery     : \u001B[31m5000 mAh\u001B[0m");
	System.out.println("Charger     : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 26,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*26999;
	total("vivox50",26999,q);
	}
	
		displayvi();
	 
  }
}
class Iqoo extends  Vivo
{
//Static Scanner sc=new Scanner(System.in);
  void displayiq() 
  {
	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t  1   iQoo 7pro\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   iQoo z7s\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   iQoo z7\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		iqoo7pro();
		break;
		case 2:
		iqooz7s();
		break;
		case 3:
		iqooz7();
		break;
		case 4:
		Flipkart.all.mobile();
			
		
        }
   }	
	 
  void iqoo7pro()
  {
	System.out.println("Processor   : Snapdragon 870");
	System.out.println("clock Speed : 2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : Amoled screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 32 Mp");
	System.out.println("battery     : 4800 mAh");
	System.out.println("Charger  : 80W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 26,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*26999;
	total("iqoo7pro",26999,q);
	}
	
	  displayiq();
	
	
  }
  void iqooz7s()
  {
	System.out.println("Processor   : Snapdragon 775");
	System.out.println("clock Speed : 2.24Gh");
	System.out.println("Screen Size : 6.2 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 64 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("battery     : 4700 mAh");
	System.out.println("Charger     : 44W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 28,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*28999;
	total("iqooz7s",28999,q);
	}
	
	  displayiq();
	
  }
  void iqooz7()
  {
	System.out.println("Processor   : Snapdragon 675");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen Size : 6.3 inch");
	System.out.println("Screen type : ips screen");
	System.out.println("Rear Camera : 50 Mp");
	System.out.println("Font Camera : 16 Mp");
	System.out.println("battery     : 6000 mAh");
	System.out.println("Charger     : 33W");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 30,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*30999;
	total("iqooz7",30999,q);
	}
	
	  displayiq();
	
  }

}
class Realmetv extends Iqoo		//*************realme tv
{
 void displayratv()
 {
	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t  1   Real me Smart 4k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  2   Real me lite  2k\n"+
		   	   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  3   Real me ultra 8k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  4   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		realmesmart4k();
		break;
		case 2:
		realmelite2k();
		break;
		case 3:
		realmeultra4k();
		break;
		case 4:
		ac.tv();
		
		
        }
 }			
	

 void realmesmart4k()
  {
	System.out.println("Processor   : Med tek 500");
	System.out.println("clock Speed : 1.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 20watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 30,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*30999;
	total("Realme smart",30999,q);
	}
	
	displayratv();
	
  }
  void realmelite2k()
  {
	System.out.println("Processor   : Med tek 900");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 30watts");
	System.out.println("os          : webOs  ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 20,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*20999;
	total("Realme lite",20999,q);
	}
	
	displayratv();
	
  }
  void realmeultra4k()
  {
	System.out.println("Processor   : Med tek 700");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 24watts");
	System.out.println("os         : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 40,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*40999;
	total("Realme ultra",40999,q);
	}
	
	displayratv();
	
  }
}

class Redmitv extends Realmetv		// ************redmi Tv
{
 void displayre()
 {
	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t  1   Redmi 4k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  2   Redmi 2k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  3   Redmi 8k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  4   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		redmi4k();
		break;
		case 2:
		redmi2k();
		break;
		case 3:
		redmi8k();
		break;
		case 4:
		ac.tv();
		
        }
 }			
	

 void redmi4k()
  {
	System.out.println("Processor   : Med tek 500");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 30,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*30999;
	total("Redmi smart",30999,q);
	}
	
	displayre();
	
  }
  void redmi2k()
  {
	System.out.println("Processor   : Med tek 900");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : webOs  ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 20,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*20999;
	total("Redmi 2k",20999,q);
	}
	
	displayre();
	
  }
  void redmi8k()
  {
	System.out.println("Processor   : Med tek 700");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 80,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*80999;
	total("Redmi smart 8k",80999,q);
	}
	
	displayre();
	
  }
}
class VU extends Redmitv
{
 void displayvu()
 {
	System.out.println("\u001B[31m\t\t\t\t\t\t\t\t\t\t  1   vu pixal 4k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  2   vu edge 2k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  3   vu cinema 8k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  4   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		vupixal4k();
		break;
		case 2:
		vuedge2k();
		break;
		case 3:
		vucinema8k();
		break;	
		case 4:
		ac.tv();	
        }
  }		
  void vupixal4k()
  {
	System.out.println("Processor   : Med tek 500");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 30,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*30999;
	total("Vu pixal",30999,q);
	}
	
	displayvu();
	
  }
  void vuedge2k()
  {
	System.out.println("Processor   : Med tek 900");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : webOs  ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 20,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*20999;
	total("Vu edge",20999,q);
	}
	
	displayvu();
	
  }
  void vucinema8k()
  {
	System.out.println("Processor   : Med tek 700");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 50,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*50999;
	total("Vu cinema",50999,q);
	}
	
	displayvu();
	
  }
}
class Sony extends VU
{
  void displayso()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Sony xiperia 4k\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Sony x 2k\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Sony flip 8k\n"+
			   "\u001B[31m\t\t\t\t\t\t\t\t\t\t  4   Back\u001B[0m");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		sonyxiperia4k();
		break;
		case 2:
		sonyx2k();
		break;
		case 3:
		sonyflip8k();
		break;
		case 4:
		ac.tv();
		
        }
  }
  void sonyxiperia4k()
  {
	System.out.println("Processor   : Med tek 500");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 90,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*90999;
	total("sony xiperia",90999,q);
	}
	
		displayso();
	
  }
  void sonyx2k()
  {
	System.out.println("Processor   : Med tek 900");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : webOs  ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 80,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*80999;
	total("sony x2k",80999,q);
	}
	
		displayso();
	
  }
  void sonyflip8k()
  {
	System.out.println("Processor   : Med tek 700");
	System.out.println("clock Speed : 2.04Gh");
	System.out.println("Screen type : ips screen");
	System.out.println("Speaker     : 40watts");
	System.out.println("os          : Android ");
	System.out.println("\u001B[31m\u001B[5mM.R.P = 110,999/- only\u001B[0m");
	rating();
	System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
	if(sc.nextInt()==1)
	{
	System.out.println("plz Enter the how many quantity you want : ");
	int q=sc.nextInt();aca=aca+q*110999;
	total("sony flip8k",110999,q);
	}
	
		displayso();
	
  }
}
class Cookingoils extends Sony
{
 void displayco()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Sun flower Cooking Oils\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Rice band Cooking Oils\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   moon flower Cooking Oils\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Back" );
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		//rate = 800;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 800/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*800;
		total("sun flower oil",800,q);
		}
		
			displayco();
		
		break;
		case 2:
		System.out.println("\u001B[31m\u001B[5mM.R.P = 500/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*500;
		total("rice band oil",500,q);
		}
		
			displayco();
		
		break;

		//rate = 500;
		case 3:
		System.out.println("\u001B[31m\u001B[5mM.R.P = 450/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*450;
		total("moon flower oil",450,q);
		}
			displayco();
		
		break;
		case 4:
		{
			ac.Grocery();
		}

		//rate = 450;
        }
 }
}
class Skincare extends Cookingoils
{
 void displaysk()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   body cream\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   hair shampoo\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   hair oils\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Back\n");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		rate = 450;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 450/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*450;
		total("body cream",450,q);
		}
		
			displaysk();
			
		break;
		case 2:
		rate = 300;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 300/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*300;
		total("hair shampoo",300,q);
		}
		
			displaysk();
		
		break;
		case 3:
		System.out.println("\u001B[31m\u001B[5mM.R.P = 200/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*200;
		total("hair oil",200,q);
		}
		
			displaysk();
		
		break;
		case 4:
		{
			ac.Grocery();
		}
		//rate = 200;
        }
 }
}  		
class Deosperfumes extends Skincare
{
void displayde()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Fogg\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Park Avenue\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Wild Stone\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4  Back");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		rate = 350;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 350/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*350;
		total("Fogg",350,q);
		}
		
			displayde();
			
		break;
		case 2:
		rate = 200;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 200/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*200;
		total("park Avenue",200,q);
		}
		
			displayde();
		
		break;
		case 3:
		System.out.println("\u001B[31m\u001B[5mM.R.P = 200/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*200;
		total("wild stone",200,q);
		}
		
			displayde();
		
		break;
		case 4:
		{
			ac.Grocery();
		}
        }
 }
}  
class Rice extends Deosperfumes
{
 void displayr()
 {	
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Lohitha Rice Band\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   lalitha Rice Band\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Amma Rice Band\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Back\n");
	int a=sc.nextInt();
	
	
	switch(a)
	{
		case 1:
		rate = 1800;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 1800/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz entered how k.Gs you want" );
		int kg=sc.nextInt();
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*1800;
		total("Lohitha Rice",1800,q);
		}
		
			displayr();
		
		break;
		case 2:
		rate = 1200;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 1200/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz entered how k.Gs you want" );
		int kg=sc.nextInt();
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*1200;
		total("Lalitha Rice",1200,q);
		}
		
			displayr();
		
		break;
		case 3:
		rate = 850;
		System.out.println("\u001B[31m\u001B[5mM.R.P = 850/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
		System.out.println("plz entered how k.Gs you want" );
		int kg=sc.nextInt();
		System.out.println("plz Enter the how many quantity you want : ");
		int q=sc.nextInt();aca=aca+q*850;
		total("Amma Rice",850,q);
		}
		
			displayr();
		
		break;
		case 4:
		{
			ac.Grocery();
		}
        }
 }
}  
class Fashion extends Rice
{
 void mshirts()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1. Aloha Shirt     -450\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2. Baseball shirt  -550\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3. Camp shirt      -650\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4. Casual Shirts   -750\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5. Dress shirt     -580\n"+
			   "\t\t\t\t\t\t\t\t\t\t  6. Epaulette shirt -850\n"+
			   "\t\t\t\t\t\t\t\t\t\t  7. Flannel shirt   -950\n"+
			   "\t\t\t\t\t\t\t\t\t\t  8. Granddad shirt  -1000\n"+
			   "\t\t\t\t\t\t\t\t\t\t  9. Golf shirts     -850\n"+
			  "\t\t\t\t\t\t\t\t\t\t  10. Henley shirt    -700\n"+
			  "\t\t\t\t\t\t\t\t\t\t  11. Back");
	System.out.println("plz select the option");
	int ms=sc.nextInt();
	System.out.print("plz Enter your size in inch only  : ");
	int size=sc.nextInt();
		
	switch(ms)
	{
		case 1:
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*450;
			total("mshirt1",450,q);
		break;
		case 2:
			System.out.println("plz Enter the how many quantity you want : ");
			q=sc.nextInt();aca=aca+q*550;
			total("mshirt2",550,q);
		break;
                case 3:
                	System.out.println("plz Enter the how many quantity you want : ");
			q=sc.nextInt();aca=aca+q*650;
			total("mshirt3",650,q);
		break; 
                case 4:
                	System.out.println("plz Enter the how many quantity you want : ");
			q=sc.nextInt();aca=aca+q*750;
			total("mshirt4",750,q);
		break;
 		case 5:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*580;
			total("mshirt5",580,q);
		break;
		case 6:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*850;
			total("mshirt6",850,q);
		break;
		case 7:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*950;
			total("mshirt7",950,q);
		break;
		case 8:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*1000;
			total("mshirt8",1000,q);
		break;
		case 9:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*850;
			total("mshirt9",850,q);
		break;
		case 10:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*700;
			total("mshirt10",700,q);
		break;
		case 11:
			ac.fashion();
             }
		mshirts();
		System.out.println("Shirts");
	

  }
  void gshirts()
  {
	System.out.println("\u001B[1m\u001B[36m\t\t\t\t\t\t\t\t\t\t  1 Ivyleague shirt -450\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2 Jersey shirt    -550\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3 Night Shirt     -650\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4 Western shirt   -750\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5 Polo shirts     -580\n"+
			   "\t\t\t\t\t\t\t\t\t\t  6 Sweatshirt      -850\n"+
			   "\t\t\t\t\t\t\t\t\t\t  7 T-shirt         -950\n"+
			   "\t\t\t\t\t\t\t\t\t\t  8 Tunic shirt     -1000\n"+
			   "\t\t\t\t\t\t\t\t\t\t  9 Tuxedo shirt    -850\n"+
			   "\t\t\t\t\t\t\t\t\t\t  10 Undershirt     -700\u001B[0m"+
			   "\t\t\t\t\t\t\t\t\t\t  11. Back");
	System.out.println("plz select the option");
	int gs=sc.nextInt();
		System.out.print("plz Enter your size in inch only : ");
		int size=sc.nextInt();
		switch(gs)
		{
		case 1:
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*450;
			total("gshirt1",450,q);
		break;
		case 2:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*550;
			total("gshirt2",550,q);
		break;
                case 3:
                	System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*650;
			total("gshirt3",650,q);
		break; 
                case 4:
                	System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*750;
			total("gshirt4",750,q);
		break;
 		case 5:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*580;
			total("gshirt5",580,q);
		break;
		case 6:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*850;
			total("gshirt6",850,q);
		break;
		case 7:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*950;
			total("gshirt7",950,q);
		break;
		case 8:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*1000;
			total("gshirt8",1000,q);
		break;
		case 9:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*850;
			total("gshirt9",850,q);
		break;
		case 10:
			System.out.println("plz Enter the how many quantity you want : ");
			 q=sc.nextInt();aca=aca+q*700;
			total("gshirt10",700,q);
		break;
		case 11:
			ac.fashion();
              }
  }
  void mpants()
  {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1. Jeans           - 200");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  2. Trousers        - 300");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  3. Leggings        - 400");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  4. Cargo pants     - 500");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  5. Chinos          - 600");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  6. Sweatpants      - 700");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  7. Capri pants     - 800");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  8. Corduroy pants  - 900");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  9. Palazzo pants   -1000");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  10. Culottes       -1050");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  11. Back");
        System.out.println("plz select the option");
	int mp=sc.nextInt();
		System.out.print("plz Enter your size in inch only : ");
		int size=sc.nextInt();
		switch(mp)
		{
		case 1:
			System.out.println("plz Enter the how gany quantity you want : ");
			int q=sc.nextInt();aca=aca+q*200;
			total("mpant1",200,q);
		break;
		case 2:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*300;
			total("mpant2",300,q);
		break;
                case 3:
                	System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*400;
			total("mpant3",400,q);
		break; 
                case 4:
                	System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*500;
			total("mpant4",500,q);
		break;
 		case 5:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*600;
			total("mpant5",600,q);
		break;
		case 6:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*700;
			total("mpant6",700,q);
		break;
		case 7:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*800;
			total("mpant7",800,q);
		break;
		case 8:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*900;
			total("mpant8",900,q);
		break;
		case 9:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*1000;
			total("mpant9",1000,q);
		break;
		case 10:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*1050;
			total("mpant10",1050,q);
		break;
		case 11:
			ac.fashion();


		}
 }
 void gpants()
 {	System.out.println("\t\t\t\t\t\t\t\t\t\t  1. Khaki pants     - 200");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  2. waisted pants   - 300");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  3. Flare pants     - 400");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  4. Wide-leg pants  - 500");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  5. Skinny jeans    - 600");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  6. Jogger pants    - 700");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  7. Harem pants     - 800");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  8. Bell-bottoms    - 900");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  9. Bootcut pants   - 1000");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  10. Pajama pants   - 1050");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  11. Back");
	int gp=sc.nextInt();
		System.out.print("plz Enter your size in inch only : ");
		int size=sc.nextInt();
		switch(gp)
		{
		case 1:
			System.out.println("plz Enter the how gany quantity you want : ");
			int q=sc.nextInt();aca=aca+q*200;
			total("gpant1",200,q);
		break;
		case 2:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*300;
			total("gpant2",300,q);
		break;
                case 3:
                	System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*400;
			total("gpant3",400,q);
		break; 
                case 4:
                	System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*500;
			total("gpant4",500,q);
		break;
 		case 5:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*600;
			total("gpant5",600,q);
		break;
		case 6:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*700;
			total("gpant6",700,q);
		break;
		case 7:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*800;
			total("gpant7",800,q);
		break;
		case 8:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*900;
			total("gpant8",900,q);
		break;
		case 9:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*1000;
			total("gpant9",1000,q);
		break;
		case 10:
			System.out.println("plz Enter the how gany quantity you want : ");
			 q=sc.nextInt();aca=aca+q*1050;
			total("gpant10",1050,q);
		break;
		case 11:
			ac.fashion();


		}
 	
 }
	
 void menfashion()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Shirts");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  2   Pants");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  3   Back");
	System.out.println("plz select you option");
	int a=sc.nextInt();
	if(a==1)
	{
	   mshirts();	
	}
	if(a==2)
	{
	    mpants();
	}
	if(a==3)
	{
	    ac.fashion();
	}
	
   }
 void womenfashion()
 {	
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Shirts");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  2   Pants");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  3   Back");
	System.out.println("plz select you option");
	int a=sc.nextInt();
	if(a==1)
	{
		
		gshirts();

	}
	if(a==2)
	{ 
		gpants();	
	}
	if(a==3)
	{
	    ac.fashion();
	}
 }

}
class Footwear extends Fashion
{
 void displayfo()
 {
 	System.out.println("\u001B[33m\t\t\t\t\t\t\t\t\t\t  1   Puma    - 1000");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  2   Adidas  - 1200");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  3   Reebok  - 1500");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  4   Wooland - 1300");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  5   Bata    - 900");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  6   Skechers- 3000");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  7   Clarks  - 1500");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  8   Back\u001B[0m");
	//System.out.println("plz select you option");
	//int a=sc.nextInt();
	System.out.println("plz select the option");
	int fo=sc.nextInt();
	if(fo<=7)
	{
	System.out.print("plz Enter your size in inch only : ");
	int size=sc.nextInt();
	}
		
	switch(fo)
	{
		case 1:
			
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*1000;
			total("puma",1000,q);
		}
		
			displayfo();
		
		
		break;
		case 2:
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*1200;
			total("Adidas",1200,q);
		}
		
			displayfo();
		
		break;
                case 3:
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
                	System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*1500;
			total("Reebok",1500,q);
		}
		
			displayfo();
		
		break; 
                case 4:
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
                	System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*1300;
			total("Woodload",1300,q);
		}
		
			displayfo();
		
		break;
 		case 5:
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			 int q=sc.nextInt();aca=aca+q*900;
			total("Bata",900,q);
		}
		
			displayfo();
		
		break;
		case 6:
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*3000;
			total("Skechers",3000,q);
		}
		
			displayfo();
		
		break;
		case 7:
			System.out.println("press 1 continue");
		System.out.println("press any number to Back");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*1500;
			total("clarks",1500,q);
		}
		
			displayfo();
		
		break;
		case 8:
			ac.fashion();

             }
	
 }
}
class Kids extends Footwear
{
	void displayk()
	{
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   boy");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  2   girl");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  3   Back");
	System.out.println("plz select you option");
	int a=sc.nextInt();
	if(a==1)
	{
		System.out.println("\t\t\t\t\t\t\t\t\t\t  1   shirts");
		System.out.println("\t\t\t\t\t\t\t\t\t\t  2   pants");
		System.out.println("\t\t\t\t\t\t\t\t\t\t  3   Back");
		int b=sc.nextInt();
		if(b==1)
	   	mshirts();
		if(b==2)	
	    	mpants();
		if(b==3)
		ac.fashion();
		
	}
	if(a==2)
	{
		System.out.println("\t\t\t\t\t\t\t\t\t\t  1   shirts");
		System.out.println("\t\t\t\t\t\t\t\t\t\t  2   pants");
		System.out.println("\t\t\t\t\t\t\t\t\t\t  3   Back");
		int p=sc.nextInt();
		if(p==1)
	   	gshirts();
		if(p==2)	
	    	gpants();
		if(p==3)
		ac.fashion();	
	}
	if(a==3)
	displayk();	
      }
}
class Laptop extends Kids
{
 void displayla()
 {
	System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t   *****Welcome To Laptop*****\u001B[0m"); 
	System.out.println(); 
 	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   HP\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Dell\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Lenovo\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Asus\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5   Back");
	System.out.println("plz select you option ");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		hp();
		break;
		case 2:
                Dell();
		break;
                case 3:
                lenovo();
		break;
                case 4:
                Asus();
		break;
		case 5:
		Flipkart.display();

        }
 }
 void hp()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   HP Pavilion\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   HP vitus\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Back");
	System.out.println("plz select you option ");
	int a=sc.nextInt();
	if(a==1)
	{
		System.out.println("Processor   : i5 12th gen");
		System.out.println("clock Speed : 2.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 5watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 90,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*90999;
			total("hp pavilion",90999,q);
		}
		
			hp();
		
	}
	if(a==2)
	{
		System.out.println("Processor   : i7 12th gen");
		System.out.println("clock Speed : 4.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 10watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 1,50,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*150999;
			total("hp vitus",150999,q);
		}
		
			hp();
		
	}
	if(a==3)
	{
		displayla();
	}
 }
 void Dell()
 {
        System.out.println("\t\t\t\t\t\t\t\t\t\t  1   DELL Inspiron\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   DELL Vostro\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Back");
	System.out.println("plz select you option ");
	int a=sc.nextInt();
	if(a==1)
	{
		System.out.println("Processor   : i7 12th gen");
		System.out.println("clock Speed : 4.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 5watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 90,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*90999;
			total("hp inspiron",90999,q);
		}
		
			Dell();
		
	}
	if(a==2)
	{
		System.out.println("Processor   : i5 12th gen");
		System.out.println("clock Speed : 3.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 10watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 50,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*50999;
			total("dell vostro",50999,q);
		}
		
			Dell();
		
 	 } 
	if(a==3)
	{
		displayla();
	}
  }
 void lenovo()
 {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Lenovo Thinkpad\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Lenovo Legion\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Back");
	System.out.println("plz select you option ");
	int a=sc.nextInt();
	if(a==1)
	{
		System.out.println("Processor   : i5 12th gen");
		System.out.println("clock Speed : 2.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 5watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 40,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*40999;
			total("Lenovo Thinkpad",40999,q);
		}
		
			lenovo();
		
	}
	if(a==2)
	{
		System.out.println("Processor   : i7 12th gen");
		System.out.println("clock Speed : 3.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 10watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 65,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*65999;
			total("Lenovo Legion",65999,q);
		}
		
			lenovo();
		
	  }
	 if(a==3)
	{
		displayla();
	}
 }
  void Asus()
  {
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Asus TUF Gaming\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Asus Zenbook\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Asus RoG\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Asus Vivobook\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5   Back");
	System.out.println("plz select you option ");
	int a=sc.nextInt();
	if(a==1)
	{
		System.out.println("Processor   : i5 12th gen");
		System.out.println("clock Speed : 2.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 5watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 60,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*60999;
			total("Asus TuF",60999,q);
		}
		
			Asus();
		
   	}
	if(a==2)
	{
		System.out.println("Processor   : i9 12th gen");
		System.out.println("clock Speed : 3.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 10watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 65,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*65999;
			total("Asus Zenbook",65999,q);
		}
		
			Asus();
		
     	}
	if(a==3)
	{
		System.out.println("Processor   : i7 12th gen");
		System.out.println("clock Speed : 2.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 5watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 70,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*70999;
			total("Asus RoG",70999,q);
		}
		
			Asus();
		
	 }
	if(a==4)
	{
		System.out.println("Processor   : i5 12th gen");
		System.out.println("clock Speed : 3.04Gh");
		System.out.println("Screen type : Amoled screen");
		System.out.println("Speaker     : 10watts");
		System.out.println("os          : Windows 11");
		System.out.println("\u001B[31m\u001B[5mM.R.P = 65,999/- only\u001B[0m");
		rating();
		System.out.println("\u001B[32m\u001B[1mpress 1    Buy");System.out.println( "press any number   Back\u001B[0m");
		if(sc.nextInt()==1)
		{
			System.out.println("plz Enter the how many quantity you want : ");
			int q=sc.nextInt();aca=aca+q*65999;
			total("Asus Vivobook",65999,q);
		}
		
			Asus();
		
         }
	 if(a==5)
	{
		displayla();
	}
  }
}


class  Allcategories extends Laptop
{
 //static Scanner sc=new Scanner(System.in);

 

 void mobile()
 {
	System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t   *****Welcome To Mobiles*****\u001B[0m"); 
	System.out.println(); 
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   RealMe");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  2   RedMi");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  3   AsusRog");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  4   GooglePix");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  5   Vivo");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  6   iQoo");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  7   Back");
	System.out.println("plz select you option");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		displayrm();
		break;
		case 2:
                displayei();
		break;
                case 3:
                displayas();
		break; 
                case 4:
                displaygo();
		break;
 		case 5:
		displayvi();
		break;
		case 6:
		displayiq();
		break;
		case 7:
		Flipkart.allca();
        }
	
  }
  void tv()
  {
	System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t   *****Welcome To T.Vs*****\u001B[0m"); 
	System.out.println(); 
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   RealMe");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  2   RedMe");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  3   VU");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  4   Sony");
	System.out.println("\t\t\t\t\t\t\t\t\t\t  5   Back");
	System.out.println("plz entred the how inch you want");
	int inch=sc.nextInt();
	System.out.println("plz select you option");
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		displayratv();
		break;
		case 2:
                displayre();
		break;
                case 3:
                displayvu();
		break;
                case 4:
                displayso();
		break;
		case 5:
		Flipkart.allca();
		

        }
   }
   void Grocery()
   {
	System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t   *****Welcome To Grocery*****\u001B[0m"); 
	System.out.println(); 
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Cooking Oils\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Skincare\n"+
			   "\t\t\t\t\t\t\t\t\t\t  3   Deos&perfumes\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   rice\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5   Back" );
	System.out.println("plz select you option");
	int a=sc.nextInt();
	//System.out.println("plz entred the how Quantity you want");
	//int q=sc.nextInt();
	switch(a)
	{
		case 1:
		displayco();
		break;
		case 2:
                displaysk();
		break;
                case 3:
                displayde();
		break;
                case 4:
                displayr();
		break;
		case 5:
		Flipkart.allca();
		

        }
  }
  void fashion()
   {
	System.out.println("\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t   *****Welcome To Fashion*****\u001B[0m"); 
	System.out.println(); 
	System.out.println("\t\t\t\t\t\t\t\t\t\t  1   Men's Clothing\n"+
			   "\t\t\t\t\t\t\t\t\t\t  2   Women's Clothing\n "+
			   "\t\t\t\t\t\t\t\t\t\t  3   Casual and Sports Footwear\n"+
			   "\t\t\t\t\t\t\t\t\t\t  4   Kids Fashion\n"+
			   "\t\t\t\t\t\t\t\t\t\t  5   Back" );
	System.out.println("plz select you option");
	int a=sc.nextInt();
	//System.out.println("plz entred the how Quantity you want");
	//int q=sc.nextInt();
	switch(a)
	{
		case 1:
		menfashion();
		break;
		case 2:
                womenfashion();
		break;
                case 3:
                displayfo();
		break;
                case 4:
                displayk();
		break;
		case 5:
		Flipkart.allca();
		
		

        }
    }
  void laptop()
  {
	displayla();	
  }


}

































