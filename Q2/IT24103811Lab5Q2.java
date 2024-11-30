import java.util.Scanner;

	public class IT24103811Lab5Q2 {
	
	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Declare new members  

		System.out.print("Enter the number of new members introduce:");
		int mem = input.nextInt();

		
		if (mem >= 0)
		{
		switch(mem)
		{
		case 0 : System.out.print("No Prize");
		break;
		
		
		case 1 : System.out.print("Prize is a : Pen");
		break;
		
		
		case 2 : System.out.print("Prize is a : Umbrella");
		break;
		
		
		case 3 : System.out.print("Prize is a : Bag");
		break;
		
		
		case 4 : System.out.print("Prize is a : Travelling Chair");
		break;
		
		
		default : System.out.print("Prize is a : Headphone");
		}
		}
		else
		{
		System.out.print("Input must be a number 0 or greater");
		return;
		}


	}
}