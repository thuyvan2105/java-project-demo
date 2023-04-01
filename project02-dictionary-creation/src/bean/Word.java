package bean;

import common.WordType;

public class Word {
	private String word;
	private String definition;
	private WordType type;
	private String note;
	
	public Word() {
	}

	public Word(String word, String definition, WordType type, String note) {
		this.word = word;
		this.definition = definition;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public WordType getType() {
		return type;
	}

	public void setType(WordType type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Word: " + word + "\n" +
	            "Definition: " + definition + "\n" +
	            "Type: " + type + "\n" +
	            "Note: " + note + "\n";
	}
}