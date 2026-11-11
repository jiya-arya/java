public class SmallestElement {
    public static void main(String[] args) {
        int[] a = { 15, 8, 42, 4, 23 };
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Smallest element: " + min);
    }
}