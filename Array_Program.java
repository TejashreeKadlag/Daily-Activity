
import java.util.Arrays;
import java.util.Scanner;

public class Array_Program

{	
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int i,temp;
    void display() 
    {
		System.out.println("Enter the "+ size +" numbers :");	
	}
	int num[]=new int[size];
	
    void accept() 
    {

     for(i=0;i<size;i++)
     {
	num[i]=sc.nextInt();
     }
     for( i=0;i<size;i++) 
     {
	  System.out.println("The given array is :"+num[i]);
     }
     for(i=0;i<size;i++)
     {
	 for(int j=i+1;j<size;j++) 
	 {
		if(num[j]<num[i]) // Greatest Number Condition
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
		}
	}
	
 }
   System.out.println("The larger number of this array :"+num[size-1]);

   for(i=0;i<size;i++) 
  {
   for(int j=i+1;j<size;j++) 
   {
		if(num[j]>num[i]) // Smallest Number Condition
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
		}
	}
  }
    System.out.println("The smaller number of this array :"+num[size-1]);
}
    void sort() 
    {
      System.out.println("Sort of array elements in desending order :");
      for(i=0;i<size;i++) 
      {
	    System.out.println(num[i]);
       }
      Arrays.sort(num); // Sort method is used for sort the numbers
      System.out.println("Sort of array elements in assending order :");
      for(i=0;i<size;i++) 
      {
	   System.out.println(num[i]);
      }
   }
    public static void main(String[] args)
	{
    	Array_Program obj=new Array_Program();
		obj.display();
		obj.accept();
		obj.sort();
   }
}