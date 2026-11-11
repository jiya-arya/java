public class EvenPositionArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };

        System.out.println("Elements at even positions:");
        // Even indices: 0, 2, 4... (or 1, 3, 5 if starting from 1st index)
        for (int i = 0; i < a.length; i = i + 2) {
            System.out.println(a[i]);
        }
    }
}