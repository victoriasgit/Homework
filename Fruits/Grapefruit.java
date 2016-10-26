public class Grapefruit extends Orange {
	
	private boolean bitterness;
     
    public Grapefruit(String colour, String shape, boolean bitterness) {
		super(colour, shape);
        this.bitterness = bitterness;
    }
	
	public Grapefruit(String colour, String shape) {
        super(colour, shape);
    }
	
	public boolean equals(Grapefruit grapefruit) { 
	    
		if (( grapefruit.colour == this.colour ) && ( grapefruit.shape == this.shape ) && ( grapefruit.bitterness == this.bitterness )) {
            return true;
	 	}
        else {
			return false;
		}		
    } 
	
	public String toString() {
        return "This fruit is " + colour + ". It's " + shape + ". Does it have bitterness? - " + bitterness;
    }
}