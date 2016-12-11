import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementation of methods that work on strings
 * @author Victoria Giniatullina
 * @version 1.0
 */
public class MyString {
	/**
     * The value is used for characters storage.
     */
	private char[] signs;
	
	/**
     * The value is used for length of string.
     */
	private int length;
	
	/** 
	 * Two constructors
	 */
	public MyString (){                                 //создаем два конструктора
		
	}
	
	/** 
	 *
	 */
	public MyString (MyString s){                        //length and charAt - методы String стандарт.
    	length = s.length();
	    signs = new char [length];                 //массив
		for (int i = 0; i < length; i++){
		    signs[i] = s.charAt(i);
		}
	}
	
	/** 
	 *
	 */
	public MyString (char[] s){
        length = s.length;
        signs = new char [length];
        for (int i = 0; i < length; i++){
            signs[i] = s[i];
        }
    }
	
	/**
	 * This method returns a new string that is string1 with string2 added to it at the end. 
	 */
	public MyString concat(MyString s){
        int length = this.signs.length + s.signs.length;
        char[] temp = new char[length];
        for (int i = 0; i < this.signs.length; i++){
            temp[i] = this.signs[i];
		}
        for (int i = 0; i < s.signs.length; i++){
            temp[this.signs.length + i] = s.signs[i];
		}
        return MyString(temp);
    }
    
	/**
	 * This method converts a string to a new character array.
	 * @return a new array
	 */
    public char[] toCharArray(){
		char result[] = new char[this.length];
		for(int i =0; i < result.length; i++){
            result[i] = this.signs[i];
        }
        return result;
	}
	
	/**
	 * This method returns the character at the specified offset in this line.
	 */
	public char charAt(int index){
		if ((index < 0) || (index >= signs.length)){
		    throw new StringIndexOutOfBoundsException(index);
		}
		return signs[index];
	}
    
	/**
	 * This method return the length of string.
	 */
	public int length (){
		return length;
	}
	
	/** 
	 *
	 */
	//public int indexOf (MyString s){
		//return signs.indexOf(s);
	//}
	
	/** 
	 * This method returns a substring of the string starting with the character at "start" index, ending ("end" - 1) index.
	 */
	public MyString substring(int start, int end){
        if (start < 0){
            throw new StringIndexOutOfBoundsException(start);
		}
        if (end > length){ 
            throw new StringIndexOutOfBoundsException(end);
		}
        if (start > end){ 
            throw new StringIndexOutOfBoundsException(end - start);
		}
        MyString result = new MyString();
        result.length = length - start + 1;
        result.signs = new char[result.length];
        for (int i = 0; i < result.length; i++){
            result.signs[i] = this.signs[start + i];
		}
		return result;
    }
	
	/** 
	 * This method is used to represent an object as a string.
	 * @rerurn a new string
	 */
	public String toString (){
		return new String(signs);
	}	
    
	/** 
	 * This method receives an object as an argument
	 * Performs a comparison and returns "true" (if the two copies of the object are equal) or "false" (if they are not equal).
	 */
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyString other = (MyString) obj;
        if (length != other.length)
            return false;
        if (!Arrays.equals(signs, other.signs))
            return false;
        return true;
  }

	
	/** 
	 * This method looks for coincidences in the string according to the given regular expression and breaks the string into an array.
	 */
	//public String[] split(String regex){
	  //  String s = new String("Welcome-to-Tutorialspoint.com");
        //System.out.println("Return Value :" );      
      
        //for (String retval: s.split("-")) {
           // System.out.println(retval);
        //}
	//}
}	
