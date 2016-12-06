import java.util.Scanner;

public class Exercise7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter 10 numbers
		System.out.println("Enter ten numbers: ");
		double[] numbers = new double[10];
		 
		// create array to hold 10 numbers
		  for (int i = 0; i < numbers.length; i++) {
		   numbers[i] = input.nextDouble();
		  }
		   
		  System.out.println("The minimum number is: " + min(numbers));
	}
	
	//Create a method to find the smallest element in the array list
	public static double min(double[] array) {
		double min = array[0];
		
		for (int i = 1; i < array.length; i++){
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}
}