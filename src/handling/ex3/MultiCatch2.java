package handling.ex3;

public class MultiCatch2 {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            int num = Integer.parseInt("10A");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 바꿀 수 없습니다.");
        } catch (Exception e) {
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
