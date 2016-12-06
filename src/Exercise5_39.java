public class Exercise5_39 {
	public static void main(String[] args) {
		
		/* There seems to be a typo in the book (5,000*8% + 5,000*10% + 15,000*12% = 2,700.) 
		 * 15,000 is a random number as it is show nowhere in the directions. I think this is 
		 * supposed to be 5,000 * 12% rather than 15,000.
		*/
		
		// Calculate commission 
		double commission = 1;
		int sales = 0;
		while (commission < 25000){

			commission = (sales * .12);
					sales++;
		}
			
		System.out.println("Your salary is $5,000 a year. You would like to make $30,000");
		System.out.println("In order to make $25,000 in commission, you must make $" + 
				commission + " in commission");


	}

}
