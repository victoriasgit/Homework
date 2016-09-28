public class Nok {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int a1 = a;
		int b1 = b;
		int nok = 0;
	
	    if ( ( a <= 0 ) || ( b <= 0 ) ) {
			
			System.out.println("The number must be positive.");
			
		}
		else {
			
		while ( a != b ) {
			
			if ( a < b ) {
				
				b = b + a;
		        a = b - a;
		        b = b - a;
				
            }
			a = a - b;
		}       
		
	    nok = a1 * b1 / a;
		
	    System.out.println("NOK is " + nok);
		}
		
    }
}