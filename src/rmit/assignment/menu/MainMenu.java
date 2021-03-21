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

    public void menuGUI() {
        System.out.println("Main Menu");
        System.out.println("1. View Enrollments");
        System.out.println("2. Add Enrollments");
        System.out.println("3. Edit Enrollments");
        System.out.println("4. Delete Enrollments");
        System.out.println("5. Exit.");
        System.out.print("Enter a number (1-5): ");
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        menuGUI();
        String mySelect = myInput.nextLine();

        while(!mySelect.equals("5")) {
            switch (mySelect) {
                case "1":
                    studentEnrolmentList.getAllStudentEnrollment();
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "2":
                    System.out.println("Here are list of students. Pls enter studentId for enrolment: ");
                    System.out.println(studentList.getAllStudents());
                    String myStudentSelect = myInput.nextLine();
                    StudentList studentList = new StudentList();
                    Student student = studentList.getStudentId(myStudentSelect);

                    System.out.println("Here are list of courses. Pls enter courseId for enrolment :");
                    System.out.println(courseList.getAllCourses());
                    String myCourseSelect = myInput.nextLine();
                    CourseList courseList = new CourseList();
                    Course course = courseList.getCourseId(myCourseSelect);

                    System.out.println("Please enter semester: ");
                    String mySem = myInput.nextLine();

                    StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, mySem);
                    studentEnrolmentList.addStudentEnrollment(studentEnrolment);
                    System.out.println("New enrolment added: " + studentEnrolment);
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "4":
                    String myStudentInput = myInput.nextLine();
                    String myCourseInput = myInput.nextLine();
                    studentEnrolmentList.deleteStudentEnrollment(myStudentInput, myCourseInput);
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                default:
                    System.out.println("Wrong input. Pls try again");
                    menuGUI();
                    mySelect = myInput.nextLine();
            }
        }
    }
}
