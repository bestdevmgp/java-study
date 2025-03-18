package loop;

public class While1 {
    public static void main(String[] args) {
        int count1 = 0;
        count1++;
        System.out.println("현재 숫자는: " + count1);
        count1++;
        System.out.println("현재 숫자는: " + count1);
        count1++;
        System.out.println("현재 숫자는: " + count1);

        // While 사용하기
        int count2 = 0;
        while (count2 < 3) {
            count2++;
            System.out.println("현재 숫자는: " + count2);
        }
    }
}
