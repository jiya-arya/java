public class finallyblock {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("finally block");
        }
    }
}