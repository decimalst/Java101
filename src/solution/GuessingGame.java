package solution;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// Liang Java, page 161
		Random rand = new Random();

		Scanner input = new Scanner(System.in);
		int guessMe = rand.nextInt(10) + 1;
		boolean notRightYet = true;
		
		System.out.println("Guess the number from 1-10 I'm thinking of! ");
		int userAnswer = -1;
		while(guessMe != userAnswer) {
			userAnswer = input.nextInt();
			if(guessMe == userAnswer){
				System.out.println("Correct! I was thinking of the number " + guessMe);
			}
			else if (guessMe > userAnswer){
				System.out.println("Close, but guess higher!");
			}
			else {
				System.out.println("Close, but guess lower!");
			}
		}

		input.close();
	}

}
