class arithmetic{
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        arithmetic m = new arithmetic();
        m.add(2, 3);
        m.add(2, 3, 4);
    }
}
