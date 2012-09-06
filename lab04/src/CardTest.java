import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a card notation: ");
		String notation = s.next();
		
		Card c = new Card(notation);
		System.out.println(c.getDescription());
		
		s.close();
		
	}
	
}
