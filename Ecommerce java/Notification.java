class Notification 
{
static Home h=new Home();
 static void displayNO()
 {
	System.out.println();
	System.out.print("\t\t\t\t\t\t\t\t\t\t\u001B[1m"+"Opening Notification\n"+"please wait");
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
	System.out.println("\u001B[32m"+"Welcome To Notification & Messages"+"\u001B[0m");	
        String notifications = "\t\t\t\t\t\t\t\t\u001B[5m"+"\u001B[31m"+"1. Great news! Your favorite product is now back in stock. Grab it before it's gone!\n" +
                               "\t\t\t\t\t\t\t\t\u001B[37m"+"2. Exclusive Deal Alert: Get up to 50% off on electronics today!\n" +
                               "\t\t\t\t\t\t\t\t\u001B[31m"+"3. Hurry! The Big Fashion Sale is now live. Shop your style at amazing prices.\n" + 
                               "\t\t\t\t\t\t\t\t\u001B[37m"+"4. Flash Sale: Only One hour deal.\n" +
                               "\t\t\t\t\t\t\t\t\u001B[31m"+"5. Last chance to grab the deal of the day. Don't miss out!\n" + 
                               "\t\t\t\t\t\t\t\t\u001B[37m"+"6. Exclusive offer for you: Extra 10% off on your next purchase.\n"+
			       "\t\t\t\t\t\t\t\t\u001B[31m7. Back\u001B[0m";
  
	String nnotifications ="\t\t\t\t\t\t\t\t\u001B[5m"+"\u001B[31m"+"* Your wishlist item is on sale. Shop now and save big!\n" +
			       "\t\t\t\t\t\t\t\t\u001B[37m"+"* New arrivals in home decor just for you. Explore the latest trends.\n" +
			       "\t\t\t\t\t\t\t\t\u001B[31m"+"* Your order is on its way. Track your package here.\n" +
			       "\t\t\t\t\t\t\t\t\u001B[37m"+"* Your product review is live. Share your thoughts with the community.\n" +
			       "\t\t\t\t\t\t\t\t\u001B[31m"+"* Your favorite author's new book is now available for pre-order.\n" +
                               "\t\t\t\t\t\t\t\t\u001B[37m"+"* Your Flipkart Plus membership is expiring soon. \n" +
			       "\t\t\t\t\t\t\t\t\u001B[31m"+"* Congratulations! You've earned 1000 Flipkart SuperCoins.\n" +
			       "\t\t\t\t\t\t\t\t\u001B[37m"+"* Join our Flipkart Affiliate Program and start earning today."+"\u001B[5m"+"\u001B[0m";
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t\t\t\tFlipkart Messages");
	System.out.println();
	String[] notificationArray1 = nnotifications.split("\n");
        for (String notification1 : notificationArray1)
	 {
	    try
	    {
	    Thread.sleep(500);
            System.out.println(notification1);
	    }
	    catch(Exception e)
				{
				}
   	    
	 }
	System.out.println();
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t\t\t\tFlipkart notifications");
	System.out.println();
        String[] notificationArray = notifications.split("\n");
        for (String notification : notificationArray)
	 {
	    try
	    {
	    Thread.sleep(1000);
            System.out.println(notification);
	    }
	    catch(Exception e)
				{
				}

	 }
	System.out.println("plz selet the one");
	int a=Home.sc.nextInt();
	if(a==1)
	Flipkart.all.asusRogNeo();
	else if(a==2)
	h.saleonmobile();
	else if(a==3)
	h.offers();
	else if(a==4)
	h.onedeal();
	else if(a==5)
	h.discount();
	else if(a==6)
	h.offers();
	else if(a==7)
	Flipkart.display();
        }
    }

