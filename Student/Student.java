public class Student {
 

    String surname;
	String name;
    String midName;
    int course;
	int exams;
	int passedExams;
	boolean comission;
	int rating;
	int books;
	Comission com1 = new Comission();
	Rating r1 = new Rating();
	Books b1 = new Books();
 
    Student(String name, String surname, String midName, int course, int exams, int passedExams, boolean comission, int rating, int books) {
 
        this.name = name;
        this.surname = surname;
        this.midName = midName;
        this.course = course;
		this.exams = exams;
		this.rating = rating;
		this.books = books;
        
    }
 
    Student() {
 
        this.name = "";
        this.surname = "";
        this.midName = "";
        this.course = 0;
		this.rating = 0;
		this.books = 0;
		
        
    }
	
	String getWelcom(){
		return "Hello, " + this.getSurname() + " " + this.getMidName() + " " + this.getName() + "! ";
	}
	
	String getCompare(){
		if (com1.compare()) {  
		    return "You were transferred to the" + this.getCourse() + " course. " ;
		}
			else {
				return "You should pass exams to comission. ";
			}
	}
	
	String getArmy(){
		if (r1.army()) {
			return "Yee, you shouldn't go to the army. " ;
		}
		else {
			return "Sorry, you will go to the army. " ;
		}
	}
	
	String getReplace(){
		if (b1.replace() == true) {
			return "And, please, return books to the library. ";
		}
		else {
			return "You have good reputation in the library." ;
		}
	}
	
	String getBye(){
		return "Thank you for using this program.";
	}
	
 
    String getSurname() {
        return surname;
    }
	
	String getName() {
        return name;
    }
 
    String getMidName() {
        return midName;
    }
 
    int getCourse() {
        return course;
    }
	
    int getRating() {
		return rating;
	}
	
	String getComission() {
		boolean b = com1.compare();
		if (b) {
			return "Student isn't on comission.";
		}
		else {
			return "Student is on comission.";
		}
	}
 
 
    int getBooks() {
		return books;
	}
	
    int getExams() {
		return exams;
	}
	
    int getPassedExams() {
		return passedExams;
	}
	
    void setSurName(String setName) {
        this.surname = setName;
    }
	
	void setName(String name) {
        this.name = name;
    }
 
    void setMidName(String midName) {
        this.midName = midName;
    }
 
    void setCourse(int course) {
        this.course = course;
    }
	
	void setComission(boolean com1) {
		com1 = false;
	}
	
	void setRating(int rating) {
		this.rating = rating;
	}
 
	void setExams(int exams) {
		this.exams = exams;
	}
	
	void setPassedExams(int exams) {
		this.passedExams = passedExams;
	}
	
	void setBooks(int books) {
		this.books = books;
	}
	
	void setArmy(boolean army) {
		if (army) {
			this.rating = 60;
		}
		else {
			this.rating = 49;
		}
	}
}