package Lab_5.Program_3;

// Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program

interface test {
    final double PI = 3.141;
}

public class Usefull implements test {
    double area_circle(int r) {
        return PI * r * r;
    }

    public static void main(String[] args) {
        Usefull o = new Usefull();
        double a = o.area_circle(10);
        System.out.println(a);
    }
}
