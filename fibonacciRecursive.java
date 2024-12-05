public class fibonacciRecursive {
    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            int c = a + b;
            System.out.println(c);
            fibonacci(b, c, n - 1);
        }
    }

    public static void main(String[] args) {
        fibonacci(0, 1, 10);
    }
}