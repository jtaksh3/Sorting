import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of elements to be Sorted :");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("The Sorted array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
}
