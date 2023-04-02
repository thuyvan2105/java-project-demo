package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
	private static final int MIN_USERNAME_LENGTH = 6;
    private static final int MAX_USERNAME_LENGTH = 20;
    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final int MAX_PASSWORD_LENGTH = 30;
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]+$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{8,30}$";
    
    public static boolean isValidUsername(String username) throws Exception {
    	if (username.length() < MIN_USERNAME_LENGTH || username.length() > MAX_USERNAME_LENGTH) {
        	throw new Exception("Username must contain at least 6 characters and up to 20 characters!!!");
        }   
        
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);
        if (!matcher.matches()) {
        	throw new Exception("Username must contain at least 1 number, 1 uppercase alphabetic character, " 
        					  + "1 lowercase alphabetic character, and no special characters!!!");
        }
		return true; 
    }
    
    public static boolean isValidPassword(String password) throws Exception {
        if (password.length() < MIN_PASSWORD_LENGTH || password.length() > MAX_PASSWORD_LENGTH) {
        	throw new Exception("Password must contain at least 8 characters and up to 30 characters!!!");
        }
        
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
        	throw new Exception("Password must contain at least 1 number, 1 uppercase alphabetic character, " 
					          + "1 lowercase alphabetic character, and 1 special character!!!");
        }
		return true;
    }
    
    public static boolean isDuplicateMoreThanNLetters(String password, String username, int n) {
        for (int i = 0; i < password.length(); i++) {
            String letter = String.valueOf(password.charAt(i));
            if (username.contains(letter)) {
                int count = 0;
                for (int j = 0; j < username.length(); j++) {
                    if (letter.equals(String.valueOf(username.charAt(j)))) {
                        count++;
                        if (count > n) {
                            System.out.println("Password can't duplicate more than " + n 
                            		         + " characters with the account name!");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}