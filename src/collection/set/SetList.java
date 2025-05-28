package collection.set;

import java.util.*;

public class SetList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "바나나", "사과", "메론");

        // 1. 중복 제거
        Set<String> set = new HashSet<>(list);

        // 2. 다시 list로 변환 (정렬 가능하게)
        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        System.out.println("정렬된 과일 목록: ");
        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
