public class Surgeon extends Doctor {    //хирург
	
	protected boolean doOperation;
     
    public Surgeon(String profession, String branchOfScience, boolean doOperation) {
     
        super(profession, branchOfScience);
		this.doOperation = doOperation;
        
    }
	
	public boolean equals(Surgeon surgeon) { 
	    
		if (( surgeon.profession == this.profession ) && ( surgeon.branchOfScience == this.branchOfScience ) && ( surgeon.doOperation == this.doOperation )) {
            return true;
	 	}
        else {
			return false;
		}		
    } 
	
	public String toString() {
        return profession + " is a " + branchOfScience + " specialist." + " Does this specialist different operations? - " + doOperation + ".";
    }
}