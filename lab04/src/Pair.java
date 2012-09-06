
public class Pair {

	private double number1;
	private double number2;
	
	public Pair(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public double sum() {
		return number1 + number2;
	}
	
	public double difference() {
		return number1 - number2;
	}
	
	public double product() {
		return number1 * number2;
	}
	
	public double average() {
		return (number1 + number2) / 2.0;
	}
	
	public double distance() {
		return Math.abs(number1 - number2);
	}
	
	public double maximum() {
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	public double minimum() {
		if (number1 > number2) {
			return number2;
		} else {
			return number1;
		}
	}
	
	public double remainder() {
		return number1 % number2;
	}
	
}
