package rmit.assignment.menu;

import rmit.assignment.student.StudentList;
import rmit.assignment.studentenrolment.StudentEnrolmentList;

import java.util.Scanner;

public class MainMenu {
    StudentEnrolmentList studentEnrolmentList = new StudentEnrolmentList();
    StudentList studentList = new StudentList();
    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("1. View All Enrollments");
        System.out.println("2. Add Enrollments");
        System.out.println("3. Change Enrollments");
        System.out.println("4. Exit.");
        System.out.print("Enter a number (1-4): ");

        String mySelect = myInput.nextLine();

        while(!mySelect.equals("4")) {
            switch (mySelect) {
                case "1":
                    studentEnrolmentList.getAllStudentEnrollment();
                    System.out.print("Enter a number (1-4): ");
                    mySelect = myInput.nextLine();
                    break;
                case "2":
                    System.out.println("Here are list of students. Pls enter name for enrolment");
                    System.out.println(studentList.getStudentArrayList());
                    System.out.print("Enter a number (1-4): ");
                    mySelect = myInput.nextLine();

                    break;
                default:
                    System.out.println("Wrong input. Pls try again");
                    System.out.print("Enter a number (1-4): ");
                    mySelect = myInput.nextLine();

            }
        }
    }
}
