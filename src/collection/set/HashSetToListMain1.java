package collection.set;

import java.util.*;

public class HashSetToListMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> emails = new HashSet<>();

        System.out.println("이메일 주소 5개를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            String email = sc.nextLine();
            emails.add(email);
        }

        System.out.println("\n중복 제거 후 이메일 목록");
        for (String e : emails) {
            System.out.println(e);
        }

        // HashSet -> ArrayList
        List<String> emailList = new ArrayList<>(emails);

        // 리스트 정렬
        Collections.sort(emailList);

        System.out.println("정렬된 이메일 목록: ");
        for (String e : emailList) {
            System.out.println(e);
        }

        System.out.println("총 " + emails.size() + "개의 이메일이 저장되었습니다.");
    }
}
