package loop;

public class LoopEx12 {
    public static void main(String[] args) {
        char c = 'A';
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
    }
}
