package be.intecbrussel.uml;

public class ClassRoom {

    private Student[] students;
    private String nameOfClass;

    public ClassRoom(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public void addStudent(Student student) {

    }

    public double getClassAverageGrade() {
        double average = 0;
        return average;
    }

    public void printListOfStudentNames() {

    }
}
