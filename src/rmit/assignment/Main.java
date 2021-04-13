package rmit.assignment;

import rmit.assignment.course.Course;
import rmit.assignment.course.CourseList;
import rmit.assignment.menu.MainMenu;
import rmit.assignment.student.Student;
import rmit.assignment.student.StudentList;
import rmit.assignment.studentenrolment.StudentEnrolment;
import rmit.assignment.studentenrolment.StudentEnrolmentList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try {
            File myObj = new File("default.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrSplit = data.split(",");

                Student student = new Student(arrSplit[0], arrSplit[1], arrSplit[2]);
                StudentList studentList = new StudentList();
                studentList.addStudent(student);

                Course course = new Course(arrSplit[3], arrSplit[4], Integer.parseInt(arrSplit[5]));
                CourseList courseList = new CourseList();
                courseList.addCourse(course);

                StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, arrSplit[6]);
                StudentEnrolmentList studentEnrolmentList = new StudentEnrolmentList();
                studentEnrolmentList.addStudentEnrollment(studentEnrolment);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        MainMenu mainMenu = new MainMenu();
        mainMenu.execute();
    }
}
