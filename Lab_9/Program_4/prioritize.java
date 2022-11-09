// Write a Java program to create five threads with different priorities. Send
// two threads of the highest priority to sleep state. Check the aliveness of
// the threads and mark which thread is long lasting

package Lab_9.Program_4;

class thread extends Thread {
    public thread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread " + getName() + " is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " is interrupted");
        }
        System.out.println("Thread " + getName() + " is exiting");
    }
}

public class prioritize {
    public static void main(String[] args) {
        thread t1 = new thread("1");
        thread t2 = new thread("2");
        thread t3 = new thread("3");
        thread t4 = new thread("4");
        thread t5 = new thread("5");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
        System.out.println("Thread 3 is alive: " + t3.isAlive());
        System.out.println("Thread 4 is alive: " + t4.isAlive());
    }
}