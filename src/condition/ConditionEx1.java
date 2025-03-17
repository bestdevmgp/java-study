package condition;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int age = sc.nextInt();

        if (price >= 10000) {
            price -= 1000;
        }
        if (age <= 10) {
            price -= 1000;
        }
        System.out.println(price + "원 입니다.");
    }
}
