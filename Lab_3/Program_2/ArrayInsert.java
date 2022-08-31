package Lab_3.Program_2;

import java.util.Scanner;

public class ArrayInsert {
    int[] arr;

    public ArrayInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void insert(int index, int value) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid Index");
        } else {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
        }
    }

    public static void main(String[] args) {
        ArrayInsert ai = new ArrayInsert();
        // end element of array will get lost
        ai.insert(2, 100);
        ai.insert(3, 100);
        for (int i = 0; i < ai.arr.length; i++) {
            System.out.println(ai.arr[i]);
        }
    }
}
