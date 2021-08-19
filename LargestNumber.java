import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: "); //user input
		int a= sc.nextInt();
		System.out.println("Enter the Second Number: "); //user input
		int b= sc.nextInt();
		System.out.println("Enter the Third Number: "); //user input
		int c= sc.nextInt();
		
		int largest = ((a>b)?a:b) > c ? ((a>b)?a:b) : c ;
		System.out.println(largest + " is the Largest number amongst the three.");

	}

}
