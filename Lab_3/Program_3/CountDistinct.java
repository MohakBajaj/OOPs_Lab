package Lab_3.Program_3;

import java.util.Scanner;

public class CountDistinct {
    public CountDistinct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        printDistinct(arr);
    }

    private void printDistinct(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }
        System.out.println("Number of distinct elements in the array: " + count);
    }

    public static void main(String[] args) {
        new CountDistinct();
    }
}
