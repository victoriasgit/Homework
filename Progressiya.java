public class Progressiya { 

    public static void main(String[] args) { 
	
        int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		int d;
		int an;
		
		if ( n <= 0 ){
			System.out.println ("The number must be positive.")
		}
		else {
		
		d = a2 - a1;
		an = a1 + d * (n-1);
		System.out.println (an);
		}
		
    } 
}