public class OddEvenArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 6, 3, 2, 8 };

        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}