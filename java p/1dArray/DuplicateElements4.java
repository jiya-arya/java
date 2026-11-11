import java.util.Scanner;

class DuplicateElements4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        System.out.println("Duplicate elements:");
        for (int i = 0; i < 5; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j])
                    found = true;
            }
            if (!found) {
                for (int j = i + 1; j < 5; j++) {
                    if (a[i] == a[j]) {
                        System.out.println(a[i]);
                        break;
                    }
                }
            }
        }
    }
}