public class FrequencyArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 1, 4, 2 };

        for (int i = 0; i < a.length; i++) {
            // Check if already counted before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}