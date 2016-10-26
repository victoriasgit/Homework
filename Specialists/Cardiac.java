public class Cardiac extends Surgeon {            //кардиолог
	
    private boolean heartSurgery;                //сердечная хирургия
     
    public Cardiac(String profession, String branchOfScience, boolean doOperation, boolean heartSurgery) {
     
        super(profession, branchOfScience, doOperation);
		this.heartSurgery = heartSurgery;
        
    }
     
	
	public boolean equals(Cardiac cardiac) { 
	    
		if (( cardiac.profession == this.profession ) && ( cardiac.branchOfScience == this.branchOfScience ) && ( cardiac.doOperation == this.doOperation &&
		cardiac.heartSurgery == this.heartSurgery)) {
            return true;
	 	}
        else {
			return false;
		}		
    } 
	
	public String toString() {
        return profession + " is a " + branchOfScience + " specialist." + " Does this specialist different operations? - " + doOperation + "." +
		" Does this surgeon heart operations? - " + heartSurgery + ".";
    }

}