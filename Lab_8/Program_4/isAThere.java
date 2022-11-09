// 4)	Write a program in Java to create a String object. Initialize this object with your name. Find the length of your name using the appropriate String method. Find whether the character ‘a’ is in your name or not; if yes find the number of times ‘a’ appears in your name. Print locations of occurrences of ‘a’ .Try the same for different String objects

package Lab_8.Program_4;

public class isAThere {
    String name = "Mohak Bajaj";
    int length;
    int count = 0;

    public boolean isAhere() {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                return true;
            }
        }
        return false;
    }

    public void lengthOfName() {
        this.length = name.length();
    }

    public void countA() {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                count++;
            }
        }
    }

    public void printLocations() {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                System.out.println("a is at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        isAThere obj = new isAThere();
        obj.lengthOfName();
        System.out.println(obj.length);
        if (obj.isAhere()) {
            System.out.println("a is present in the name");
            obj.countA();
            System.out.println("a is present " + obj.count + " times");
            obj.printLocations();
        } else {
            System.out.println("a is not present in the name");
        }
    }
}
