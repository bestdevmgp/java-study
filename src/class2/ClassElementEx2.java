package class2;

public class ClassElementEx2 {
    public static void main(String[] args) {
        Account account = new Account(0);
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.getRemain());
    }

    static class Account {
        int remain;

        public void deposit(int amount) {
            remain += amount;
        }

        public void withdraw(int amount) {
            if (amount > remain) {
                System.out.println("잔액 부족");
            } else {
                remain -= amount;
            }
        }

        public int getRemain() {
            return remain;
        }

        public Account(int remain) {
            this.remain = remain;
        }
    }
}
