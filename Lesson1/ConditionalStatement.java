public class ConditionalStatement {
	public static void main(String[] args) {

		int yourAge = 35;
		if(yourAge > 20) {
			System.out.println("Your are older than 20 years");
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("Your are a male");
		} else {
			System.out.println("Your are a female");
		}

		double yourHeight = 1.60;
		if(yourHeight < 1.80) {
			System.out.println("Your are under 1.80 m");
		} else {
			System.out.println("Your are higher than 1.80 m");
		}

		char yourNameBeginsWithM ='B';
		if(yourNameBeginsWithM =='M') {
			System.out.println("Your name begins with M");
		} else if (yourNameBeginsWithM=='I') {
			System.out.println("Your name begins with I");
		} else {
			System.out.println("Your name begins with some other letter");
		}
	}
}