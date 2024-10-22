public class maxMin {
    public static void Reverse(int arr[], int start, int stop) {
        while(start<stop) {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp;
            start++;
            stop--;
        }
    }
    public static void printMaxMin(int arr[], int size) {
        for(int i=0;i<size-1;i++) {
            Reverse(arr, i, size-1);
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        printMaxMin(arr, arr.length);
        
    }
}
