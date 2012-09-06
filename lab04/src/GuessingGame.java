import java.util.Random;


public class GuessingGame {

	private int max;
	private int min;
	private int correctNumber;
	
	public GuessingGame(int max) {
		this.max = max;
		this.min = 0;
	}
	
	public GuessingGame(int max, int min) {
		this.max = max;
		this.min = min;
	}
	
	public int generateNumber() {
		Random rng = new Random();
		correctNumber = rng.nextInt((max - min) + 1) + min;
		
		return correctNumber;
	}
	
	public String getPrompt() {
		return "I  am thinking of a number between " + min + " and " + max + ".";
	}
	
	public String getWinner(int guess1, int guess2) {		
		if (guess1 > max || guess1 < min) {
			if (guess2 > max || guess2 < min) {
				return "Neither of you win!";
			}
			return "Player 2 wins!";
		} else if (guess2 > max || guess2 < min) {
			return "Player 1 wins!";
		}
		
		if (guess1 == guess2) {
			return "It was a tie!";
		}
		
		if (Math.abs(correctNumber - guess1) < Math.abs(correctNumber - guess2)) {
			return "Player 1 wins!";
		} else {
			return "Player 2 wins!";
		}
	}
	
	public String getSolution() {
		return "The number is: " + correctNumber;
	}
	
}
