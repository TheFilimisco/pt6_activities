package institutmanagement.models;

public class Student {
    private String name;
    private int age;
    private String dni;

    public Student(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
