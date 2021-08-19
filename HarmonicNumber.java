import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Harmonic number: "); //user input
		int N= sc.nextInt();
		float sum = 1; //1st Harmonic number is 1
		
		//Main Logic
		for(int i=2 ; i<=N ; i++) //starts from 2
		{
			sum += (float) 1/i;
			//System.out.println(sum);
		}
		System.out.println(" The value of "+ N + " harmonic(s) is/are: " + sum);
	}
}
