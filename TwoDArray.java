import java.util.Scanner;
import java.io.PrintWriter; 

public class TwoDArray {
	
	//Function to enter elements into an array
	public static void create(int[][] arr1, int m, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j] = sc.nextInt();
			}// end of j
		}// end if i
	}
	
	//Function to Print the elements
	public static void print(int[][] arr, int m, int n) {
		System.out.println("The elements of the array are : ");
		PrintWriter writer = new PrintWriter(System.out);    
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				writer.write(+arr[i][j]+"\t");
				writer.flush(); 
			}//j
			writer.write("\n");
			writer.flush();
		}//i
		writer.close();	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows (M)  for a MxN Array : ");
		int m = sc.nextInt(); //User input for rows
		System.out.println("Enter the number of coloumns (N)  for a MxN Array : ");
		int n = sc.nextInt(); //User input for columns 
		int[][] arr = new int[m][n];
		create(arr,m,n); //This method is used to create an array
		print(arr,m,n);  //This method is used to print the array

	}

}
