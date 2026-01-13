package January.java.Intermediate;
import java.util.Scanner;
abstract class StudentData extends Student {
    String[] subjects = {"Maths", "Science", "History"};
    double Marks;
    String grade;
    abstract void calculateGrade();
    void displayInfo(){
        System.out.println("Grade: " + grade);
    }
}
class Undergraduate extends StudentData {
    void calculateGrade() { 
        if(Marks > 100 || Marks < 0){
            grade = "Invalid Marks";
            return;
        } else if (Marks >= 90) {
            grade = "A";
        } else if (Marks >= 80) {
            grade = "B";
        } else if (Marks >= 70) {
            grade = "C";
        } else if (Marks >= 60) {
            grade = "D";
        } else if (Marks >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
    }
}
class X extends StudentData {
    void calculateGrade() { 
        if(Marks > 100 || Marks < 0){
            grade = "Invalid Marks";
            return;
        } else if (Marks >= 95) {
            grade = "A++";
        } else if (Marks >= 85) {
            grade = "A+";
        } else if (Marks >= 75) {
            grade = "A";
        } else if (Marks >= 65) {
            grade = "A-";
        } else if (Marks >= 55) {
            grade = "B+";
        } else if (Marks >= 45) {
            grade = "B";
        } else if (Marks >= 33) {
            grade = "B-";
        } else {
            grade = "Fail";
        }
    }
}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student type (UG/X): ");
        String studentType = sc.next();
        StudentData student = null;
        if(studentType.equalsIgnoreCase("UG")) {
            student = new Undergraduate();
        } else if(studentType.equalsIgnoreCase("X")) {
            student = new X();
        } else {
            System.out.println("Invalid student type.");
            return;
        }
        int totalMarks = 0;
        System.out.println("Enter marks for the subjects:");
        for (String subject : student.subjects) {
            System.out.print(subject + " : ");
            int mark = sc.nextInt();
            totalMarks += mark;
        }
        student.Marks = totalMarks / (double) student.subjects.length;
        student.calculateGrade();
        student.displayInfo();
    }
}