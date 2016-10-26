public class Doctor {
	
	protected String profession; 
    protected String branchOfScience;     //область науки
    
    public String getProfession() { 
	    return profession; 
	}
	
    public String getBranchOfScience() { 
	    return branchOfScience; 
	}
     
    public Doctor(String profession, String branchOfScience){
     
        this.profession=profession;
        this.branchOfScience=branchOfScience;
    }
	
	public boolean equals(Doctor doctor) { 
	    
		if (( doctor.profession == this.profession ) && ( doctor.branchOfScience == this.branchOfScience )) {
            return true;
	 	}
        else {
			return false;
		}		
    } 
	
	public String toString() {
        return profession + " is a " + branchOfScience + " specialist.";
    }
}

