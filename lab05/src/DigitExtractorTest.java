import java.util.Scanner;

public class DigitExtractorTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = s.nextInt();
		
		try {
			DigitExtractor d = new DigitExtractor(number);
			
			System.out.println("Looping through digits twice:");
			for (int i = 0; i < d.getNumberOfDigits() * 2; i++) {
				System.out.println("i: " + i + " result: " + d.nextDigit());
			}
			
			System.out.println("There are " + d.getNumberOfDigits() + " digits in total.");
			
			System.out.println("If your number is reversed you get:");
			System.out.println(d.reverse());
			
			System.out.println("Is the number a palindrome?");
			System.out.println(d.isPalindrome());
			
			System.out.println("Enter a digit to search for:");
			int digit = s.nextInt();
			
			s.close();
			
			try {
				int occurences = d.searchDigit(digit);
				System.out.println("Your number appears " + occurences + " times.");
			} catch (IllegalArgumentException e) {
				System.out.println("Caught exception.");
				e.printStackTrace();
			}
			
		} catch (IllegalArgumentException e) {
			s.close();
			System.out.println("Exception caught.");
			e.printStackTrace();
		}
		
	}
	
}
