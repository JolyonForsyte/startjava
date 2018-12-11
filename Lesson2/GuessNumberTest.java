import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		System.out.println("Enter the names of players: ");
		Scanner sc = new Scanner(System.in);
		Player playerOne = new Player(sc.nextLine());
		Player playerTwo = new Player(sc.nextLine());

		GuessNumber guessGame = new GuessNumber(playerOne, playerTwo);

		guessGame.playGame();
	}
}
