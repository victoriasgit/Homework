public class Nod1 {

    public static void main(String[] args) {
		
	    int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	
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
		
		System.out.println("NOD is " + a);
		}
	
	}
}