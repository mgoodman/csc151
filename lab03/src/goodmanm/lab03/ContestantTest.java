

public class ContestantTest {

	public static void main(String[] args) {
		
		Contestant c1 = new Contestant("Mac");
		
		c1.addCash(500000.23);
		c1.addCash(-500.23);
		System.out.println(c1);
		
		c1.bankrupt();
		System.out.println(c1);
		
	}
	
}
