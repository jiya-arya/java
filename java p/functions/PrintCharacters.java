public class PrintCharacters {

    // Method to print characters between two characters
    static void printBetween(char c1, char c2) {
        for (char c = c1; c <= c2; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'P';

        System.out.println("Characters between " + ch1 + " and " + ch2 + ":");
        printBetween(ch1, ch2);
    }
}