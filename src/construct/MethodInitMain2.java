package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        member1.initMember("user1", 15, 90);
        MemberInit2 member2 = new MemberInit2();
        member2.initMember("user2", 16, 80);
        MemberInit2[] members = {member1, member2};
    }
}
