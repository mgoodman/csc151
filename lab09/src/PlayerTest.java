import java.util.ArrayList;
import java.util.Collections;

public class PlayerTest {

	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<Player>();
		
		Player player1 = new Player("Bob");
		Player player2 = new Player("Bill");
		Player player3 = new Player("Jane");
		
		player1.increaseScore(5);
		player2.increaseScore(6);
		player3.increaseScore(7);
		
		players.add(player1);
		players.add(player3);
		players.add(player2);
		
		Collections.sort(players);
		
		for (Player p : players) {
			System.out.print(p.getName());
			System.out.print(" : ");
			System.out.println(p.getScore());
		}
	}
	
}
