package rmit.assignment;

import rmit.assignment.course.Course;
import rmit.assignment.course.CourseList;
import rmit.assignment.menu.MainMenu;
import rmit.assignment.student.Student;
import rmit.assignment.student.StudentList;
import rmit.assignment.studentenrolment.StudentEnrolment;
import rmit.assignment.studentenrolment.StudentEnrolmentList;

public class Main {
    public static void main(String [] args) {
        Student student1 = new Student("s3681410", "An", "28/12/1998");
        Student student2 = new Student("s3781410", "Hong", "12/12/1998");
        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.addStudent(student2);

        Course course1 = new Course("MKTT12","Marketing", 12);
        Course course2 = new Course("MKTG1420","Digital", 12);
        CourseList courseList = new CourseList();
        courseList.addCourse(course1);
        courseList.addCourse(course2);

        StudentEnrolment studentEnrolment1 = new StudentEnrolment(student1, course1, "2021A");
        StudentEnrolment studentEnrolment2 = new StudentEnrolment(student1, course2, "2021A");
        StudentEnrolment studentEnrolment3 = new StudentEnrolment(student2, course1, "2021A");
        StudentEnrolment studentEnrolment4 = new StudentEnrolment(student2, course2, "2021A");
        StudentEnrolmentList studentEnrolmentList = new StudentEnrolmentList();
        studentEnrolmentList.addStudentEnrollment(studentEnrolment1);
        studentEnrolmentList.addStudentEnrollment(studentEnrolment2);
        studentEnrolmentList.addStudentEnrollment(studentEnrolment3);
        studentEnrolmentList.addStudentEnrollment(studentEnrolment4);

        MainMenu mainMenu = new MainMenu();
        mainMenu.execute();
    }
}
