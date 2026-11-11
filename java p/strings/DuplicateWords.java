
import java.util.Scanner;

class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        System.out.println("Duplicate words are:");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                continue;
            }

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                int count = 0;

                for (int j = 0; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
