public class Triangle {
     
    public static void main(String[] args) {
		
        int n = Integer.parseInt(args[0]);
		int p = n;
		
		if ( n <= 0 ) {
			
			System.out.println("The base of the triangle must be greater than 0.");
		}
		else {
		
        for ( int i = 0; i < n; i++ ) {
			
			for ( int k = p ; k > 1; ) {
				
				System.out.print(' ');
				k = k - 1;
			}	
				
            for ( int j = 0; j <= i; j++ ) {
				
                System.out.printf(" %s", '*');
            }
			
            System.out.println();
			p = p - 1;
        }
		}
	
    }

}