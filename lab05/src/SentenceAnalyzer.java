
public class SentenceAnalyzer {

	private String sentence;
	private String[] words;
	private String longestWord = "";
	
	public SentenceAnalyzer(String sentence) {
		this.sentence = sentence;
		words = sentence.split("\\s+");
	}
	
	public int getNumberOfWords() {
		return words.length;
	}
	
	public String getLongestWord() {
		for (int i = 0; i < words.length; i++) {
			if (longestWord.length() < words[i].length()) {
				longestWord = words[i];
			}
		}
		
		return longestWord;
	}
	
	public String getWord(int index) {
		if (index < 0 || index >= words.length) {
			throw new IllegalArgumentException("Invalid index.");
		}
		return words[index];
	}
	
	public int countCharacter(char c) {
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf((int) c) != -1) {
				count += 1;
			}
		}
		
		return count;
	}
	
	
	
}
