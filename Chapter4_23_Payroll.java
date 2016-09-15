import java.util.Scanner;

/**
 * Created by scott_000 on 9/15/2016.
 */
public class Chapter4_23_Payroll {
    public static void main(String[] args) {
        //Gather employee information
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String empName = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();


        //Calculate Gross Pay
        double grossPay = hoursWorked * payRate;

        //Calculate Withholdings
        double stateWithHolding = (grossPay * stateTax);
        double fedWithHolding = (grossPay * fedTax);

        //Calcuate Net Pay
        double netPay = (grossPay - (stateWithHolding + fedWithHolding));

        //Print Payroll Statement
        System.out.printf("Pay Rate: $%4.2f\n", payRate);
        System.out.printf("Gross Pay: $%4.2f\n", grossPay);
        System.out.printf("Deductions:");
        System.out.printf("\n     " + "Federal Withholding " + "(" + (fedTax * 100) + "): " + "$%4.2f", fedWithHolding);
        System.out.printf("\n     " + "State Withholding " + "(" + (stateTax * 100)  + "): "  + "$%4.2f", stateWithHolding);
        System.out.printf("\n     " + "Total Deduction: " + "$%4.2f", (fedWithHolding + stateWithHolding));
        System.out.printf("\nNet Pay: " + "$%4.2f", netPay);




    }


}
