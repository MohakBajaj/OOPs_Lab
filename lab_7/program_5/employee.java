// Write a java program to throw an exception  for an employee details. 
// • If an employee name is a number, a name exception must be thrown.
// • If an employee age is greater than 50, an age exception must be thrown. 
// • Or else an object must be created for the entered employee details

package Lab_7.program_5;

public class employee {
    String name;
    int age;

    public static void main(String[] args) {
        employee e = new employee();
        e.name = "sde";
        e.age = 60;
        try {
            Integer.parseInt(e.name);
            throw new nameException("Name cannot be a number");
        } catch (NumberFormatException | nameException err) {
            System.out.println(err);
        }
        try {
            if (e.age > 50) {
                throw new ageException("Age should be less than 50");
            }
        } catch (ageException err) {
            System.out.println(err);
        }
    }
}

class nameException extends Exception {
    public nameException(String msg) {
        super(msg);
    }
}

class ageException extends Exception {
    public ageException(String msg) {
        super(msg);
    }
}
