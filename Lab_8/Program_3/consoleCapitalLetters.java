// Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuilt function) 
package Lab_8.Program_3;

import java.util.Scanner;

public class consoleCapitalLetters {
    String str;

    public consoleCapitalLetters() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        this.str = sc.nextLine();
        sc.close();
    }

    public void capitalize() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str = str.substring(0, i) + (char) (str.charAt(i) - 32) + str.substring(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        consoleCapitalLetters obj = new consoleCapitalLetters();
        obj.capitalize();
        System.out.println(obj.str);
    }
}
