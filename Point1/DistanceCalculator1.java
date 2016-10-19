public class DistanceCalculator1 {
		
	public double data (Point1 p){
		double x = p.getX();
		double y = p.getY();
		double x0 = p.getX0();
		double y0 = p.getY0();
		return Math.sqrt((x0-x)*(x0-x) + (y0-y)*(y0-y));
	}
}