package oodj;

public class CourseGrade {
    private Course course ; 
    private int numericGrade ; 
    public Course getCourse() {return course ;}
    public void setCourse(Course course ) {this.course = course;}
    // Getter & Setter for numericGrade
    public int getNumericGrade() {
        return numericGrade;
    }

    public void setNumericGrade(int numericGrade) {
        this.numericGrade = numericGrade;
    }

    public CourseGrade(Course course , int numericGrade) 
    {
        this.course = course ; 
        this.numericGrade = numericGrade ; 
    }


    // Getting the Grade Letter without Storing it explicity
    public String returnLetterGrade() {
        if (numericGrade >= 80)
            return "A+";
        else if (numericGrade >= 75)
            return "A";
        else if (numericGrade >= 70)
            return "B+";
        else if (numericGrade >= 65)
            return "B";
        else if (numericGrade >= 60)
            return "C+";
        else if (numericGrade >= 55)
            return "C";
        else if (numericGrade >= 50)
            return "C-";
        else if (numericGrade >= 40)
            return "D";
        else if (numericGrade >= 30)
            return "F+";
        else if (numericGrade >= 20)
            return "F";
        else
            return "F-";
    }
}

// SARUF'S TEMPLATE (!!HELP!!: ONLY TAKE FROM THIS WHAT IS USEABLE IF ANY, THEN DELETE THE REST)

/*public class CourseGrade {
    private Course course;
    private double grade;      // 0.0 to 4.0 scale
    private String status;     // "Passed" / "Failed"

    public CourseGrade(Course course, double grade) {
        this.course = course;
        this.grade = grade;
        this.status = (grade >= 2.0) ? "Passed" : "Failed";
    }

    public boolean isPassed() { return grade >= 2.0; }

    public double getGradePoint() {
        return grade * course.getCreditHours();
    }

    public Course getCourse() { return course; }
    public double getGrade() { return grade; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return course.getCourseCode() + " - " + course.getCourseTitle() +
               ": " + grade + " (" + status + ")";
    }
}*/
