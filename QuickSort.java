import java.util.Scanner;

public class QuickSort {
    int partition(int[] arr, int p, int r) {
        int x = arr[r];// x = Pivot Element.
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
    void quicksort(int[] arr, int p, int r) {
        if(p < r) {
            int q = partition(arr, p, r);
            quicksort(arr, p, q - 1);
            quicksort(arr, q + 1, r);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements to be Sorted");
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();//Inputting the Elements.
        QuickSort obj = new QuickSort();
        obj.quicksort(arr, 0, n - 1);//Accesing non-static method using Object referencing Variable.
        System.out.println("Sorted Elements");
        for(int element : arr)
            System.out.println(element);
    }
}
