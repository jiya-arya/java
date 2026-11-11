public class StringToStringArray {

    // Method to split a string into a string array by spaces
    static String[] convertToArray(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {
        String str = "Java is very easy";

        // Convert string to string array
        String[] words = convertToArray(str);

        System.out.println("Original String: " + str);
        System.out.println("\nElements in String Array:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Index " + i + ": " + words[i]);
        }
    }
}