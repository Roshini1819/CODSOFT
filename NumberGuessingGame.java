import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Random random= new Random();
		boolean playAgain;
		do{
			int numberToGuess= random.nextInt(100)+1;
			int attempts=0;
			int maxAttempts=10;
			boolean hasGuessedCorrectly = false;
			System.out.println("I have generated a number between 1 and 100. You have" + maxAttempts +"attempts to guess it.");
			while(attempts < maxAttempts &&! hasGuessedCorrectly){
				System.out.println("Enter your guess:");
				int userGuess = scanner.nextInt();
				attempts++;

				if(userGuess== numberToGuess){
					hasGuessedCorrectly = true;
					System.out.println("Congratulations! You guessed the correct number:" + numberToGuess);
				}else if(userGuess < numberToGuess){
					System.out.println("Too high! Try again.");
				}
			}
			if(!hasGuessedCorrectly){
				System.out.println("Sorry! You've used all your attempts. The correct number was:"+ numberToGuess);
			}
			System.out.println("Do you want to play again?(true/false):");
			playAgain = scanner.nextBoolean();
		}while(playAgain);
		System.out.println("Thanks for playing!");
		scanner.close();
		
	}
}
