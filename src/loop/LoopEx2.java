package loop;

import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for 사용
        for (int i = 0; i < 5; i++) {
            System.out.println(n);
            n++;
        }

        // while 사용
        int i = 0;
        while (i < 5) {
            System.out.println(n);
            n++;
            i++;
        }
    }
}
