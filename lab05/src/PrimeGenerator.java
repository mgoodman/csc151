
public class PrimeGenerator {

	private int number;
	private int lastPrime = 1;
	
	public PrimeGenerator(int number) {
		this.number = number;
	}
	
	public int nextPrime() {
		boolean skip = false;
		for (int i = lastPrime + 1; i < number; i++) {		
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					skip = true;
				}
			}
			if (skip == true) {
				skip = false;
				continue;
			}
			lastPrime = i;
			return i;			
		}
		return -1;
	}
	
}
