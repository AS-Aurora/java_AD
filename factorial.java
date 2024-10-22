public class factorial {
    public static int fact(int n) {
        int fac=1;
        for(int i=1;i<=n;i++) {
            fac *= i;
        }
        return fac;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("Factorial: "+fact(n));
    }
}
