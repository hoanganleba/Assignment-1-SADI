package rmit.assignment.studentenrolment;

import rmit.assignment.course.Course;
import rmit.assignment.student.Student;

public class StudentEnrolment {
    Student student;
    Course course;
    private String semester;

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student Name: " + student.getName() + ". " + "Course: "
                + course.getName() + ". " + "Semester: " + getSemester();
    }
}
