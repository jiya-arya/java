public class ConsecutiveNumbers {

    // Method to check if three numbers are consecutive
    static boolean areConsecutive(int a, int b, int c) {
        // Find min, max, and middle
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = (a + b + c) - min - max;

        // Check if middle is min + 1 and max is min + 2
        if (mid == min + 1 && max == min + 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 17;
        int c = 16;

        int x = 2;
        int y = 4;
        int z = 6;

        System.out.println(a + ", " + b + ", " + c + " -> " + areConsecutive(a, b, c));
        System.out.println(x + ", " + y + ", " + z + " -> " + areConsecutive(x, y, z));
    }
}