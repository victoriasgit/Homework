public class Row { 

    public static void main(String[] args) { 
	
        int n = Integer.parseInt(args[0]);
		double sum = 0.0;
		double p = 1.0;
		double p1 = 1.0;
		
		if ( n <= 0 ) {
			
			System.out.println("The number must be positive.");
		}
		else {
		
		for ( int m = 1 ; m <= n ; m++) {
		
			for ( int i = 1; i <= ( m - 1 ) ; i++) {
			    p = p * i;
		    } 
			
			for ( int k = 1; k <= ( 2 * m ) ; k++) {
			    p1 = p1 * k ;
		    }
			
			sum = p * p / p1  + sum;
        }
		
		System.out.println(sum);
		}
				
    } 
}