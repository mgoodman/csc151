import java.util.Map;
import java.util.HashMap;

public class Card {

	private Map<String, String> prefixes = new HashMap<String, String>();
	private Map<String, String> suffixes = new HashMap<String, String>();
	private String notation;
	
	
	public Card(String notation) {
		prefixes.put("a", "Ace");
		prefixes.put("2", "Two");
		prefixes.put("3", "Three");
		prefixes.put("4", "Four");
		prefixes.put("5", "Five");
		prefixes.put("6", "Six");
		prefixes.put("7", "Seven");
		prefixes.put("8", "Eight");
		prefixes.put("9", "Nine");
		prefixes.put("j", "Jack");
		prefixes.put("q", "Queen");
		prefixes.put("k", "King");
		
		suffixes.put("s", "spades");
		suffixes.put("c", "clubs");
		suffixes.put("h", "hearts");
		suffixes.put("d", "diamonds");
		
		this.notation = notation;
	}
	
	public String getDescription() {
		String prefix = notation.substring(0, 1).toLowerCase();
		String suffix = notation.substring(1, 2).toLowerCase();
		
		prefix = prefixes.get(prefix);
		suffix = suffixes.get(suffix);
		
		if (prefix == null || suffix == null) {
			return "Unknown";
		} else {
			return prefix + " of " + suffix;
		}
	}
	
}
