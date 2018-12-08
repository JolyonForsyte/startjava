import java.util.Scanner;

public class Player {
	String name;
	int userNumber;
	
	public Player(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	Scanner sc = new Scanner(System.in);
	void play() {
		userNumber = sc.nextInt();
	}
}
