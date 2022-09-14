package Lab_5.Program_2;

// Write a program to create interface A, in this interface we have two method meth1 and meth2.Implements this interface in another class named MyClass.

interface A {
    void meth1();

    void meth2();
}

public class MyClass implements A {
    public void meth1() {
        System.out.println("meth1 called");
    }

    public void meth2() {
        System.out.println("meth2 called");
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        o.meth1();
        o.meth2();
    }
}
