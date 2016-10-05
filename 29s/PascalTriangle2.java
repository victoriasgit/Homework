public class PascalTriangle2 {
 
    public static void main(String[] args) {
        
        int lines = 10;
		int d = lines+13;

        int [][] p = new int [lines][];
        p[0] = new int [1];
        p[1] = new int [2];
        p[1][0] = p[1][1] = 1;
		
        for ( int i = 2; i < lines; i++) {
			for ( int k = d ; k > 1; ) {
				
				System.out.print("  ");
				k = k - 1;
			}	
			
            p[i] = new int [i+1];
			
                System.out.print((p[i][0] = 1) + "  ");
                for (int j = 1; j < i; j++)
                {
                    System.out.print((p[i][j] = p[i-1][j-1] + p[i-1][j]) + " ");
                }
			
			
				
			
            System.out.print(p[i][i]=1);
			System.out.println();
			
			d = d - 2;
        }
    }
 
}