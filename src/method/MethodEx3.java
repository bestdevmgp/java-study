package method;

public class MethodEx3 {
    public static void main(String[] args) {
        deposit(10000, 1000);
        withdraw(11000, 2000);
    }
    // 입금
    public static void deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    }
    // 출금
    public static void withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + balance + "원");
    }
}
