

import java.util.Scanner;

/**
 * Created by scott_000 on 9/14/2016.
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        double f0 = 0;
        double f1 = 0;
        double currentFib;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index to display its Fibonacci number: ");
        double n = input.nextDouble();

        System.out.println(fibonacci(n));

    }


    public static double fibonacci(double n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);


    }
}

