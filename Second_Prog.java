import java.util.Scanner;

public class Second_Prog {

	public static void main(String[] args) {
    int a,b;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Numbers");
    a=sc.nextInt();
    b=sc.nextInt();

    if((a>b)&&(b<a))
    {
        System.out.println("a");

    }
    else
    {
        System.out.println("b");

    }
	}

}
