package rmit.assignment.student;

import java.util.ArrayList;

public class StudentList {
    private static final ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public Student getStudentName(String name) {
        for(Student student: studentArrayList) {
            if(student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
}
