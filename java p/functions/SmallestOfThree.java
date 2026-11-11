public class SmallestOfThree {

    // Method to find the smallest number
    static int findSmallest(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        int a = 25;
        int b = 37;
        int c = 12;

        int result = findSmallest(a, b, c);

        System.out.println("Smallest number: " + result);
    }
}