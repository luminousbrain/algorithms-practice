package CodeTest;

public class Test2 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x); // 10
        B b = new B();
        System.out.println(b.x); // 20
        System.out.println(b.getSuperX()); // 10
    }

    static class A {
        int x = 10;
    }

    static class B extends A {
        int x = 20;

        int getSuperX() {
            return super.x;
        }
    }
}
