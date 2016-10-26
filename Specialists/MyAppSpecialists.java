public class MyAppSpecialists {
	
	public static void main(String[] args) {
         
    Doctor specialist1 = new Doctor("doctor", "medicine");
	Surgeon specialist2 = new Surgeon("doctor", "medicine", true);
    Cardiac specialist3 = new Cardiac("doctor", "medicine", true, true);

	System.out.println(specialist1); 
    System.out.println(specialist2);
	System.out.println(specialist3);
	
    System.out.println(specialist1.equals(specialist2));
	System.out.println(specialist1.equals(specialist3));
	System.out.println(specialist2.equals(specialist3));
	}
}