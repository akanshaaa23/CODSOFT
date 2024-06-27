
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int randomnumber = rand.nextInt(100) + 1;
		boolean win = false; 
		while (win == false) {

			System.out.println("enter your guess(1-100):");
			int playerguess = sc.nextInt();

			if (playerguess == randomnumber) {

				System.out.println("correct! You win");

				break;

			} else if (playerguess > randomnumber) {
				System.out.println("Number is higher.try again");
			} else if (playerguess < randomnumber)
				System.out.println("Number is lesser.try again");
		}
	}
}