public class Q1 {
    public static void bubbleSort(int arr[]) {
        boolean flag=false;
        int i, j;
        for (i = 0; i < arr.length; i++) {
            flag = false;
            for(j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) 
                break;
            for(j=0;j<arr.length;j++)
                System.out.print(arr[j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Element after sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}