import java.util.Scanner;

public class GuessNumber {

	Scanner sc = new Scanner(System.in);
	Player one = new Player(sc.nextLine());
	Player two = new Player(sc.nextLine());
	int computerNumber = (int) (Math.random() * 100);

	do {
		System.out.println("Player 1: Enter number from 0 to 100: ");
		one.play();
		System.out.println("Player 1: Enter number from 0 to 100: ");
		two.play();

		if (one.userNumber == computerNumber) {
			System.out.println("Congratulations to Player 1! you guessed it! The number was: "+ computerNumber);
			break;
		}
		if (two.userNumber == computerNumber) {
			System.out.println("Congratulations to Player 2! you guessed it! The number was: "+ computerNumber);
			break;
		}
		else {
			System.out.println("Nobody guessed yet.Try again.");
            System.out.println("Here is a hint: ");
            if(one.userNumber < computerNumber) {
            	System.out.println("Player 1 number is smaller than target number");
            }
            if (one.userNumber > computerNumber) {
            	System.out.println("Player 1 number is bigger than target number");
            }
            if(two.userNumber < computerNumber) {
            	System.out.println("Player 2 number is smaller than target number");
            }
            if (two.userNumber > computerNumber) {
            	System.out.println("Player 2 number is bigger than target number");
            }
		}
	}while (one.userNumber != computerNumber || two.userNumber != computerNumber)
}
