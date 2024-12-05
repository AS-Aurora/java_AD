public class Lab7_5 {
    public static int getMax(int[] arr, int size) {
        int max=arr[0];
        int count = 1;
        int maxCount=1;
        for(int i=0;i<size;i++) {
            count =1;
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                max = arr[i];
                maxCount = count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {9, 7, 6, 5, 6, 6, 5, 5, 7, 5, 6};
        System.out.println(getMax(arr, arr.length));
    }
}
