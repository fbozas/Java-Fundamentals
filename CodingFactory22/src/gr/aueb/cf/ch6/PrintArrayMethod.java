package gr.aueb.cf.ch6;

/**
 * Εκτυπώνει έναν πίνακα με την χρήση μεθόδου.
 */
public class PrintArrayMethod {

    public static void main(String[] args) {
        int[] ages = {15, 18, 42, 57};
        printArray(ages);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        //if (arr == null) return;
        if ((arr == null) || low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
