package rmit.assignment;

import rmit.assignment.course.Course;
import rmit.assignment.student.Student;
import rmit.assignment.studentenrolment.StudentEnrolment;
import rmit.assignment.studentenrolment.StudentEnrolmentList;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Student student1 = new Student("s381410", "An", "28/12/1998");
        Student student2 = new Student("s361410", "Hong", "28/12/1998");

        Course course1 = new Course("MQTT12","Marketing", 12);

        StudentEnrolment studentEnrolment1 = new StudentEnrolment(student1, course1, "2021A");
        StudentEnrolment studentEnrolment2 = new StudentEnrolment(student2, course1, "2021B");
        StudentEnrolmentList studentEnrolmentList = new StudentEnrolmentList();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        studentEnrolmentList.add(studentEnrolment1);
        studentEnrolmentList.add(studentEnrolment2);
        studentEnrolmentList.getAll();
        studentEnrolmentList.getOne("An");
    }
}
