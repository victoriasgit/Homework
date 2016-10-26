public class MyAppFruits {
	
	public static void main(String[] args) {
         
	Orange fruit1 = new Orange("Orange", "Circle");
    Grapefruit fruit2 = new Grapefruit("Orange", "Circle", true);
	System.out.println(fruit1); 
    System.out.println(fruit2);
    System.out.println(fruit1.equals(fruit2));
	}
}