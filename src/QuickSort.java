import java.util.Arrays;

public class QuickSort {


    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int idx = low - 1;
        // Move all lower than partition to the front of the array
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                idx++;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        // Move the pivot to the end of the lesser values
        idx++;
        arr[high] = arr[idx];
        arr[idx] = pivot;
        return idx;
    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
