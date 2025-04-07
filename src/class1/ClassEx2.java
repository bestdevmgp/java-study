package class1;

public class ClassEx2 {
    public static void main(String[] args) {
        MovieReview2 mr = new MovieReview2();

        mr.title = new String[]{"인셉션", "어바웃 타임"};
        mr.review = new String[]{"인생은 무한 루프", "인생 시간 영화!"};

        for (int i = 0; i < mr.title.length; i++) {
            System.out.println("영화제목: " + mr.title[i] + ", 리뷰: " + mr.review[i]);
        }
    }
}

class MovieReview2 {
    String[] title;
    String[] review;
}
