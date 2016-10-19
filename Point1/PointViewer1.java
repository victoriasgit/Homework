import java.io.*; //сканнер не нужен, т.к. не используем его, а только через поинт
public class PointViewer1 {
	
	public static void main(String[] args)  throws FileNotFoundException {
		
	    Point1 p = new Point1();
		p.scan();                
		DistanceCalculator1 d = new DistanceCalculator1();
		System.out.println ("Distance = " + d.data(p)); 
	}
}