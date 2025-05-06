package com.mycompany.fun;

public class Task {
    private String name;
    private int id;
    public static int taskCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Task(String name){
        this.name = name;
        taskCount++;
    }
    public static void displayTasks(Task tasksArray[]){
        if(tasksArray.length >= taskCount){
            for(int i = 0; i<taskCount&& tasksArray[i]!= null;i++){
            System.out.println((i+1)+") "+tasksArray[i].getName());
        }    
       }
    }
    public static void getTaskWithId(int id, Task tasksArray[]){
        System.out.println("Task name: "+tasksArray[id].getName());
        System.out.println("Task id: "+tasksArray[id].getId());
        
    }

    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", id=" + id + '}';
    }
    
            
}
