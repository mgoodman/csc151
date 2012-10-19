import java.util.Random;

public class PowerBallGame {

	private int[] winningNumbers = new int[5];
	private int winningPowerball;
	private int jackpot;
	
	public PowerBallGame(int jackpot) {
		this.jackpot = jackpot;
		boolean[] numbersUsed = new boolean[57];
		Random rng = new Random();
		
		for (int i = 0; i < 5; i++) {
			winningNumbers[i] = rng.nextInt(56) + 1;
			while (numbersUsed[winningNumbers[i]] == true) {
				winningNumbers[i] = rng.nextInt(56) + 1;
			}
			numbersUsed[winningNumbers[i]] = true;
		}
		
		winningPowerball = rng.nextInt(35) + 1;
	}
	
	public int getWinningPowerBall() {
		return this.winningPowerball;
	}
	
	public int[] getWinningNumbers() {
		return this.winningNumbers;
	}
	
	public int getPayout(int[] picks, int pb) {
		int winnings = 0;
		int correct = 0;
	
		for (int i = 0; i < 5; i++) {
			if (picks[i] == this.winningNumbers[i]) {
				correct += 1;
			}
		}
		
		if (pb == this.winningPowerball) {
			switch (correct) {
			case 0:
				winnings = 4;
				break;
			case 1:
				winnings = 4;
				break;
			case 2:
				winnings = 7;
				break;
			case 3:
				winnings = 100;
				break;
			case 4:
				winnings = 10000;
				break;
			case 5:
				winnings = this.jackpot;
				break;
			}
		} else {
			switch (correct) {
			case 3:
				winnings = 7;
				break;
			case 4:
				winnings = 100;
				break;
			case 5:
				winnings = 100000;
				break;
			}
		}

		return winnings;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("Winning Numbers: ");
		for (int number : this.winningNumbers) {
			result.append(number + " ");
		}
		result.append("\nWinning Powerball: " + this.winningPowerball);
		
		result.append("\nJackpot: $" + this.jackpot);
		
		return result.toString();
	}
	
}
