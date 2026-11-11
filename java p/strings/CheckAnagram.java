import java.util.Arrays;

public class CheckAnagram {

    // Method to check if two strings are anagrams
    static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare sorted arrays
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        String str3 = "Hello";
        String str4 = "World";

        System.out.println(str1 + " and " + str2 + " -> " + isAnagram(str1, str2));
        System.out.println(str3 + " and " + str4 + " -> " + isAnagram(str3, str4));
    }
}