package condition;

public class Switch2 {
    public static void main(String[] args) {
        // grade = 1: 1000, 2: 3000(변경), 3: 3000, 나머지: 5000
        int grade = 2;
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            case 4:
                coupon = 4000;
                break;
            default:
                coupon = 5000;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
