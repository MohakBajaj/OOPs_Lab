package Lab_1.Program_3;

class A {
    public A(int x) {
        System.out.println("A's constructor called");
        System.out.println("x = " + x);
    }

    int a = 10;
}

public class Class_Object {
    public static void main(String[] args) {
        A obj = new A(5);
        System.out.println("obj.a = " + obj.a);
    }
}
