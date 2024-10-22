import java.util.*;
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int i = 0, a;
        int sum = 0;
        System.out.println("Enter the elements: ");
        while(i<n) {
            a = sc.nextInt();
            sum += a;
            i++;
        }
        System.out.println(sum);
    }
}