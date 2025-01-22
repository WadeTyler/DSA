import java.util.Arrays;

public class BinarySearch {

    // Binary Search a sorted array for a key value.
    // O(log n) - With each call, the remaining calls is divided by 2
    public static void main(String[] args) {
        int[] nums = {
                4, 5, 1, 8, 3, 2, 0, 6, 0, 2, 2, 1,4, 6, 0, 0, 40, 2, 33, 44,
                7, 7,7, 3,4, 543,3, 42,34, 43,4,234, 234, 243,42,4, 24,23,4,
                23,674,56,53,5,
        };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(binarySearch(nums, 22));
    }



    public static int binarySearch(int[] arr, int key, int low, int high) {
        if (low >= high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearch(arr, key, low, mid);
        } else {
            return binarySearch(arr, key, mid + 1, high);
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        return binarySearch(arr, key, low, high);
    }
}
