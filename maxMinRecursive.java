public class maxMinRecursive {
    public static int findMax(int arr[], int n) {
        if(n==1)
            return arr[0];
        int rest = findMax(arr, n-1);
        return Math.max(arr[n-1], rest);
    }
    public static int findMin(int arr[], int n) {
        if(n==1) 
            return arr[0];
        int rest = findMin(arr, n-1);
        return Math.min(arr[n-1], rest);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 2, 100, 78, 600, 30};
        int max = findMax(arr, arr.length);
        int min = findMin(arr, arr.length);
        System.out.println(max);
        System.out.println(min);
    }
}