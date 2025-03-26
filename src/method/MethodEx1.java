package method;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(getAverage(a, b, c));

        int x = 15;
        int y = 25;
        int z = 35;
        System.out.println(getAverage(x, y, z));
    }
    public static String getAverage(int n1, int n2, int n3) {
        return "평균 값: " + (n1 + n2 + n3) / 3;
    }
}
