public class Palindrom6 {
 
    public static void main(String[] args) {
		
		String s = "hellehe";
        char[] m = s.toCharArray();
		char[] m1 = new char[m.length];
		int sum = 0;
		
		for ( int i = 0; i < m.length ; i++) { //переворачиваем  наоборот
            m1[i] = m[m.length - i - 1];
        }
			
		for ( int j = 0; j < m.length; j++ ){
				
			if ( m1[j] == m[j] ){
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