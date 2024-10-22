public class Rotate {
    public static void rotate(int arr[], int k, int n) {
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int arr[], int start, int end) {
        for(int i=start, j=end;i<j;i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        rotate(arr, 4, 6);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
