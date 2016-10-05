public class Dividers {
	
    public static void main(String args[]) {
		
        int n = Integer.parseInt(args[0]);
		
		if ( n <= 0 ) {
			
			System.out.println("The number must be positive.");
			
		}
		else {
		
        for( int i = 1; i <= n; i++ ) {
			
            if ( (n % i) == 0 ) {
				
                System.out.print(i + " ");
				
            }
        }
		}
    }
}