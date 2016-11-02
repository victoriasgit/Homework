//заполнить массив случайными числами от 0 до 1000 и перевернуть его

public class Array1{

    public static void main(String[] args) {
	
	    int n = 10;
		int arr[];
		arr = new int [n];
            
		for (int i = 0; i < arr.length; i++) {        //звполнить произвольными числами
            arr[i] = (int) (Math.random() * 1000);
		}
		
		for (int i: arr) {                                     //вывести заполненный
            System.out.print(i + " ");
		}
		
		System.out.println();
				
        for (int t = 0; t < arr.length / 2; t++) {     //перевернуть
            int tmp = arr[t];
            arr[t] = arr[arr.length - t - 1];
            arr[arr.length - t - 1] = tmp;
        }
		
		for (int b = 0; b < arr.length; b++) {     //вывести перевернутый
			System.out.print(arr[b] + " ");
		}
    }
			
}
