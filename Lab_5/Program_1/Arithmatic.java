package Lab_5.Program_1;

// Write a program to create interface named test. In this interface the member function is square.Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class usethe object of arithmetic class.

interface Test {
    int square(int a);
}

class Arithmatic implements Test {
    public int square(int a) {
        return a * a;
    }
}

class Main {
    public static void main(String[] args) {
        Arithmatic obj = new Arithmatic();
        System.out.print("The Square of 5 is ");
        System.out.println(obj.square(5));
    }
}
