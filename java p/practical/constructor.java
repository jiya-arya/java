    class Student {
        String name;
        Student() {
            name = "jiya";
            System.out.println("Default: " + name);
        }     
        Student(String n) {
            name = n;
            System.out.println("Parameterized: " + name);
        }
    }
    public class constructor {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("janvi");
        }
    }

