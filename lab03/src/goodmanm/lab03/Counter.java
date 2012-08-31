

public class Counter {

	private int i = 0;
	private int total = 0;
	
	public Counter() {
		i = 1;
		total = 0;
	}
	
	public Counter(int value, int count) {
		i = count;
		total = value;
	}
	
	public void increase() {
		total += i;
	}
	
	public void decrease() {
		total -= i;
	}
	
	public int getCount() {
		return total;
	}
	
}
