// Design a class employee of an organization. An employee has a name, empid, and salary. 
// Write the default constructor, a constructor with parameters (name, empid, and salary) and methods 
// to return name and salary. Also write a method increaseSalary that raises the employee’s salary 
// by a certain user specified percentage. Derive a subclass Manager from employee. 
// Add an instance variable named department to the manager class. 
// Supply a test program that uses theses classes and methods.

package Lab_4.Program_5;

public class Employee {
    String name;
    int empid;
    int salary;

    public Employee(String name, int empid, int salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Empid: " + empid + ", Salary: " + salary;
    }

    public void increaseSalary(int percentage) {
        salary += salary * percentage / 100;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int empid, int salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("John", 1, 1000, "Marketing");
        employees[1] = new Manager("Smith", 2, 1000, "IT");
        employees[2] = new Manager("Smith", 2, 1000, "User Feedback & Support");

        for (Employee employee : employees) {
            System.out.println(employee);
            employee.increaseSalary(10);
            System.out.println("Salary: " + employee.salary);
        }
    }
}