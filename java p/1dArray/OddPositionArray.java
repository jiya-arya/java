public class OddPositionArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };

        System.out.println("Elements at odd positions:");
        // Odd indices: 1, 3, 5...
        for (int i = 1; i < a.length; i = i + 2) {
            System.out.println(a[i]);
        }
    }
}