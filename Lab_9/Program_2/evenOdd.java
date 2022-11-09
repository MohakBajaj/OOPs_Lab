// Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
package Lab_9.Program_2;

public class evenOdd {
    public static void main(String[] args) {
        even e = new even();
        Odd o = new Odd();
        e.start();
        o.start();
    }
}

class even extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class Odd extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}