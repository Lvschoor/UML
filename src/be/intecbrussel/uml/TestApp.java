package be.intecbrussel.uml;

import java.util.Random;

public class TestApp {

    public static void main(String[] args) {
        ClassRoom javaIot=new ClassRoom("JAVA-IOT");
        Student[] students = new Student[14];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(generateRandomStudentName());
        }

        javaIot.setStudents(students);
        javaIot.printListOfStudentNames();

        for (int i =0; i<students.length;i++){
            javaIot.getStudents()[i].getReportCard().addGrade(generateGrade());
        }
        System.out.printf("Average class grade: %.2f",javaIot.getClassAverageGrade());
        System.out.println("\nGrade 1 for student "+javaIot.getStudents()[1].getReportCard().getGrades()[1]);

    }


    public static String generateRandomStudentName() {
        char[] letters = new char[6];
        String str;
        Random random = new Random();
        char letter = (char) ((char) 97 + random.nextInt(26));
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ((char) 97 + random.nextInt(26));
        }
        str = String.valueOf(letters);
        return str;
    }

    public static int generateGrade() {
        Random random = new Random();
        int grade;
        return grade = random.nextInt(10) + 1;
    }
}

