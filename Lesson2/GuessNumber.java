import java.util.Scanner;

public class GuessNumber {
	Player player1;
	Player player2;

	public GuessNumber (Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playGame() {
		String answer;
		while (true) {
			System.out.println("Do you want to continue? enter yes or no");
			Scanner ans = new Scanner(System.in);
			answer = ans.nextLine();

			if (answer.equals("yes")) {
				int computerNumber = (int)(Math.random() * 100);
				// printing out random number for testing
				System.out.println("Target number is " + computerNumber);
				do {
					System.out.println("Player 1 " + player1.getName() + ": Enter number from 0 to 100: ");
					player1.play();
					System.out.println("Player 2 " + player2.getName() + ": Enter number from 0 to 100: ");
					player2.play();

					if (player1.userNumber == computerNumber) {
						System.out.println("Congratulations to " + player1.getName() + "! you guessed it! The number was: " + computerNumber);
						break;
					}
					if (player2.userNumber == computerNumber) {
						System.out.println("Congratulations to " + player2.getName() + "! you guessed it! The number was: " + computerNumber);
						break;
					} else {
						System.out.println("Nobody guessed yet. Try again");
						System.out.println("Here is a hint: ");
						if (player1.userNumber < computerNumber) {
							System.out.println("Player 1 number is smaller than target number");
						}
						if (player1.userNumber > computerNumber) {
							System.out.println("Player 1 number is bigger than target number");
						}
						if (player2.userNumber < computerNumber) {
							System.out.println("Player 2 number is smaller than target number");
						}
						if (player2.userNumber > computerNumber) {
							System.out.println("Player 2 number is bigger than target number");
						}
					}
				} while (player1.userNumber != computerNumber || player2.userNumber != computerNumber);
			} else if (answer.equals("no")) {
				System.out.print("Game over");
				break;
			} else {
				System.out.print("Invalid answer. ");

			}
		}
	}
}
