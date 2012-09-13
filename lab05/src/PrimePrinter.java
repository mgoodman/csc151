import java.util.Scanner;

public class PrimePrinter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nextPrime;
		String list = "";
		
		System.out.println("Eneter your number:");
		int number = s.nextInt();
		s.close();
		
		PrimeGenerator pg = new PrimeGenerator(number);
		
		while (true) {
			nextPrime = pg.nextPrime();
			
			if (nextPrime == -1) {
				break;
			}
			
			list += Integer.toString(nextPrime) + ", ";
		}
		
		list = list.substring(0, list.length() - 2);
		System.out.println(list);
	}
	
}
