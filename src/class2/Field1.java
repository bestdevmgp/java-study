package class2;

public class Field1 {
    private int m = 3;
    private int n = 4;
    public void work1() {
        int k = 5;
        System.out.println(k);
        work2(3);
    }

    public void work2(int i) {
        int j = 4;
        System.out.println(i + j);
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        Field1 field1 = new Field1();
        System.out.println(field1.getM());
        System.out.println(field1.getN());
        field1.work1();
    }
}
