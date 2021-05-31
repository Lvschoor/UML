package be.intecbrussel.uml;

public class ClassRoom {

    private Student[] students = new Student[14];
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
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }

    }

    public double getClassAverageGrade() {
        double average = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                average += students[i].getReportCard().getAverageGrade();
            }
        }
        average /= Student.numberOfStudents;
        return average;
    }

    public void printListOfStudentNames() {
        for (Student student : students) {
            if (student.getName() != null) {
                System.out.println(student.getName());
            }
        }


    }
}
