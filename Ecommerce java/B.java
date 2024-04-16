import java.util.*; 
class B {
	static Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {
      while(1==1)
	{
	 System.out.println("do you want to contiune press 1");
	 int i=sc.nextInt();
		if(i==1)
		{
			System.out.print("plz entered the how many elements you wants : ");
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			System.out.println(Arrays.toString(a));
			a=null;
	
				
		}
		else
		{
		break;
		}
		//System.out.println("do you want to continue press 1");
		System.out.println("do you want to exits press 2");
		
		
	}
	//System.out.println(java.util.Arrays.toString(a));
        

    }
}
