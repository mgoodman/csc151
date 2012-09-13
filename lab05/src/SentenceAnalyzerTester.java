import java.util.Scanner;

public class SentenceAnalyzerTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = s.nextLine();
		
		SentenceAnalyzer sa = new SentenceAnalyzer(sentence);
		
		System.out.println("There are " + sa.getNumberOfWords() + " words");
		System.out.println("The longest word is `" + sa.getLongestWord() + "`");
	
		System.out.println("Enter a number between 0 and " + (sa.getNumberOfWords() - 1));
		int index = s.nextInt();
		System.out.println("The number at that index is: " + sa.getWord(index));
		
		System.out.println("Enter a char to check: ");
		char c = s.next().charAt(0);
		System.out.println("There are " + sa.countCharacter(c) + " words that have your letter in them");
		
		s.close();
	}
	
}
