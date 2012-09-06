import java.text.DecimalFormat;

public class PairTest {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("########0.0");
		runTests(new Pair(1.0,2.1), f);
	}
	
	private static void runTests(Pair p, DecimalFormat f) {
		System.out.println("Sum: " + f.format(p.sum()));
		System.out.println("Difference: " + f.format(p.difference()));
		System.out.println("Product: " + f.format(p.product()));
		System.out.println("Average: " + f.format(p.average()));
		System.out.println("ABS: " + f.format(p.distance()));
		System.out.println("Maximum: " + f.format(p.maximum()));
		System.out.println("Minimum: " + f.format(p.minimum()));
		System.out.println("Remainder: " + f.format(p.remainder()));
	}
	
}
