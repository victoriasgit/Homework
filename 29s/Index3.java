public class Index3 {
 
    public static void main(String[] args) {
		
		int array1[] = {15, 0, -13, -2, 128, -2, 78, -198, -2, 78};
		int array2[] = {-2, 78};
		int index = -1;
		int sum = 0;
		
		for ( int i = 0 ; i < array1.length; i++ ) { 
        
            if ( array2[0] == array1[i] ) {
				
				index = i;
				
				for ( int j = 0 ; j < array2.length; j++) {
					if ( array2[j] == array1[i+j] ) {
						sum = sum + 1;
					}
					else {
						sum = 0;
					    break;
				    }
				}
			}
            
            if ( sum == array2.length ) {
				break;
			}			
		}
		
		if ( sum != array2.length ) {
			System.out.println( "There are not the second array in the first array." );
		} else {
			System.out.println( "Index = " + index );
		}
	}
	
}