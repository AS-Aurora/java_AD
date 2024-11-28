public class La7_1 {

    public static int firstRepeated(int arr[], int size) {
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j]) 
                    return arr[i];
            }
        }
        return 0;
    }
    public static void main() {
        int arr[] = {34, 56, 23, 76, 87, 56};
        int size = arr.length;
        System.out.println(firstRepeated(arr, size));
    }
}