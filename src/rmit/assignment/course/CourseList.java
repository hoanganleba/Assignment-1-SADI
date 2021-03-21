package rmit.assignment.course;

import rmit.assignment.student.Student;

import java.util.ArrayList;

public class CourseList {
    private static final ArrayList<Course> courseArrayList = new ArrayList<>();

    public void addCourse(Course course) {
        courseArrayList.add(course);
    }

    public Course getCourseId(String name) {
        for(Course course: courseArrayList) {
            if(course.getId().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }

    public Object getAllCourses() {
        ArrayList<String> courses = new ArrayList<>();
        for(Course course: courseArrayList) {
            courses.add("CourseId: " + course.getId() + " " + "CourseName: " + course.getName());
        }
        return courses;
    }

    public ArrayList<Course> getCourseArrayList() {
        return courseArrayList;
    }
}
