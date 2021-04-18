import java.time.LocalDate;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.ArrayList; 
import java.util.Collections;                  

public class TaskSorter {     
  ArrayList<TaskClass> task = new ArrayList<>();       

  public TaskSorter(ArrayList<TaskClass> task) {         
    this.task = task;     
  }       

  public ArrayList<TaskClass> getSortedTaskByDate() {         
    Collections.sort(task, TaskClass.dateComparator);         
    return task;     
  }       
}