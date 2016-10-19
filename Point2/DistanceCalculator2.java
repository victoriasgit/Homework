public class DistanceCalculator2 {
		
	public double data (Point2 p){
		double x = p.getX();
		double y = p.getY();
		double x0 = p.getX0();
		double y0 = p.getY0();
		return Math.sqrt((x0-x)*(x0-x) + (y0-y)*(y0-y));
	}
}