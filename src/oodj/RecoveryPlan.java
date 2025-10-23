package oodj;
import java.time.LocalDate; 
import java.util.List; 

public class RecoveryPlan {
    private String planID ; 
    private List<LocalDate> taskDates; 
    private List<String> taskList ; 
    private List<String> taskRecommendation ; 
    private List<String> taskGrade ; 
    private List<String> taskStatus ;
/* Acess modifers - setters , getters  */
    public String getPlanID () // getter only since it is ( auto-generated)
    {
        return planID ;
    }
    public List<LocalDate> getTaskDates () // getter only since it is ( auto-generated)
    {
        return taskDates ; 
    }
    public List<String> getTaskList () // getter only since it is ( auto-generated)
    {

        return taskList ; 
    }
    public void  setTaskRecommendation (List<String> taskRecommendation) // This field / attribute has a getter and setter because it is adjusted manually 
    {

        this.taskRecommendation  = taskRecommendation ; 
    }
    public List<String> getTaskRecommendation () 
    {
        return taskRecommendation ; 
    }
        public void  setTaskGrade (List<String> taskGrade) // Getter & Setter (manual input)
    {

        this.taskGrade = taskGrade ; 
    }
    public List<String> getTaskGrade () 
    {
        return taskGrade; 
    }
    public void  setTaskStatus (List<String> taskStatus)  // manually edited so it gets a setter and getter 
    {
        this.taskStatus = taskStatus ; 
    }
        public List<String>  getTaskStatus ( ) 
    {
        return taskStatus ; 
    }

}

