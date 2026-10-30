class Student {
    String name = "jiya";
    int rollNo = 7011;

    void display() {
        System.out.println("Roll No: " + rollNo);
    }
}
public class classmember {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name);
        s.display();
    }
}