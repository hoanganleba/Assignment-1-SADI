package rmit.assignment.course;

import java.util.ArrayList;

public class CourseList {
    private static final ArrayList<Course> courseArrayList = new ArrayList<>();

    public void addCourse(Course course) {
        courseArrayList.add(course);
    }

    public Course getCourseName(String name) {
        for(Course course: courseArrayList) {
            if(course.getName().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }

    public ArrayList<Course> getCourseArrayList() {
        return courseArrayList;
    }
}
