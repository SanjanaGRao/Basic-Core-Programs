import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: "); //user input
		int a= sc.nextInt();
		System.out.println("Enter the Second Number: "); //user input
		int b= sc.nextInt();
		int temp;
		System.out.println("Before swap: a = " +a+" b = "+b);
		
		//I used temp variable to swap
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap: a = " +a+" b = "+b);
	}

}
