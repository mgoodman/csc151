
public class PurseTester {

	public static void main(String[] args) {
		Purse p1 = new Purse();
		System.out.println("Creating new purse. Adding a penny");
		p1.addCoin("Penny");
		System.out.println("toString:");
		System.out.println(p1.toString());
		System.out.println("calling reverse:");
		p1.reverse();
		System.out.println(p1.toString());
		
		Purse p2 = new Purse();
		System.out.println("\nCreating new purse. Adding quarter and penny");
		p2.addCoin("Quarter");
		p2.addCoin("Penny");
		System.out.println("toString:");
		System.out.println(p2.toString());
		System.out.println("calling reverse:");
		p2.reverse();
		System.out.println(p2.toString());
		
		System.out.println("\nCreating two new purses. Adding coins and testing transfer");
		Purse p3 = new Purse();
		Purse p4 = new Purse();
		
		p3.addCoin("Quarter");
		p3.addCoin("Dime");
		p3.addCoin("Nickel");
		p3.addCoin("Penny");
		
		p4.addCoin("Penny");
		p4.addCoin("Dime");
		
		System.out.println("p3 before: " + p3.toString());
		System.out.println("p4 before: " + p4.toString());
		
		System.out.println("Calling p3.transfer(p4)");
		p3.transfer(p4);
		
		System.out.println("p3 after: " + p3.toString());
		System.out.println("p4 after: " + p4.toString());
		
		System.out.println("\nCreating two new empty purses and calling transfer");
		p3 = new Purse();
		p4 = new Purse();
		p3.transfer(p4);
		System.out.println("p3: " + p3.toString());
		System.out.println("p4: " + p4.toString());

		System.out.println("\nCreating two new empty purses and adding a quarter to the first one. Then calling transfer");
		p3 = new Purse();
		p4 = new Purse();
		p3.addCoin("Quarter");
		p3.transfer(p4);
		System.out.println("p3: " + p3.toString());
		System.out.println("p4: " + p4.toString());
		
		System.out.println("\nCreating two new empty purses and adding a quarter to the second one. Then calling transfer");
		p3 = new Purse();
		p4 = new Purse();
		p4.addCoin("Quarter");
		p3.transfer(p4);
		System.out.println("p3: " + p3.toString());
		System.out.println("p4: " + p4.toString());
		
		System.out.println("\nCreating two new purses with the same coins in opposite order and then calling sameContents & sameCoins");
		Purse p5 = new Purse();
		Purse p6 = new Purse();

		p5.addCoin("Quarter");
		p5.addCoin("Dime");
		p5.addCoin("Nickel");
		p5.addCoin("Penny");
		
		p6.addCoin("Penny");
		p6.addCoin("Nickel");
		p6.addCoin("Dime");
		p6.addCoin("Quarter");
		
		System.out.println("sameContents returned: " + p5.sameContents(p6));
		System.out.println("sameCoins returned: " + p5.sameCoins(p6));
		p6.reverse();
		System.out.println("Reversing the second purse and running sameContents again: " + p5.sameContents(p6));
	}
	
}
