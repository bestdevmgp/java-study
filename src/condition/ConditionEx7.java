package condition;

import java.util.Scanner;

public class ConditionEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x % 2 == 0 ? "짝수" : "홀수");
    }
}
