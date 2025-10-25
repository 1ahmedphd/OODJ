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
