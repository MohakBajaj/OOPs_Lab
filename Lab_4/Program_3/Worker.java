// Write a class Worker and derive classes DailyWorker and SalariedWorker from it. 
// Every workerhas a name and a salary rate. Write method ComPay (int hours) to compute the week pay of everyworker.
// A Daily Worker is paid on the basis of the number of days he/she works. 
// The SalariedWorker gets paid the wage for 40 hours a week no matter what the actual hours are. 
// Test this program to calculate the pay of workers. 
// You are expected to use the concept of polymorphism to write this program.

package Lab_4.Program_3;

public class Worker {
    String name;
    int days;
    int salaryRate;

    public Worker(String name, int days, int salaryRate) {
        this.name = name;
        this.days = days;
        this.salaryRate = salaryRate;
    }

    public String toString() {
        return "Name: " + name + ", Days: " + days + ", Salary Rate: " + salaryRate;
    }

    public int ComPay(int days) {
        return days * salaryRate;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, int days, int salaryRate) {
        super(name, days, salaryRate);
    }

    public int ComPay(int days) {
        return super.ComPay(days);
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, int days, int salaryRate) {
        super(name, days, salaryRate);
    }

    public int ComPay(int days) {
        return super.ComPay(40 / 24);
    }
}

class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[2];
        workers[0] = new DailyWorker("John", 5, 100);
        workers[1] = new SalariedWorker("Smith", 5, 100);

        for (Worker worker : workers) {
            System.out.println(worker);
            System.out.println("Pay: " + worker.ComPay(worker.days));
        }
    }
}
