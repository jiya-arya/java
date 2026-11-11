public class CheckPassword {

    // Standard password rules:
    // 1. At least 8 characters
    // 2. Contains only letters and digits
    // 3. Contains at least 2 digits
    static boolean isValid(String s) {
        if (s.length() < 8) {
            return false;
        }

        int digits = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // valid letter
            } else {
                return false; // not a letter or digit
            }
        }

        if (digits >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String pass1 = "JavaPass12";
        String pass2 = "short1";

        System.out.println(pass1 + " is valid: " + isValid(pass1));
        System.out.println(pass2 + " is valid: " + isValid(pass2));
    }
}