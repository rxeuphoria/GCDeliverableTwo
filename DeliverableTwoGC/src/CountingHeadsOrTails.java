import java.util.Scanner;
import java.lang.Math;

public class CountingHeadsOrTails {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Guess which will have more: heads or tails?");
			String headsOrTailsGuess = scnr.nextLine();
			headsOrTailsGuess = headsOrTailsGuess.toLowerCase();
		System.out.println("How many times shall we flip a coin?");
			double numberOfFlips = scnr.nextInt();
			double originalNumberOfFlips = numberOfFlips;
			int correctCount = 0;
		while (numberOfFlips > 0) {
			if (Math.random() < 0.5) {
				System.out.println("tails");
				if (headsOrTailsGuess.equals("tails")) {
					correctCount += 1;
				}
			} else {
				System.out.println("heads");
				if (headsOrTailsGuess.equals("heads")) {
					correctCount += 1;
				}
			}
			numberOfFlips -=1;
		}
		double percentage = (correctCount / originalNumberOfFlips) * 100;
		System.out.print("You guess came up " + correctCount + " time(s). That's " + percentage + "%.");
	}
}
