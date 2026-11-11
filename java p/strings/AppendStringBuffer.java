public class AppendStringBuffer {

    // Method to append two strings using StringBuffer
    static String appendText(String s1, String s2) {
        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2);
        return sb.toString();
    }

    public static void main(String[] args) {
        String first = "Hello ";
        String second = "World";

        String result = appendText(first, second);

        System.out.println("First String: " + first);
        System.out.println("Second String: " + second);
        System.out.println("Appended String: " + result);
    }
}