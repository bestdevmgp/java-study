package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        // 일반 for
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            System.out.println(num);
        }

        // 향상된 for, for-each
        for (int num : nums) {
            System.out.println(num);
        }

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < nums.length; ++i) {
            System.out.println("num" + i + "번의 결과는: " + nums[i]);
        }
    }
}
