package condition;

import java.util.Scanner;

public class ConditionEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();

        if (rate >= 9) {
            System.out.println("어바웃타임");
        }
        if (rate >= 8) {
            System.out.println("토이 스토리");
        }
        if (rate >= 7) {
            System.out.println("고질라");
        }
    }
}
