public class CountWords {

    // Method to count words
    static int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Count a word when a space is found after a character
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        // Add 1 for the last word (if string is not empty)
        if (s.length() > 0) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Java is very easy";

        int total = countWords(str);

        System.out.println("Total words: " + total);
    }
}