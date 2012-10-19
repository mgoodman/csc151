import java.util.ArrayList;

/**
 * A purse holds a collection of coins.
 * 
 * @author Malcolm Goodman
 */
public class Purse {

	private ArrayList<String> coins;

	/**
	 * Constructs an empty purse.
	 */
	public Purse() {
		coins = new ArrayList<String>();
	}

	/**
	 * Add a coin to the purse.
	 * 
	 * @param coinName
	 *            the coin to add
	 */
	public void addCoin(String coinName) {
		coins.add(coinName);
	}

	/**
	 * Returns a string describing the object.
	 * 
	 * @return a string in the format "Purse[coinName1,coinName2,...]"
	 */
	public String toString() {
		StringBuilder result = new StringBuilder("Purse[");

		for (String coin : coins) {
			result.append(coin).append(",");
		}
		if (coins.size() > 0) {
			result.replace(result.length() - 1, result.length(), "");
		}

		return result.append("]").toString();
	}

	/**
	 * Reverses the elements in the purse.
	 */
	public void reverse() {
		ArrayList<String> tempCoinsArray = new ArrayList<String>(coins);

		coins.clear();

		for (int i = tempCoinsArray.size() - 1; i >= 0; i--) {
			coins.add(tempCoinsArray.get(i));
		}
	}

	/**
	 * Transfer the coins from one purse to another.
	 * 
	 * @param other
	 *            the other purse
	 */
	public void transfer(Purse other) {
		for (String coin : other.coins) {
			this.addCoin(coin);
		}

		other.coins.clear();
	}

	/**
	 * Determines if a purse has the same coins in the same order as another
	 * purse.
	 * 
	 * @param other
	 *            the other purse
	 * @return true if the two purses have the same coins in the same order,
	 *         false otherwise
	 */
	public boolean sameContents(Purse other) {
		return this.toString().equals(other.toString());
	}

	/**
	 * Determines if a purse has the same coins in the same or different order
	 * as another purse.
	 * 
	 * @param other
	 *            the other purse
	 * @return true if the two purses have the same coins in the same or
	 *         different order, false otherwise
	 */
	public boolean sameCoins(Purse other) {
		if (this.toString().equals(other.toString())) {
			return true;
		}

		return coins.containsAll(other.coins) && other.coins.containsAll(coins);
	}
}