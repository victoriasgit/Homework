public class Cosx { 

    public static void main(String[] args) { 
	
        int n = Integer.parseInt(args[0]); 
        double x = Double.parseDouble(args[1]); 
        double sum = 0.0; 
		
        if ( n <= 0 ) {
			
			System.out.println("The number must be positive.");
		}
		else {
			
		for ( int i = 0; i < n; i++ ) {
			
            sum = Math.cos(x + sum); 
        } 
		
        System.out.println(sum);
		}		
		
    } 
}