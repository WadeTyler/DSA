public class LinearSearch {

    // Find the index of the target value in an unsorted array
    // Runtime: O(n)
    public static void main(String[] args) {
        int[] nums = {
                4, 5, 1, 8, 3, 2, 0, 6, 0, 2, 2, 1,4, 6, 0, 0, 40, 2, 33, 44,
                7, 7,7, 3,4, 543,3, 42,34, 43,4,234, 234, 243,42,4, 24,23,4,
                23,674,56,53,5,
        };

        System.out.println(linearSearch(nums, 2));
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
