package loop;

import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // for 사용
        for (int i = 1; i < n + 1; i++) {
            sum += i;
            System.out.print(sum + " ");
        }

        // while 사용
        int i = 1;
        while (i < n + 1) {
            sum += i;
            System.out.print(sum + " ");
            i++;
        }
    }
}
