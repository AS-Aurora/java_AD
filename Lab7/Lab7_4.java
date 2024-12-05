

public class Lab7_4 {
    public static int minDifference(int arr[], int size) {
        // Array.sort(arr);
        int diff=999999;
        for(int i=0;i<size;i++) {
            if((arr[i+1]-arr[i])<diff) {
                diff=arr[i+1]-arr[i];
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 18, 19, 25};
        System.out.println(minDifference(arr, arr.length));
    }
}
