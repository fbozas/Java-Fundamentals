package gr.aueb.cf.ch6;

/*
*   Array sort with SelectionSort
*   Time complexity: 0(n^2) (Here we have the swap inside the FIRST for loop)
* */
public class SelectionSort {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int[] arr = {5, 8, 2, 14, 3, 25, 12};
        int minVal;
        int minPosition;
        int tmp;

        // Εντολές
        for(int i = 0; i < arr.length - 1; i++){
            // Find the min value
            minPosition = i;
            minVal = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < minVal){
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            // Swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }

        // Εκτύπωση αποτελεσμάτων
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
