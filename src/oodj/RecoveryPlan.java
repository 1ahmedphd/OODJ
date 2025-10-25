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
    //public RecoveryPlan ( String planID,List<LocalDate> taskDates ,List<String> taskList ,List<String> taskRecommendation, List<String> taskGrade,List<String> taskStatus ) {}
    public void Recoveryplan () 
    {

    }

    // Note that the tasks for each Recovery plan will be based on the failed component 
    // Given The data there are 20 Unique Coruse : which are : 
        /* [1] "Algorithms"             
    [2] "Artificial Intelligence"
    [3] "Biology"                
    [4] "Chemistry"              
    [5] "Operating Systems"      
    [6] "English Composition"    
    [7] "Literature"             
    [8] "Software Engineering"   
    [9] "Database Systems"       
    [10] "Data Structures"        
    [11] "Cybersecurity"          
    [12] "Philosophy"             
    [13] "Machine Learning"       
    [14] "Computer Science"       
    [15] "Mathematics"            
    [16] "History"                
    [17] "Physics"                
    [18] "Economics"              
    [19] "Networking"             
    [20] "Statistics" */
}

