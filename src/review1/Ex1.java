package review1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.println("숫자를 선택하세요.");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("삽입을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("수정을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("삭제를 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
                break;
        }
    }
}
