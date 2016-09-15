/**
 * Created by scott_000 on 9/13/2016.
 */
public class CheckPassword {
    public static boolean validateLength(String password) {
        int length = password.length();
        if (length >= 8) {
            return true;
        }
        return false;
    }

    public static boolean validateLettersAndNumbers(String password) {
        String pattern = "^[a-zA-Z0-9]*$";
        if (password.matches(pattern)) {
            return true;
        }
        return false;
    }

    public static boolean validateTwoDigits(String password) {
        int numberOfDigits = 0;
        char[] checkForNumbers = password.toCharArray();
        for (char val : checkForNumbers) {
            if (Character.isDigit(val)) {
                numberOfDigits++;
            }
        }
        if (numberOfDigits >= 2)
            return true;
        else
            return false;
    }
}



