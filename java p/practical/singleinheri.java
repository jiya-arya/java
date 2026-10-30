    class A {
        void showA() {
            System.out.println("Base class");
        }
    }
    class B extends A {
        void showB() {
            System.out.println("Derived class");
        }
    }
    public class singleinheri{
        public static void main(String[] args) {
            B obj = new B();
            obj.showA(); 
            obj.showB();
        }
    }

