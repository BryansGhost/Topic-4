import java.util.Scanner;
 
//This one was rather difficult. Much help was needed!
public class Exercise7_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Hold array of words to be used
		String[] words = { "steak", "death star", "wells", "tesla", "cthulu", "planet", "express", 
				"akira", "rosebud", "plastics", "bond", "metropolis"};
		String ans;
		
		//initialize variables
		do {
			int i = intRandom(0, words.length - 1);
			char[] word = words[i].toCharArray();
			boolean[] asterisk = new boolean[word.length];
			int correctGuesses = 0;
			int misses = 0;
			while (correctGuesses != word.length) {
				
			System.out.print("(Guess) Enter a letter in word ");
 
			// Print out result
			for (int j = 0; j < word.length; j++) {
 
				if (asterisk[j])
					System.out.print(word[j]);
				else
					System.out.print("*");
			}
 
			System.out.print(">");
			char guess = input.next().charAt(0);
 
			// Check results
			boolean miss = true;
			boolean repeat = false;
 
			for (int j = 0; j < word.length; j++) {
				if (word[j] == guess) {
					if (asterisk[j] != true) {
						asterisk[j] = true;
						correctGuesses++;
					} else {
						repeat = true;
						break;
					}
					miss = false;
				}
			}
 
				if (miss)
					misses++;
				if (repeat)
					System.out.println(guess + " is already in the word");
				}
				
				//Display results
				System.out.println("The word is " + String.valueOf(word)
					+ ". You missed " + misses + " times");
				System.out.print("Do you want to guess another word? Enter y or n>");
				ans = input.next();
				} while (ans.charAt(0) != 'n');
			}
 
			public static int intRandom(int lowerBound, int upperBound) {
				return (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
			}
}