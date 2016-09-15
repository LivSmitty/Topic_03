/**
 * Created by scott_000 on 9/13/2016.
 *//*

public class CCNValidation {

    public static int sumOfDoubleEvenPlace(Long ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public static double sumOfOddPlace(long ccNumber) {
        int sumOdd = 0;
        for (int i = (ccNumber.length() - 1); i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i));
            sumOdd = sumOdd + n;
        }
        return sumOdd;

    }
}*/
