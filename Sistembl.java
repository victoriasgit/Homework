public class Sistembl { 

    public static void main(String[] args) { 
	
	    int a = Integer.parseInt(args[0]);
		int z = 0;
		int n = 0;
		int max = 0;
		int a1 = a;
		
		while ( a1 > 0 ) {
			a1 = a1 / 10;
			z = z + 1 ;
			
		}
		
		while ( a >= 1 ) {
			if ( ( a % 2 ) == 0 ) {
				n = n + 1 ;
			}
			    else if ( n >= max ) {
					max = n;
					n = 0;
	
				}
			a = a / 2;
			
		}
		
		System.out.println(max);
    } 
}