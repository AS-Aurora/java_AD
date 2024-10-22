

public class minMax {
    public static void main(String[] args) {
        int arr[] = {4, -000000000000000000000000000000000000001, 7, 9, 3};
        int min, max;
        min = arr[0];
        max = arr[0];
        int n = arr.length;
        int i = 1;
        while (i<n) {
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
            i += 1;
        }
        System.out.println("Min="+min+", Max="+max);
    }
}
