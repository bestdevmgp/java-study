package handling.ex6;

class A implements AutoCloseable {
    String resource;

    A(String resource) {
        this.resource = resource;
    }

    @Override
    public void close() throws Exception {
        if (resource != null) {
            resource = null;
            System.out.println("리소스가 해제되었습니다.");
        }
    }
}

public class TryWithResource2 {
    public static void main(String[] args) {
        A a1 = null;

        try {
            a1 = new A("특정파일");
        } catch (Exception e) {
            System.out.println("예외처리");
        } finally {
            if (a1.resource != null) {
                try {
                    a1.close();
                } catch (Exception e) {
                }
            }
        }

        try (A a2 = new A("특정파일")) {
        } catch (Exception e) {
            System.out.println("예외처리");
        }
    }
}
