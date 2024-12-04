package institutmanagement.test;

import institutmanagement.models.Course;
import institutmanagement.models.Enrollment;
import institutmanagement.models.Student;

public class InstitutManagement {
    public static void main(String[] args) {

        Student student1 = new Student("54910978L","Steven",21);
        Student student2 = new Student("00000000X","Steven2",20);

        Course courseScience = new Course("Science");
        Course courseComputing = new Course("Computing");
        Course courseHistory = new Course("History");


        Course courseChemistry = new Course("Chemistry");
        Course coursePhysics = new Course("Physics");
        Course courseMaths = new Course("Maths");

        Enrollment enrollmenStudent = new Enrollment(student1,courseScience,9);
        Enrollment enrollmenStudent1 = new Enrollment(student1,courseChemistry,7);
        Enrollment enrollmenStudent2 = new Enrollment(student1,courseComputing,9);

        Enrollment enrollmenStudent3 = new Enrollment(student2,courseHistory,2);
        Enrollment enrollmenStudent4 = new Enrollment(student2,coursePhysics,3);
        Enrollment enrollmenStudent5 = new Enrollment(student2,courseMaths,7);


        System.out.println(enrollmenStudent);
        System.out.println(enrollmenStudent1);
        System.out.println(enrollmenStudent2);

        System.out.println(enrollmenStudent3);
        System.out.println(enrollmenStudent4);
        System.out.println(enrollmenStudent5);

    }

    public int extractAverageGrades(String dni){

        return 0;
    }

    public Course extractFailedCourse(){
        return new Course("");
    }


}
