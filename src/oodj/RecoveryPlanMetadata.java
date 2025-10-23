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
    private int attemptNO ; 
    private String studentName;
    private String courseTitle;
    private List<String> failedComponents;
    private LocalDate createdDate; 
    private PlanStatus planStatus;
    private AcademicOfficer createdBy ; 
}
