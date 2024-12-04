package institutmanagement.models;

import java.util.ArrayList;

public class InstituteManagement {
    private ArrayList<Enrollment> enrollments;
    private  ArrayList<Student> students;
    private ArrayList<Course> courses;


    public InstituteManagement(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Enrollment> enrollments) {
        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;
    }


    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(ArrayList<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public double extractAverageGrades(String dni){
        double totalGrades = 0;
        int count = 0;
        for (Enrollment enrollment: enrollments){
            if (enrollment.getStudent().getDni().equals(dni)){
                totalGrades  += enrollment.getGrade();
                count++;
            }
        }
//        for (int i = 0; i < enrollments.size(); i++) {
//            Enrollment enrollment = enrollments.get(i);
//            if (enrollment.getStudent().getDni().equals(dni)){
//                totalGrades += enrollment.getGrade();
//                count++;
//            }
//        }
        return totalGrades/count;
    }

    public ArrayList<Course> extractFailedCourse(String dni){
        ArrayList<Course> coursesFailed = new ArrayList<>();
        for (Enrollment enrollment:enrollments){
            if (enrollment.getStudent().getDni().equals(dni)) {
                if (enrollment.getGrade()<7) {
                    coursesFailed.add(enrollment.getCourse());
                }
            }
        }
        return  coursesFailed;
    }

//    public ArrayList<Object> extractFailedCourse(String dni){
//        var coursesFailed = new ArrayList<>();
//        for (Enrollment enrollment:enrollments){
//            if (enrollment.getStudent().getDni().equals(dni)) {
//               if (enrollment.getGrade()<7) {
//                   coursesFailed.add(enrollment.getCourse());
//               }
//            }
//        }
//        return  coursesFailed;
//    }

    @Override
    public String toString() {
        return "InstitutManagement{" +
                "enrollments=" + enrollments +
                ", students=" + students +
                ", courses=" + courses +
                '}';
    }
}
