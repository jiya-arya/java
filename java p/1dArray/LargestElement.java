public class LargestElement {
    public static void main(String[] args) {
        int[] a = { 15, 8, 42, 4, 23 };
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}