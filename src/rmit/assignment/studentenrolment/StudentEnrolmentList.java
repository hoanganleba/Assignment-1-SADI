package rmit.assignment.studentenrolment;

import java.util.ArrayList;

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

    public void getStudentEnrollmentName(String studentName) {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is no enrollment record.");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentLists) {
                String student = String.valueOf(studentEnrolment.getStudent().getName());
                if(student.equalsIgnoreCase(studentName)) {
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

    public void getStudentNameAndCourse(String studentName, String courseName) {

    }

    public void editStudentEnrollment(String studentName) {

    }

    public void deleteStudentEnrollment(String studentName, String courseName) {
        for (int i = 0; i < studentEnrolmentLists.size(); i++) {
            if(studentEnrolmentLists.get(i).getStudent().getName().equalsIgnoreCase(studentName)
            && studentEnrolmentLists.get(i).getCourse().getName().equalsIgnoreCase(courseName)) {
                System.out.println(studentEnrolmentLists.remove(i));
            }

        }
    }

}
