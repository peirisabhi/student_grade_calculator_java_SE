/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayan;

import dayan.model.Student;
import dayan.model.Subject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abhi
 */
public class Dayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student = new Student();

        ArrayList<Subject> subjects = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        student.setName(scanner.nextLine());

        System.out.println("Enter Index No : ");
        student.setIndexNumber(scanner.nextLine());

        System.out.println("Enter Course Type : ");
        student.setCourseType(scanner.nextLine());

//        System.out.println(student.toString());
        boolean status = true;

        while (status) {
            System.out.println("Enter Subject (Subject Name-Marks) : ");

            String nextLine = scanner.nextLine();

            if (nextLine.equals("") || nextLine == null) {
                status = false;
                break;
            }

            String[] split = nextLine.split("-");

            subjects.add(new Subject(split[0], Double.parseDouble(split[1])));
        }

        student.setSubjects(subjects);

        double totalMarks = 0;
        int subjectCount = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
            subjectCount++;
        }
        String grade = "";
        double avgMarks = totalMarks / subjectCount;

        if (student.getCourseType().equals("BSc")) {
            System.out.println("BSc" + student.getCourseType());
            if (avgMarks < 45) {
                grade = "FAIL";
            } else if (avgMarks > 45 && avgMarks < 55) {
                grade = "PASS";
            } else if (avgMarks > 55 && avgMarks < 65) {
                grade = "C";
            } else if (avgMarks > 65 && avgMarks < 75) {
                grade = "B";
            } else if (avgMarks > 75) {
                grade = "A";
            }

        } else if (student.getCourseType().equals("MSc")) {
            System.out.println("MSc" + student.getCourseType());
            if (avgMarks < 55) {
                grade = "FAIL";
            } else if (avgMarks > 55 && avgMarks < 65) {
                grade = "PASS";
            } else if (avgMarks > 65 && avgMarks < 75) {
                grade = "C";
            } else if (avgMarks > 75 && avgMarks < 85) {
                grade = "B";
            } else if (avgMarks > 85) {
                grade = "A";
            }
        }

        System.out.println("Student Name : " + student.getName());
        System.out.println("Student Index : " + student.getIndexNumber());
        System.out.println("Student Course Type : " + student.getCourseType());
        System.out.println("Student AVG Marks : " + avgMarks);
        System.out.println("Student Grade : " + grade);

    }

}
