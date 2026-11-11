public class AddCharacters {

    // Method to add a character at the end
    static String addToEnd(String s, char ch) {
        return s + ch;
    }

    // Method to add a character at the beginning
    static String addToStart(String s, char ch) {
        return ch + s;
    }

    // Method to add a character at a specific position
    static String addAtIndex(String s, char ch, int index) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == index) {
                result = result + ch;
            }
            result = result + s.charAt(i);
        }
        // If index is at the very end
        if (index == s.length()) {
            result = result + ch;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Java";
        char ch = '!';

        String atEnd = addToEnd(str, ch);
        String atStart = addToStart(str, '#');
        String atMiddle = addAtIndex(str, '-', 2);

        System.out.println("Original String: " + str);
        System.out.println("Add at end: " + atEnd);
        System.out.println("Add at start: " + atStart);
        System.out.println("Add at index 2: " + atMiddle);
    }
}