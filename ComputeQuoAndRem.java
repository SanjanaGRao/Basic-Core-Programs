import java.util.Scanner;

public class ComputeQuoAndRem {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend: "); //user input
		int dividend= sc.nextInt();
		System.out.println("Enter the Divisor (!0): "); //user input
		int divisor= sc.nextInt();
		int quotient = dividend/divisor;
		int remainder = dividend % divisor;
		System.out.println("The Quotient of " + dividend + " / " + divisor + " is :" + quotient);
		System.out.println("The Remainder of " + dividend + " / " + divisor + " is :" + remainder);
	}

}
