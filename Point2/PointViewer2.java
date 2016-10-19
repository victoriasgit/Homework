public class PointViewer2 {
	
	public static void main(String[] args)  {
		
	    Point2 p = new Point2();
        p.scan();  		
		DistanceCalculator2 d = new DistanceCalculator2();
		System.out.println ("Distance = " + d.data(p));  
	}
}