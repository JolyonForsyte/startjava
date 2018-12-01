public class Calculator {
	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		System.out.println(calc(a, b, '*'));
		System.out.println(calc(a, b, '/'));
		System.out.println(calc(a, b, '+'));
		System.out.println(calc(a, b, '-'));
		System.out.println(calc(a, b, '%'));
		System.out.println(calc(a, b, '^'));
		
	}
	public static double calc (int x, int y, char sign) {
		double result = 0;
		if(sign == '+') {
			result = x + y;
		} else if (sign == '-') {
			result = x - y;
		} else if (sign == '/') {
			result = x / y;
		} else if (sign == '*') {
			result = x * y;
		} else if (sign == '%') {
			result = x % y;
		} else if (sign == '^') {
			result = calcPower(x, y);
		}
		return result;
	}
	
	public static int calcPower(int base, int power) {
		int res = 1;
		for(int i = 1; i <= power; i++) {
			res *= base;
		}
		return res;
		
	}

}