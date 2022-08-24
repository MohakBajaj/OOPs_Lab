package Lab_2.Program_1;

// import java.util.Arrays;

public class Three_Digit_Combo {
    // Input 3 digits and output all possible combinations of the digits.
    public String[] combinations(int a, int b, int c) {
        int[] digits = { a, b, c };
        String combos[] = new String[6];
        // int count = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    if (x != y && y != z && z != x) {
                        System.out.println(digits[x] + "" + digits[y] + "" + digits[z]);
                        // combos[count] = digits[x] + "" + digits[y] + "" + digits[z];
                        // count++;
                    }
                }
            }
        }
        return combos;
    }

    public static void main(String[] args) {
        Three_Digit_Combo t = new Three_Digit_Combo();
        // System.out.println(Arrays.toString(t.combinations(1, 2, 3)));
        t.combinations(1, 2, 4);
    }
}

// Uncomment the comments for alternate output.