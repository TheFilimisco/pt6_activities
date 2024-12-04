package institutmanagement.test;

import institutmanagement.models.Course;
import institutmanagement.models.Enrollment;
import institutmanagement.models.InstituteManagement;
import institutmanagement.models.Student;

import java.util.ArrayList;

public class TestInstitute {
    public static void main(String[] args) {


        // Lists for entity
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();


        Student student1 = new Student("54910978L","Steven",21);
        Student student2 = new Student("00000000X","Steven2",20);

        students.add(student1);
        students.add(student2);


        Course courseScience = new Course("Science");
        Course courseComputing = new Course("Computing");
        Course courseHistory = new Course("History");
        Course courseChemistry = new Course("Chemistry");
        Course coursePhysics = new Course("Physics");
        Course courseMaths = new Course("Maths");

        courses.add(courseScience);
        courses.add(courseComputing);
        courses.add(courseHistory);
        courses.add(courseChemistry);
        courses.add(coursePhysics);
        courses.add(courseMaths);

        Enrollment enrollmenStudent = new Enrollment(student1,courseScience,5);
        Enrollment enrollmenStudent1 = new Enrollment(student1,courseChemistry,6);
        Enrollment enrollmenStudent2 = new Enrollment(student1,courseComputing,9);


        Enrollment enrollmenStudent3 = new Enrollment(student2,courseHistory,2);
        Enrollment enrollmenStudent4 = new Enrollment(student2,coursePhysics,3);
        Enrollment enrollmenStudent5 = new Enrollment(student2,courseMaths,7);

        enrollments.add(enrollmenStudent);
        enrollments.add(enrollmenStudent1);
        enrollments.add(enrollmenStudent2);
        enrollments.add(enrollmenStudent3);
        enrollments.add(enrollmenStudent4);
        enrollments.add(enrollmenStudent5);

        InstituteManagement instituteManagement = new InstituteManagement(students,courses,enrollments);

        for (Student student: instituteManagement.getStudents()) {
            System.out.println(student);
        }
        for (Course course: instituteManagement.getCourses()) {
            System.out.println(course);
        }
        for (Enrollment enrollment: instituteManagement.getEnrollments()) {
            System.out.println(enrollment);
        }


        // Methods works! AverageGrades
        var petition = instituteManagement.extractAverageGrades("54910978L");
        System.out.println(petition);

        //Methods works! FailedCourse
        var petition2 = instituteManagement.extractFailedCourse("54910978L");
        System.out.println(petition2);



    }







}
