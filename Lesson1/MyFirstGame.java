import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		
		int computerNumber = 56;
		int userInput;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter number from 0 to 100: ");
			userInput = sc.nextInt();
		
			if (userInput < computerNumber) {
				System.out.println("Entered number is smaller than target number");
			} else if (userInput > computerNumber) {
				System.out.println("Entered number is bigger than target number");
			}
		} while (userInput != computerNumber);
		System.out.println("You've guessed it!");
	}
}
