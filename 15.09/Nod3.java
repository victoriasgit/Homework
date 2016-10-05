public class Nod3 {

    public static void main(String[] args) {
		
	    int a1 = Integer.parseInt(args[0]);
		int b1 = Integer.parseInt(args[1]);
		int a2 = a1;
		int b2 = b1;
		int nod2;
		
		if ( ( a1 <= 0 ) || ( b1 <= 0 ) ) {
			
			System.out.println("The number must be positive.");
			
		}
		else {
		
		
		long t1 = System.nanoTime();
		while ( a1 != b1 ) {
			
			if ( a1 < b1 ) {
				
				b1 = b1 + a1;
		        a1 = b1 - a1;
		        b1 = b1 - a1;
				
            }
			a1 = a1 - b1;                         //a1 - nod
		}       
		long t1k = System.nanoTime();
		t1 = t1k-t1;                              // it's time calculation by Euclid's algorithm
	
	
	
		long t2 = System.nanoTime();
	    for ( int i = 1; i <= b2; i++ ) {
			
			if ( ( ( b2 % i ) == 0 ) && ( ( a2 % i ) == 0) ) {
				
				nod2 = i;                    
				
			}
		}
		long t2k = System.nanoTime();
		t2 = (t2k - t2);                          // it's time calculation by exhaustive method
	
	
		
		if (t1 < t2) {
			
			System.out.println ("Euclid's algorithm (" + t1 + " nanosec) is faster than exhaustive method (" + t2 + " nanosec).");
			
		}
		    else { 
		
		        System.out.println ("Exhaustive method (" + t2 + " nanosec) is faster than Euclid's algorithm (" + t1 + " nanosec).");
			 
		    }
		}
    }
}