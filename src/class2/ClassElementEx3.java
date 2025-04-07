package class2;

class Book {
    private String title;
    private String author;
    private int pages;

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + pages);
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class ClassElementEx3 {
    public static void main(String[] args) {
        Book book1 = new Book("", "", 0);
        book1.displayInfo();
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();
        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
        book3.displayInfo();
    }
}
