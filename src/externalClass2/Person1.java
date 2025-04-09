package externalClass2;

public class Person1 {
    private String name;
    private int age;
    private Job1 job;
    public Person1(String name, int age, Job1 job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        if (job != null) {
            System.out.println("직업: " + job.getTitle() + " (" + job.getCompany() + ")");
        }
    }
}
