public class charCount {

    // Method to count words in a string
    static int countWords(String s) {
        // If string is null or empty after trimming spaces
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        // Split by one or more whitespace characters
        String[] words = s.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        String str1 = "Java is simple and powerful";
        String str2 = "   Hello   world   ";

        System.out.println("String: \"" + str1 + "\"");
        System.out.println("Total words: " + countWords(str1));

        System.out.println("\nString: \"" + str2 + "\"");
        System.out.println("Total words: " + countWords(str2));
    }
}