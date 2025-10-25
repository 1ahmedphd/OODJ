package oodj;
import java.time.LocalDate; 
import java.util.List; 
public class RecoveryPlanMetadata {
    public enum PlanStatus /* Creating an enum to avoid typos */
    {
        ACTIVE,
        COMPLETED
    }
    private String recordID;
    private String planID;
    private String studentID;
    private int attemptNo ; 
    private String studentName;
    private String courseTitle;
    private List<String> failedComponents;
    private LocalDate createdDate; 
    private PlanStatus planStatus;
    private AcademicOfficer createdBy ;
    // Getter only (auto-generated)
    public String getRecordID() {
        return recordID;
    }

    // Getter only (fetched from RecoveryPlan)
    public String getPlanID() {
        return planID;
    }

    // Getter only (fetched from Student object)
    public String getStudentID() {
        return studentID;
    }
    // Getter only (auto-fetched from the Academic records of students): 2nd attemp only need to repeat the failed component, 3rd attempt repeat all components of the module 
    public int getAttemptNo() {
        return attemptNo;
    }
    // Getter only (fetched from Student object)
    public String getStudentName() {
        return studentName;
    }

// Getter only (fetched from course record in text file)
    public String getCourseTitle() {
        return courseTitle;
    }
// has a getter only as the failed components are automatically fetched from the academic record of the students which will be stored in a text file 
    public List<String> getFailedComponents() 
    {
        return failedComponents;
    }
// Getter only as The Academic Officer who created the Recovery plan will be fetche From The Session Class 
    public AcademicOfficer getCreatedBy()
    {
        return createdBy;
    }

    // Getter & Setter (updated based on plan progress has 2 possible value  Active / Completed 
    public PlanStatus getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(PlanStatus planStatus) {
        this.planStatus = planStatus;
    }
    
}

