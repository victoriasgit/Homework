import java.util.Scanner;
public class Brackets{
	
	static int open = 0;
	static int close = 0;
	static int i = 0;
	
	public static void CountBrackets(char[] str) {
		i++;
		if ( str[i-1] == '(') {
			open++;
		}
		if ( i < str.length ) {
		    CountBrackets(str);
		}
			
		i--;
		if ( str[i] == ')' ) {
			close++;
		}
	}

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] s2 = s1.toCharArray();
		int indexClose = s1.indexOf(')');
        int indexOpen = s1.indexOf('(');
        
		CountBrackets(s2);
        
        if ( indexClose < indexOpen ) {
			System.out.println("false");
		}
		else {
			System.out.println( close == open );
		}
    }
			
}