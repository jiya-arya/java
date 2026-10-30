class Student {
    String name;
    int age;

    Student() {
        name = "no";
        age = 0;
    }

    Student(String n) {
        name = n;
        age = 21;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " , " + age);
    }
}

public class construcoverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("jiya");
        Student s3 = new Student("janvi", 21);
        s1.display();
        s2.display();
        s3.display();
    }
}