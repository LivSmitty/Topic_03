/**
 * Created by scott_000 on 9/12/2016.
 */
public class SortThreeNumbers {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The numbers sorted are: " + num1 + " "
                + num2 + " " + num3);


    }
}



