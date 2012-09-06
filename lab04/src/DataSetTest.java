
public class DataSetTest {

	public static void main(String[] args) {
		
		DataSet set = new DataSet();
		
		set.addValue(5);
		set.addValue(2);
		set.addValue(1);
		
		System.out.println("getValues() test. Expected: 5 | 2 | 1");
		System.out.println(set.getValues());
		
		System.out.println("getLargest() test. Expected: 5");
		System.out.println(set.getLargest());
		
		System.out.println("getSmallest() test. Expected: 1");
		System.out.println(set.getSmallest());
		
	}
	
}
