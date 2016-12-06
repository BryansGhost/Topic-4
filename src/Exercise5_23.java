import java.util.Scanner;

public class Exercise5_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter loan amount
		System.out.print("Enter loan amount: ");
		double loan = input.nextDouble();
		
		// Prompt user to enter number of years for loan
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		System.out.println(" "); // line break
		 
		
		// Enter yearly interest rate start value
		double annualInterestRate = 5.0;
		
		// Display table header
		System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		
		while (annualInterestRate <= 8.0) {
			double monthlyInterestRate = annualInterestRate / 1200;
			
			// Calculate total payment
			double monthlyPayment = loan * monthlyInterestRate / 
					(1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
			double totalPayment = monthlyPayment * years * 12;
			
			// Display results
			System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate, monthlyPayment,
					totalPayment);
			annualInterestRate = annualInterestRate + 1.0 / 8;
		}
	}
}
