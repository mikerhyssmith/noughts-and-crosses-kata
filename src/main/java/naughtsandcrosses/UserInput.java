package naughtsandcrosses;


import java.util.Scanner;

public class UserInput {

	Scanner scanner = new Scanner(System.in);

	public String getUserInput() {
		return scanner.nextLine();
	}

	public void close() {
		scanner.close();
	}
}
