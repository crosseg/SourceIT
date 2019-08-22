public class Array {
    public static void maxNum() {
        int nums[] = {1, 23, 444, 55, 5633, 555, 2};
        int max;
        max = nums[0];

        for (int i = 1; i < 7; i++) {
            if (nums[i] > max) {
                max = nums[i];

            }

        }
        System.out.println(max);
    }
}