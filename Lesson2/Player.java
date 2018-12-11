import java.util.Scanner;

public class Player {
	String name;
	int userNumber;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Scanner sc = new Scanner(System.in);
	void play() {
		userNumber = sc.nextInt();
	}
}
