package rmit.assignment.studentenrolment;

import rmit.assignment.studentenrolment.StudentEnrolment;

public interface StudentEnrolmentManager {
    void addStudentEnrollment(StudentEnrolment studentEnrolment);
    void getAllStudentEnrollment();
    void getStudentEnrollmentName(String studentName);
    void getStudentEnrollmentSemester(String semester);
    void getStudentNameAndCourse(String studentName, String courseName);
    void editStudentEnrollment(String studentName);
    void deleteStudentEnrollment(String studentName, String courseName);
}
