import java.util.Scanner;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to iterate (<31) : "); //user input
		int N= sc.nextInt();
		int result = 0;
		
		// To calculate Power 
		for(int i=1; i<=N ; i++)
		{
			result = (int) Math.pow(2,i);
			System.out.println(" 2 ^ "+i+" = " + result);
		}
	}

}
