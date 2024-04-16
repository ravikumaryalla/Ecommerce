class Logo
{

 void fkdisplay()
{
String s="\u001B[5m"+
"\u001B[34m\t\t\t\t\t\t\t/########  /## /##           /##                             /##\n"+    
"\t\t\t\t\t\t\t| ##_____/| ##|__/          | ##                            | ##\n"+    
"\t\t\t\t\t\t\t| ##      | ## /##  /###### | ##   /##  /######   /######  /######\n"+  
"\t\t\t\t\t\t\t| #####   | ##| ## /##__  ##| ##  /##/ |____  ## /##__  ##|_  ##_/\n"+  
"\t\t\t\t\t\t\t| ##__/   | ##| ##| ##  | ##| ######/   /#######| ##  |__/  | ##\n"+    
"\t\t\t\t\t\t\t| ##      | ##| ##| ##  | ##| ##_  ##  /##__  ##| ##        | ## /##\n"+
"\t\t\t\t\t\t\t| ##      | ##| ##| #######/| ## |  ##|  #######| ##        |  ####/\n"+
"\t\t\t\t\t\t\t|__/      |__/|__/| ##____/ |__/  |__/ |_______/|__/         |___/\n"+  
"\t\t\t\t\t\t\t                  | ##\n"+                                              
"\t\t\t\t\t\t\t                  | ##\n"+                                             
"\t\t\t\t\t\t\t                  |__/"+"\u001B[0m";
System.out.println(s);
}
public static void main(String [] args)
{
 Logo l=new Logo();
 l.fkdisplay();
}
void homelogo()
{

	String s=    
"\u001B[31m\u001B[5m\t\t\t\t\t\t\t\t\t| ##   ##    ###    ##     ## ######\n"+    
"\t\t\t\t\t\t\t\t\t| ##   ##  ##   ##  ##  #  ## ##\n"+  
"\t\t\t\t\t\t\t\t\t| #######  ##   ##  ##  #  ## ######\n"+  
"\t\t\t\t\t\t\t\t\t| ##   ##  ##   ##  ##     ## ##\n"+    
"\t\t\t\t\t\t\t\t\t| ##   ##    ###    ##     ## ######\u001B[0m";
System.out.println(s);

}

}
