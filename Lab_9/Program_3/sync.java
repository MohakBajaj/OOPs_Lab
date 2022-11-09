// Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization. 
package Lab_9.Program_3;

public class sync {
    public static void main(String[] args) {
        CounterThread c = new CounterThread(new Counter());
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(c);
            t.start();
        }
    }
}

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

class CounterThread implements Runnable {
    Counter c;

    CounterThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            c.increment();
        }
    }
}
