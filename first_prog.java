import java.util.Scanner;

public class first_prog {

	public static void main(String[] args) {
		int a,b,c;
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Numbers");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=a+b;
	    c=a-b;
	    c=a*b;
	    c=a/b;
	    c=a%b;
	    System.out.println("Addition is" + c);
	    System.out.println("Subtraction"+c);
	    System.out.println("Multiplication"+c);
	    System.out.println("Division"+c);
	    System.out.println("Modulus"+c);

	}

}
