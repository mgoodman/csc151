import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class TwitterAccountTest {
	
	@Test
	public void testGetID() {
		TwitterAccount account = new TwitterAccount();
		assertEquals(1, account.getID());
	}

	@Test
	public void testAddTweetString() {
		TwitterAccount account = new TwitterAccount();
		Tweet tweet = account.addTweet("Hello World! #hashtagone");
		
		assertEquals("Hello World! #hashtagone", tweet.getMessage());
		assertEquals(tweet, account.getTweet(tweet.getID()));
	}

	@Test
	public void testAddTweetTweet() {
		TwitterAccount account = new TwitterAccount();
		Tweet tweet = new Tweet("Second Tweet! #hashtagtwo #hashtagthree");
		account.addTweet(tweet);
		
		assertEquals(tweet, account.getTweet(tweet.getID()));
	}

	@Test
	public void testRemoveTweet() {
		TwitterAccount account = new TwitterAccount();
		Tweet tweet = account.addTweet("Hello World! This is my third tweet! #yay");
		
		assertTrue(account.removeTweet(tweet.getID()));
		assertNull(account.getTweet(tweet.getID()));
	}

	@Test
	public void testGetTweet() {
		TwitterAccount account = new TwitterAccount();
		account.addTweet("Tweet 1");
		Tweet tweet2 = account.addTweet("Tweet 2");
		Tweet result = account.getTweet(tweet2.getID());
		
		assertNotNull(result);
		assertEquals(tweet2, result);
		assertNull(account.getTweet(0));
	}

	@Test
	public void testGetTweetsByHashTag() {
		TwitterAccount account = new TwitterAccount();
		ArrayList<Tweet> expected = new ArrayList<Tweet>();
		
		Tweet tweet1 = account.addTweet("Another random tweet! #hashtagr");
		Tweet tweet2 = account.addTweet("Yet another random tweet! #hashtagr");
		
		expected.add(tweet1);
		expected.add(tweet2);
		
		assertArrayEquals(expected.toArray(), account.getTweetsByHashTag("hashtagr").toArray());
	}

	@Test
	public void testGetMostViewedTweet() {
		TwitterAccount account = new TwitterAccount();
		Tweet tweet1 = account.addTweet("Tweet 1.. This tweet will never be viewed.. QQ #hashpro");
		Tweet expected = account.addTweet("Tweet 2 #hashpro");
		
		account.getTweetsByHashTag("hashpro");
		
		try {
			assertEquals(tweet1, account.getMostViewedTweet());
		} catch (Exception e) {
			fail ("Something is seriously wrong: " + e.getMessage());
		}
		
		account.getTweet(expected.getID());
		
		try {
			assertEquals(expected, account.getMostViewedTweet());
		} catch (Exception e) {
			fail ("Something is seriously wrong: " + e.getMessage());
		}
	}
	
	@Test
	public void testGetNumberOfTweets() {
		TwitterAccount account = new TwitterAccount();
		account.addTweet("Tweet 1");
		account.addTweet("Tweet 2");
		
		assertEquals(2, account.getNumberOfTweets());
	}
	
}
