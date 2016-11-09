import java.util.ArrayList;

public class Diary {
	private Task task;
	private ArrayList<Task> allTasks;
	private boolean status = false;
	
	public Diary() {
		allTasks = new ArrayList<>();
		task = new Task();
	}
	
	public boolean addTask(Task task) {
		status = allTasks.add(task);
		return status;
	}
	
	
	public boolean removeTask(Task task) {
		status = allTasks.remove(task);
		return status;
	}
	
	public ArrayList<Task> getAllTasks() {
		return allTasks;
	}
}
