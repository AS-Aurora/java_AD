public class fibonacci {
    public static void printFibonacci(int n) {
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        printFibonacci(5);
    }
}
