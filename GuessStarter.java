import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int YOUR_GUESS = in.nextInt();
		System.out.println("Your guess is: " + YOUR_GUESS);
		Random random= new Random();
		int number = random.nextInt(100) + 1;
		System.out.println("The number I was thinking of is: " + number);
		int OFF_BY = number-YOUR_GUESS;
		System.out.print("You were off by: " + OFF_BY);
		
	}

}
