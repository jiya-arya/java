class Student {
    String name = "Jiya";
    void show() {
        System.out.println(name);
    }
}
public class classobj {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}