// Write a program for the following:
// Read all elements from ArrayList by using Iterator.
// Create duplicate object of an ArrayList instance.
// Reverse ArrayList content.

package Lab_9.Program_5;

import java.util.Scanner;

public class arrayCollection {
    int[] arr = new int[10];

    public void take_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public int[] reverse(int arr[]) {
        for (int i = 0; i < 10; i++) {
            arr[i] = 10 - i;
        }
        return arr;
    }

    public void print(int arr[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        arrayCollection a = new arrayCollection();
        a.take_input();
        a.print(a.reverse(a.arr));
    }
}
