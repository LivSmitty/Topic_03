import java.util.Scanner;
import java.util.concurrent.Future;

/**
 * Created by scott_000 on 9/12/2016.
 */
public class TestFutureInvestments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual Interest Rate");
        double monthlyInterestRate = ((input.nextDouble()/100) /12);
        int years = 1;

        FutureInvestments.printTableHeading();
        FutureInvestments.futureInvestmentValue(investmentAmount, monthlyInterestRate, years);




    }
}
