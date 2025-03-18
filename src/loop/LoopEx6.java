package loop;

public class LoopEx6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
