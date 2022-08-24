package Lab_2.Program_2;

import java.util.Scanner;

public class Sqr_10num_Sum {
    public int[] take_input() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public int sum_of_squares(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Sqr_10num_Sum s = new Sqr_10num_Sum();
        int[] arr = s.take_input();
        System.out.println("Sum of squares of the numbers is: " + s.sum_of_squares(arr));
    }
}
