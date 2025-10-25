package oodj;
import java.util.List;
import java.util.ArrayList;
// SARUF: this will act as a template for now, changes can be made accordingly as we progress.
// Ahmed: Fixed ur imports coz errors look annoying af but u do ur own thing here i guess

public class AcademicRecord {
    private String recordID;
    private Student student;
    private String academicYear;
    private int degreeLevel;
    private int semester;
    private List<CourseGrade> courseGrades;
    private RecoveryPlan recoveryPlan;

    public AcademicRecord(String recordID, Student student, String academicYear, 
                          int degreeLevel, int semester) {
        this.recordID = recordID;
        this.student = student;
        this.academicYear = academicYear;
        this.degreeLevel = degreeLevel;
        this.semester = semester;
        this.courseGrades = new ArrayList<>();
    }

    public void addCourseGrade(CourseGrade cg) {
        courseGrades.add(cg);
    }

    public double calculateCGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (CourseGrade cg : courseGrades) {
            if (cg.getCourse().getCreditHours() > 0) { // safeguard
                totalPoints += cg.getGradePoint();
                totalCredits += cg.getCourse().getCreditHours();
            }
        }
        return totalCredits == 0 ? 0 : totalPoints / totalCredits;
    }

    public long countFailedCourses() {
        return courseGrades.stream().filter(cg -> !cg.isPassed()).count();
    }

    public boolean isEligibleForProgression() {
        double cgpa = calculateCGPA();
        return cgpa >= 2.0 && countFailedCourses() <= 3;
    }

    public String generateEligibilityReport() {
        return "Academic Record ID: " + recordID +
               "\nStudent: " + student.getName() + " (" + student.getStudentID() + ")" +
               "\nCGPA: " + String.format("%.2f", calculateCGPA()) +
               "\nFailed Courses: " + countFailedCourses() +
               "\nEligible to Progress: " + (isEligibleForProgression() ? "YES" : "NO");
    }
}
