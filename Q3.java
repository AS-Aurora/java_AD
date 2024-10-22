public class Q3 {
    public static int smallestMissing(int arr[]) {
        int found;
        for(int i=1;i<=arr.length+1;i++) {
            found = 0;
            for(int j=0;j<arr.length;j++) {
                if(arr[j] == i) {
                    found = 1;
                    break;
                }
            }
            if(found == 0)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 11, 2, 5, 8, 6, 1, 10, 9};
        int ans = smallestMissing(arr);
        if(ans==-1) 
            System.out.println("Number not missing.");
        else
            System.out.println("missing number is: "+ans);
    }
}