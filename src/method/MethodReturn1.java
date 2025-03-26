package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
        return false; // 반환 타입이 있으면 대개는 값을 반환해야 한다.
    }
}
