public class SecondLargest {
    public static void main(String[] args) {
        int[] a = { 5, 2, 8, 7, 1, 9 };
        int temp;

        // Sort ascending
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // 2nd largest will be at index (length - 2)
        System.out.println("2nd Largest: " + a[a.length - 2]);
    }
}