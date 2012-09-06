import javax.swing.JOptionPane;

public class Pair {

	private double number1;
	private double number2;
	
	public Pair() {
		String number1 = JOptionPane.showInputDialog("Enter your first number (double): ");
		String number2 = JOptionPane.showInputDialog("Enter your second number (double): ");
		
		this.number1 = Double.parseDouble(number1);
		this.number2 = Double.parseDouble(number2);
		
		System.out.println("Sum: " + this.sum());
		System.out.println("Difference: " + this.difference());
		System.out.println("Product: " + this.product());
		System.out.println("Average: " + this.average());
		System.out.println("Distance: " + this.distance());
		System.out.println("Maximum: " + this.maximum());
		System.out.println("Minimum: " + this.minimum());
		System.out.println("Remainder: " + this.remainder());
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
