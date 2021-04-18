package br.ufscar.dc.compiladores.compiladorTask;

import java.util.ArrayList; 
import java.util.Collections;                  

public class TaskSorter {     
  ArrayList<TaskClass> task = new ArrayList<>();       

  public TaskSorter(ArrayList<TaskClass> task) {         
    this.task = task;     
  }       

  public ArrayList<TaskClass> getSortedTaskByDate() {         
    Collections.sort(task, TaskClass.dateComparator); 
    Collections.reverse(task);
    return task;     
  }       
}