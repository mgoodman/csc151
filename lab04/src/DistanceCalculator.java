
public class DistanceCalculator {

	private int lastX;
	private int lastY;
	
	private double totalDistance;
	
	public DistanceCalculator(){
		lastX = 0;
		lastY = 0;
	}
	
	public double addPoint(int x, int y) {
		double deltaDistance = Math.sqrt(Math.pow(x - lastX, 2) + Math.pow(y - lastY, 2));
		
		totalDistance += deltaDistance;
		lastX = x;
		lastY = y;
		
		return deltaDistance;
	}
	
	public double getTotalDistance() {
		return totalDistance;
	}
	
	public double getTotalDistanceInMiles() {
		return totalDistance * 0.621371;
	}
	
}
