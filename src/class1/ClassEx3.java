package class1;

public class ClassEx3 {
    public static void main(String[] args) {
        MovieReview3 mr1 = new MovieReview3();
        mr1.setTitle("인셉션");
        mr1.setReview("인생은 무한 루프");

        MovieReview3 mr2 = new MovieReview3();
        mr2.setTitle("어바웃 타임");
        mr2.setReview("인생 시간 영화");

        mr1.showMovieReview(mr1.getTitle(), mr1.getReview());
        mr2.showMovieReview(mr2.getTitle(), mr2.getReview());
    }
}

class MovieReview3 {
    private String title;
    private String review;

    void showMovieReview(String title, String review) {
        System.out.println("영화 제목: " + title + ", 리뷰: " + review);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public MovieReview3() {
    }
}
