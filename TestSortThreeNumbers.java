import java.util.Scanner;

/**
 * Created by scott_000 on 9/12/2016.
 */
public class TestSortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers to sort: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        SortThreeNumbers.displaySortedNumbers(num1, num2, num3);

    }
}
