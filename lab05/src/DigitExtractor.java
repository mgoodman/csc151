
public class DigitExtractor {

	private int theNumber;
	
	private int currentDigit = 0;
	
	public DigitExtractor(int number) {
		if (number < 0 || number > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("number must be positive and less than int max");
		}
		this.theNumber = number;
	}
	
	public int nextDigit() {
		String number = Integer.toString(theNumber);
		
		if (currentDigit == getNumberOfDigits()) {
			currentDigit = 0;
		}
		
		int digit = Integer.parseInt(number.substring(currentDigit, currentDigit + 1));
		
		currentDigit += 1;
		
		return digit;
	}
	
	public int getNumberOfDigits() {
		return Integer.toString(theNumber).length();
	}
	
	public int reverse() {
		int temp = 0;
		int reverse = 0;
		int numberToReverse = theNumber;
		
		while (numberToReverse > 0) {
			temp = numberToReverse % 10;
			
			reverse = reverse * 10 + temp;
			numberToReverse = numberToReverse / 10;
		}
		
		return reverse;
	}
	
	public boolean isPalindrome() {
		return theNumber == reverse();
	}
	
	public String toString() {
		return Integer.toString(theNumber);
	}
	
	public int searchDigit(int digit) {
		if (digit >= 10 || digit < 0) {
			throw new IllegalArgumentException("Must provide a single digit that is positive");
		}
		
		int numberOfTimes = 0;
		String number = toString();
		
		for (int i = 0; i < getNumberOfDigits(); i++) {
			if (number.substring(i, i + 1).equals(Integer.toString(digit))) {
				numberOfTimes += 1;
			}
		}
	
		return numberOfTimes;
	}
	
}
