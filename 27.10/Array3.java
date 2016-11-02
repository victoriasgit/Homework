//каждое число - квадрат предыдущего

import java.util.Arrays;

public class Array3{

    public static void main(String[] args) {
	
	    int n = 10;
		long arr[];
		arr = new long [n];
            
		arr[0] = (int) (Math.random() * 10);
		
		
		for (long i: arr) {                                     //вывести заполненный
            System.out.print(i + " ");
		}
		
		System.out.println();
				
        for (int t = 1; t <= arr.length-1; t++) { 		//каждое последующее - произведение двух предыдущих
           
		   arr[t] = arr[t-1]*arr[t-1];
        }
		
        String arrStr = Arrays.toString(arr);
		System.out.println("result: " + arrStr);
    }
			
}