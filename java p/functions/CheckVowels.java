public class CheckVowels {

    // Method to check if all characters are vowels
    static boolean allVowels(String s) {
        // Empty string check
        if (s.length() == 0) {
            return false;
        }

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character is not a vowel, return false
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false;
            }
        }

        // All characters matched vowels
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aeiou";
        String s2 = "java";

        System.out.println(s1 + " -> " + allVowels(s1));
        System.out.println(s2 + " -> " + allVowels(s2));
    }
}