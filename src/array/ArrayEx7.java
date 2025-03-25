package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] item = new String[2][10];
        int howMany = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int menu = sc.nextInt();

            if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case 1:
                    System.out.println("상품 등록을 선택하셨습니다.");
                    if (howMany >= 10) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름: ");
                    item[0][howMany] = sc.next();
                    System.out.print("상품 가격: ");
                    item[1][howMany] = sc.next();
                    howMany++;
                    break;

                case 2:
                    System.out.println("상품 목록을 선택하셨습니다.");
                    if (howMany == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < howMany; i++) {
                        System.out.println(item[0][i] + ": " + item[1][i] + "원");
                    }
                    break;
            }
        }
    }
}