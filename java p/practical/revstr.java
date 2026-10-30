public class revstr {
    public static void main(String[] args) {
        String s = "jiya";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("rev " + rev);
    }
}