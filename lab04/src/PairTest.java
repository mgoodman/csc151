import java.text.DecimalFormat;

public class PairTest {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("########0.0");
				
		for (int i = 0; i < 3; i++) {
			Pair p = new Pair();
			
			System.out.println("Sum: " + f.format(p.sum()));
			System.out.println("Difference: " + f.format(p.difference()));
			System.out.println("Product: " + f.format(p.product()));
			System.out.println("Average: " + f.format(p.average()));
			System.out.println("Distance: " + f.format(p.distance()));
			System.out.println("Maximum: " + f.format(p.maximum()));
			System.out.println("Minimum: " + f.format(p.minimum()));
			System.out.println("Remainder: " + f.format(p.remainder()));
			
			if (i < 2 ) {
				System.out.println("-----------------");
			}
		}
	}
	
}
