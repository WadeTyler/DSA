import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // Given an array of integers nums and an integer target,
    // return the indices i and j such that nums[i] + nums[j] == target and i != j.
    // Return the answer with the smaller index first.
    // Runtime: O(2n) = O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 4, 5, 6}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{4, 5, 6}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{5, 5}, 10)));
    }

    // Use a hashmap to store the val and the index.
    // Then iterate over each index to check if the difference between itself and the target are a value in the array.
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();    // <val, index>
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.get(diff) != null && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }
        }

        return new int[0];
    }


}
