import java.util.Scanner;

public class Multiplication_Prog 
{

	public static void main(String[] args) 
	{
		Multiplication_Prog obj1 = new Multiplication_Prog();
		obj1.Mul();
	}
	 public static void Mul()
	  {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		  {
			System.out.println(n+"*"+i+"="+n*i);
		 }
	  }
}


