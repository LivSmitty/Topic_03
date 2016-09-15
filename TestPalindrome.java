import java.util.Scanner;

/**
 * Created by scott_000 on 9/12/2016.
 */
public class TestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to test if palindrome: ");

        int original = input.nextInt();
        Palindrome.getReverse(original);

    }
}
