package demo;

import static demo.PasswordValidator.*;
import static utils.Input.*;

public class RegisterAccount {
	public static void main(String[] args) {
		String username = getUsername();
		String password = getPassword(username);

		System.out.println("Thanks! Your account has been successfully signed up.");
	}

	private static String getUsername() {
		String username = null;
		do {
			try {
				username = getStringInputWithMaxTries("Please enter username", 3);
				if (isValidUsername(username)) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		return username;
	}

	private static String getPassword(String username) {
		String password = null;
		do {
			try {
				password = getStringInputWithMaxTries("Please enter password", 3);
				if (isValidPassword(password) || isDuplicateMoreThanNLetters(password, username, 3)) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		return password;
	}
}