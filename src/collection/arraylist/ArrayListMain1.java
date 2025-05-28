package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain1 {
    public static void main(String[] args) {
        List<String> interests = new ArrayList<>();
        interests.add("맛집");
        interests.add("여행");
        interests.add("영화");

        System.out.println(interests.get(0));
        System.out.println(interests.get(1));
        System.out.println(interests.get(2));

        for (String i : interests) {
            System.out.println(i);
        }
    }
}
