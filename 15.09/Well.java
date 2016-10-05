public class Well {
	
    public static void main(String[] args) {
		
        double t = Double.parseDouble(args[0]);
        double g = 9.8;
		double h;
		
        if ( t <= 0 ) {
			
			System.out.println("The number must be positive.");
		}
		else {
			
		h = g * t * t / 2; 
        System.out.println(h + " metres");
		}
		
    } 
}