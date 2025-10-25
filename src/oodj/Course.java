package oodj;

public class Course {
    private String courseID ; 
    private String courseName ; 
    private int credit ; 
    // ID , Name and credit will only have Getters because within the scope of this system Courses are not Created or generated so 
    // this information only gets fetched from the text file that is storing info about Courses 
    public String getCourseID () {return courseID ; }
    public String getCourseName () {return courseName ; }
    public int getcredit () {return credit ; }
}

// SARUF'S TEMPLATE (!!HELP!!: ONLY TAKE FROM THIS WHAT IS USEABLE IF ANY, THEN DELETE THE REST)

/*public class Course {
    private String courseCode;
    private String courseTitle;
    private int creditHours;

    // Constructor
    public Course(String courseCode, String courseTitle, int creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    // Getters and setters
    public String getCourseCode() { return courseCode; }
    public String getCourseTitle() { return courseTitle; }
    public int getCreditHours() { return creditHours; }

    @Override
    public String toString() {
        return courseCode + " - " + courseTitle + " (" + creditHours + " credits)";
    }
}*/
