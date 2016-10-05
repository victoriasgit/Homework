public class Bubble1 {
	
    public static void main(String args[]) { 
	
	    int size = 10;
        int array[] = {15, 0, -13, 4, 128, -1000, 13, -198, -2, 78};
	
        System.out.print( "Before:" );
		for ( int i = 0 ; i < size ; i++ ) {
			
            System.out.print( " " + array[i] );
		}
		
        System.out.println();
	    for ( int j = 1 ; j <= size ; j++ ) { //итераций столько же, сколько элементов в массиве
			
            for ( int a = 1 ; a <= size-j ; a++ ) { //итераций столько же, сколько пар элементов
				                                    //максимальный элемент окажется на последнем месте
                if ( array[a-1] > array[a] ) { 
                                    
                    int t = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = t;
                }
		    }
        }
 
        System.out.print( "After:" );
        for( int k = 0; k < size ; k++ ) {
			
            System.out.print( " " + array[k] );
	    }
    }
}