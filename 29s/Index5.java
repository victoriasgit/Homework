public class Index5 {
 
    public static void main(String[] args) {
		
		String s1 = "0hel4helloo";
		String s2 = "hello";
		int index = -1;
		int sum = 0;

		for ( int i = 0 ; i < s1.length(); i++ ) { 
        
            if ( s2.charAt(0) == s1.charAt(i) ) {
				
				index = i;
				
				for ( int j = 0 ; j < s2.length(); j++) {
					if ( s2.charAt(j) == s1.charAt(i+j) ) {
						sum = sum + 1;
					}
					else {
						sum = 0;
					    break;
				    }
				}
			}
            
            if ( sum == s2.length() ) {
				break;
			}			
		}
		
		if ( sum != s2.length() ) {
			System.out.println( "There are not the second string in the first string." );
		} else {
			System.out.println( "Index = " + index );
		}
	}
	
}
				