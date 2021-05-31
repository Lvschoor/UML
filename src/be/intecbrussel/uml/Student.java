package be.intecbrussel.uml;

public class Student {

    private int studentId;
    private String name;
    private ReportCard reportCard;
    public static int numberOfStudents;

    public Student(String name) {
        this.name = name;
        studentId=numberOfStudents+1;
        numberOfStudents++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }
}
