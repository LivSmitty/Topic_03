import java.util.Scanner;

/**
 * Created by scott_000 on 9/18/2016.
 */
public class StringPermutation18_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to find its permutations: ");
        String str = input.nextLine();
        permutation(str);
    }


    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
}
