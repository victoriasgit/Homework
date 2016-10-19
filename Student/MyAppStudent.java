public class MyAppStudent {
	
	public static void main(String[] args) {
		
		int exams = 9;
		int passedExams = 9;
		int rating = 99;
		
	    Student s1 = new Student();
	    s1.setExams(exams);
	    s1.setPassedExams(passedExams);
		s1.setName("Emil");
		s1.setMidName("Marguzovich");
		s1.setSurName("Zaynullin");
		s1.setCourse(1);
		s1.setRating(99);
		s1.setBooks(3);
		
	    s1.setComission(false);    //комиссия - false, когда мы сдали всё без комиссии или прошли успешно комиссию
		s1.setArmy(false);
	    
		System.out.println(s1.getWelcom());
		System.out.println(s1.getCompare());
		System.out.println(s1.getArmy());
		System.out.println(s1.getReplace());
		System.out.println(s1.getBye());
		
	}
}