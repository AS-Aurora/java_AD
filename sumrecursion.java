public class sumrecursion {
    public static int sum(int n) {
        if(n==1) 
            return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = sum(5);
        System.out.println("Sum: "+ans);
    }
}