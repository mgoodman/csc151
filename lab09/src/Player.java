
public class Player implements Comparable<Player> {

	private String name;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void increaseScore(int amount) {
		this.score += amount;
	}

	@Override
	public int compareTo(Player otherPlayer) {
		int difference = this.score - otherPlayer.getScore();
		
		if (difference == 0) {
			difference = this.name.compareTo(otherPlayer.getName());
		}
		
		return difference;
	}
	
}
