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
        System.out.println("1. View All Enrollments");
        System.out.println("2. View All Enrollments By Student Id");
        System.out.println("3. Add Enrollments");
        System.out.println("4. Edit Enrollments");
        System.out.println("5. Delete Enrollments");
        System.out.println("6. Print all courses for 1 student in 1 semester");
        System.out.println("7. Print all students of 1 course in 1 semester");
        System.out.println("8. Print all courses offered in 1 semester");
        System.out.println("0. Exit.");
        System.out.print("Enter a number (0-8): ");
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        menuGUI();
        String mySelect = myInput.nextLine();

        while(!mySelect.equals("0")) {
            switch (mySelect) {
                case "1":
                    studentEnrolmentList.getAllStudentEnrollment();
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "2":
                    System.out.println("Please enter student id: ");
                    String myStudentIdSelect = myInput.nextLine();
                    studentEnrolmentList.getStudentEnrollmentById(myStudentIdSelect);
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "3":
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
                    System.out.println("Please enter student id: ");
                    String myStudentId = myInput.nextLine();
                    studentEnrolmentList.editStudentEnrollment(myStudentId);
                    System.out.println(studentEnrolmentList);

                case "5":
                    System.out.println("Please enter student id: ");
                    String myStudentIdInput = myInput.nextLine();
                    System.out.println("Please enter course id: ");
                    String myCourseIdInput = myInput.nextLine();
                    studentEnrolmentList.deleteStudentEnrollment(myStudentIdInput, myCourseIdInput);
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "6":
                    System.out.println("Please enter student id:");
                    String myStudentIdInput1 = myInput.nextLine();
                    System.out.println("Please enter semester: ");
                    String mySemester = myInput.nextLine();
                    studentEnrolmentList.printAllCoursesForStudentInSemester(myStudentIdInput1, mySemester);
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "7":
                    System.out.println("Please enter course id:");
                    String myCourseIdInput1 = myInput.nextLine();
                    System.out.println("Please enter semester: ");
                    String mySemester1 = myInput.nextLine();
                    studentEnrolmentList.printAllStudentsInCourseInSemester(myCourseIdInput1, mySemester1);
                    menuGUI();
                    mySelect = myInput.nextLine();
                    break;
                case "8":
                    System.out.println("Please enter semester: ");
                    String mySemester2 = myInput.nextLine();
                    studentEnrolmentList.printAllCoursesInSemester(mySemester2);
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
