public class Comission {

    public boolean compare (){	
		Student s1 = new Student();
		int exams = s1.getExams();
		int passedExams = s1.getPassedExams(); 
		int rating = s1.getRating();
		if (exams == passedExams) {
		    s1.setRating(100);
		}
		return exams == passedExams;
	}
}