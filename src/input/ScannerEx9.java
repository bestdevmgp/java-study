package input;

import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item = "";
        int price = 0;
        int quantity = 0;
        int totalPrice = 0;

        while (true) {
            System.out.println("옵션을 선택하세요\n1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            switch (option) {
                case 1 :
                    System.out.println("상품 입력을 선택하셨습니다.");
                    System.out.print("상품명을 입력하세요: ");
                    item = sc.next();
                    System.out.print("상품의 가격을 입력하세요: ");
                    price = sc.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    quantity = sc.nextInt();
                    totalPrice += price * quantity;
                    System.out.println("상품명: " + item + ", 가격: " + price + ", 수량: " + quantity + ", 합계: " + totalPrice);
                    break;

                case 2 :
                    System.out.println("결제를 선택하셨습니다.");
                    System.out.println("총 비용: " + totalPrice);
                    totalPrice = 0;
                    break;

                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
