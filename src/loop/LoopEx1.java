package loop;

public class LoopEx1 {
    public static void main(String[] args) {
        int sum = 0;

        // for 사용
        for (int i = 1; i < 4; i++) {
            System.out.print("i = " + i);
            sum += i;
            System.out.println(" sum = " + sum);
        }

        System.out.println();
        sum = 0;

        // while 사용
        int i = 1;
        while (i < 4) {
            System.out.print("i = " + i);
            sum += i;
            System.out.println(" sum = " + sum);
            i++;
        }
    }
}
