// package java.basic;

public class sumofdig {

    public static void main(String[] args) {
        int a = 1234;
        int b = a;
        int sum = 0;

        while (b > 0) {
            int digit = b % 10;
            sum += digit;
            b = b / 10;
        }

        System.out.println("Sum of " + a + " is " + sum);
    }
}
