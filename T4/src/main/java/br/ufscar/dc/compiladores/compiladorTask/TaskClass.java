import java.util.Comparator;   
import java.time.LocalDate;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class TaskClass {     
  private String name;     
  private LocalDate date;     
  private String local;
  private String category;
  private String description;       

  public TaskClass(String name, LocalDate date, String local, String category, String description) {         
    this.name = name;         
    this.date = date;         
    this.local = local;
    this.category = category;
    this.description = description;     
  }       

  public String getName() {         
    return name;     
  }       

  public String getLocal() {         
    return local;     
  }       

  public LocalDate getDate() {         
    return date;     
  }     

    public String getCategory() {         
    return category;     
  }       

    public String getDescription() {         
    return description;     
  }         

  public static Comparator<TaskClass> dateComparator = new Comparator<TaskClass>() {         
    @Override         
    public int compare(TaskClass task1, TaskClass task2) {             
        //task2 < task1 se sim -1 senao 
      return (task2.getDate().compareTo(task1.getDate()) <= 0 ? -1 :                     
              (task2.getDate() == task1.getDate() ? 0 : 1));           
    }     
  };       
     
  @Override     
  public String toString() {         
    return " Name: " + this.name + ", Date: " + this.date + ", Local:" + this.local + ", Category:" + this.category + ", Description:" + this.description;     
  } 
}