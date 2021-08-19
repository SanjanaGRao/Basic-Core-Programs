import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet: "); //user input
		char ch = sc.next().charAt(0);
		
		//Checking if its a Vowel or Consonant
		if(ch == 'A'||ch=='a' || ch=='E'|| ch=='e' || ch=='i' || ch=='I'|| ch=='o'|| ch=='O' || ch=='u' || ch=='U')
			System.out.println(ch + " is a Vowel.");
		else
			System.out.println(ch + " is a Consonant.");

	}

}
