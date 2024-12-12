package earthquakedatamanagement.models;

public class Victim {
    private String name;
    private int age;
    private String condition;

    public Victim(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        switch (condition) {
            case "missing" -> this.condition = "missing";
            case "injured" -> this.condition = "injured";
            case "death" -> this.condition = "death";
        }
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Victim{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", condition='" + condition + '\'' +
                '}';
    }
    
}
