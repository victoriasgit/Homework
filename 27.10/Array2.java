//заполнить массив, вывести его красиво и преобразовать таким образом (arrays TO STRING), каждый элемент явл произведением предыдущих двух

import java.util.Arrays;

public class Array2{

    public static void main(String[] args) {
	
	    int n = 10;
		long arr[];
		arr = new long [n];
            
		for (int i = 0; i < arr.length; i++) {        //звполнить произвольными числами
            arr[i] = (int) (Math.random() * 10);
		}
		
		for (long i: arr) {                                     //вывести заполненный
            System.out.print(i + " ");
		}
		
		System.out.println();
				
        for (int t = 2; t <= arr.length-1; t++) {     //каждое последующее - произведение двух предыдущих
            arr[t] = arr[t-1]*arr[t-2];
        }
		
		String arrStr = Arrays.toString(arr);
		System.out.println("result: " + arrStr);
	
    }
}