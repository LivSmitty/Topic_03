/**
 * Created by scott_000 on 9/12/2016.
 */
public class Palindrome {

    public static int getReverse(int original) {
        int reverse = 0;
        while (original != 0) {
            int remainder = original % 10;
            reverse = reverse * 10 + remainder;
            original = original / 10;
        }
        if (isPalindrome(reverse)) {
            System.out.println("This number is a palindrome.");
        }else

         System.out.println("This number is not a palindrome.");

        return reverse;
    }


    public static boolean isPalindrome(int reverse) {
        int palindrome = reverse;
        int reversed = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reversed = reversed * 10 + remainder;
            palindrome /= 10;
        }

        if (reversed == reverse) {
            return true;
        }else {
            return false;
        }

    }

}

