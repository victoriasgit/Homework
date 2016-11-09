import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Diary my = new Diary();
		ArrayList<Task> allTasks;
		Task task;                                                                        
		String date, title, content;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. To add note\n2. To check the date\n3. All notes\n0. Exit");    
		int menuPoint;
		boolean quit = false;
		
		do {
			System.out.print("Select point of the menu: ");
			menuPoint = sc.nextInt();
			sc.nextLine();
			switch (menuPoint) {
			case 1:
				System.out.print("Date: ");
				date = sc.nextLine();
				System.out.print("Title: ");
				title = sc.nextLine();
				System.out.print("Task: ");
				content = sc.nextLine();
				task = new Task(date, title, content);              
				my.addTask(task);                                    
				break;
			case 2:
				allTasks = my.getAllTasks();
				System.out.print("Date: ");
				date = sc.nextLine();
				for(Task task1: allTasks) {                       
					if(date.equals(task1.getDate())) {
						System.out.println(task1);
					} else {
						System.out.println("No notes");
						break;
					}
				}
				break;
			case 3:
				allTasks = my.getAllTasks();
				for(Task task1: allTasks) {
					System.out.println(task1);
				}
				break;
			case 0:
				quit = true;
				break;
			default:                                          
				System.out.println("Incorrect.");
				break;
		}
		} while (!quit);                  
		System.out.println("Bye-bye!");
		
	}

}
