public class fibonacciRecursive {
    public static int fibonacci(int a, int b, int n) {
        if(n==0 || n==1)
            System.out.println(n);
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        fibonacci(a, b, n-1);
    }
}
