package Lab_1.Program_1;

public class Largest {

    int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Largest l = new Largest();
        System.out.println(l.largest(10, 20, 30));
    }
}
