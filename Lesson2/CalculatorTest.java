import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calc1 = new Calculator();

		int num1;
		int num2;
		char operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter sign: ");
		operation = sc.next().charAt(0);
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();

		System.out.println(calc1.calc(num1, num2, operation));

	}

}