public class nthfibonacci {
    public static int nthFibonacci(int n) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n-2;i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.err.println(nthFibonacci(10));
    }
}
