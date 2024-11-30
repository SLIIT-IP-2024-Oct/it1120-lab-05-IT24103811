import java.util.Scanner;

	public class IT24103811Lab5Q1 {
	
	public static void main(String args[]) {

		// Create a Scanner object 
		Scanner input = new Scanner(System.in);
		

		// Declare the variables 
		int num1, num2, num3, Smallest, Largest;
		
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();

		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		
		System.out.println("");

		// User entered numbers

		System.out.println("User entered numbers are : " +num1 + " " +num2 + " " +num3);

		// find the Smallest and Largest

		Smallest = num1;
		Largest = num1;

		if (num2 < Smallest) {
		Smallest = num2;
		}

		if (num2 > Largest) {
		Largest = num2;
		}

		if (num3 < Smallest) {
		Smallest = num3;
		}

		if (num3 > Largest) {
		Largest = num3;
		}

		System.out.println("The Smallest number is: " +Smallest);
		System.out.println("The Largest number is: " +Largest);

	





}

}