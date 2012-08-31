

public class SimpleCashRegister {

	private double taxRate;
	private double subtotal;
	
	public SimpleCashRegister(double taxRate) {
		this.taxRate = taxRate;
		subtotal = 0;
	}
	
	public void addItem(int quantity, double unitPrice) {
		subtotal += quantity * unitPrice;
	}
	
	public void subtractItem(int quantity, double unitPrice) {
		subtotal -= quantity * unitPrice;
	}
	
	public double getSubTotal() {
		return subtotal;
	}
	
	public double getTaxAmount() {
		return subtotal * taxRate;
	}
	
	public double getTotalAmount() {
		return subtotal + this.getTaxAmount();
	}
	
	public double enterPayment(double amount) {
		return amount - this.getTotalAmount();
	}
	
}
