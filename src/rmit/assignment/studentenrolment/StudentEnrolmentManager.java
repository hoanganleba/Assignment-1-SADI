package rmit.assignment.studentenrolment;

public interface StudentEnrolmentManager {
    void addStudentEnrollment(StudentEnrolment studentEnrolment);
    void getAllStudentEnrollment();
    void deleteStudentEnrollment(String studentId, String courseId);
    void editStudentEnrollment(String studentId);
}

