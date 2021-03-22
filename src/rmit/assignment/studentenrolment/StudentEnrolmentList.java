package rmit.assignment.studentenrolment;

import rmit.assignment.course.Course;
import rmit.assignment.course.CourseList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEnrolmentList implements StudentEnrolmentManager {
    private static final ArrayList<StudentEnrolment> studentEnrolmentLists = new ArrayList<>();

    public void addStudentEnrollment(StudentEnrolment studentEnrolment) {
        studentEnrolmentLists.add(studentEnrolment);
    }

    public void getAllStudentEnrollment() {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is no enrollment record.");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentLists) {
                System.out.println(studentEnrolment.toString());
            }
        }
    }

    public void getStudentEnrollmentById(String studentId) {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is no enrollment record.");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentLists) {
                String student = String.valueOf(studentEnrolment.getStudent().getId());
                if(student.equalsIgnoreCase(studentId)) {
                    System.out.println(studentEnrolment.toString());
                }
            }
        }
    }

    public void getStudentEnrollmentSemester(String semester) {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is no enrollment record.");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentLists) {
                String student = String.valueOf(studentEnrolment.getSemester());
                if(student.equals(semester)) {
                    System.out.println(studentEnrolment.toString());
                }
            }
        }
    }

    public void editStudentEnrollment(String studentId) {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is currently 0 enrollment record.");
        }
        else {
            for (StudentEnrolment studentEnrolmentList: studentEnrolmentLists) {
                String student = String.valueOf(studentEnrolmentList.getStudent().getId());
                System.out.println("Enter Course Id to change");
                Scanner scanner = new Scanner(System.in);
                String mySelectCourseId = scanner.nextLine();
            }
        }
    }

    public void deleteStudentEnrollment(String studentId, String courseId) {
        for (int i = 0; i < studentEnrolmentLists.size(); i++) {
            if(studentEnrolmentLists.get(i).getStudent().getId().equalsIgnoreCase(studentId)
            && studentEnrolmentLists.get(i).getCourse().getId().equalsIgnoreCase(courseId)) {
                System.out.println(studentEnrolmentLists.remove(i));
            }

        }
    }

}
