// Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments). 

package lab_7.Program_3;

public class customException {
    public void mod(String a, String b) throws NonNumericException {
        try {
            System.out.println(Integer.parseInt(a) % Integer.parseInt(b));
        } catch (NumberFormatException e) {
            throw new NonNumericException("It should be Numeric");
        }
    }

    public static void main(String[] args) throws NonNumericException {
        customException c = new customException();
        c.mod(args[0], args[1]);
    }
}

class NonNumericException extends Exception {
    public NonNumericException(String msg) {
        super(msg);
    }
}