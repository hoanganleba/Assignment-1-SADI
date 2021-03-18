package rmit.assignment.studentenrolment;

import rmit.assignment.studentenrolment.StudentEnrolment;

public interface StudentEnrolmentManager {
    void add(StudentEnrolment studentEnrolment);
    void update();
    void delete();
    void getOne(String name);
    void getAll();
}
