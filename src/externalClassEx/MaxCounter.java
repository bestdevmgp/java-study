package externalClassEx;

public class MaxCounter {
    int count = 0;
    int max;

    void increment() {
        if (count == max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    int getCount() {
        return count;
    }

    public MaxCounter(int max) {
        this.max = max;
    }
}
