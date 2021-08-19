import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: "); //user input
		int year= sc.nextInt(); 
		//Logic to check if its a Leap year or not
		if( ((year % 4 == 0) && (year%100!=0)) ||(year % 400 == 0) )
			System.out.println(" Year " + year + " is a leap year.");
		else
			System.out.println(" Year " + year + " is not a leap year.");
	}

}
