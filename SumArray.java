

public class SumArray {
    public static int largestSum(int arr[]) {
        int a=0, b=0;
        for(int i=0;i<arr.length;i++) {
            b += arr[i];
            if(b<0) 
                b=0;
            if(a<b)
                a=b;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {2, -3, 4, -2, 5, -4, 3};
        int ans = largestSum(arr);
        System.out.println(ans);
    }
}
