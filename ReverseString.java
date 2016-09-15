/**
 * Created by scott_000 on 9/14/2016.
 */
public class ReverseString {

    private static int i = 0;

    public static void main(String args[]) {
        reverseDisplay("abcd");
    }

    public static String reverseDisplay(String str) {
        int localI = i++;
        if ((null == str) || (str.length()  <= 1)) {
            return str;
        }

        String reversed = reverseDisplay(str.substring(1)) + str.charAt(0);

        System.out.println(reversed);

        return reversed;
    }
}
