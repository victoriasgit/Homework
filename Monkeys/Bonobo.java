public class Bonobo {
 
    protected String food;
    protected int numberOfLegs;
	protected boolean canRead;
    
	public Bonobo(){}
 
    public Bonobo(boolean canRead, String food, int numberOfLegs){

        this.food = food;
        this.numberOfLegs = numberOfLegs;
		this.canRead = canRead;
    }
 
    public boolean canRead() {
        return canRead;
    }
 
    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }
 
    public String getFood() {
        return food;
    }
 
    public void setFood(String food) {
        this.food = food;
    }
 
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
 
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
	
	public String toString() {
		return "Does bonobo read? -" + canRead() + ". " + "Bonobo eats " + food + ". " +
		    "Bonobo has " + numberOfLegs + " legs.";
        
    }
}