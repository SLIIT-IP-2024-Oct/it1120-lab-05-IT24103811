import java.util.Scanner;

	public class IT24103811Lab5Q3 {

	public static final double amount = 48000.00; // one day room charge
	public static final double discount1 = 10/100.0; // 10% discount for 3-4 days
	public static final double discount2 = 20/100.0; // 20% discount for >=5 days
		
	public static void main(String[] args) {

		// Create a Scanner object

		Scanner input = new Scanner(System.in);

		// Declare the Start day, End Date, Total amount
		int start_date, end_date, days_res;
		double total_amount, discount; 
	
		
		System.out.print("Enter Start Date (1-31): ");		
		 start_date = input.nextInt();

		System.out.print("Enter End Date (1-31): ");		
		 end_date = input.nextInt();
		
		// Validate the entered dates are 1 or greater than 31

		if (start_date >= 1 && start_date <= 30 && end_date >= 1 && start_date <= 30)
		
		{
			if (start_date < end_date)
			{
				System.out.println("");
			}
			
			else
			{
				System.out.print("Start Date must be less than End Date");
				return;
				
			}
		}
		else
		{
			System.out.print("Days must be between 1 and 31");
			return;
		}

			System.out.println("Room Charge Per Day: Rs. " + amount);

			// Calculate number of Days Reserved
			 days_res = end_date - start_date;
			System.out.println("Number of Days Reserved: " + days_res);

					// Calculate the Total amount 
					total_amount = days_res * amount;
					discount = 0;

					// Calculate the Total amount with  discount
					if (days_res < 3) // no discount 
					{
						System.out.println("Total Amount to be  paid: " + total_amount); 
					}
					else if (days_res == 3 || days_res == 4) // 10% discount for 3 to 4 days
					{
						discount = total_amount * discount1;
						total_amount =  total_amount - discount;
						System.out.println("Total Amount to be  paid: " + total_amount);
					}
					else // 20% discount 5 or more days
					{
						discount = total_amount * discount2;						
						total_amount = total_amount - discount;
						System.out.println("Total Amount to be  paid: " + total_amount); 
					}




}
}