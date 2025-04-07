package class2;

public class ClassElementEx1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

    public static class Rectangle {
        private int width;
        private int height;

        public int calculateArea() {
            return width * height;
        }

        int calculatePerimeter() {
            return 2 * (width + height);
        }

        boolean isSquare() {
            return width == height;
        }

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
