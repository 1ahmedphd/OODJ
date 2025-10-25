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
