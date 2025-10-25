package oodj;

// SARUF: this will act as a template for now, changes can be made accordingly as we progress.

public class Student {
    private String studentID;
    private String name;
    private String program;
    private List<AcademicRecord> records;

    public Student(String studentID, String name, String program) {
        this.studentID = studentID;
        this.name = name;
        this.program = program;
        this.records = new ArrayList<>();
    }

    public double calculateCGPA() {
        if (records.isEmpty()) return 0.0;
        // Compute based on most recent record
        return records.get(records.size() - 1).calculateCGPA();
    }

    public boolean checkEligibility() {
        if (records.isEmpty()) return false;
        return records.get(records.size() - 1).isEligibleForProgression();
    }

    public void enrolRecovery(RecoveryPlan plan) {
        // Implementation can be added later when integrating with RecoveryPlan
    }

    public String getStudentID() { return studentID; }
    public String getName() { return name; }
}

