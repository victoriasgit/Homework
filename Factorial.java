public class Factorial { 

    public static void main(String[] args) { 
	
        int n = Integer.parseInt(args[0]);
		
		if ( n == 0 ) { 
                System.out.println("1"); 
            } 
		if ( n < 0 ) { 
                System.out.println("No meaning"); 
            }
			
		int p = 1;
		if ( n > 0 ) { 
                for ( int i = 1; i<=n; i++) {
			        p = p * i;
		        } 
        }
		
		System.out.println(p);
		
		
    } 
}