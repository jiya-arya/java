public class CheckDigits {

    // Method to check if string contains only digits
    static boolean isOnlyDigits(String s) {
        if (s.length() == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If any character is not between '0' and '9', return false
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "12a45";

        System.out.println(s1 + " contains only digits: " + isOnlyDigits(s1));
        System.out.println(s2 + " contains only digits: " + isOnlyDigits(s2));
    }
}