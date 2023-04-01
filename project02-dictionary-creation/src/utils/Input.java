package utils;

import java.util.Scanner;

public class Input {	
	
	private static Scanner scanner = new Scanner(System.in);
	
	public Input() {
	}
	
	public static String getInput(String message) {
		String input;
		do {
			System.out.print(message);
			input = scanner.nextLine().trim().toLowerCase();
		} while (!isValidInput(input));
		return input;
	}
	
	public static boolean isValidInput(String input) {
		if (input.matches("[a-zA-Z]+")) {
			return true;
		}
		throw new IllegalArgumentException("Invalid input. Please try again!");
	}

}
