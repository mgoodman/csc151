import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tweet {

	private static int lastID = 0;
	
	private static final Pattern hashTagPattern = Pattern.compile("#(\\w+)");
	
	private int id;
	private String message;
	private int views;
	private ArrayList<String> hashTags = new ArrayList<String>();
	
	public Tweet(String message) {
		this.id = ++lastID;
		this.views = 0;
		
		if (message.length() > 80 || message.length() < 0) {
			this.message = message.substring(0,79);
		} else {
			this.message = message;
		}
		
		
		this.extractHashTags();
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public int getViews() {
		return this.views;
	}
	
	public void incrementViews() {
		this.views += 1;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("(");
		result.append(id).append("): ").append(this.message);
		result.append("\nThis Tweet has been viewed ").append(this.views).append(" times.\n");
		
		return result.toString();
	}
	
	public boolean hasHashTag(String tag) {
		return this.hashTags.contains(tag);
	}
	
	private void extractHashTags() {
		Matcher m = hashTagPattern.matcher(this.message);
		
		while (m.find()) {
			this.hashTags.add(m.group(1));
		}
	}
	
}
