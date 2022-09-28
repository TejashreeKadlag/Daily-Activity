import java.util.Scanner;

public class Pattern_Program 
{

	public static void main(String[] args)
	{
		Pattern_Program obj = new Pattern_Program();
		obj.Pyramidpattern();
		obj.Alphabet();
		obj.Number();
		obj.Number1();
	}
	public static void Pyramidpattern()
{
	Scanner sc=new Scanner(System.in);
	int size;
	System.out.println("Enter the size:");
	size=sc.nextInt();
	for (int i=1; i<=size; i++)  
    { 
		 for (int j=i; j<=size; j++ )
		 {
			 System.out.print(" "); 
        }  
		 for (int j=1; j<i; j++ )
		 {
			 System.out.print("*"); 
		 }
		 for (int j=1; j<=i; j++ )
		 {
			 System.out.print("*"); 

		 }
     
    System.out.println(); 
} 
}
   public static void Alphabet() 
   
   {
		Scanner sc=new Scanner(System.in);
		int size,alphabet=65;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alphabet+j)+"");
			}
			
			System.out.println();
   
       }
   }
	public static void Number()
	 {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size:");
		size=sc.nextInt();

		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size-i;j++)
			{
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");

		}
	}
    public static void Number1()
    {
	Scanner sc=new Scanner(System.in);
	int size;
	System.out.println("Enter the size:");
	size=sc.nextInt();
	for(int i=1;i<=size;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=size;k++)
		{
			if(k%2==0)
			{
				System.out.print("0");

			}
			else
			{
				System.out.print("1");

			}
		}
		System.out.println();
	}
 }
   
 }









