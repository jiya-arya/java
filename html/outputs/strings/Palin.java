public class Palin {
    public static void main(String[] args) {
        String text = "radar";
        String reverseText = "";

        // String ko ulta iterate karke naya string banate hain
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }

        // Check if both are same
        if (text.equalsIgnoreCase(reverseText)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}