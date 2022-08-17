package Lab_1.Program_2;

import java.util.Scanner;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }

    int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int a, b;
        int choice = 0;
        while (choice >= 0) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Addition: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Subtraction: " + calc.sub(a, b));
                    break;
                case 3:
                    System.out.println("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Multiplication: " + calc.mul(a, b));
                    break;
                case 4:
                    System.out.println("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Division: " + calc.div(a, b));
                    break;
                case 5:
                    System.out.println("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Modulus: " + calc.mod(a, b));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    choice = -1;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
