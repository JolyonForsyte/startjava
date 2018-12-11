import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator calc1 = new Calculator();
		int number1;
		int number2;
		char operation;
		String answer;

		while (true) {
			System.out.println("Do you want to continue? enter yes or no");
			Scanner ans = new Scanner(System.in);
			answer = ans.nextLine();

			if (answer.equals("yes")) {
				System.out.println("Enter first number: ");
				number1 = sc.nextInt();
				System.out.println("Enter sign: ");
				operation = sc.next().charAt(0);
				System.out.println("Enter second number: ");
				number2 = sc.nextInt();
				System.out.println(calc1.calculate(number1, number2, operation));
			} else if (answer.equals("no")) {
				System.out.print("Programm ended");
				break;
			} else {
				System.out.print("Invalid answer. ");
			}
		}
	}
}
