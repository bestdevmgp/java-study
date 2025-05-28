package collection.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("팔공티");
        cart.add("썬칩");
        System.out.println(cart.get(0));
        cart.remove(1);
        System.out.println(cart.size());
        System.out.println(cart.isEmpty());
    }
}
