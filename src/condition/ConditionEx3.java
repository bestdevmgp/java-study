package condition;

import java.util.Scanner;

public class ConditionEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();

        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else if (distance <= 1000) {
            System.out.println("비행기");
        }
    }
}
