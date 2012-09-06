import java.util.ArrayList;

public class DataSet {

	private String data = "";
	private int min;
	private int max;
	
	public DataSet() {}
	
	public void addValue(int x) {
		if (data == "") {
			data += x;
			max = x;
			min = x;
		} else {
			data += " | " + x; 
		}
		
		if (x > max) {
			max = x;
		}
		if (x < min) {
			min = x;
		}
	}
	
	public String getValues() {
		return data;
	}
	
	public int getLargest() {
		return max;
	}
	
	public int getSmallest() {
		return min;
	}
	
}
