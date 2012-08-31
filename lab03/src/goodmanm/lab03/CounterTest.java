

public class CounterTest {
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
		increaseTest(c);
		decreaseTest(c);
		
		c = new Counter(5, 10);
		increaseTest(c);
		decreaseTest(c);
		
	}
	
	public static void increaseTest(Counter c) {
		for (int i = 0; i < 100; i++) {
			c.increase();
			System.out.println(c.getCount());
		}
		System.out.println("---------------");
	}
	
	public static void decreaseTest(Counter c) {
		for (int i = 0; i < 100; i++) {
			c.decrease();
			System.out.println(c.getCount());
		}
		System.out.println("---------------");
	}
	
}
