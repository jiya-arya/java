public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 4, 5 };
        int[] temp = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (a[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = a[i];
                j++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}