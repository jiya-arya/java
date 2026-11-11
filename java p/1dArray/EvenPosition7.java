import java.util.Scanner;

class EvenPosition7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        System.out.println("Elements at even positions:");
        for (int i = 1; i < 5; i += 2)
            System.out.print(a[i] + " ");
    }
}