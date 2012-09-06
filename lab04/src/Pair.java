
public class Pair {

	private int number1;
	private int number2;
	
	public Pair(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int sum() {
		return number1 + number2;
	}
	
	public int difference() {
		return number1 - number2;
	}
	
	public int product() {
		return number1 * number2;
	}
	
	public int average() {
		return (number1 / number2) / 2;
	}
	
	public int distance() {
		return Math.abs(number1 - number2);
	}
	
	public int maximum() {
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	public int minimum() {
		if (number1 > number2) {
			return number2;
		} else {
			return number1;
		}
	}
	
	public int remainder() {
		return number1 % number2;
	}
	
}
