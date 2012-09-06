
public class DistanceCalculatorTest {

	public static void main(String[] args) {
		
		DistanceCalculator d = new DistanceCalculator();
		
		d.addPoint(1, 1);
		d.addPoint(5,9);
		d.addPoint(8,16);
		d.addPoint(0,0);
		
		System.out.println("Total distance traveled: " + d.getTotalDistance() + "km");
		System.out.println("In miles: " + d.getTotalDistanceInMiles() + "mi");
		
	}
	
}
