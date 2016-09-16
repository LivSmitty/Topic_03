import java.util.Scanner;

/**
 * Created by scott_000 on 9/15/2016.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = input.nextLine();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        if (s.length() == 0)
            return s;

        return reverseString(s.substring(1)) + s.charAt(0);
    }

}

