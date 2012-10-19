import java.util.Scanner;

public class PowerBallGameTester {

	public static void main (String[] args) {
		PowerBallGame p = new PowerBallGame(200000);
		Scanner s = new Scanner(System.in);
		int[] guesses = new int[5];
		int powerball;
		
		System.out.println("Enter 5 guesses:");
		for (int i = 0; i < 5; i++) {
			guesses[i] = s.nextInt();
		}
		
		System.out.println("Enter powerball guess:");
		powerball = s.nextInt();
		
		System.out.println(p.toString());
		System.out.println("You won: $" + p.getPayout(guesses, powerball));
		
		
		
		s.close();
	}
	
}
