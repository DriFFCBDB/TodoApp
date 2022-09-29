package Todo.model;

import java.util.Date;

//DEFINIR ATRIBUTOS DA CLASSE PROJETO
public class project 
{
    private int id_project;
    private String project_name;
    private String project_description;
    private Date createdAt;
    private Date updatedAt;

    //CONSTRUTOR
    public project(int id_project, String project_name, String project_description, Date createdAt, Date updatedAt) 
    {
        this.id_project = id_project;
        this.project_name = project_name;
        this.project_description = project_description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //getters and setters
    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
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

     //To string
    @Override
    
    public String toString() 
    {
        return "project{" + "id_project=" + id_project 
                + ", project_name=" + project_name 
                + ", project_description=" + project_description 
                + ", createdAt=" + createdAt 
                + ", updatedAt=" + updatedAt + '}';
    }
    
  
}
