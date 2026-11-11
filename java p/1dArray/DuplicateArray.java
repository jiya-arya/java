public class DuplicateArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 4, 1, 5 };

        System.out.println("Duplicate elements:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}