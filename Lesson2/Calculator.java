public class Calculator {

	public static double calculate(int x, int y, char sign) {
		double result = 0;

		switch (sign) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '/':
			result = x / y;
			break;
		case '*':
			result = x * y;
			break;
		case '%':
			result = x % y;
			break;
		case '^':
			result = calculatePower(x, y);
			break;
		}
		return result;
	}

	public static int calculatePower(int base, int power) {
		int resultNumber = 1;
		for (int i = 1; i <= power; i++) {
			resultNumber *= base;
		}
		return resultNumber;
	}

}