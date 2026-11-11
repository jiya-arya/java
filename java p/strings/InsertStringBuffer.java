public class InsertStringBuffer {

    // Method to insert a string at a specific index using StringBuffer
    static String insertText(String original, int index, String toInsert) {
        StringBuffer sb = new StringBuffer(original);
        sb.insert(index, toInsert);
        return sb.toString();
    }

    public static void main(String[] args) {
        String base = "Hello World";
        String extra = "Beautiful ";
        int position = 6;

        String result = insertText(base, position, extra);

        System.out.println("Original String: " + base);
        System.out.println("Inserted Text: " + extra);
        System.out.println("Result: " + result);
    }
}