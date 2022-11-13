// Write a program for the following:
// Read all elements from ArrayList by using Iterator.
// Create duplicate object of an ArrayList instance.
// Reverse ArrayList content.

package Lab_9.Program_5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class arrayCollection {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public void duplicate() {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2 = (ArrayList<Integer>) list.clone();
        System.out.println("The duplicate array is: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
    }

    public void reverse() {
        Collections.reverse(list);
        System.out.println("The reversed array is: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        arrayCollection obj = new arrayCollection();
        obj.takeInput();
        obj.duplicate();
        obj.reverse();
    }
}
