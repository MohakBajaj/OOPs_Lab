// 1)	Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String to Integer converts Integer to int.
package Lab_8.Program_5;

public class Wrapper {
    int a = 10;
    Integer b = 20;
    String c = "30";
    String d = "40";

    public void intToInteger() {
        System.out.println("int to Integer: " + Integer.valueOf(a));
    }

    public void integerToString() {
        System.out.println("Integer to String: " + b.toString());
    }

    public void stringToInt() {
        System.out.println("String to int: " + Integer.parseInt(c));
    }

    public void intToString() {
        System.out.println("int to String: " + String.valueOf(a));
    }

    public void stringToInteger() {
        System.out.println("String to Integer: " + Integer.valueOf(c));
    }

    public void integerToInt() {
        System.out.println("Integer to int: " + b.intValue());
    }

    public static void main(String[] args) {
        Wrapper obj = new Wrapper();
        obj.intToInteger();
        obj.integerToString();
        obj.stringToInt();
        obj.intToString();
        obj.stringToInteger();
        obj.integerToInt();
    }
}
