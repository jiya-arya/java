public class RemoveChar {

    // Method to remove all occurrences of a character
    static String removeCharacter(String s, char target) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Add character to result only if it doesn't match the target
            if (ch != target) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';

        String updated = removeCharacter(str, ch);

        System.out.println("Original String: " + str);
        System.out.println("Character to remove: " + ch);
        System.out.println("Resulting String: " + updated);
    }
}