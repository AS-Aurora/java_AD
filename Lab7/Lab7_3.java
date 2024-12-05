
public class Lab7_3 {
    public static int findMissing(int arr[], int size) {
        int found;
        for(int i=0; i<size;i++) {
            found=0;
            for(int j=0;j<size;j++) {
                if(arr[j]==i) {
                    found = 1;
                    break;
                }
            }
            if(found==0) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4 ,5, 6, 7, 8, 9,};
        int size=arr.length;
        System.out.println(findMissing(arr, size));
    }
}
