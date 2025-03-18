package loop;

import java.util.Scanner;

public class LoopEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for 사용
        for (int i = 0; i < 5; i++) {
            if (n % 2 == 1) {
                n++;
            }
            System.out.println(n);
            n += 2;
        }

        // while 사용
        int i = 0;
        while (i < 5) {
            if (n % 2 == 1) {
                n++;
            }
            System.out.println(n);
            n += 2;
            i++;
        }
    }
}
