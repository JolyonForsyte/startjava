import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calcOne = new Calculator();

		int number1;
		int number2;
		char operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		number1 = sc.nextInt();

		System.out.println("Enter the operation sign: ");
		operation = sc.next().charAt(0);

		System.out.println("Enter the second number: ");
		number2 = sc.nextInt();

		System.out.println(calcOne.calculate(number1, number2, operation));

	}

}