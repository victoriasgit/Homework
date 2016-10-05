public class Compare4 {
 
    public static void main(String[] args) {
        
        String s1 = "hello";
		String s2 = "hellu";
        char[] m1=s1.toCharArray();
		char[] m2=s2.toCharArray();
		int sum = 0;
		
		if ( m1.length != m2.length ){
			System.out.println ("false");
		}
		
		else {
			for ( int i = 0; i < m1.length; i++ ){
				
			    if ( m1[i] == m2[i] ){
						sum = sum + 1;
				}
				
			}
			
			if ( sum == m1.length ) {
				System.out.println("true");
			}
			else {
				System.out.println("false");	
			}
		}
    }
}
		
		
		