// Write a Java program to enable the user to handle any chance of divide by zero exception. 
package lab_7.Program_2;

public class divZero {
    public void div(int a, int b) throws ArithmeticException {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        }
    }

    public static void main(String[] args) {
        divZero a = new divZero();
        a.div(5, 0);
        a.div(5, 2);
    }
}
