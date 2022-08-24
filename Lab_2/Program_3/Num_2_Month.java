package Lab_2.Program_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num_2_Month {
    public int take_input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public String month(int num) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        return months.get(num);
    }

    public static void main(String[] args) {
        Num_2_Month n = new Num_2_Month();
        int num = n.take_input();
        System.out.println("The month is: " + n.month(num));
    }
}
