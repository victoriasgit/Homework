public class Orange {
	
	protected String colour; 
    protected String shape;
    
    public String getColour() { 
	    return colour; 
	}
	
    public String getShape() { 
	    return shape; 
	}
     
    public Orange(String colour, String shape){
     
        this.colour=colour;
        this.shape=shape;
    }
  
	public boolean equals(Orange orange) { 
	    
		if (( this.colour == orange.colour ) && ( this.shape == orange.shape )) {
            return true;
	 	}
        else {
			return false;
		}		
    } 
	
	public String toString() {
        return "This fruit is " + colour + ". It's " + shape;
    }
}