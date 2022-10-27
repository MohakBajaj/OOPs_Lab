package Program_1.P1;

import Program_1.P2.xyz;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        xyz obj = new xyz();
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The Sum with x is: " + (a + obj.x));
        sc.close();
    }
}
