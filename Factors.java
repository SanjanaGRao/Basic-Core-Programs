import java.util.Scanner;

public class Factors {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find Prime factors: "); //user input
		int n= sc.nextInt();
		
		while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        // when n is odd
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        // when a prime number is greater than 2
        if (n > 2)
            System.out.print(n);
	}

}
