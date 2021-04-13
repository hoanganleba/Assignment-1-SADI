package rmit.assignment.studentenrolment;

import java.io.FileWriter;
import java.io.IOException;
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

    public void printAllCoursesForStudentInSemester(String studentId, String semester) {
        ArrayList<String> courseList = new ArrayList<String>();
        for (StudentEnrolment studentEnrolmentList : studentEnrolmentLists) {
            if (studentEnrolmentList.getStudent().getId().equalsIgnoreCase(studentId)
                    && studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                courseList.add(studentEnrolmentList.getCourse().getName());
            }
        }
        try {
            FileWriter myWriter = new FileWriter("allCoursesOfStudentInSemester.csv");
            myWriter.write(String.valueOf(courseList));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printAllStudentsInCourseInSemester(String courseId, String semester) {
        ArrayList<String> studentList = new ArrayList<String>();
        for (StudentEnrolment studentEnrolmentList : studentEnrolmentLists) {
            if (studentEnrolmentList.getCourse().getId().equalsIgnoreCase(courseId)
                    && studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                studentList.add(studentEnrolmentList.getStudent().getName());
            }
        }
        try {
            FileWriter myWriter = new FileWriter("allStudentsOfCourseInSemester.csv");
            myWriter.write(String.valueOf(studentList));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printAllCoursesInSemester(String semester) {
        ArrayList<String> courseList = new ArrayList<String>();
        for(StudentEnrolment studentEnrolmentList: studentEnrolmentLists) {
            if (studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                courseList.add(studentEnrolmentList.getCourse().getName());
            }
        }
        try {
            FileWriter myWriter = new FileWriter("allCoursesInSemester.csv");
            myWriter.write(String.valueOf(courseList));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
