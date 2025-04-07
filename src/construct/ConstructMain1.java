package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct1 member1 = new MemberConstruct1("user1", 15, 90);
        MemberConstruct1 member2 = new MemberConstruct1("user2", 16, 80);
        MemberConstruct1[] members = {member1, member2};
        for (MemberConstruct1 member : members) {
            System.out.println("이름: " + member.getName() + ", 나이: " + member.getAge() + ", 성적: " + member.getGrade());
        }
    }
}
