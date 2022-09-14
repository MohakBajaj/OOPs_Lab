package Lab_5.Program_4;

//Write a program to create an Interface having two methods division and modules. Create a class,which overrides these methods.

interface dm {
    float division(int a, int b);

    float modules(int a, int b);
}

public class DivMod implements dm {
    public float division(int a, int b) {
        return a / b;
    }

    public float modules(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        DivMod o = new DivMod();
        System.out.println(o.division(15, 6));
        System.out.println(o.modules(15, 6));
    }
}
