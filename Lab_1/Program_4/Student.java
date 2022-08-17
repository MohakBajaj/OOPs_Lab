package Lab_1.Program_4;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);

    int[] accept_marks() {
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    int[] sort_marks(int[] marks) {
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (marks[i] > marks[j]) {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        return marks;
    }

    int[] convert_grades(int[] marks) {
        int grades[] = new int[10];
        for (int i = 0; i < 10; i++) {
            if (marks[i] < 40) {
                grades[i] = 0;
            } else if (marks[i] >= 40 && marks[i] < 50) {
                grades[i] = 1;
            } else if (marks[i] >= 51 && marks[i] <= 75) {
                grades[i] = 2;
            } else if (marks[i] >= 76 && marks[i] <= 100) {
                grades[i] = 3;
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Student s = new Student();
        int[] marks = s.accept_marks();
        int[] sorted_marks = s.sort_marks(marks);
        int[] grades = s.convert_grades(sorted_marks);
        System.out.println("Marks \tGrades ");
        for (int i = 0; i < 10; i++) {
            String grade;
            if (grades[i] == 0) {
                grade = "FAIL";
            } else if (grades[i] == 1) {
                grade = "PASS";
            } else if (grades[i] == 2) {
                grade = "MERIT";
            } else {
                grade = "DISTINCTION";
            }
            System.out.println(sorted_marks[i] + "\t" + grade);
        }
    }

}
