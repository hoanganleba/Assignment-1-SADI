package rmit.assignment.studentenrolment;

import java.util.ArrayList;

public class StudentEnrolmentList implements StudentEnrolmentManager {

    private static final ArrayList<StudentEnrolment> studentEnrolmentLists = new ArrayList<>();

    public void add(StudentEnrolment studentEnrolment) {
        studentEnrolmentLists.add(studentEnrolment);
    }

    public void update() {

    }

    public void delete() {

    }

    public void getOne(String name) {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is currently 0 enrollment record.");
        }
        else {
            for (StudentEnrolment enrollment: studentEnrolmentLists) {
                if(enrollment.getStudent().getName().equals(name)) {
                    System.out.println(enrollment.toString());
                }
            }
        }
    }

    public void getAll() {
        if (studentEnrolmentLists.size() == 0) {
            System.out.println("There is no student enrollment record.");
        }
        for (StudentEnrolment enrollment: studentEnrolmentLists) {
            System.out.println(enrollment.toString());
        }

    }
}
