package be.intecbrussel.uml;

public class ReportCard {

    private int[] grades = new int[10];
    private int numberOfGrades;

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        numberOfGrades++;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 0) {
                grades[i] = grade;
                break;
            }
        }
    }

    public double getAverageGrade() {
        double average = 0;
        for (int grade : grades) {
            if (grade != 0) {
                average = +grade;
            }
            if (numberOfGrades != 0) {
                average /= numberOfGrades;
            } else average = 0;
        }
        return average;
    }

}

