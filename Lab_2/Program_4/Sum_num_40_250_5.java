package Lab_2.Program_4;

public class Sum_num_40_250_5 {
    public int sum() {
        int sum = 0;
        for (int i = 40; i < 250; i += 5) { // increments of 5 to maintain divisibility by 5.
                                            // Increments of 1 for alternate solution.
            sum += i;
            // alternatively this can be used with increments of 1 in loop.
            // if (i % 5 == 0) {
            // sum += i;
            // }
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum_num_40_250_5 s = new Sum_num_40_250_5();
        System.out.println("The sum is: " + s.sum());
    }

}
