package rmit.assignment;

import rmit.assignment.course.Course;
import rmit.assignment.menu.MainMenu;
import rmit.assignment.student.Student;
import rmit.assignment.studentenrolment.StudentEnrolment;
import rmit.assignment.studentenrolment.StudentEnrolmentList;

public class Main {
    public static void main(String [] args) {
        Student student1 = new Student("s381410", "An", "28/12/1998");
        Student student2 = new Student("s381410", "Hong", "12/12/1998");

        Course course1 = new Course("MQTT12","Marketing", 12);
        Course course2 = new Course("MKTG1420","Digital", 12);

        StudentEnrolment studentEnrolment1 = new StudentEnrolment(student1, course1, "2021A");
        StudentEnrolment studentEnrolment2 = new StudentEnrolment(student2, course1, "2021B");
        StudentEnrolmentList studentEnrolmentList = new StudentEnrolmentList();

        studentEnrolmentList.addStudentEnrollment(studentEnrolment1);
        studentEnrolmentList.addStudentEnrollment(studentEnrolment2);

        MainMenu mainMenu = new MainMenu();
        mainMenu.execute();
    }
}
