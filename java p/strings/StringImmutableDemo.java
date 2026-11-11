public class StringImmutableDemo {

    // Method to check and print reference changes
    static void checkImmutability(String s) {
        int originalAddress = System.identityHashCode(s);
        System.out.println("Original String: " + s);
        System.out.println("Memory address before: " + originalAddress);

        // Trying to modify the string
        s = s.concat(" World");

        int newAddress = System.identityHashCode(s);
        System.out.println("\nModified String: " + s);
        System.out.println("Memory address after: " + newAddress);

        // Verification
        if (originalAddress != newAddress) {
            System.out
                    .println("\nProof: Memory address changed! A new object was created, proving String is immutable.");
        } else {
            System.out.println("\nString was modified in-place.");
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        checkImmutability(str);
    }
}