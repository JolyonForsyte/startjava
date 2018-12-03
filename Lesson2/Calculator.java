public class Calculator {

	public static double calc(int x, int y, char sign) {
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
			result = calcPower(x, y);
			break;

		}
		return result;
	}

	public static int calcPower(int base, int power) {
		int res = 1;
		for (int i = 1; i <= power; i++) {
			res *= base;
		}
		return res;

	}

}