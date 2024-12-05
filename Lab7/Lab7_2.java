
public class Lab7_2 {
    public static void printDuplicate(int arr[], int size) {
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j])
                    System.out.println(arr[i]+" is the duplicate.");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {34, 56, 23, 76, 87, 56, 21, 76};
        int size=arr.length;
        printDuplicate(arr, size);
    }
}
