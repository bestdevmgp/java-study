package classes;

public class Student1 {
    private String name;
    private int age;
    private int grade;

    // Constructor
    public Student1(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showData() {
        System.out.println("이름: " + this.name + " 나이: " + this.age + " 성적: " + this.grade);
    }
}
