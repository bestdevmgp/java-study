package variable;

public class TypeCasting2 {
    public static void main(String[] args) {
        long value5 = 10L;
        long value6 = 10l;
        float value7 = 5.8F; // 예외
        float value8 = 5.8f; // 예외

        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
    }
}
