import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Inbuilt sort method
        Arrays.sort(a);

        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}