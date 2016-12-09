public class BinaryCode{    //старое дз, которое почему-то было выполнено не полностью
	
	public static void main(String[] args) {
		int numb = Integer.parseInt(args[0]);
                int modulo;
		String backwards = "";
		String result = "";
                int q = 0; 
		if (numb < 0) {
			System.out.println("A number should be positive.");
		}
                else{
		    while ( numb > 0 ){
			modulo = numb % 2;
			if ( modulo == 1 ){
			    q++;
			    backwards += "1";
			}
                        else{
			    backwards += "0";
			}
			numb = numb / 2;
		   }
		
		    char[] array = backwards.toCharArray();
		    for ( int i = array.length; i > 0; i-- ){
			    result = result + array[i];
		    }
	
		    System.out.println(numb + "(10) = " + result + "(2)");
                    System.out.println("Numeral 1 in code = " + q);
                }
	}
}