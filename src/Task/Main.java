package Task;

public class Main {
    public static void main(String[] args) {

        int[] nums = {10, 4, 6, 2, 12, 24, 8, 9, 35, 11, 1};

        //Count all numbers that are below min or above
        //max array number(min and max numbers-are [0] and [1]).
        int nums1 = 0;

        if (nums[0] < nums[1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[0] || nums[i] > nums[1]) {
                    nums1++;
                }
            }
        }

        if (nums[1] < nums[0]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[1] || nums[i] > nums[0]) {
                    nums1++;
                }
            }
        }

        System.out.println(nums1);
    }
}

