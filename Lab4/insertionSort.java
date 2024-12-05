public class insertionSort {
    public static void InsertionSort(int[] A) {
        int i, j;
        for (i = 1; i < A.length; i++) {
            int key = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(A);
        InsertionSort(A);
        System.out.println("Sorted array:");
        printArray(A);
    }
}

