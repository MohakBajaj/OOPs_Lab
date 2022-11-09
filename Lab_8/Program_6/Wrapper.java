// 2)	Write a Java code that converts float to Float converts Float to String converts String to float converts float to String converts String to Float converts Float to float.
package Lab_8.Program_6;

public class Wrapper {
    float a = 10.5f;
    Float b = 20.5f;
    String c = "30.5";
    String d = "40.5";

    public void floatToFloat() {
        System.out.println("float to Float: " + Float.valueOf(a));
    }

    public void floatToString() {
        System.out.println("Float to String: " + b.toString());
    }

    public void stringToFloat() {
        System.out.println("String to float: " + Float.parseFloat(c));
    }

    public void floatToString2() {
        System.out.println("float to String: " + String.valueOf(a));
    }

    public void stringToFloat2() {
        System.out.println("String to Float: " + Float.valueOf(c));
    }

    public void floatToFloat2() {
        System.out.println("Float to float: " + b.floatValue());
    }

    public static void main(String[] args) {
        Wrapper obj = new Wrapper();
        obj.floatToFloat();
        obj.floatToString();
        obj.stringToFloat();
        obj.floatToString2();
        obj.stringToFloat2();
        obj.floatToFloat2();
    }
}
