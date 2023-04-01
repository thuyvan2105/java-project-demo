package model;

import java.util.HashMap;
import java.util.Map;

import bean.Word;
import common.WordType;

public class WordList {
	private WordList() {
	}
	
	public static Map<String, Word> mockWordList() {
		Map<String, Word> wordList = new HashMap<>();
		wordList.put("abandon", new Word("abandon",
				"to leave somebody, especially somebody you are responsible for, with no intention of returning",
				WordType.VERB, "abandon somebody to something"));
		wordList.put("generous", new Word("generous", "giving or willing to give freely; given freely",
				WordType.ADJECTIVE, "generous with something"));
		wordList.put("outdoors", new Word("outdoors", "outside, rather than in a building", 
				WordType.ADVERB, "OPPOSITE: indoors"));
		wordList.put("tie", new Word("tie", "a long, narrow piece of cloth worn around the neck, especially by men, with a knot in front",
				WordType.NOUN, "a striped silk tie"));
		wordList.put("apple", new Word("apple", "a round fruit with shiny red or green skin and firm white flesh",
				WordType.NOUN, "a juicy red apple"));
		wordList.put("clever", new Word("clever", "able to learn and understand things quickly and easily",
				WordType.ADJECTIVE, "a clever child"));
		wordList.put("diligent",new Word("diligent",
	            "showing care and effort in your work or duties",
	            WordType.ADJECTIVE, "a diligent student"));
		wordList.put("integrity", new Word("integrity", "the quality of being honest and having strong moral principles", 
				WordType.NOUN, "a person of integrity"));
		wordList.put("obscure", new Word("obscure", "not well known; difficult to understand", 
				WordType.ADJECTIVE, "an obscure reference"));
		wordList.put("reliable", new Word("reliable", "able to be trusted to do something well", 
				WordType.ADJECTIVE, "a reliable source of information"));
		return wordList;
	}
}