package staticEx;

public class Car {
    private String name;
    private static int carCount;

    public Car(String name) {
        this.name = name;
        carCount++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carCount);
    }
}
