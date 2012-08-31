

public class Contestant {

	private String name;
	private double balance;
	
	public Contestant(String name) {
		this.name = name;
		balance = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCash() {
		return balance;
	}
	
	public void addCash(double amount) {
		balance += amount;
	}
	
	public void bankrupt() {
		balance = 0;
	}
	
	public String toString() {
		return "Player: " + name + " Cash: $" + balance;
	}
	
}
