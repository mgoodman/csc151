import java.util.Scanner;

public class GuessingGameTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		GuessingGame game = new GuessingGame(10);
		runGame(game, s);
		
		GuessingGame newGame = new GuessingGame(10, 5);
		runGame(newGame, s);
		
		s.close();
		
	}
	
	public static void runGame(GuessingGame game, Scanner s) {
		game.generateNumber();
		
		System.out.println(game.getPrompt());

		System.out.println("Player 1, enter your guess:");
		int player1Guess = s.nextInt();
		System.out.println("Player 2, enter your guess:");
		int player2Guess = s.nextInt();
		
		System.out.println(game.getWinner(player1Guess, player2Guess));
		System.out.println(game.getSolution());
	}
	
}
