package rmit.assignment.menu;

import rmit.assignment.course.Course;
import rmit.assignment.course.CourseList;
import rmit.assignment.student.Student;
import rmit.assignment.student.StudentList;
import rmit.assignment.studentenrolment.StudentEnrolment;
import rmit.assignment.studentenrolment.StudentEnrolmentList;

import java.util.Scanner;

public class MainMenu {
    StudentEnrolmentList studentEnrolmentList = new StudentEnrolmentList();
    StudentList studentList = new StudentList();
    CourseList courseList = new CourseList();

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
                    System.out.println("Here are list of students. Pls enter name for enrolment: ");
                    System.out.println(studentList.getStudentArrayList());
                    String myStudentSelect = myInput.nextLine();
                    StudentList studentList = new StudentList();
                    Student student = studentList.getStudentName(myStudentSelect);

                    System.out.println("Here are list of courses. Pls enter name for enrolment :");
                    System.out.println(courseList.getCourseArrayList());
                    String myCourseSelect = myInput.nextLine();
                    CourseList courseList = new CourseList();
                    Course course = courseList.getCourseName(myCourseSelect);

                    System.out.println("Please enter semester: ");
                    String mySem = myInput.nextLine();

                    StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, mySem);
                    studentEnrolmentList.addStudentEnrollment(studentEnrolment);
                    System.out.println("New enrolment added: " + studentEnrolment);
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
