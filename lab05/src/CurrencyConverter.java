import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter how many dollars go into one euro:");
		double dollarsPerEuro = s.nextDouble();
		String input = "";
		
		System.out.println("Enter a number of dollars to convert to euros:");
		System.out.println("[Press Q to quit]");
		
		while (true) {
			input = s.next();
			
			if (input.equals("Q")) {
				s.close();
				System.out.println("Execution halted");
				return;
			}
			
			System.out.println("In euros: " + Double.parseDouble(input) / dollarsPerEuro);
			
		}		
	}
	
}
