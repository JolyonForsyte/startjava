import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		
		int number = 56;
		int input;
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 0 to 100: ");
		input = sc.nextInt();
		
		if(input < number) {
			System.out.println("Entered number is smaller than target number");
		} else if (input > number) {
			System.out.println("Entered number is bigger than target number");
		} else if (input == number) {
			System.out.println("You've guessed it!");
		}
		} while (input != number);

	}
}
