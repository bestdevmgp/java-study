package collection.arraylist;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("팔공티");
        cart.add("썬칩");
        cart.add(1, "포카칩");
        cart.add(2, "꼬북칩");
        cart.remove(0); // 팔공티 삭제

        for (String c : cart) {
            System.out.println(c);
        }
    }
}
