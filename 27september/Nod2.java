public class Nod2 {

    public static void main(String[] args) {
		
	    int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int n = -1;
	
		if ( a < b ) {
				
				b = b + a;
		        a = b - a;
		        b = b - a;
				
            }
		
	    for ( int i = 1; i <= b; i++ ) {
			
			if ( ( ( b % i ) == 0 ) && ( ( a % i ) == 0) ) {
				n = i;
			}
		}
		
		if ( n > 0 ) {
			
			System.out.println("NOD is " + n);
			
		} else {
			System.out.println("The number must be positive.");
	    }
	
	}
}