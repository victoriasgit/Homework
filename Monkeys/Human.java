public class Human extends Bonobo{
 
    private String name;
 
    public Human(boolean canRead, String food, int numberOfLegs) {
        super(canRead, food, numberOfLegs);
        this.name = "Garry";
    }
 
    public Human(boolean canRead, String food, int numberOfLegs, String name){
        super(canRead, food, numberOfLegs);
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
	
	public String toString() {
        return "Does Human read? -" + canRead + ". " + "Human eats " + food + ". " +
            "Human has " + numberOfLegs + " legs. " + "Human's name is " + name + ".";
    }
}