package demo;

import static model.WordList.*;
import static utils.Input.*;
import java.util.Map;
import java.util.Scanner;
import bean.Word;
import common.WordType;

public class DictionaryApp {
	private static final Scanner scanner = new Scanner(System.in);

	private static Map<String, Word> wordList = mockWordList();

	public static void main(String[] args) {
		boolean quit = false;
		while (!quit) {
			int choice = getChoiceFromUser();
			switch (choice) {
			case 1:
				addWord();
				break;
			case 2:
				lookupWord();
				break;
			case 3:
				quit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static int getChoiceFromUser() {
		System.out.println("===== MENU =====");
		System.out.println("1. Add new word");
		System.out.println("2. Lookup word");
		System.out.println("3. Quit");
		System.out.print("Enter your choice: ");
		return scanner.nextInt();
	}

	private static void addWord() {
		String word = "";
		do {
			word = getInput("Enter the word you want to add: ");
			if (word.trim().isEmpty()) {
				System.out.println("Word cannot be empty. Please try again.");
			} else if (wordList.containsKey(word)) {
				System.out.println("Word already exists. Please try again.");
			} else {
				break;
			}
		} while (true);

		String definition = getInput("Enter the meaning: ");

		WordType wordType = WordType.UNKNOWN;
		while (wordType == WordType.UNKNOWN) {
			String typeString = getInput("Enter the word type (noun, verb, adjective, adverb): ");
			try {
				wordType = WordType.valueOf(typeString.toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid word type. Please try again.");
			}
		}

		String note = getInput("Enter the note: ");
		wordList.put(word, new Word(word, definition, wordType, note));
		System.out.println("The word has been added to the dictionary.");
	}

	private static void lookupWord() {
		String word = getInput("Enter the word to look up: ");
		if (wordList.containsKey(word)) {
			System.out.println(wordList.get(word));
		} else {
			System.out.println("The word is not in the dictionary.");
		}
	}
}