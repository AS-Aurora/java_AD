

public class bubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean flag = false;
        int i, j;
        for(i=0;i<n-1;i++) {
            for(j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            for(j=0;j<n;j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            if(flag == false) 
                break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Initial array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("After sort: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
