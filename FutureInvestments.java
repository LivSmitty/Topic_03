/**
 * Created by scott_000 on 9/12/2016.
 */
public class FutureInvestments {

    public static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

        double futureInvestment;

        while (years <=30) {
            futureInvestment = investmentAmount * Math.pow((1 + monthlyInterestRate), years);
            investmentAmount = futureInvestment;
            FutureInvestments.fillChart(years, futureInvestment);
            years++;

        }
    }


    public static void fillChart(int i, double futureInvestment) {
        System.out.printf("%-5s", i);
        System.out.printf("%-5s\n", futureInvestment);

    }

    public static void printTableHeading() {
        System.out.printf("%-5s", "Years");
        System.out.printf("%-5s\n", "Future Value");
    }



}
