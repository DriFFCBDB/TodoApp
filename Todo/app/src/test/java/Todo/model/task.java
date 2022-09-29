package Todo.model;

import java.util.Date;

//Classe task
public class task 
{
    //atributos do task
    private int id_task;
    private int id_project;
    private String task_name;
    private String task_description;
    private int task_completed;
    private String task_notes;
    private Date deadline;
    private Date createdAt;
    private Date updatedAt;

        //construtor
    public task(int id_task, int id_project, String task_name, String task_description, int task_completed, String task_notes, Date deadline, Date createdAt, Date updatedAt) {
        this.id_task = id_task;
        this.id_project = id_project;
        this.task_name = task_name;
        this.task_description = task_description;
        this.task_completed = task_completed;
        this.task_notes = task_notes;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //getters e setters
    public int getId_task() {
        return id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public int getTask_completed() {
        return task_completed;
    }

    public void setTask_completed(int task_completed) {
        this.task_completed = task_completed;
    }

    public String getTask_notes() {
        return task_notes;
    }

    public void setTask_notes(String task_notes) {
        this.task_notes = task_notes;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    //tostring
    @Override
    public String toString() 
    {
        return "task{" + "id_task=" + id_task 
                + ", id_project=" + id_project 
                + ", task_name=" + task_name 
                + ", task_description=" + task_description
                + ", task_completed=" + task_completed 
                + ", task_notes=" + task_notes 
                + ", deadline=" + deadline 
                + ", createdAt=" + createdAt 
                + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
