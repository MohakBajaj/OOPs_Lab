// Write a program to implement the concept of threading by extending Thread
// Class and Runnable interface.

package Lab_9.Program_1;

public class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

class ThreadDemo1 implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

class Main {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        ThreadDemo1 t2 = new ThreadDemo1();
        Thread t3 = new Thread(t2);
        t3.start();
    }
}