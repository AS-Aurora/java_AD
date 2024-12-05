public class Lab6_1 {
    public static int LinearSearch(int arr[], int x) {
        int size=arr.length;
        for(int i=0;i<size;i++) {
            if(arr[i]==x) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x=5;
        System.out.println(LinearSearch(arr, x));
    }
}
