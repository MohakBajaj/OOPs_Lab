package Lab_5.Program_6;

interface A {
    final int a = 25;
}

interface B {
    final int b = 30;
}

public class MI implements A, B {
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}