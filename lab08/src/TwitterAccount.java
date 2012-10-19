import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwitterAccount {

	private static int lastID = 0;
	
	private int id;
	private Map<Integer, Tweet> tweets = new HashMap<Integer, Tweet>();
	
	public TwitterAccount() {
		this.id = ++lastID;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Tweet addTweet(String tweetMessage) {
		Tweet tweet = new Tweet(tweetMessage);
		tweets.put(tweet.getID(), tweet);
		
		return tweet;
	}
	
	public void addTweet(Tweet tweet) {
		tweets.put(tweet.getID(), tweet);
	}
	
	public boolean removeTweet(int id) {
		boolean removed = false;
		
		if (tweets.remove(id) != null) {
			removed = true;
		}
		
		return removed;
	}
	
	public Tweet getTweet(int id) {
		Tweet tweet = this.tweets.get(id);
		if (tweet != null) {
			tweet.incrementViews();
		}
		return tweet;
	}
	
	public ArrayList<Tweet> getTweetsByHashTag(String tag) {
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		for (Map.Entry<Integer, Tweet> record : this.tweets.entrySet()) {
			if (record.getValue().hasHashTag(tag)) {
				tweets.add(record.getValue());
				record.getValue().incrementViews();
			}
		}
		
		return tweets;
	}
	
	public Tweet getMostViewedTweet() throws Exception {
		if (this.tweets.size() == 0) {
			throw new Exception("There are no tweets associated with this account.");
		}
		
		int tweetID = 0;
		
		for (Map.Entry<Integer, Tweet> record : this.tweets.entrySet()) {
			if (tweetID == 0) {
				tweetID = record.getKey();
			} else if (record.getValue().getViews() > this.tweets.get(tweetID).getViews()) {
				tweetID = record.getValue().getID();
			}
		}
		
		return this.tweets.get(tweetID);
	}
	
	public int getNumberOfTweets() {
		return this.tweets.size();
	}
}
