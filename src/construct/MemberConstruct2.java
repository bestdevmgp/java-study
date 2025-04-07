package construct;

public class MemberConstruct2 {
    private String name;
    private int age;
    private int grade;

    public MemberConstruct2(String name) {
        this.name = name;
        this.age = 17;
        this.grade = 50;
    }
    public MemberConstruct2(String name, int age) {
        this(name, age, 50);
    }
    public MemberConstruct2(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
