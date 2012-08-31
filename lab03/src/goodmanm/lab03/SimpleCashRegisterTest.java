import java.text.DecimalFormat;

public class SimpleCashRegisterTest {

	public static void main(String[] args) {
		
		SimpleCashRegister c = new SimpleCashRegister(.07);
		DecimalFormat formatter = new DecimalFormat("######.00");
		
		c.addItem(10, 2.54);
		System.out.println("Subtotal: " + formatter.format(c.getSubTotal()));
		System.out.println("Tax: " + formatter.format(c.getTaxAmount()));
		System.out.println("Total: " + formatter.format(c.getTotalAmount()));
		System.out.println("---------------");
		
		c.subtractItem(3,2.54);
		System.out.println("Subtotal: " + formatter.format(c.getSubTotal()));
		System.out.println("Tax: " + formatter.format(c.getTaxAmount()));
		System.out.println("Total: " + formatter.format(c.getTotalAmount()));
		System.out.println("---------------");
		
		System.out.println("Your Change: " + formatter.format(c.enterPayment(100)));
		
	}
	
}
