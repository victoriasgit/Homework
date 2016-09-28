public class Circumference { 

    public static void main(String[] args) { 
	
        double x0 = Double.parseDouble(args[0]); 
        double y0 = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		double x = Double.parseDouble(args[3]); 
        double y = Double.parseDouble(args[4]);
        double s;
        s = ( x - x0 ) * ( x - x0 ) + ( y - y0 ) * ( y - y0 ) ; //Pifagor
        r = r * r;
			if ( s < r ) { 
                System.out.println("inside"); 
            }
			if ( s > r ) { 
                System.out.println("outside"); 
            }
            if ( s == r ) { 
                System.out.println("on the circumference"); 
            } 
    } 
}