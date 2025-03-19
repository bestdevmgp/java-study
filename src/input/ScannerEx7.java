package input;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("입력한 숫자 " + num + "은(는) ");
        System.out.println(num % 2 == 0 ? "짝수입니다." : "홀수입니다.");
    }
}
