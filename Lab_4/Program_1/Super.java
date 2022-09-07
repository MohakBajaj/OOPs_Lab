package Lab_4.Program_1;

public class Super {
    private void private_method() {
        System.out.println("using Super private method in public method of the class");
    }

    private int private_variable = 15;
    public int variable = 20;

    public void public_method() {
        System.out.println("Super public method");
        private_method();
        System.out.println("Super private variable of the class: " + private_variable);
    }
}

class Sub extends Super {
    public static void main(String[] args) {
        Sub sub = new Sub();
        // sub.private_method(); // Error due to use of private method
        // System.out.println(sub.private_variable); // Error due to use of private
        // variable
        System.out.println(sub.variable);
        sub.public_method();
    }
}