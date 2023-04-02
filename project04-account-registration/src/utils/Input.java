package utils;

import java.util.Scanner;

public class Input {
	private Input() {

	}

	private static Scanner scanner = new Scanner(System.in);

	// check input for string & maxTries
	public static String getStringInputWithMaxTries(String prompt, int maxTries) {
		String input;
		int attempts = 0;
		do {
			String suffix = attempts > 0 ? "! You have " + (maxTries - attempts) + " attempts left: " : ": ";
			System.out.print(prompt + suffix);
			input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				break;
			}
			attempts++;
			if (attempts == maxTries) {
				System.out.println("Maximum attempts exceeded. Please try again later.");
				System.exit(0);
			}
		} while (true);
		return input;
	}
}