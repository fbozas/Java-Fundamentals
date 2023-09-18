package gr.aueb.cf.ch6;

public class ArrayMinWithMaxInt {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int[] arr = {6, 90, 4, 17};
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        // Εντολές
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Min value: %d, Min Position: %d", minValue, minPosition + 1);
    }
}
